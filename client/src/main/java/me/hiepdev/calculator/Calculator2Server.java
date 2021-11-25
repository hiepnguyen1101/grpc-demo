package me.hiepdev.calculator;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Calculator2Server {
    private final io.grpc.Server server;
    private static class Calculator2Service extends CalculatorServiceGrpc.CalculatorServiceImplBase{
        @Override
        public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
            int result = 0;
            int a = request.getNum1();
            int b = request.getNum2();
            result = a + b;
            SumResponse response = SumResponse.newBuilder().setResult(result).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
    public Calculator2Server(int port){
        server = ServerBuilder.forPort(port).addService(new Calculator2Service())
                .build();
    }
    public static void main(String[] args) throws Exception {
        Calculator2Server calculator2Server = new Calculator2Server(50069);
        calculator2Server.start();
        calculator2Server.blockUntilShutdown();
    }
    public void start() throws IOException {
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    Calculator2Server.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }
    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}
