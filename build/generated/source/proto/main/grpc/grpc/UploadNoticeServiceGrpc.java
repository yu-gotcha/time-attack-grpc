package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: UploadNoticeService.proto")
public final class UploadNoticeServiceGrpc {

  private UploadNoticeServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.UploadNoticeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.UploadNoticeServiceOuterClass.ProcessingRequest,
      grpc.UploadNoticeServiceOuterClass.ProcessingResponse> getDoProcessUploadedImageAndVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doProcessUploadedImageAndVideo",
      requestType = grpc.UploadNoticeServiceOuterClass.ProcessingRequest.class,
      responseType = grpc.UploadNoticeServiceOuterClass.ProcessingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UploadNoticeServiceOuterClass.ProcessingRequest,
      grpc.UploadNoticeServiceOuterClass.ProcessingResponse> getDoProcessUploadedImageAndVideoMethod() {
    io.grpc.MethodDescriptor<grpc.UploadNoticeServiceOuterClass.ProcessingRequest, grpc.UploadNoticeServiceOuterClass.ProcessingResponse> getDoProcessUploadedImageAndVideoMethod;
    if ((getDoProcessUploadedImageAndVideoMethod = UploadNoticeServiceGrpc.getDoProcessUploadedImageAndVideoMethod) == null) {
      synchronized (UploadNoticeServiceGrpc.class) {
        if ((getDoProcessUploadedImageAndVideoMethod = UploadNoticeServiceGrpc.getDoProcessUploadedImageAndVideoMethod) == null) {
          UploadNoticeServiceGrpc.getDoProcessUploadedImageAndVideoMethod = getDoProcessUploadedImageAndVideoMethod =
              io.grpc.MethodDescriptor.<grpc.UploadNoticeServiceOuterClass.ProcessingRequest, grpc.UploadNoticeServiceOuterClass.ProcessingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doProcessUploadedImageAndVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UploadNoticeServiceOuterClass.ProcessingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UploadNoticeServiceOuterClass.ProcessingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UploadNoticeServiceMethodDescriptorSupplier("doProcessUploadedImageAndVideo"))
              .build();
        }
      }
    }
    return getDoProcessUploadedImageAndVideoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UploadNoticeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadNoticeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadNoticeServiceStub>() {
        @java.lang.Override
        public UploadNoticeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadNoticeServiceStub(channel, callOptions);
        }
      };
    return UploadNoticeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UploadNoticeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadNoticeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadNoticeServiceBlockingStub>() {
        @java.lang.Override
        public UploadNoticeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadNoticeServiceBlockingStub(channel, callOptions);
        }
      };
    return UploadNoticeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UploadNoticeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadNoticeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadNoticeServiceFutureStub>() {
        @java.lang.Override
        public UploadNoticeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadNoticeServiceFutureStub(channel, callOptions);
        }
      };
    return UploadNoticeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UploadNoticeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void doProcessUploadedImageAndVideo(grpc.UploadNoticeServiceOuterClass.ProcessingRequest request,
        io.grpc.stub.StreamObserver<grpc.UploadNoticeServiceOuterClass.ProcessingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoProcessUploadedImageAndVideoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoProcessUploadedImageAndVideoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.UploadNoticeServiceOuterClass.ProcessingRequest,
                grpc.UploadNoticeServiceOuterClass.ProcessingResponse>(
                  this, METHODID_DO_PROCESS_UPLOADED_IMAGE_AND_VIDEO)))
          .build();
    }
  }

  /**
   */
  public static final class UploadNoticeServiceStub extends io.grpc.stub.AbstractAsyncStub<UploadNoticeServiceStub> {
    private UploadNoticeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadNoticeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadNoticeServiceStub(channel, callOptions);
    }

    /**
     */
    public void doProcessUploadedImageAndVideo(grpc.UploadNoticeServiceOuterClass.ProcessingRequest request,
        io.grpc.stub.StreamObserver<grpc.UploadNoticeServiceOuterClass.ProcessingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoProcessUploadedImageAndVideoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UploadNoticeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UploadNoticeServiceBlockingStub> {
    private UploadNoticeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadNoticeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadNoticeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.UploadNoticeServiceOuterClass.ProcessingResponse doProcessUploadedImageAndVideo(grpc.UploadNoticeServiceOuterClass.ProcessingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoProcessUploadedImageAndVideoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UploadNoticeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UploadNoticeServiceFutureStub> {
    private UploadNoticeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadNoticeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadNoticeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.UploadNoticeServiceOuterClass.ProcessingResponse> doProcessUploadedImageAndVideo(
        grpc.UploadNoticeServiceOuterClass.ProcessingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoProcessUploadedImageAndVideoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_PROCESS_UPLOADED_IMAGE_AND_VIDEO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UploadNoticeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UploadNoticeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_PROCESS_UPLOADED_IMAGE_AND_VIDEO:
          serviceImpl.doProcessUploadedImageAndVideo((grpc.UploadNoticeServiceOuterClass.ProcessingRequest) request,
              (io.grpc.stub.StreamObserver<grpc.UploadNoticeServiceOuterClass.ProcessingResponse>) responseObserver);
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

  private static abstract class UploadNoticeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UploadNoticeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.UploadNoticeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UploadNoticeService");
    }
  }

  private static final class UploadNoticeServiceFileDescriptorSupplier
      extends UploadNoticeServiceBaseDescriptorSupplier {
    UploadNoticeServiceFileDescriptorSupplier() {}
  }

  private static final class UploadNoticeServiceMethodDescriptorSupplier
      extends UploadNoticeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UploadNoticeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UploadNoticeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UploadNoticeServiceFileDescriptorSupplier())
              .addMethod(getDoProcessUploadedImageAndVideoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
