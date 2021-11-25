Install plugin grpc
$ go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.26
$ go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.1
$ go get -u github.com/golang/protobuf/{proto,protoc-gen-go}
$ go get -u google.golang.org/grpc

Navigate to place proto files, run cmd to generate go files from protoc fils
protoc --go_out=plugins=grpc:. *.proto