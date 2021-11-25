package me.hiepdev.calculator;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class CalculatorClient {
    private static final Logger LOGGER = Logger.getLogger(CalculatorClient.class.getName());
    private final CalculatorServiceGrpc.CalculatorServiceBlockingStub  blockingStub;
    private final CalculatorServiceGrpc.CalculatorServiceStub asyncStub;
    public CalculatorClient(Channel channel){
        blockingStub = CalculatorServiceGrpc.newBlockingStub(channel);
        asyncStub = CalculatorServiceGrpc.newStub(channel);
    }
    public void sum(int a, int b){
        LOGGER.info("SUM Function - Making request for sum function");
        SumRequest request = SumRequest.newBuilder().setNum1(a).setNum2(b).build();
        SumResponse response;
        try {
            response = blockingStub.sum(request);
            LOGGER.info("SUM Function - Response with result " + response.getResult());
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void pnd(int num){
        LOGGER.info("PND Function - Making request");
        PNDRequest request = PNDRequest.newBuilder().setNumber(1000).build();

        Iterator<PNDResponse> responses;
        try {
            responses = blockingStub.primeNumberDecomposition(request);
            for (int i = 1; responses.hasNext();i++){
                PNDResponse response = responses.next();
                LOGGER.info("PND Function - Response # " + i + " with result " + response.getResult());
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void average(List<Integer> numbers) throws InterruptedException {
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<AverageResponse> responseObserver = new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value) {
                LOGGER.info("AVERAGE Function - Receive response with result " + value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                LOGGER.info("AVERAGE Function - Failed to receive response " + t);
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                LOGGER.info("AVERAGE Function - Complete receive response");
                finishLatch.countDown();
            }
        };
        StreamObserver<AverageRequest> requestObserver = asyncStub.average(responseObserver);
        try {
            // Send numPoints points randomly selected from the features list.
            for (int i = 0; i < numbers.size(); ++i) {
                LOGGER.info("AVERAGE Function - Send request # " + (i+1) + " with number " + numbers.get(i));
                AverageRequest request = AverageRequest.newBuilder().setNum(numbers.get(i)).build();
                requestObserver.onNext(request);
                // Sleep for a bit before sending the next one.
                Thread.sleep(1000);
                if (finishLatch.getCount() == 0) {
                    // RPC completed or errored before we finished sending.
                    // Sending further requests won't error, but they will just be thrown away.
                    return;
                }
            }
        } catch (RuntimeException | InterruptedException e) {
            // Cancel RPC
            requestObserver.onError(e);
            LOGGER.info("AVERAGE Function - Failed to send request " + e);
        }
        // Mark the end of requests
        requestObserver.onCompleted();
        LOGGER.info("AVERAGE Function - Complete send request");
        // Receiving happens asynchronously
        if (!finishLatch.await(1, TimeUnit.MINUTES)) {
            LOGGER.info("AVERAGE Function - Can not finish within 1 minutes");
        }
    }

    public void findMax() throws InterruptedException {
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<FindMaxRequest> requestObserver =
                asyncStub.findMax(new StreamObserver<FindMaxResponse>() {
                    @Override
                    public void onNext(FindMaxResponse response) {
                        LOGGER.info("Find Max Function - Receive response # with result " + response.getMax());
                    }

                    @Override
                    public void onError(Throwable t) {
                        LOGGER.info("Find Max Function - Failed to receive response " + t);
                        finishLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        LOGGER.info("Find Max Function - Finished receive response");
                        finishLatch.countDown();
                    }
                });

        try {
            for (Integer number : prepareNumbers() ) {
                FindMaxRequest request = FindMaxRequest.newBuilder().setNum(number).build();
                LOGGER.info("Find Max Function - Send request # with number " + number);
                requestObserver.onNext(request);
                Thread.sleep(1000);
            }
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        }
        // Mark the end of requests
        requestObserver.onCompleted();
        if (!finishLatch.await(1, TimeUnit.MINUTES)) {
            LOGGER.info("Find Max Function - Can not finish within 1 minutes");
        }
    }
    public static void main(String[] args){
        String target = "localhost:50069";
        String host = "localhost";
        int port = 50069;
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        try{
            CalculatorClient calculatorClient = new CalculatorClient(channel);
//            calculatorClient.sum(39, 79);
//            calculatorClient.pnd(100);
//            calculatorClient.average(prepareNumbers());
//            calculatorClient.findMax();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    static List<Integer> prepareNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(79);
        numbers.add(39);
        numbers.add(86);
        numbers.add(68);
        numbers.add(3272);
        return numbers;
    }
}
