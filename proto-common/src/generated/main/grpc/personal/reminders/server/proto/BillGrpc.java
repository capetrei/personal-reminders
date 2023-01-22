package personal.reminders.server.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Bill.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillGrpc {

  private BillGrpc() {}

  public static final String SERVICE_NAME = "personal.reminders.server.proto.Bill";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<personal.reminders.server.proto.BillRequest,
      personal.reminders.server.proto.BillResponse> getSetBillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetBill",
      requestType = personal.reminders.server.proto.BillRequest.class,
      responseType = personal.reminders.server.proto.BillResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<personal.reminders.server.proto.BillRequest,
      personal.reminders.server.proto.BillResponse> getSetBillMethod() {
    io.grpc.MethodDescriptor<personal.reminders.server.proto.BillRequest, personal.reminders.server.proto.BillResponse> getSetBillMethod;
    if ((getSetBillMethod = BillGrpc.getSetBillMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getSetBillMethod = BillGrpc.getSetBillMethod) == null) {
          BillGrpc.getSetBillMethod = getSetBillMethod =
              io.grpc.MethodDescriptor.<personal.reminders.server.proto.BillRequest, personal.reminders.server.proto.BillResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetBill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  personal.reminders.server.proto.BillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  personal.reminders.server.proto.BillResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillMethodDescriptorSupplier("SetBill"))
              .build();
        }
      }
    }
    return getSetBillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      personal.reminders.server.proto.ListBillsResponse> getListBillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBills",
      requestType = com.google.protobuf.Empty.class,
      responseType = personal.reminders.server.proto.ListBillsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      personal.reminders.server.proto.ListBillsResponse> getListBillsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, personal.reminders.server.proto.ListBillsResponse> getListBillsMethod;
    if ((getListBillsMethod = BillGrpc.getListBillsMethod) == null) {
      synchronized (BillGrpc.class) {
        if ((getListBillsMethod = BillGrpc.getListBillsMethod) == null) {
          BillGrpc.getListBillsMethod = getListBillsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, personal.reminders.server.proto.ListBillsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  personal.reminders.server.proto.ListBillsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillMethodDescriptorSupplier("ListBills"))
              .build();
        }
      }
    }
    return getListBillsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillStub>() {
        @java.lang.Override
        public BillStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillStub(channel, callOptions);
        }
      };
    return BillStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillBlockingStub>() {
        @java.lang.Override
        public BillBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillBlockingStub(channel, callOptions);
        }
      };
    return BillBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillFutureStub>() {
        @java.lang.Override
        public BillFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillFutureStub(channel, callOptions);
        }
      };
    return BillFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BillImplBase implements io.grpc.BindableService {

    /**
     */
    public void setBill(personal.reminders.server.proto.BillRequest request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.BillResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetBillMethod(), responseObserver);
    }

    /**
     */
    public void listBills(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.ListBillsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBillsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetBillMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                personal.reminders.server.proto.BillRequest,
                personal.reminders.server.proto.BillResponse>(
                  this, METHODID_SET_BILL)))
          .addMethod(
            getListBillsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                personal.reminders.server.proto.ListBillsResponse>(
                  this, METHODID_LIST_BILLS)))
          .build();
    }
  }

  /**
   */
  public static final class BillStub extends io.grpc.stub.AbstractAsyncStub<BillStub> {
    private BillStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillStub(channel, callOptions);
    }

    /**
     */
    public void setBill(personal.reminders.server.proto.BillRequest request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.BillResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetBillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBills(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<personal.reminders.server.proto.ListBillsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBillsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BillBlockingStub extends io.grpc.stub.AbstractBlockingStub<BillBlockingStub> {
    private BillBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillBlockingStub(channel, callOptions);
    }

    /**
     */
    public personal.reminders.server.proto.BillResponse setBill(personal.reminders.server.proto.BillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBillMethod(), getCallOptions(), request);
    }

    /**
     */
    public personal.reminders.server.proto.ListBillsResponse listBills(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBillsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BillFutureStub extends io.grpc.stub.AbstractFutureStub<BillFutureStub> {
    private BillFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<personal.reminders.server.proto.BillResponse> setBill(
        personal.reminders.server.proto.BillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetBillMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<personal.reminders.server.proto.ListBillsResponse> listBills(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBillsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_BILL = 0;
  private static final int METHODID_LIST_BILLS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BillImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BillImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_BILL:
          serviceImpl.setBill((personal.reminders.server.proto.BillRequest) request,
              (io.grpc.stub.StreamObserver<personal.reminders.server.proto.BillResponse>) responseObserver);
          break;
        case METHODID_LIST_BILLS:
          serviceImpl.listBills((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<personal.reminders.server.proto.ListBillsResponse>) responseObserver);
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

  private static abstract class BillBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return personal.reminders.server.proto.BillOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Bill");
    }
  }

  private static final class BillFileDescriptorSupplier
      extends BillBaseDescriptorSupplier {
    BillFileDescriptorSupplier() {}
  }

  private static final class BillMethodDescriptorSupplier
      extends BillBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillFileDescriptorSupplier())
              .addMethod(getSetBillMethod())
              .addMethod(getListBillsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
