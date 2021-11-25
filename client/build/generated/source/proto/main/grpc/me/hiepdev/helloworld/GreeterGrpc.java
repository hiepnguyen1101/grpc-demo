package me.hiepdev.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = me.hiepdev.helloworld.HelloRequest.class,
      responseType = me.hiepdev.helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloServerSideStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloServerSideStreaming",
      requestType = me.hiepdev.helloworld.HelloRequest.class,
      responseType = me.hiepdev.helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloServerSideStreamingMethod() {
    io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply> getSayHelloServerSideStreamingMethod;
    if ((getSayHelloServerSideStreamingMethod = GreeterGrpc.getSayHelloServerSideStreamingMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloServerSideStreamingMethod = GreeterGrpc.getSayHelloServerSideStreamingMethod) == null) {
          GreeterGrpc.getSayHelloServerSideStreamingMethod = getSayHelloServerSideStreamingMethod =
              io.grpc.MethodDescriptor.<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloServerSideStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloServerSideStreaming"))
              .build();
        }
      }
    }
    return getSayHelloServerSideStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloClientSideStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloClientSideStreaming",
      requestType = me.hiepdev.helloworld.HelloRequest.class,
      responseType = me.hiepdev.helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloClientSideStreamingMethod() {
    io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply> getSayHelloClientSideStreamingMethod;
    if ((getSayHelloClientSideStreamingMethod = GreeterGrpc.getSayHelloClientSideStreamingMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloClientSideStreamingMethod = GreeterGrpc.getSayHelloClientSideStreamingMethod) == null) {
          GreeterGrpc.getSayHelloClientSideStreamingMethod = getSayHelloClientSideStreamingMethod =
              io.grpc.MethodDescriptor.<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloClientSideStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloClientSideStreaming"))
              .build();
        }
      }
    }
    return getSayHelloClientSideStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloBidirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloBidirectionalStreaming",
      requestType = me.hiepdev.helloworld.HelloRequest.class,
      responseType = me.hiepdev.helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest,
      me.hiepdev.helloworld.HelloReply> getSayHelloBidirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply> getSayHelloBidirectionalStreamingMethod;
    if ((getSayHelloBidirectionalStreamingMethod = GreeterGrpc.getSayHelloBidirectionalStreamingMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloBidirectionalStreamingMethod = GreeterGrpc.getSayHelloBidirectionalStreamingMethod) == null) {
          GreeterGrpc.getSayHelloBidirectionalStreamingMethod = getSayHelloBidirectionalStreamingMethod =
              io.grpc.MethodDescriptor.<me.hiepdev.helloworld.HelloRequest, me.hiepdev.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloBidirectionalStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.hiepdev.helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloBidirectionalStreaming"))
              .build();
        }
      }
    }
    return getSayHelloBidirectionalStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(me.hiepdev.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloServerSideStreaming(me.hiepdev.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloServerSideStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloRequest> sayHelloClientSideStreaming(
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloClientSideStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloRequest> sayHelloBidirectionalStreaming(
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloBidirectionalStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                me.hiepdev.helloworld.HelloRequest,
                me.hiepdev.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloServerSideStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                me.hiepdev.helloworld.HelloRequest,
                me.hiepdev.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO_SERVER_SIDE_STREAMING)))
          .addMethod(
            getSayHelloClientSideStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                me.hiepdev.helloworld.HelloRequest,
                me.hiepdev.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO_CLIENT_SIDE_STREAMING)))
          .addMethod(
            getSayHelloBidirectionalStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                me.hiepdev.helloworld.HelloRequest,
                me.hiepdev.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO_BIDIRECTIONAL_STREAMING)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(me.hiepdev.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloServerSideStreaming(me.hiepdev.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayHelloServerSideStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloRequest> sayHelloClientSideStreaming(
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSayHelloClientSideStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloRequest> sayHelloBidirectionalStreaming(
        io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayHelloBidirectionalStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public me.hiepdev.helloworld.HelloReply sayHello(me.hiepdev.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<me.hiepdev.helloworld.HelloReply> sayHelloServerSideStreaming(
        me.hiepdev.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayHelloServerSideStreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<me.hiepdev.helloworld.HelloReply> sayHello(
        me.hiepdev.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_SERVER_SIDE_STREAMING = 1;
  private static final int METHODID_SAY_HELLO_CLIENT_SIDE_STREAMING = 2;
  private static final int METHODID_SAY_HELLO_BIDIRECTIONAL_STREAMING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((me.hiepdev.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_SERVER_SIDE_STREAMING:
          serviceImpl.sayHelloServerSideStreaming((me.hiepdev.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_CLIENT_SIDE_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloClientSideStreaming(
              (io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply>) responseObserver);
        case METHODID_SAY_HELLO_BIDIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloBidirectionalStreaming(
              (io.grpc.stub.StreamObserver<me.hiepdev.helloworld.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return me.hiepdev.helloworld.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloServerSideStreamingMethod())
              .addMethod(getSayHelloClientSideStreamingMethod())
              .addMethod(getSayHelloBidirectionalStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
