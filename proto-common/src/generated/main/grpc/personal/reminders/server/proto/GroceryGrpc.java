package personal.reminders.server.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Grocery.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GroceryGrpc {

  private GroceryGrpc() {}

  public static final String SERVICE_NAME = "personal.reminders.server.proto.Grocery";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<personal.reminders.server.proto.GroceryRequest,
      personal.reminders.server.proto.GroceryResponse> getSetGroceryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetGrocery",
      requestType = personal.reminders.server.proto.GroceryRequest.class,
      responseType = personal.reminders.server.proto.GroceryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<personal.reminders.server.proto.GroceryRequest,
      personal.reminders.server.proto.GroceryResponse> getSetGroceryMethod() {
    io.grpc.MethodDescriptor<personal.reminders.server.proto.GroceryRequest, personal.reminders.server.proto.GroceryResponse> getSetGroceryMethod;
    if ((getSetGroceryMethod = GroceryGrpc.getSetGroceryMethod) == null) {
      synchronized (GroceryGrpc.class) {
        if ((getSetGroceryMethod = GroceryGrpc.getSetGroceryMethod) == null) {
          GroceryGrpc.getSetGroceryMethod = getSetGroceryMethod =
              io.grpc.MethodDescriptor.<personal.reminders.server.proto.GroceryRequest, personal.reminders.server.proto.GroceryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetGrocery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  personal.reminders.server.proto.GroceryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  personal.reminders.server.proto.GroceryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroceryMethodDescriptorSupplier("SetGrocery"))
              .build();
        }
      }
    }
    return getSetGroceryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      personal.reminders.server.proto.ListGroceriesResponse> getListGroceriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroceries",
      requestType = com.google.protobuf.Empty.class,
      responseType = personal.reminders.server.proto.ListGroceriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      personal.reminders.server.proto.ListGroceriesResponse> getListGroceriesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, personal.reminders.server.proto.ListGroceriesResponse> getListGroceriesMethod;
    if ((getListGroceriesMethod = GroceryGrpc.getListGroceriesMethod) == null) {
      synchronized (GroceryGrpc.class) {
        if ((getListGroceriesMethod = GroceryGrpc.getListGroceriesMethod) == null) {
          GroceryGrpc.getListGroceriesMethod = getListGroceriesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, personal.reminders.server.proto.ListGroceriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroceries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  personal.reminders.server.proto.ListGroceriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroceryMethodDescriptorSupplier("ListGroceries"))
              .build();
        }
      }
    }
    return getListGroceriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroceryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroceryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroceryStub>() {
        @java.lang.Override
        public GroceryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroceryStub(channel, callOptions);
        }
      };
    return GroceryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroceryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroceryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroceryBlockingStub>() {
        @java.lang.Override
        public GroceryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroceryBlockingStub(channel, callOptions);
        }
      };
    return GroceryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroceryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroceryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroceryFutureStub>() {
        @java.lang.Override
        public GroceryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroceryFutureStub(channel, callOptions);
        }
      };
    return GroceryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GroceryImplBase implements io.grpc.BindableService {

    /**
     */
    public void setGrocery(personal.reminders.server.proto.GroceryRequest request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.GroceryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetGroceryMethod(), responseObserver);
    }

    /**
     */
    public void listGroceries(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.ListGroceriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGroceriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetGroceryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                personal.reminders.server.proto.GroceryRequest,
                personal.reminders.server.proto.GroceryResponse>(
                  this, METHODID_SET_GROCERY)))
          .addMethod(
            getListGroceriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                personal.reminders.server.proto.ListGroceriesResponse>(
                  this, METHODID_LIST_GROCERIES)))
          .build();
    }
  }

  /**
   */
  public static final class GroceryStub extends io.grpc.stub.AbstractAsyncStub<GroceryStub> {
    private GroceryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroceryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroceryStub(channel, callOptions);
    }

    /**
     */
    public void setGrocery(personal.reminders.server.proto.GroceryRequest request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.GroceryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetGroceryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listGroceries(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.ListGroceriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGroceriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroceryBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroceryBlockingStub> {
    private GroceryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroceryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroceryBlockingStub(channel, callOptions);
    }

    /**
     */
    public personal.reminders.server.proto.GroceryResponse setGrocery(personal.reminders.server.proto.GroceryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetGroceryMethod(), getCallOptions(), request);
    }

    /**
     */
    public personal.reminders.server.proto.ListGroceriesResponse listGroceries(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroceriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroceryFutureStub extends io.grpc.stub.AbstractFutureStub<GroceryFutureStub> {
    private GroceryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroceryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroceryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<personal.reminders.server.proto.GroceryResponse> setGrocery(
        personal.reminders.server.proto.GroceryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetGroceryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<personal.reminders.server.proto.ListGroceriesResponse> listGroceries(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGroceriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_GROCERY = 0;
  private static final int METHODID_LIST_GROCERIES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroceryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroceryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_GROCERY:
          serviceImpl.setGrocery((personal.reminders.server.proto.GroceryRequest) request,
              (io.grpc.stub.StreamObserver<personal.reminders.server.proto.GroceryResponse>) responseObserver);
          break;
        case METHODID_LIST_GROCERIES:
          serviceImpl.listGroceries((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<personal.reminders.server.proto.ListGroceriesResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GroceryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroceryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return personal.reminders.server.proto.GroceryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Grocery");
    }
  }

  private static final class GroceryFileDescriptorSupplier
      extends GroceryBaseDescriptorSupplier {
    GroceryFileDescriptorSupplier() {}
  }

  private static final class GroceryMethodDescriptorSupplier
      extends GroceryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroceryMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroceryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroceryFileDescriptorSupplier())
              .addMethod(getSetGroceryMethod())
              .addMethod(getListGroceriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
