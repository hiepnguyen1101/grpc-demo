package main

import (
	"calculator/calculatorpb"
	"context"
	"encoding/json"
	"fmt"
	"io"
	"log"
	"time"

	"google.golang.org/grpc"
	"google.golang.org/protobuf/proto"
)

func main() {
	//// certFile := "ssl/server.crt"
	//// creds, sslErr := credentials.NewClientTLSFromFile(certFile, "localhost")
	//// if sslErr != nil {
	//// 	log.Fatalf("create client creds ssl err %v\n", sslErr)
	//// 	return
	//// }
	//// --demo
	cc, err := grpc.Dial("localhost:50069", grpc.WithInsecure())

	if err != nil {
		log.Fatalf(" err while dial %v", err)
	}
	defer cc.Close()

	// client := calculatorpb.NewCalculatorServiceClient(cc)

	//// log.Printf("service client %f", client)
	// callSum(client)
	// callPND(client)
	// callAverage(client)
	// callFindMax(client)
	CompareJsonVsProtobuf()
	//// callSquareRoot(client, -4)
	//// callSumWithDeadline(client, 1*time.Second) // bi timeout

	//// callSumWithDeadline(client, 5*time.Second) // ko bi timeout
}

type Contact struct {
	PhoneNumber string `json:"phone_number`
	Country     string `json:"country"`
}

type User struct {
	FirstName string    `json:"first_name`
	LastName  string    `json:"last_name"`
	Contact   []Contact `json:"contact"`
}

func CompareJsonVsProtobuf() {
	n := 5000000
	fmt.Println("JSON - START")
	now := time.Now()

	for i := 1; i <= n; i++ {
		u := User{
			FirstName: "Truong",
			LastName:  "Vo",
			Contact: []Contact{
				Contact{
					PhoneNumber: "0384 220 863",
					Country:     "Viet Nam",
				},
			},
		}
		binary, _ := json.Marshal(u)
		var v User
		json.Unmarshal(binary, &v)
	}
	fmt.Println("JSON - END :", time.Now().Sub(now))
	fmt.Println("PROTOBUF - START")
	now = time.Now()
	for i := 1; i <= n; i++ {
		u := &calculatorpb.UserProtobuf{
			FirstName: "Truong",
			LastName:  "Vo",
			Contact: []*calculatorpb.ContactProtobuf{
				&calculatorpb.ContactProtobuf{
					PhoneNumber: "0384 220 863",
					Country:     "Viet Name",
				},
			},
		}
		binary, _ := proto.Marshal(u)
		var v calculatorpb.UserProtobuf
		proto.Unmarshal(binary, &v)
	}
	fmt.Println("PROTOBUF - END :", time.Now().Sub(now))

}

func callSum(c calculatorpb.CalculatorServiceClient) {
	log.Println("calling sum api")
	resp, err := c.Sum(context.Background(), &calculatorpb.SumRequest{
		Num1: 100,
		Num2: 6,
	})

	if err != nil {
		log.Fatalf("call sum api err %v", err)
	}

	log.Printf("sum api response %v\n", resp.GetResult())
}

func callPND(c calculatorpb.CalculatorServiceClient) {
	log.Println("calling pnd api")
	stream, err := c.PrimeNumberDecomposition(context.Background(), &calculatorpb.PNDRequest{
		Number: 120,
	})

	if err != nil {
		log.Fatalf("callPND err %v", err)
	}

	for {
		resp, recvErr := stream.Recv()
		if recvErr == io.EOF {
			log.Println("server finish streaming")
			return
		}

		if recvErr != nil {
			log.Fatalf("callPND recvErr %v", recvErr)
		}

		log.Printf("prime number %v", resp.GetResult())
	}
}

func callAverage(c calculatorpb.CalculatorServiceClient) {
	log.Println("calling average api")
	stream, err := c.Average(context.Background())
	if err != nil {
		log.Fatalf("call average err %v", err)
	}

	listReq := []calculatorpb.AverageRequest{
		calculatorpb.AverageRequest{
			Num: 5,
		},
		calculatorpb.AverageRequest{
			Num: 10,
		},
		calculatorpb.AverageRequest{
			Num: 12,
		},
		calculatorpb.AverageRequest{
			Num: 3,
		},
		calculatorpb.AverageRequest{
			Num: 4.2,
		},
	}

	for _, req := range listReq {
		log.Printf("sending number %v", req.GetNum())
		err := stream.Send(&req)
		if err != nil {
			log.Fatalf("send average request err %v", err)
		}
		time.Sleep(1000 * time.Millisecond)
	}

	resp, err := stream.CloseAndRecv()
	if err != nil {
		log.Fatalf("receive average response err %v", err)
	}

	log.Printf("average response %+v", resp)
}

func callFindMax(c calculatorpb.CalculatorServiceClient) {
	log.Println("calling find max ...")
	stream, err := c.FindMax(context.Background())
	if err != nil {
		log.Fatalf("call find max err %v", err)
	}

	waitc := make(chan struct{})

	go func() {
		//gui nhieu request
		listReq := []calculatorpb.FindMaxRequest{
			calculatorpb.FindMaxRequest{
				Num: 5,
			},
			calculatorpb.FindMaxRequest{
				Num: 10,
			},
			calculatorpb.FindMaxRequest{
				Num: 12,
			},
			calculatorpb.FindMaxRequest{
				Num: 3,
			},
			calculatorpb.FindMaxRequest{
				Num: 4,
			},
		}
		for _, req := range listReq {
			err := stream.Send(&req)
			log.Println("sending number %v", req.GetNum())
			if err != nil {
				log.Fatalf("send find max request err %v", err)
				break
			}
			time.Sleep(1000 * time.Millisecond)
		}
		stream.CloseSend()
	}()

	go func() {
		for {
			resp, err := stream.Recv()
			if err == io.EOF {
				log.Println("ending find max api ...")
				break
			}
			if err != nil {
				log.Fatalf("recv find max err %v", err)
				break
			}

			log.Printf("max: %v\n", resp.GetMax())
		}
		close(waitc)
	}()

	<-waitc
}
