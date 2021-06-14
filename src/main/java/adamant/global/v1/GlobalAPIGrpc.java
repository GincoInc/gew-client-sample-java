package adamant.global.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto")
public final class GlobalAPIGrpc {

  private GlobalAPIGrpc() {}

  public static final String SERVICE_NAME = "adamant.global.v1.GlobalAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateWalletRequest,
      adamant.global.v1.CreateWalletResponse> getCreateWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWallet",
      requestType = adamant.global.v1.CreateWalletRequest.class,
      responseType = adamant.global.v1.CreateWalletResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateWalletRequest,
      adamant.global.v1.CreateWalletResponse> getCreateWalletMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateWalletRequest, adamant.global.v1.CreateWalletResponse> getCreateWalletMethod;
    if ((getCreateWalletMethod = GlobalAPIGrpc.getCreateWalletMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreateWalletMethod = GlobalAPIGrpc.getCreateWalletMethod) == null) {
          GlobalAPIGrpc.getCreateWalletMethod = getCreateWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateWalletRequest, adamant.global.v1.CreateWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateWalletResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreateWallet"))
              .build();
        }
      }
    }
    return getCreateWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetWalletRequest,
      adamant.global.v1.Model.Wallet> getGetWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWallet",
      requestType = adamant.global.v1.GetWalletRequest.class,
      responseType = adamant.global.v1.Model.Wallet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetWalletRequest,
      adamant.global.v1.Model.Wallet> getGetWalletMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetWalletRequest, adamant.global.v1.Model.Wallet> getGetWalletMethod;
    if ((getGetWalletMethod = GlobalAPIGrpc.getGetWalletMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetWalletMethod = GlobalAPIGrpc.getGetWalletMethod) == null) {
          GlobalAPIGrpc.getGetWalletMethod = getGetWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetWalletRequest, adamant.global.v1.Model.Wallet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Wallet.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetWallet"))
              .build();
        }
      }
    }
    return getGetWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CancelWalletRequest,
      com.google.protobuf.Empty> getCancelWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelWallet",
      requestType = adamant.global.v1.CancelWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CancelWalletRequest,
      com.google.protobuf.Empty> getCancelWalletMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CancelWalletRequest, com.google.protobuf.Empty> getCancelWalletMethod;
    if ((getCancelWalletMethod = GlobalAPIGrpc.getCancelWalletMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCancelWalletMethod = GlobalAPIGrpc.getCancelWalletMethod) == null) {
          GlobalAPIGrpc.getCancelWalletMethod = getCancelWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CancelWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CancelWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CancelWallet"))
              .build();
        }
      }
    }
    return getCancelWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ArchiveWalletRequest,
      com.google.protobuf.Empty> getArchiveWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveWallet",
      requestType = adamant.global.v1.ArchiveWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ArchiveWalletRequest,
      com.google.protobuf.Empty> getArchiveWalletMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ArchiveWalletRequest, com.google.protobuf.Empty> getArchiveWalletMethod;
    if ((getArchiveWalletMethod = GlobalAPIGrpc.getArchiveWalletMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getArchiveWalletMethod = GlobalAPIGrpc.getArchiveWalletMethod) == null) {
          GlobalAPIGrpc.getArchiveWalletMethod = getArchiveWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ArchiveWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ArchiveWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ArchiveWallet"))
              .build();
        }
      }
    }
    return getArchiveWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UnArchiveWalletRequest,
      com.google.protobuf.Empty> getUnArchiveWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnArchiveWallet",
      requestType = adamant.global.v1.UnArchiveWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UnArchiveWalletRequest,
      com.google.protobuf.Empty> getUnArchiveWalletMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UnArchiveWalletRequest, com.google.protobuf.Empty> getUnArchiveWalletMethod;
    if ((getUnArchiveWalletMethod = GlobalAPIGrpc.getUnArchiveWalletMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUnArchiveWalletMethod = GlobalAPIGrpc.getUnArchiveWalletMethod) == null) {
          GlobalAPIGrpc.getUnArchiveWalletMethod = getUnArchiveWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UnArchiveWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnArchiveWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UnArchiveWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UnArchiveWallet"))
              .build();
        }
      }
    }
    return getUnArchiveWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWallets",
      requestType = adamant.global.v1.ListWalletsRequest.class,
      responseType = adamant.global.v1.ListWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsRequest, adamant.global.v1.ListWalletsResponse> getListWalletsMethod;
    if ((getListWalletsMethod = GlobalAPIGrpc.getListWalletsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListWalletsMethod = GlobalAPIGrpc.getListWalletsMethod) == null) {
          GlobalAPIGrpc.getListWalletsMethod = getListWalletsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListWalletsRequest, adamant.global.v1.ListWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWallets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListWallets"))
              .build();
        }
      }
    }
    return getListWalletsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsByFilterRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWalletsByFilter",
      requestType = adamant.global.v1.ListWalletsByFilterRequest.class,
      responseType = adamant.global.v1.ListWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsByFilterRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsByFilterRequest, adamant.global.v1.ListWalletsResponse> getListWalletsByFilterMethod;
    if ((getListWalletsByFilterMethod = GlobalAPIGrpc.getListWalletsByFilterMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListWalletsByFilterMethod = GlobalAPIGrpc.getListWalletsByFilterMethod) == null) {
          GlobalAPIGrpc.getListWalletsByFilterMethod = getListWalletsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListWalletsByFilterRequest, adamant.global.v1.ListWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWalletsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListWalletsByFilter"))
              .build();
        }
      }
    }
    return getListWalletsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListBaseWalletsRequest,
      adamant.global.v1.ListBaseWalletsResponse> getListBaseWalletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBaseWallets",
      requestType = adamant.global.v1.ListBaseWalletsRequest.class,
      responseType = adamant.global.v1.ListBaseWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListBaseWalletsRequest,
      adamant.global.v1.ListBaseWalletsResponse> getListBaseWalletsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListBaseWalletsRequest, adamant.global.v1.ListBaseWalletsResponse> getListBaseWalletsMethod;
    if ((getListBaseWalletsMethod = GlobalAPIGrpc.getListBaseWalletsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListBaseWalletsMethod = GlobalAPIGrpc.getListBaseWalletsMethod) == null) {
          GlobalAPIGrpc.getListBaseWalletsMethod = getListBaseWalletsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListBaseWalletsRequest, adamant.global.v1.ListBaseWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBaseWallets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBaseWalletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBaseWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListBaseWallets"))
              .build();
        }
      }
    }
    return getListBaseWalletsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletNameRequest,
      com.google.protobuf.Empty> getUpdateWalletNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWalletName",
      requestType = adamant.global.v1.UpdateWalletNameRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletNameRequest,
      com.google.protobuf.Empty> getUpdateWalletNameMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletNameRequest, com.google.protobuf.Empty> getUpdateWalletNameMethod;
    if ((getUpdateWalletNameMethod = GlobalAPIGrpc.getUpdateWalletNameMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateWalletNameMethod = GlobalAPIGrpc.getUpdateWalletNameMethod) == null) {
          GlobalAPIGrpc.getUpdateWalletNameMethod = getUpdateWalletNameMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateWalletNameRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWalletName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateWalletNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateWalletName"))
              .build();
        }
      }
    }
    return getUpdateWalletNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletValidationRequest,
      com.google.protobuf.Empty> getUpdateWalletValidationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWalletValidation",
      requestType = adamant.global.v1.UpdateWalletValidationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletValidationRequest,
      com.google.protobuf.Empty> getUpdateWalletValidationMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletValidationRequest, com.google.protobuf.Empty> getUpdateWalletValidationMethod;
    if ((getUpdateWalletValidationMethod = GlobalAPIGrpc.getUpdateWalletValidationMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateWalletValidationMethod = GlobalAPIGrpc.getUpdateWalletValidationMethod) == null) {
          GlobalAPIGrpc.getUpdateWalletValidationMethod = getUpdateWalletValidationMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateWalletValidationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWalletValidation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateWalletValidationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateWalletValidation"))
              .build();
        }
      }
    }
    return getUpdateWalletValidationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletPolicyRequest,
      com.google.protobuf.Empty> getUpdateWalletPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWalletPolicy",
      requestType = adamant.global.v1.UpdateWalletPolicyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletPolicyRequest,
      com.google.protobuf.Empty> getUpdateWalletPolicyMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateWalletPolicyRequest, com.google.protobuf.Empty> getUpdateWalletPolicyMethod;
    if ((getUpdateWalletPolicyMethod = GlobalAPIGrpc.getUpdateWalletPolicyMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateWalletPolicyMethod = GlobalAPIGrpc.getUpdateWalletPolicyMethod) == null) {
          GlobalAPIGrpc.getUpdateWalletPolicyMethod = getUpdateWalletPolicyMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateWalletPolicyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWalletPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateWalletPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateWalletPolicy"))
              .build();
        }
      }
    }
    return getUpdateWalletPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ReviewWalletProposalRequest,
      com.google.protobuf.Empty> getReviewWalletProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewWalletProposal",
      requestType = adamant.global.v1.ReviewWalletProposalRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ReviewWalletProposalRequest,
      com.google.protobuf.Empty> getReviewWalletProposalMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ReviewWalletProposalRequest, com.google.protobuf.Empty> getReviewWalletProposalMethod;
    if ((getReviewWalletProposalMethod = GlobalAPIGrpc.getReviewWalletProposalMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getReviewWalletProposalMethod = GlobalAPIGrpc.getReviewWalletProposalMethod) == null) {
          GlobalAPIGrpc.getReviewWalletProposalMethod = getReviewWalletProposalMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ReviewWalletProposalRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewWalletProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ReviewWalletProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ReviewWalletProposal"))
              .build();
        }
      }
    }
    return getReviewWalletProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.FlushBalanceRequest,
      adamant.global.v1.FlushBalanceResponse> getFlushBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FlushBalance",
      requestType = adamant.global.v1.FlushBalanceRequest.class,
      responseType = adamant.global.v1.FlushBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.FlushBalanceRequest,
      adamant.global.v1.FlushBalanceResponse> getFlushBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.FlushBalanceRequest, adamant.global.v1.FlushBalanceResponse> getFlushBalanceMethod;
    if ((getFlushBalanceMethod = GlobalAPIGrpc.getFlushBalanceMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getFlushBalanceMethod = GlobalAPIGrpc.getFlushBalanceMethod) == null) {
          GlobalAPIGrpc.getFlushBalanceMethod = getFlushBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.FlushBalanceRequest, adamant.global.v1.FlushBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FlushBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.FlushBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.FlushBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("FlushBalance"))
              .build();
        }
      }
    }
    return getFlushBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ApproveWalletRequest,
      com.google.protobuf.Empty> getApproveWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveWallet",
      requestType = adamant.global.v1.ApproveWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ApproveWalletRequest,
      com.google.protobuf.Empty> getApproveWalletMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ApproveWalletRequest, com.google.protobuf.Empty> getApproveWalletMethod;
    if ((getApproveWalletMethod = GlobalAPIGrpc.getApproveWalletMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getApproveWalletMethod = GlobalAPIGrpc.getApproveWalletMethod) == null) {
          GlobalAPIGrpc.getApproveWalletMethod = getApproveWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ApproveWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ApproveWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ApproveWallet"))
              .build();
        }
      }
    }
    return getApproveWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ApproveTransactionRequest,
      com.google.protobuf.Empty> getApproveTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveTransaction",
      requestType = adamant.global.v1.ApproveTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ApproveTransactionRequest,
      com.google.protobuf.Empty> getApproveTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ApproveTransactionRequest, com.google.protobuf.Empty> getApproveTransactionMethod;
    if ((getApproveTransactionMethod = GlobalAPIGrpc.getApproveTransactionMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getApproveTransactionMethod = GlobalAPIGrpc.getApproveTransactionMethod) == null) {
          GlobalAPIGrpc.getApproveTransactionMethod = getApproveTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ApproveTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ApproveTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ApproveTransaction"))
              .build();
        }
      }
    }
    return getApproveTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateAddressRequest,
      adamant.global.v1.CreateAddressResponse> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = adamant.global.v1.CreateAddressRequest.class,
      responseType = adamant.global.v1.CreateAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateAddressRequest,
      adamant.global.v1.CreateAddressResponse> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateAddressRequest, adamant.global.v1.CreateAddressResponse> getCreateAddressMethod;
    if ((getCreateAddressMethod = GlobalAPIGrpc.getCreateAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreateAddressMethod = GlobalAPIGrpc.getCreateAddressMethod) == null) {
          GlobalAPIGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateAddressRequest, adamant.global.v1.CreateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreateAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddress",
      requestType = adamant.global.v1.GetAddressRequest.class,
      responseType = adamant.global.v1.Model.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetAddressRequest, adamant.global.v1.Model.Address> getGetAddressMethod;
    if ((getGetAddressMethod = GlobalAPIGrpc.getGetAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetAddressMethod = GlobalAPIGrpc.getGetAddressMethod) == null) {
          GlobalAPIGrpc.getGetAddressMethod = getGetAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetAddress"))
              .build();
        }
      }
    }
    return getGetAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressByAddress",
      requestType = adamant.global.v1.GetAddressByAddressRequest.class,
      responseType = adamant.global.v1.Model.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressByAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressRequest, adamant.global.v1.Model.Address> getGetAddressByAddressMethod;
    if ((getGetAddressByAddressMethod = GlobalAPIGrpc.getGetAddressByAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetAddressByAddressMethod = GlobalAPIGrpc.getGetAddressByAddressMethod) == null) {
          GlobalAPIGrpc.getGetAddressByAddressMethod = getGetAddressByAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressByAddressRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetAddressByAddress"))
              .build();
        }
      }
    }
    return getGetAddressByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByIndexRequest,
      adamant.global.v1.Model.Address> getGetAddressByIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressByIndex",
      requestType = adamant.global.v1.GetAddressByIndexRequest.class,
      responseType = adamant.global.v1.Model.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByIndexRequest,
      adamant.global.v1.Model.Address> getGetAddressByIndexMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByIndexRequest, adamant.global.v1.Model.Address> getGetAddressByIndexMethod;
    if ((getGetAddressByIndexMethod = GlobalAPIGrpc.getGetAddressByIndexMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetAddressByIndexMethod = GlobalAPIGrpc.getGetAddressByIndexMethod) == null) {
          GlobalAPIGrpc.getGetAddressByIndexMethod = getGetAddressByIndexMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressByIndexRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressByIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetAddressByIndex"))
              .build();
        }
      }
    }
    return getGetAddressByIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesRequest,
      adamant.global.v1.ListAddressesResponse> getListAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAddresses",
      requestType = adamant.global.v1.ListAddressesRequest.class,
      responseType = adamant.global.v1.ListAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesRequest,
      adamant.global.v1.ListAddressesResponse> getListAddressesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesRequest, adamant.global.v1.ListAddressesResponse> getListAddressesMethod;
    if ((getListAddressesMethod = GlobalAPIGrpc.getListAddressesMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListAddressesMethod = GlobalAPIGrpc.getListAddressesMethod) == null) {
          GlobalAPIGrpc.getListAddressesMethod = getListAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListAddressesRequest, adamant.global.v1.ListAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListAddresses"))
              .build();
        }
      }
    }
    return getListAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesWithBalanceRequest,
      adamant.global.v1.ListAddressesWithBalanceResponse> getListAddressesWithBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAddressesWithBalance",
      requestType = adamant.global.v1.ListAddressesWithBalanceRequest.class,
      responseType = adamant.global.v1.ListAddressesWithBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesWithBalanceRequest,
      adamant.global.v1.ListAddressesWithBalanceResponse> getListAddressesWithBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesWithBalanceRequest, adamant.global.v1.ListAddressesWithBalanceResponse> getListAddressesWithBalanceMethod;
    if ((getListAddressesWithBalanceMethod = GlobalAPIGrpc.getListAddressesWithBalanceMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListAddressesWithBalanceMethod = GlobalAPIGrpc.getListAddressesWithBalanceMethod) == null) {
          GlobalAPIGrpc.getListAddressesWithBalanceMethod = getListAddressesWithBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListAddressesWithBalanceRequest, adamant.global.v1.ListAddressesWithBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAddressesWithBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesWithBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesWithBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListAddressesWithBalance"))
              .build();
        }
      }
    }
    return getListAddressesWithBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateAddressBalanceRequest,
      com.google.protobuf.Empty> getUpdateAddressBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAddressBalance",
      requestType = adamant.global.v1.UpdateAddressBalanceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateAddressBalanceRequest,
      com.google.protobuf.Empty> getUpdateAddressBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateAddressBalanceRequest, com.google.protobuf.Empty> getUpdateAddressBalanceMethod;
    if ((getUpdateAddressBalanceMethod = GlobalAPIGrpc.getUpdateAddressBalanceMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateAddressBalanceMethod = GlobalAPIGrpc.getUpdateAddressBalanceMethod) == null) {
          GlobalAPIGrpc.getUpdateAddressBalanceMethod = getUpdateAddressBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateAddressBalanceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAddressBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateAddressBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateAddressBalance"))
              .build();
        }
      }
    }
    return getUpdateAddressBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetEthereumFeeAddressRequest,
      adamant.global.v1.Model.EthereumFeeAddress> getGetEthereumFeeAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEthereumFeeAddress",
      requestType = adamant.global.v1.GetEthereumFeeAddressRequest.class,
      responseType = adamant.global.v1.Model.EthereumFeeAddress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetEthereumFeeAddressRequest,
      adamant.global.v1.Model.EthereumFeeAddress> getGetEthereumFeeAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetEthereumFeeAddressRequest, adamant.global.v1.Model.EthereumFeeAddress> getGetEthereumFeeAddressMethod;
    if ((getGetEthereumFeeAddressMethod = GlobalAPIGrpc.getGetEthereumFeeAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetEthereumFeeAddressMethod = GlobalAPIGrpc.getGetEthereumFeeAddressMethod) == null) {
          GlobalAPIGrpc.getGetEthereumFeeAddressMethod = getGetEthereumFeeAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetEthereumFeeAddressRequest, adamant.global.v1.Model.EthereumFeeAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEthereumFeeAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetEthereumFeeAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.EthereumFeeAddress.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetEthereumFeeAddress"))
              .build();
        }
      }
    }
    return getGetEthereumFeeAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.RegisterKeyRequest,
      adamant.global.v1.RegisterKeyResponse> getRegisterKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterKey",
      requestType = adamant.global.v1.RegisterKeyRequest.class,
      responseType = adamant.global.v1.RegisterKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.RegisterKeyRequest,
      adamant.global.v1.RegisterKeyResponse> getRegisterKeyMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.RegisterKeyRequest, adamant.global.v1.RegisterKeyResponse> getRegisterKeyMethod;
    if ((getRegisterKeyMethod = GlobalAPIGrpc.getRegisterKeyMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getRegisterKeyMethod = GlobalAPIGrpc.getRegisterKeyMethod) == null) {
          GlobalAPIGrpc.getRegisterKeyMethod = getRegisterKeyMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.RegisterKeyRequest, adamant.global.v1.RegisterKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.RegisterKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.RegisterKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("RegisterKey"))
              .build();
        }
      }
    }
    return getRegisterKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateTransactionRequest,
      adamant.global.v1.CreateTransactionResponse> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = adamant.global.v1.CreateTransactionRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateTransactionRequest,
      adamant.global.v1.CreateTransactionResponse> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateTransactionRequest, adamant.global.v1.CreateTransactionResponse> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = GlobalAPIGrpc.getCreateTransactionMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreateTransactionMethod = GlobalAPIGrpc.getCreateTransactionMethod) == null) {
          GlobalAPIGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateTransactionRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateXRPInitTransactionsRequest,
      com.google.protobuf.Empty> getCreateXRPInitTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateXRPInitTransactions",
      requestType = adamant.global.v1.CreateXRPInitTransactionsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateXRPInitTransactionsRequest,
      com.google.protobuf.Empty> getCreateXRPInitTransactionsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateXRPInitTransactionsRequest, com.google.protobuf.Empty> getCreateXRPInitTransactionsMethod;
    if ((getCreateXRPInitTransactionsMethod = GlobalAPIGrpc.getCreateXRPInitTransactionsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreateXRPInitTransactionsMethod = GlobalAPIGrpc.getCreateXRPInitTransactionsMethod) == null) {
          GlobalAPIGrpc.getCreateXRPInitTransactionsMethod = getCreateXRPInitTransactionsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateXRPInitTransactionsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateXRPInitTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateXRPInitTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreateXRPInitTransactions"))
              .build();
        }
      }
    }
    return getCreateXRPInitTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.SignTransactionRequest,
      com.google.protobuf.Empty> getSignTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignTransaction",
      requestType = adamant.global.v1.SignTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.SignTransactionRequest,
      com.google.protobuf.Empty> getSignTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.SignTransactionRequest, com.google.protobuf.Empty> getSignTransactionMethod;
    if ((getSignTransactionMethod = GlobalAPIGrpc.getSignTransactionMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getSignTransactionMethod = GlobalAPIGrpc.getSignTransactionMethod) == null) {
          GlobalAPIGrpc.getSignTransactionMethod = getSignTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SignTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SignTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("SignTransaction"))
              .build();
        }
      }
    }
    return getSignTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.SignXRPInitTransactionsRequest,
      com.google.protobuf.Empty> getSignXRPInitTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignXRPInitTransactions",
      requestType = adamant.global.v1.SignXRPInitTransactionsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.SignXRPInitTransactionsRequest,
      com.google.protobuf.Empty> getSignXRPInitTransactionsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.SignXRPInitTransactionsRequest, com.google.protobuf.Empty> getSignXRPInitTransactionsMethod;
    if ((getSignXRPInitTransactionsMethod = GlobalAPIGrpc.getSignXRPInitTransactionsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getSignXRPInitTransactionsMethod = GlobalAPIGrpc.getSignXRPInitTransactionsMethod) == null) {
          GlobalAPIGrpc.getSignXRPInitTransactionsMethod = getSignXRPInitTransactionsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SignXRPInitTransactionsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignXRPInitTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SignXRPInitTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("SignXRPInitTransactions"))
              .build();
        }
      }
    }
    return getSignXRPInitTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.SendTransactionRequest,
      adamant.global.v1.SendTransactionResponse> getSendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTransaction",
      requestType = adamant.global.v1.SendTransactionRequest.class,
      responseType = adamant.global.v1.SendTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.SendTransactionRequest,
      adamant.global.v1.SendTransactionResponse> getSendTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.SendTransactionRequest, adamant.global.v1.SendTransactionResponse> getSendTransactionMethod;
    if ((getSendTransactionMethod = GlobalAPIGrpc.getSendTransactionMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getSendTransactionMethod = GlobalAPIGrpc.getSendTransactionMethod) == null) {
          GlobalAPIGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SendTransactionRequest, adamant.global.v1.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("SendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.SendXRPInitTransactionsRequest,
      adamant.global.v1.SendXRPInitTransactionsResponse> getSendXRPInitTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendXRPInitTransactions",
      requestType = adamant.global.v1.SendXRPInitTransactionsRequest.class,
      responseType = adamant.global.v1.SendXRPInitTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.SendXRPInitTransactionsRequest,
      adamant.global.v1.SendXRPInitTransactionsResponse> getSendXRPInitTransactionsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.SendXRPInitTransactionsRequest, adamant.global.v1.SendXRPInitTransactionsResponse> getSendXRPInitTransactionsMethod;
    if ((getSendXRPInitTransactionsMethod = GlobalAPIGrpc.getSendXRPInitTransactionsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getSendXRPInitTransactionsMethod = GlobalAPIGrpc.getSendXRPInitTransactionsMethod) == null) {
          GlobalAPIGrpc.getSendXRPInitTransactionsMethod = getSendXRPInitTransactionsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SendXRPInitTransactionsRequest, adamant.global.v1.SendXRPInitTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendXRPInitTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SendXRPInitTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SendXRPInitTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("SendXRPInitTransactions"))
              .build();
        }
      }
    }
    return getSendXRPInitTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CancelTransactionRequest,
      com.google.protobuf.Empty> getCancelTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelTransaction",
      requestType = adamant.global.v1.CancelTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CancelTransactionRequest,
      com.google.protobuf.Empty> getCancelTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CancelTransactionRequest, com.google.protobuf.Empty> getCancelTransactionMethod;
    if ((getCancelTransactionMethod = GlobalAPIGrpc.getCancelTransactionMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCancelTransactionMethod = GlobalAPIGrpc.getCancelTransactionMethod) == null) {
          GlobalAPIGrpc.getCancelTransactionMethod = getCancelTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CancelTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CancelTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CancelTransaction"))
              .build();
        }
      }
    }
    return getCancelTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = adamant.global.v1.GetTransactionRequest.class,
      responseType = adamant.global.v1.Model.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionRequest, adamant.global.v1.Model.Transaction> getGetTransactionMethod;
    if ((getGetTransactionMethod = GlobalAPIGrpc.getGetTransactionMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetTransactionMethod = GlobalAPIGrpc.getGetTransactionMethod) == null) {
          GlobalAPIGrpc.getGetTransactionMethod = getGetTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTransactionRequest, adamant.global.v1.Model.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetTransaction"))
              .build();
        }
      }
    }
    return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionByTxIDRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionByTxIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionByTxID",
      requestType = adamant.global.v1.GetTransactionByTxIDRequest.class,
      responseType = adamant.global.v1.Model.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionByTxIDRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionByTxIDMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionByTxIDRequest, adamant.global.v1.Model.Transaction> getGetTransactionByTxIDMethod;
    if ((getGetTransactionByTxIDMethod = GlobalAPIGrpc.getGetTransactionByTxIDMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetTransactionByTxIDMethod = GlobalAPIGrpc.getGetTransactionByTxIDMethod) == null) {
          GlobalAPIGrpc.getGetTransactionByTxIDMethod = getGetTransactionByTxIDMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTransactionByTxIDRequest, adamant.global.v1.Model.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionByTxID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTransactionByTxIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetTransactionByTxID"))
              .build();
        }
      }
    }
    return getGetTransactionByTxIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransactions",
      requestType = adamant.global.v1.ListTransactionsRequest.class,
      responseType = adamant.global.v1.ListTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsRequest, adamant.global.v1.ListTransactionsResponse> getListTransactionsMethod;
    if ((getListTransactionsMethod = GlobalAPIGrpc.getListTransactionsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListTransactionsMethod = GlobalAPIGrpc.getListTransactionsMethod) == null) {
          GlobalAPIGrpc.getListTransactionsMethod = getListTransactionsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransactionsRequest, adamant.global.v1.ListTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListTransactions"))
              .build();
        }
      }
    }
    return getListTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsByFilterRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransactionsByFilter",
      requestType = adamant.global.v1.ListTransactionsByFilterRequest.class,
      responseType = adamant.global.v1.ListTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsByFilterRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsByFilterRequest, adamant.global.v1.ListTransactionsResponse> getListTransactionsByFilterMethod;
    if ((getListTransactionsByFilterMethod = GlobalAPIGrpc.getListTransactionsByFilterMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListTransactionsByFilterMethod = GlobalAPIGrpc.getListTransactionsByFilterMethod) == null) {
          GlobalAPIGrpc.getListTransactionsByFilterMethod = getListTransactionsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransactionsByFilterRequest, adamant.global.v1.ListTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransactionsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListTransactionsByFilter"))
              .build();
        }
      }
    }
    return getListTransactionsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetSignInfoRequest,
      adamant.global.v1.Model.SignInfo> getGetSignInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignInfo",
      requestType = adamant.global.v1.GetSignInfoRequest.class,
      responseType = adamant.global.v1.Model.SignInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetSignInfoRequest,
      adamant.global.v1.Model.SignInfo> getGetSignInfoMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetSignInfoRequest, adamant.global.v1.Model.SignInfo> getGetSignInfoMethod;
    if ((getGetSignInfoMethod = GlobalAPIGrpc.getGetSignInfoMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetSignInfoMethod = GlobalAPIGrpc.getGetSignInfoMethod) == null) {
          GlobalAPIGrpc.getGetSignInfoMethod = getGetSignInfoMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetSignInfoRequest, adamant.global.v1.Model.SignInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSignInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetSignInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.SignInfo.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetSignInfo"))
              .build();
        }
      }
    }
    return getGetSignInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListSignInfoRequest,
      adamant.global.v1.ListSignInfoResponse> getListSignInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSignInfo",
      requestType = adamant.global.v1.ListSignInfoRequest.class,
      responseType = adamant.global.v1.ListSignInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListSignInfoRequest,
      adamant.global.v1.ListSignInfoResponse> getListSignInfoMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListSignInfoRequest, adamant.global.v1.ListSignInfoResponse> getListSignInfoMethod;
    if ((getListSignInfoMethod = GlobalAPIGrpc.getListSignInfoMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListSignInfoMethod = GlobalAPIGrpc.getListSignInfoMethod) == null) {
          GlobalAPIGrpc.getListSignInfoMethod = getListSignInfoMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListSignInfoRequest, adamant.global.v1.ListSignInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSignInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListSignInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListSignInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListSignInfo"))
              .build();
        }
      }
    }
    return getListSignInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListXRPInitSignInfoRequest,
      adamant.global.v1.ListXRPInitSignInfoResponse> getListXRPInitSignInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListXRPInitSignInfo",
      requestType = adamant.global.v1.ListXRPInitSignInfoRequest.class,
      responseType = adamant.global.v1.ListXRPInitSignInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListXRPInitSignInfoRequest,
      adamant.global.v1.ListXRPInitSignInfoResponse> getListXRPInitSignInfoMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListXRPInitSignInfoRequest, adamant.global.v1.ListXRPInitSignInfoResponse> getListXRPInitSignInfoMethod;
    if ((getListXRPInitSignInfoMethod = GlobalAPIGrpc.getListXRPInitSignInfoMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListXRPInitSignInfoMethod = GlobalAPIGrpc.getListXRPInitSignInfoMethod) == null) {
          GlobalAPIGrpc.getListXRPInitSignInfoMethod = getListXRPInitSignInfoMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListXRPInitSignInfoRequest, adamant.global.v1.ListXRPInitSignInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListXRPInitSignInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListXRPInitSignInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListXRPInitSignInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListXRPInitSignInfo"))
              .build();
        }
      }
    }
    return getListXRPInitSignInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransfers",
      requestType = adamant.global.v1.ListTransfersRequest.class,
      responseType = adamant.global.v1.ListTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersRequest, adamant.global.v1.ListTransfersResponse> getListTransfersMethod;
    if ((getListTransfersMethod = GlobalAPIGrpc.getListTransfersMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListTransfersMethod = GlobalAPIGrpc.getListTransfersMethod) == null) {
          GlobalAPIGrpc.getListTransfersMethod = getListTransfersMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransfersRequest, adamant.global.v1.ListTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransfers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListTransfers"))
              .build();
        }
      }
    }
    return getListTransfersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersByFilterRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransfersByFilter",
      requestType = adamant.global.v1.ListTransfersByFilterRequest.class,
      responseType = adamant.global.v1.ListTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersByFilterRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersByFilterRequest, adamant.global.v1.ListTransfersResponse> getListTransfersByFilterMethod;
    if ((getListTransfersByFilterMethod = GlobalAPIGrpc.getListTransfersByFilterMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListTransfersByFilterMethod = GlobalAPIGrpc.getListTransfersByFilterMethod) == null) {
          GlobalAPIGrpc.getListTransfersByFilterMethod = getListTransfersByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransfersByFilterRequest, adamant.global.v1.ListTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransfersByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListTransfersByFilter"))
              .build();
        }
      }
    }
    return getListTransfersByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetRateSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRateSnapshot",
      requestType = adamant.global.v1.GetRateSnapshotRequest.class,
      responseType = adamant.global.v1.Model.RateSnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetRateSnapshotMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot> getGetRateSnapshotMethod;
    if ((getGetRateSnapshotMethod = GlobalAPIGrpc.getGetRateSnapshotMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetRateSnapshotMethod = GlobalAPIGrpc.getGetRateSnapshotMethod) == null) {
          GlobalAPIGrpc.getGetRateSnapshotMethod = getGetRateSnapshotMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.RateSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetRateSnapshot"))
              .build();
        }
      }
    }
    return getGetRateSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetLatestRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetLatestRateSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestRateSnapshot",
      requestType = adamant.global.v1.GetLatestRateSnapshotRequest.class,
      responseType = adamant.global.v1.Model.RateSnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetLatestRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetLatestRateSnapshotMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetLatestRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot> getGetLatestRateSnapshotMethod;
    if ((getGetLatestRateSnapshotMethod = GlobalAPIGrpc.getGetLatestRateSnapshotMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetLatestRateSnapshotMethod = GlobalAPIGrpc.getGetLatestRateSnapshotMethod) == null) {
          GlobalAPIGrpc.getGetLatestRateSnapshotMethod = getGetLatestRateSnapshotMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetLatestRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestRateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetLatestRateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.RateSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetLatestRateSnapshot"))
              .build();
        }
      }
    }
    return getGetLatestRateSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.SetRatesRequest,
      adamant.global.v1.SetRatesResponse> getSetRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRates",
      requestType = adamant.global.v1.SetRatesRequest.class,
      responseType = adamant.global.v1.SetRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.SetRatesRequest,
      adamant.global.v1.SetRatesResponse> getSetRatesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.SetRatesRequest, adamant.global.v1.SetRatesResponse> getSetRatesMethod;
    if ((getSetRatesMethod = GlobalAPIGrpc.getSetRatesMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getSetRatesMethod = GlobalAPIGrpc.getSetRatesMethod) == null) {
          GlobalAPIGrpc.getSetRatesMethod = getSetRatesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SetRatesRequest, adamant.global.v1.SetRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SetRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SetRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("SetRates"))
              .build();
        }
      }
    }
    return getSetRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateLabeledAddressRequest,
      adamant.global.v1.CreateLabeledAddressResponse> getCreateLabeledAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLabeledAddress",
      requestType = adamant.global.v1.CreateLabeledAddressRequest.class,
      responseType = adamant.global.v1.CreateLabeledAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateLabeledAddressRequest,
      adamant.global.v1.CreateLabeledAddressResponse> getCreateLabeledAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateLabeledAddressRequest, adamant.global.v1.CreateLabeledAddressResponse> getCreateLabeledAddressMethod;
    if ((getCreateLabeledAddressMethod = GlobalAPIGrpc.getCreateLabeledAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreateLabeledAddressMethod = GlobalAPIGrpc.getCreateLabeledAddressMethod) == null) {
          GlobalAPIGrpc.getCreateLabeledAddressMethod = getCreateLabeledAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateLabeledAddressRequest, adamant.global.v1.CreateLabeledAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLabeledAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateLabeledAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateLabeledAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreateLabeledAddress"))
              .build();
        }
      }
    }
    return getCreateLabeledAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetLabeledAddressRequest,
      adamant.global.v1.Model.LabeledAddress> getGetLabeledAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabeledAddress",
      requestType = adamant.global.v1.GetLabeledAddressRequest.class,
      responseType = adamant.global.v1.Model.LabeledAddress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetLabeledAddressRequest,
      adamant.global.v1.Model.LabeledAddress> getGetLabeledAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetLabeledAddressRequest, adamant.global.v1.Model.LabeledAddress> getGetLabeledAddressMethod;
    if ((getGetLabeledAddressMethod = GlobalAPIGrpc.getGetLabeledAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetLabeledAddressMethod = GlobalAPIGrpc.getGetLabeledAddressMethod) == null) {
          GlobalAPIGrpc.getGetLabeledAddressMethod = getGetLabeledAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetLabeledAddressRequest, adamant.global.v1.Model.LabeledAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLabeledAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetLabeledAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.LabeledAddress.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetLabeledAddress"))
              .build();
        }
      }
    }
    return getGetLabeledAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListLabeledAddressesRequest,
      adamant.global.v1.ListLabeledAddressesResponse> getListLabeledAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLabeledAddresses",
      requestType = adamant.global.v1.ListLabeledAddressesRequest.class,
      responseType = adamant.global.v1.ListLabeledAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListLabeledAddressesRequest,
      adamant.global.v1.ListLabeledAddressesResponse> getListLabeledAddressesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListLabeledAddressesRequest, adamant.global.v1.ListLabeledAddressesResponse> getListLabeledAddressesMethod;
    if ((getListLabeledAddressesMethod = GlobalAPIGrpc.getListLabeledAddressesMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListLabeledAddressesMethod = GlobalAPIGrpc.getListLabeledAddressesMethod) == null) {
          GlobalAPIGrpc.getListLabeledAddressesMethod = getListLabeledAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListLabeledAddressesRequest, adamant.global.v1.ListLabeledAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLabeledAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListLabeledAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListLabeledAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListLabeledAddresses"))
              .build();
        }
      }
    }
    return getListLabeledAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableLabeledAddressRequest,
      adamant.global.v1.IsDeletableLabeledAddressResponse> getIsDeletableLabeledAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsDeletableLabeledAddress",
      requestType = adamant.global.v1.IsDeletableLabeledAddressRequest.class,
      responseType = adamant.global.v1.IsDeletableLabeledAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableLabeledAddressRequest,
      adamant.global.v1.IsDeletableLabeledAddressResponse> getIsDeletableLabeledAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableLabeledAddressRequest, adamant.global.v1.IsDeletableLabeledAddressResponse> getIsDeletableLabeledAddressMethod;
    if ((getIsDeletableLabeledAddressMethod = GlobalAPIGrpc.getIsDeletableLabeledAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getIsDeletableLabeledAddressMethod = GlobalAPIGrpc.getIsDeletableLabeledAddressMethod) == null) {
          GlobalAPIGrpc.getIsDeletableLabeledAddressMethod = getIsDeletableLabeledAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.IsDeletableLabeledAddressRequest, adamant.global.v1.IsDeletableLabeledAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDeletableLabeledAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletableLabeledAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletableLabeledAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("IsDeletableLabeledAddress"))
              .build();
        }
      }
    }
    return getIsDeletableLabeledAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateLabeledAddressRequest,
      adamant.global.v1.Model.LabeledAddress> getUpdateLabeledAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLabeledAddress",
      requestType = adamant.global.v1.UpdateLabeledAddressRequest.class,
      responseType = adamant.global.v1.Model.LabeledAddress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateLabeledAddressRequest,
      adamant.global.v1.Model.LabeledAddress> getUpdateLabeledAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateLabeledAddressRequest, adamant.global.v1.Model.LabeledAddress> getUpdateLabeledAddressMethod;
    if ((getUpdateLabeledAddressMethod = GlobalAPIGrpc.getUpdateLabeledAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateLabeledAddressMethod = GlobalAPIGrpc.getUpdateLabeledAddressMethod) == null) {
          GlobalAPIGrpc.getUpdateLabeledAddressMethod = getUpdateLabeledAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateLabeledAddressRequest, adamant.global.v1.Model.LabeledAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLabeledAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateLabeledAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.LabeledAddress.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateLabeledAddress"))
              .build();
        }
      }
    }
    return getUpdateLabeledAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.DeleteLabeledAddressRequest,
      com.google.protobuf.Empty> getDeleteAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAddress",
      requestType = adamant.global.v1.DeleteLabeledAddressRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.DeleteLabeledAddressRequest,
      com.google.protobuf.Empty> getDeleteAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.DeleteLabeledAddressRequest, com.google.protobuf.Empty> getDeleteAddressMethod;
    if ((getDeleteAddressMethod = GlobalAPIGrpc.getDeleteAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getDeleteAddressMethod = GlobalAPIGrpc.getDeleteAddressMethod) == null) {
          GlobalAPIGrpc.getDeleteAddressMethod = getDeleteAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.DeleteLabeledAddressRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.DeleteLabeledAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("DeleteAddress"))
              .build();
        }
      }
    }
    return getDeleteAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ReviewLabeledAddressProposalRequest,
      com.google.protobuf.Empty> getReviewLabeledAddressProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewLabeledAddressProposal",
      requestType = adamant.global.v1.ReviewLabeledAddressProposalRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ReviewLabeledAddressProposalRequest,
      com.google.protobuf.Empty> getReviewLabeledAddressProposalMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ReviewLabeledAddressProposalRequest, com.google.protobuf.Empty> getReviewLabeledAddressProposalMethod;
    if ((getReviewLabeledAddressProposalMethod = GlobalAPIGrpc.getReviewLabeledAddressProposalMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getReviewLabeledAddressProposalMethod = GlobalAPIGrpc.getReviewLabeledAddressProposalMethod) == null) {
          GlobalAPIGrpc.getReviewLabeledAddressProposalMethod = getReviewLabeledAddressProposalMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ReviewLabeledAddressProposalRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewLabeledAddressProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ReviewLabeledAddressProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ReviewLabeledAddressProposal"))
              .build();
        }
      }
    }
    return getReviewLabeledAddressProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateWhitelistRequest,
      adamant.global.v1.CreateWhitelistResponse> getCreateWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWhitelist",
      requestType = adamant.global.v1.CreateWhitelistRequest.class,
      responseType = adamant.global.v1.CreateWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateWhitelistRequest,
      adamant.global.v1.CreateWhitelistResponse> getCreateWhitelistMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateWhitelistRequest, adamant.global.v1.CreateWhitelistResponse> getCreateWhitelistMethod;
    if ((getCreateWhitelistMethod = GlobalAPIGrpc.getCreateWhitelistMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreateWhitelistMethod = GlobalAPIGrpc.getCreateWhitelistMethod) == null) {
          GlobalAPIGrpc.getCreateWhitelistMethod = getCreateWhitelistMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateWhitelistRequest, adamant.global.v1.CreateWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreateWhitelist"))
              .build();
        }
      }
    }
    return getCreateWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetWhitelistRequest,
      adamant.global.v1.Model.Whitelist> getGetWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWhitelist",
      requestType = adamant.global.v1.GetWhitelistRequest.class,
      responseType = adamant.global.v1.Model.Whitelist.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetWhitelistRequest,
      adamant.global.v1.Model.Whitelist> getGetWhitelistMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetWhitelistRequest, adamant.global.v1.Model.Whitelist> getGetWhitelistMethod;
    if ((getGetWhitelistMethod = GlobalAPIGrpc.getGetWhitelistMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetWhitelistMethod = GlobalAPIGrpc.getGetWhitelistMethod) == null) {
          GlobalAPIGrpc.getGetWhitelistMethod = getGetWhitelistMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetWhitelistRequest, adamant.global.v1.Model.Whitelist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Whitelist.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetWhitelist"))
              .build();
        }
      }
    }
    return getGetWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListWhitelistsRequest,
      adamant.global.v1.ListWhitelistsResponse> getListWhitelistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWhitelists",
      requestType = adamant.global.v1.ListWhitelistsRequest.class,
      responseType = adamant.global.v1.ListWhitelistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListWhitelistsRequest,
      adamant.global.v1.ListWhitelistsResponse> getListWhitelistsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListWhitelistsRequest, adamant.global.v1.ListWhitelistsResponse> getListWhitelistsMethod;
    if ((getListWhitelistsMethod = GlobalAPIGrpc.getListWhitelistsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListWhitelistsMethod = GlobalAPIGrpc.getListWhitelistsMethod) == null) {
          GlobalAPIGrpc.getListWhitelistsMethod = getListWhitelistsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListWhitelistsRequest, adamant.global.v1.ListWhitelistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWhitelists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWhitelistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWhitelistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListWhitelists"))
              .build();
        }
      }
    }
    return getListWhitelistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableWhitelistRequest,
      adamant.global.v1.IsDeletableWhitelistResponse> getIsDeletableWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsDeletableWhitelist",
      requestType = adamant.global.v1.IsDeletableWhitelistRequest.class,
      responseType = adamant.global.v1.IsDeletableWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableWhitelistRequest,
      adamant.global.v1.IsDeletableWhitelistResponse> getIsDeletableWhitelistMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableWhitelistRequest, adamant.global.v1.IsDeletableWhitelistResponse> getIsDeletableWhitelistMethod;
    if ((getIsDeletableWhitelistMethod = GlobalAPIGrpc.getIsDeletableWhitelistMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getIsDeletableWhitelistMethod = GlobalAPIGrpc.getIsDeletableWhitelistMethod) == null) {
          GlobalAPIGrpc.getIsDeletableWhitelistMethod = getIsDeletableWhitelistMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.IsDeletableWhitelistRequest, adamant.global.v1.IsDeletableWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDeletableWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletableWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletableWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("IsDeletableWhitelist"))
              .build();
        }
      }
    }
    return getIsDeletableWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateWhitelistRequest,
      adamant.global.v1.Model.Whitelist> getUpdateWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWhitelist",
      requestType = adamant.global.v1.UpdateWhitelistRequest.class,
      responseType = adamant.global.v1.Model.Whitelist.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateWhitelistRequest,
      adamant.global.v1.Model.Whitelist> getUpdateWhitelistMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateWhitelistRequest, adamant.global.v1.Model.Whitelist> getUpdateWhitelistMethod;
    if ((getUpdateWhitelistMethod = GlobalAPIGrpc.getUpdateWhitelistMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateWhitelistMethod = GlobalAPIGrpc.getUpdateWhitelistMethod) == null) {
          GlobalAPIGrpc.getUpdateWhitelistMethod = getUpdateWhitelistMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateWhitelistRequest, adamant.global.v1.Model.Whitelist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Whitelist.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateWhitelist"))
              .build();
        }
      }
    }
    return getUpdateWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateWhitelistAddressesRequest,
      adamant.global.v1.Model.Whitelist> getUpdateWhitelistAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWhitelistAddresses",
      requestType = adamant.global.v1.UpdateWhitelistAddressesRequest.class,
      responseType = adamant.global.v1.Model.Whitelist.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateWhitelistAddressesRequest,
      adamant.global.v1.Model.Whitelist> getUpdateWhitelistAddressesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateWhitelistAddressesRequest, adamant.global.v1.Model.Whitelist> getUpdateWhitelistAddressesMethod;
    if ((getUpdateWhitelistAddressesMethod = GlobalAPIGrpc.getUpdateWhitelistAddressesMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateWhitelistAddressesMethod = GlobalAPIGrpc.getUpdateWhitelistAddressesMethod) == null) {
          GlobalAPIGrpc.getUpdateWhitelistAddressesMethod = getUpdateWhitelistAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateWhitelistAddressesRequest, adamant.global.v1.Model.Whitelist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWhitelistAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateWhitelistAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Whitelist.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateWhitelistAddresses"))
              .build();
        }
      }
    }
    return getUpdateWhitelistAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.DeleteWhitelistRequest,
      com.google.protobuf.Empty> getDeleteWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWhitelist",
      requestType = adamant.global.v1.DeleteWhitelistRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.DeleteWhitelistRequest,
      com.google.protobuf.Empty> getDeleteWhitelistMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.DeleteWhitelistRequest, com.google.protobuf.Empty> getDeleteWhitelistMethod;
    if ((getDeleteWhitelistMethod = GlobalAPIGrpc.getDeleteWhitelistMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getDeleteWhitelistMethod = GlobalAPIGrpc.getDeleteWhitelistMethod) == null) {
          GlobalAPIGrpc.getDeleteWhitelistMethod = getDeleteWhitelistMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.DeleteWhitelistRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.DeleteWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("DeleteWhitelist"))
              .build();
        }
      }
    }
    return getDeleteWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateTransferLimitRequest,
      adamant.global.v1.CreateTransferLimitResponse> getCreateTransferLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransferLimit",
      requestType = adamant.global.v1.CreateTransferLimitRequest.class,
      responseType = adamant.global.v1.CreateTransferLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateTransferLimitRequest,
      adamant.global.v1.CreateTransferLimitResponse> getCreateTransferLimitMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateTransferLimitRequest, adamant.global.v1.CreateTransferLimitResponse> getCreateTransferLimitMethod;
    if ((getCreateTransferLimitMethod = GlobalAPIGrpc.getCreateTransferLimitMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreateTransferLimitMethod = GlobalAPIGrpc.getCreateTransferLimitMethod) == null) {
          GlobalAPIGrpc.getCreateTransferLimitMethod = getCreateTransferLimitMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateTransferLimitRequest, adamant.global.v1.CreateTransferLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransferLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransferLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransferLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreateTransferLimit"))
              .build();
        }
      }
    }
    return getCreateTransferLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetTransferLimitRequest,
      adamant.global.v1.Model.TransferLimit> getGetTransferLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransferLimit",
      requestType = adamant.global.v1.GetTransferLimitRequest.class,
      responseType = adamant.global.v1.Model.TransferLimit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetTransferLimitRequest,
      adamant.global.v1.Model.TransferLimit> getGetTransferLimitMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetTransferLimitRequest, adamant.global.v1.Model.TransferLimit> getGetTransferLimitMethod;
    if ((getGetTransferLimitMethod = GlobalAPIGrpc.getGetTransferLimitMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetTransferLimitMethod = GlobalAPIGrpc.getGetTransferLimitMethod) == null) {
          GlobalAPIGrpc.getGetTransferLimitMethod = getGetTransferLimitMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTransferLimitRequest, adamant.global.v1.Model.TransferLimit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransferLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTransferLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.TransferLimit.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetTransferLimit"))
              .build();
        }
      }
    }
    return getGetTransferLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransferLimitsRequest,
      adamant.global.v1.ListTransferLimitsResponse> getListTransferLimitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransferLimits",
      requestType = adamant.global.v1.ListTransferLimitsRequest.class,
      responseType = adamant.global.v1.ListTransferLimitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransferLimitsRequest,
      adamant.global.v1.ListTransferLimitsResponse> getListTransferLimitsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransferLimitsRequest, adamant.global.v1.ListTransferLimitsResponse> getListTransferLimitsMethod;
    if ((getListTransferLimitsMethod = GlobalAPIGrpc.getListTransferLimitsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListTransferLimitsMethod = GlobalAPIGrpc.getListTransferLimitsMethod) == null) {
          GlobalAPIGrpc.getListTransferLimitsMethod = getListTransferLimitsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransferLimitsRequest, adamant.global.v1.ListTransferLimitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransferLimits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransferLimitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransferLimitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListTransferLimits"))
              .build();
        }
      }
    }
    return getListTransferLimitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableTransferLimitRequest,
      adamant.global.v1.IsDeletableTransferLimitResponse> getIsDeletableTransferLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsDeletableTransferLimit",
      requestType = adamant.global.v1.IsDeletableTransferLimitRequest.class,
      responseType = adamant.global.v1.IsDeletableTransferLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableTransferLimitRequest,
      adamant.global.v1.IsDeletableTransferLimitResponse> getIsDeletableTransferLimitMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.IsDeletableTransferLimitRequest, adamant.global.v1.IsDeletableTransferLimitResponse> getIsDeletableTransferLimitMethod;
    if ((getIsDeletableTransferLimitMethod = GlobalAPIGrpc.getIsDeletableTransferLimitMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getIsDeletableTransferLimitMethod = GlobalAPIGrpc.getIsDeletableTransferLimitMethod) == null) {
          GlobalAPIGrpc.getIsDeletableTransferLimitMethod = getIsDeletableTransferLimitMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.IsDeletableTransferLimitRequest, adamant.global.v1.IsDeletableTransferLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDeletableTransferLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletableTransferLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletableTransferLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("IsDeletableTransferLimit"))
              .build();
        }
      }
    }
    return getIsDeletableTransferLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateTransferLimitRequest,
      adamant.global.v1.Model.TransferLimit> getUpdateTransferLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTransferLimit",
      requestType = adamant.global.v1.UpdateTransferLimitRequest.class,
      responseType = adamant.global.v1.Model.TransferLimit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateTransferLimitRequest,
      adamant.global.v1.Model.TransferLimit> getUpdateTransferLimitMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateTransferLimitRequest, adamant.global.v1.Model.TransferLimit> getUpdateTransferLimitMethod;
    if ((getUpdateTransferLimitMethod = GlobalAPIGrpc.getUpdateTransferLimitMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateTransferLimitMethod = GlobalAPIGrpc.getUpdateTransferLimitMethod) == null) {
          GlobalAPIGrpc.getUpdateTransferLimitMethod = getUpdateTransferLimitMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateTransferLimitRequest, adamant.global.v1.Model.TransferLimit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTransferLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateTransferLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.TransferLimit.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateTransferLimit"))
              .build();
        }
      }
    }
    return getUpdateTransferLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateTransferLimitNameRequest,
      adamant.global.v1.Model.TransferLimit> getUpdateTransferLimitNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTransferLimitName",
      requestType = adamant.global.v1.UpdateTransferLimitNameRequest.class,
      responseType = adamant.global.v1.Model.TransferLimit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateTransferLimitNameRequest,
      adamant.global.v1.Model.TransferLimit> getUpdateTransferLimitNameMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateTransferLimitNameRequest, adamant.global.v1.Model.TransferLimit> getUpdateTransferLimitNameMethod;
    if ((getUpdateTransferLimitNameMethod = GlobalAPIGrpc.getUpdateTransferLimitNameMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdateTransferLimitNameMethod = GlobalAPIGrpc.getUpdateTransferLimitNameMethod) == null) {
          GlobalAPIGrpc.getUpdateTransferLimitNameMethod = getUpdateTransferLimitNameMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateTransferLimitNameRequest, adamant.global.v1.Model.TransferLimit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTransferLimitName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateTransferLimitNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.TransferLimit.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdateTransferLimitName"))
              .build();
        }
      }
    }
    return getUpdateTransferLimitNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.DeleteTransferLimitRequest,
      com.google.protobuf.Empty> getDeleteTransferLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTransferLimit",
      requestType = adamant.global.v1.DeleteTransferLimitRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.DeleteTransferLimitRequest,
      com.google.protobuf.Empty> getDeleteTransferLimitMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.DeleteTransferLimitRequest, com.google.protobuf.Empty> getDeleteTransferLimitMethod;
    if ((getDeleteTransferLimitMethod = GlobalAPIGrpc.getDeleteTransferLimitMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getDeleteTransferLimitMethod = GlobalAPIGrpc.getDeleteTransferLimitMethod) == null) {
          GlobalAPIGrpc.getDeleteTransferLimitMethod = getDeleteTransferLimitMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.DeleteTransferLimitRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTransferLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.DeleteTransferLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("DeleteTransferLimit"))
              .build();
        }
      }
    }
    return getDeleteTransferLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ReviewTransferLimitProposalRequest,
      com.google.protobuf.Empty> getReviewTransferLimitProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewTransferLimitProposal",
      requestType = adamant.global.v1.ReviewTransferLimitProposalRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ReviewTransferLimitProposalRequest,
      com.google.protobuf.Empty> getReviewTransferLimitProposalMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ReviewTransferLimitProposalRequest, com.google.protobuf.Empty> getReviewTransferLimitProposalMethod;
    if ((getReviewTransferLimitProposalMethod = GlobalAPIGrpc.getReviewTransferLimitProposalMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getReviewTransferLimitProposalMethod = GlobalAPIGrpc.getReviewTransferLimitProposalMethod) == null) {
          GlobalAPIGrpc.getReviewTransferLimitProposalMethod = getReviewTransferLimitProposalMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ReviewTransferLimitProposalRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewTransferLimitProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ReviewTransferLimitProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ReviewTransferLimitProposal"))
              .build();
        }
      }
    }
    return getReviewTransferLimitProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreatePolicyRequest,
      adamant.global.v1.CreatePolicyResponse> getCreatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePolicy",
      requestType = adamant.global.v1.CreatePolicyRequest.class,
      responseType = adamant.global.v1.CreatePolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreatePolicyRequest,
      adamant.global.v1.CreatePolicyResponse> getCreatePolicyMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreatePolicyRequest, adamant.global.v1.CreatePolicyResponse> getCreatePolicyMethod;
    if ((getCreatePolicyMethod = GlobalAPIGrpc.getCreatePolicyMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCreatePolicyMethod = GlobalAPIGrpc.getCreatePolicyMethod) == null) {
          GlobalAPIGrpc.getCreatePolicyMethod = getCreatePolicyMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreatePolicyRequest, adamant.global.v1.CreatePolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreatePolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CreatePolicy"))
              .build();
        }
      }
    }
    return getCreatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetPolicyRequest,
      adamant.global.v1.Model.Policy> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = adamant.global.v1.GetPolicyRequest.class,
      responseType = adamant.global.v1.Model.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetPolicyRequest,
      adamant.global.v1.Model.Policy> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetPolicyRequest, adamant.global.v1.Model.Policy> getGetPolicyMethod;
    if ((getGetPolicyMethod = GlobalAPIGrpc.getGetPolicyMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetPolicyMethod = GlobalAPIGrpc.getGetPolicyMethod) == null) {
          GlobalAPIGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetPolicyRequest, adamant.global.v1.Model.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetPolicy"))
              .build();
        }
      }
    }
    return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListPoliciesRequest,
      adamant.global.v1.ListPoliciesResponse> getListPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPolicies",
      requestType = adamant.global.v1.ListPoliciesRequest.class,
      responseType = adamant.global.v1.ListPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListPoliciesRequest,
      adamant.global.v1.ListPoliciesResponse> getListPoliciesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListPoliciesRequest, adamant.global.v1.ListPoliciesResponse> getListPoliciesMethod;
    if ((getListPoliciesMethod = GlobalAPIGrpc.getListPoliciesMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListPoliciesMethod = GlobalAPIGrpc.getListPoliciesMethod) == null) {
          GlobalAPIGrpc.getListPoliciesMethod = getListPoliciesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListPoliciesRequest, adamant.global.v1.ListPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListPolicies"))
              .build();
        }
      }
    }
    return getListPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.IsDeletablePolicyRequest,
      adamant.global.v1.IsDeletablePolicyResponse> getIsDeletablePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsDeletablePolicy",
      requestType = adamant.global.v1.IsDeletablePolicyRequest.class,
      responseType = adamant.global.v1.IsDeletablePolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.IsDeletablePolicyRequest,
      adamant.global.v1.IsDeletablePolicyResponse> getIsDeletablePolicyMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.IsDeletablePolicyRequest, adamant.global.v1.IsDeletablePolicyResponse> getIsDeletablePolicyMethod;
    if ((getIsDeletablePolicyMethod = GlobalAPIGrpc.getIsDeletablePolicyMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getIsDeletablePolicyMethod = GlobalAPIGrpc.getIsDeletablePolicyMethod) == null) {
          GlobalAPIGrpc.getIsDeletablePolicyMethod = getIsDeletablePolicyMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.IsDeletablePolicyRequest, adamant.global.v1.IsDeletablePolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDeletablePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletablePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsDeletablePolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("IsDeletablePolicy"))
              .build();
        }
      }
    }
    return getIsDeletablePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdatePolicyRequest,
      adamant.global.v1.Model.Policy> getUpdatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePolicy",
      requestType = adamant.global.v1.UpdatePolicyRequest.class,
      responseType = adamant.global.v1.Model.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdatePolicyRequest,
      adamant.global.v1.Model.Policy> getUpdatePolicyMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdatePolicyRequest, adamant.global.v1.Model.Policy> getUpdatePolicyMethod;
    if ((getUpdatePolicyMethod = GlobalAPIGrpc.getUpdatePolicyMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getUpdatePolicyMethod = GlobalAPIGrpc.getUpdatePolicyMethod) == null) {
          GlobalAPIGrpc.getUpdatePolicyMethod = getUpdatePolicyMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdatePolicyRequest, adamant.global.v1.Model.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("UpdatePolicy"))
              .build();
        }
      }
    }
    return getUpdatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.DeletePolicyRequest,
      com.google.protobuf.Empty> getDeletePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePolicy",
      requestType = adamant.global.v1.DeletePolicyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.DeletePolicyRequest,
      com.google.protobuf.Empty> getDeletePolicyMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.DeletePolicyRequest, com.google.protobuf.Empty> getDeletePolicyMethod;
    if ((getDeletePolicyMethod = GlobalAPIGrpc.getDeletePolicyMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getDeletePolicyMethod = GlobalAPIGrpc.getDeletePolicyMethod) == null) {
          GlobalAPIGrpc.getDeletePolicyMethod = getDeletePolicyMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.DeletePolicyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.DeletePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("DeletePolicy"))
              .build();
        }
      }
    }
    return getDeletePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ReviewPolicyProposalRequest,
      com.google.protobuf.Empty> getReviewPolicyProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewPolicyProposal",
      requestType = adamant.global.v1.ReviewPolicyProposalRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ReviewPolicyProposalRequest,
      com.google.protobuf.Empty> getReviewPolicyProposalMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ReviewPolicyProposalRequest, com.google.protobuf.Empty> getReviewPolicyProposalMethod;
    if ((getReviewPolicyProposalMethod = GlobalAPIGrpc.getReviewPolicyProposalMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getReviewPolicyProposalMethod = GlobalAPIGrpc.getReviewPolicyProposalMethod) == null) {
          GlobalAPIGrpc.getReviewPolicyProposalMethod = getReviewPolicyProposalMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ReviewPolicyProposalRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewPolicyProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ReviewPolicyProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ReviewPolicyProposal"))
              .build();
        }
      }
    }
    return getReviewPolicyProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetSpendableBalanceRequest,
      adamant.global.v1.GetSpendableBalanceResponse> getGetSpendableBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendableBalance",
      requestType = adamant.global.v1.GetSpendableBalanceRequest.class,
      responseType = adamant.global.v1.GetSpendableBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetSpendableBalanceRequest,
      adamant.global.v1.GetSpendableBalanceResponse> getGetSpendableBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetSpendableBalanceRequest, adamant.global.v1.GetSpendableBalanceResponse> getGetSpendableBalanceMethod;
    if ((getGetSpendableBalanceMethod = GlobalAPIGrpc.getGetSpendableBalanceMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetSpendableBalanceMethod = GlobalAPIGrpc.getGetSpendableBalanceMethod) == null) {
          GlobalAPIGrpc.getGetSpendableBalanceMethod = getGetSpendableBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetSpendableBalanceRequest, adamant.global.v1.GetSpendableBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendableBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetSpendableBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetSpendableBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetSpendableBalance"))
              .build();
        }
      }
    }
    return getGetSpendableBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetTotalBalanceRequest,
      adamant.global.v1.Model.TotalBalance> getGetTotalBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalBalance",
      requestType = adamant.global.v1.GetTotalBalanceRequest.class,
      responseType = adamant.global.v1.Model.TotalBalance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetTotalBalanceRequest,
      adamant.global.v1.Model.TotalBalance> getGetTotalBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetTotalBalanceRequest, adamant.global.v1.Model.TotalBalance> getGetTotalBalanceMethod;
    if ((getGetTotalBalanceMethod = GlobalAPIGrpc.getGetTotalBalanceMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetTotalBalanceMethod = GlobalAPIGrpc.getGetTotalBalanceMethod) == null) {
          GlobalAPIGrpc.getGetTotalBalanceMethod = getGetTotalBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTotalBalanceRequest, adamant.global.v1.Model.TotalBalance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTotalBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTotalBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.TotalBalance.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetTotalBalance"))
              .build();
        }
      }
    }
    return getGetTotalBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListBalanceSnapshotsRequest,
      adamant.global.v1.ListBalanceSnapshotsResponse> getListBalanceSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBalanceSnapshots",
      requestType = adamant.global.v1.ListBalanceSnapshotsRequest.class,
      responseType = adamant.global.v1.ListBalanceSnapshotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListBalanceSnapshotsRequest,
      adamant.global.v1.ListBalanceSnapshotsResponse> getListBalanceSnapshotsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListBalanceSnapshotsRequest, adamant.global.v1.ListBalanceSnapshotsResponse> getListBalanceSnapshotsMethod;
    if ((getListBalanceSnapshotsMethod = GlobalAPIGrpc.getListBalanceSnapshotsMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getListBalanceSnapshotsMethod = GlobalAPIGrpc.getListBalanceSnapshotsMethod) == null) {
          GlobalAPIGrpc.getListBalanceSnapshotsMethod = getListBalanceSnapshotsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListBalanceSnapshotsRequest, adamant.global.v1.ListBalanceSnapshotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBalanceSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBalanceSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBalanceSnapshotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ListBalanceSnapshots"))
              .build();
        }
      }
    }
    return getListBalanceSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CalculateFeeRequest,
      adamant.global.v1.CalculateFeeResponse> getCalculateFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateFee",
      requestType = adamant.global.v1.CalculateFeeRequest.class,
      responseType = adamant.global.v1.CalculateFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CalculateFeeRequest,
      adamant.global.v1.CalculateFeeResponse> getCalculateFeeMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CalculateFeeRequest, adamant.global.v1.CalculateFeeResponse> getCalculateFeeMethod;
    if ((getCalculateFeeMethod = GlobalAPIGrpc.getCalculateFeeMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getCalculateFeeMethod = GlobalAPIGrpc.getCalculateFeeMethod) == null) {
          GlobalAPIGrpc.getCalculateFeeMethod = getCalculateFeeMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CalculateFeeRequest, adamant.global.v1.CalculateFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CalculateFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CalculateFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("CalculateFee"))
              .build();
        }
      }
    }
    return getCalculateFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetMembersDeactivatabilitiesRequest,
      adamant.global.v1.GetMembersDeactivatabilitiesResponse> getGetMembersDeactivatabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMembersDeactivatabilities",
      requestType = adamant.global.v1.GetMembersDeactivatabilitiesRequest.class,
      responseType = adamant.global.v1.GetMembersDeactivatabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetMembersDeactivatabilitiesRequest,
      adamant.global.v1.GetMembersDeactivatabilitiesResponse> getGetMembersDeactivatabilitiesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetMembersDeactivatabilitiesRequest, adamant.global.v1.GetMembersDeactivatabilitiesResponse> getGetMembersDeactivatabilitiesMethod;
    if ((getGetMembersDeactivatabilitiesMethod = GlobalAPIGrpc.getGetMembersDeactivatabilitiesMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetMembersDeactivatabilitiesMethod = GlobalAPIGrpc.getGetMembersDeactivatabilitiesMethod) == null) {
          GlobalAPIGrpc.getGetMembersDeactivatabilitiesMethod = getGetMembersDeactivatabilitiesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetMembersDeactivatabilitiesRequest, adamant.global.v1.GetMembersDeactivatabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMembersDeactivatabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetMembersDeactivatabilitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetMembersDeactivatabilitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetMembersDeactivatabilities"))
              .build();
        }
      }
    }
    return getGetMembersDeactivatabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetRecommendedFeeRateRequest,
      adamant.global.v1.GetRecommendedFeeRateResponse> getGetRecommendedFeeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecommendedFeeRate",
      requestType = adamant.global.v1.GetRecommendedFeeRateRequest.class,
      responseType = adamant.global.v1.GetRecommendedFeeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetRecommendedFeeRateRequest,
      adamant.global.v1.GetRecommendedFeeRateResponse> getGetRecommendedFeeRateMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetRecommendedFeeRateRequest, adamant.global.v1.GetRecommendedFeeRateResponse> getGetRecommendedFeeRateMethod;
    if ((getGetRecommendedFeeRateMethod = GlobalAPIGrpc.getGetRecommendedFeeRateMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getGetRecommendedFeeRateMethod = GlobalAPIGrpc.getGetRecommendedFeeRateMethod) == null) {
          GlobalAPIGrpc.getGetRecommendedFeeRateMethod = getGetRecommendedFeeRateMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetRecommendedFeeRateRequest, adamant.global.v1.GetRecommendedFeeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecommendedFeeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRecommendedFeeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRecommendedFeeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("GetRecommendedFeeRate"))
              .build();
        }
      }
    }
    return getGetRecommendedFeeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ValidateAddressRequest,
      adamant.global.v1.ValidateAddressResponse> getValidateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateAddress",
      requestType = adamant.global.v1.ValidateAddressRequest.class,
      responseType = adamant.global.v1.ValidateAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ValidateAddressRequest,
      adamant.global.v1.ValidateAddressResponse> getValidateAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ValidateAddressRequest, adamant.global.v1.ValidateAddressResponse> getValidateAddressMethod;
    if ((getValidateAddressMethod = GlobalAPIGrpc.getValidateAddressMethod) == null) {
      synchronized (GlobalAPIGrpc.class) {
        if ((getValidateAddressMethod = GlobalAPIGrpc.getValidateAddressMethod) == null) {
          GlobalAPIGrpc.getValidateAddressMethod = getValidateAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ValidateAddressRequest, adamant.global.v1.ValidateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ValidateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ValidateAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GlobalAPIMethodDescriptorSupplier("ValidateAddress"))
              .build();
        }
      }
    }
    return getValidateAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GlobalAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GlobalAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GlobalAPIStub>() {
        @java.lang.Override
        public GlobalAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GlobalAPIStub(channel, callOptions);
        }
      };
    return GlobalAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GlobalAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GlobalAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GlobalAPIBlockingStub>() {
        @java.lang.Override
        public GlobalAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GlobalAPIBlockingStub(channel, callOptions);
        }
      };
    return GlobalAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GlobalAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GlobalAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GlobalAPIFutureStub>() {
        @java.lang.Override
        public GlobalAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GlobalAPIFutureStub(channel, callOptions);
        }
      };
    return GlobalAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GlobalAPIImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Wallet
     * </pre>
     */
    public void createWallet(adamant.global.v1.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateWalletResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWalletMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    public void getWallet(adamant.global.v1.GetWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Wallet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWalletMethod(), responseObserver);
    }

    /**
     */
    public void cancelWallet(adamant.global.v1.CancelWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelWalletMethod(), responseObserver);
    }

    /**
     */
    public void archiveWallet(adamant.global.v1.ArchiveWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveWalletMethod(), responseObserver);
    }

    /**
     */
    public void unArchiveWallet(adamant.global.v1.UnArchiveWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnArchiveWalletMethod(), responseObserver);
    }

    /**
     */
    public void listWallets(adamant.global.v1.ListWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWalletsMethod(), responseObserver);
    }

    /**
     */
    public void listWalletsByFilter(adamant.global.v1.ListWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWalletsByFilterMethod(), responseObserver);
    }

    /**
     */
    public void listBaseWallets(adamant.global.v1.ListBaseWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBaseWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBaseWalletsMethod(), responseObserver);
    }

    /**
     */
    public void updateWalletName(adamant.global.v1.UpdateWalletNameRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWalletNameMethod(), responseObserver);
    }

    /**
     */
    public void updateWalletValidation(adamant.global.v1.UpdateWalletValidationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWalletValidationMethod(), responseObserver);
    }

    /**
     */
    public void updateWalletPolicy(adamant.global.v1.UpdateWalletPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWalletPolicyMethod(), responseObserver);
    }

    /**
     */
    public void reviewWalletProposal(adamant.global.v1.ReviewWalletProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewWalletProposalMethod(), responseObserver);
    }

    /**
     */
    public void flushBalance(adamant.global.v1.FlushBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Review
     * </pre>
     */
    public void approveWallet(adamant.global.v1.ApproveWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveWalletMethod(), responseObserver);
    }

    /**
     */
    public void approveTransaction(adamant.global.v1.ApproveTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Address
     * Create a new address for an existing wallet
     * </pre>
     */
    public void createAddress(adamant.global.v1.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void getAddress(adamant.global.v1.GetAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressMethod(), responseObserver);
    }

    /**
     */
    public void getAddressByAddress(adamant.global.v1.GetAddressByAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressByAddressMethod(), responseObserver);
    }

    /**
     */
    public void getAddressByIndex(adamant.global.v1.GetAddressByIndexRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressByIndexMethod(), responseObserver);
    }

    /**
     */
    public void listAddresses(adamant.global.v1.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAddressesMethod(), responseObserver);
    }

    /**
     */
    public void listAddressesWithBalance(adamant.global.v1.ListAddressesWithBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesWithBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAddressesWithBalanceMethod(), responseObserver);
    }

    /**
     */
    public void updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAddressBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public void getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEthereumFeeAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisterKey
     * </pre>
     */
    public void registerKey(adamant.global.v1.RegisterKeyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.RegisterKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * </pre>
     */
    public void createTransaction(adamant.global.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createXRPInitTransactions(adamant.global.v1.CreateXRPInitTransactionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateXRPInitTransactionsMethod(), responseObserver);
    }

    /**
     */
    public void signTransaction(adamant.global.v1.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignTransactionMethod(), responseObserver);
    }

    /**
     */
    public void signXRPInitTransactions(adamant.global.v1.SignXRPInitTransactionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignXRPInitTransactionsMethod(), responseObserver);
    }

    /**
     */
    public void sendTransaction(adamant.global.v1.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
    }

    /**
     */
    public void sendXRPInitTransactions(adamant.global.v1.SendXRPInitTransactionsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SendXRPInitTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendXRPInitTransactionsMethod(), responseObserver);
    }

    /**
     */
    public void cancelTransaction(adamant.global.v1.CancelTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getTransaction(adamant.global.v1.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionByTxID(adamant.global.v1.GetTransactionByTxIDRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionByTxIDMethod(), responseObserver);
    }

    /**
     */
    public void listTransactions(adamant.global.v1.ListTransactionsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransactionsMethod(), responseObserver);
    }

    /**
     */
    public void listTransactionsByFilter(adamant.global.v1.ListTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransactionsByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * SignInfo
     * </pre>
     */
    public void getSignInfo(adamant.global.v1.GetSignInfoRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.SignInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSignInfoMethod(), responseObserver);
    }

    /**
     */
    public void listSignInfo(adamant.global.v1.ListSignInfoRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListSignInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSignInfoMethod(), responseObserver);
    }

    /**
     */
    public void listXRPInitSignInfo(adamant.global.v1.ListXRPInitSignInfoRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListXRPInitSignInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListXRPInitSignInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfer
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    public void listTransfers(adamant.global.v1.ListTransfersRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransfersMethod(), responseObserver);
    }

    /**
     */
    public void listTransfersByFilter(adamant.global.v1.ListTransfersByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransfersByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rate
     * Get rates by snapshot id
     * </pre>
     */
    public void getRateSnapshot(adamant.global.v1.GetRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRateSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    public void getLatestRateSnapshot(adamant.global.v1.GetLatestRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestRateSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    public void setRates(adamant.global.v1.SetRatesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SetRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * policy
     * </pre>
     */
    public void createLabeledAddress(adamant.global.v1.CreateLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateLabeledAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLabeledAddressMethod(), responseObserver);
    }

    /**
     */
    public void getLabeledAddress(adamant.global.v1.GetLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.LabeledAddress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLabeledAddressMethod(), responseObserver);
    }

    /**
     */
    public void listLabeledAddresses(adamant.global.v1.ListLabeledAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListLabeledAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLabeledAddressesMethod(), responseObserver);
    }

    /**
     */
    public void isDeletableLabeledAddress(adamant.global.v1.IsDeletableLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableLabeledAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsDeletableLabeledAddressMethod(), responseObserver);
    }

    /**
     */
    public void updateLabeledAddress(adamant.global.v1.UpdateLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.LabeledAddress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLabeledAddressMethod(), responseObserver);
    }

    /**
     */
    public void deleteAddress(adamant.global.v1.DeleteLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAddressMethod(), responseObserver);
    }

    /**
     */
    public void reviewLabeledAddressProposal(adamant.global.v1.ReviewLabeledAddressProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewLabeledAddressProposalMethod(), responseObserver);
    }

    /**
     */
    public void createWhitelist(adamant.global.v1.CreateWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWhitelistMethod(), responseObserver);
    }

    /**
     */
    public void getWhitelist(adamant.global.v1.GetWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWhitelistMethod(), responseObserver);
    }

    /**
     */
    public void listWhitelists(adamant.global.v1.ListWhitelistsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWhitelistsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWhitelistsMethod(), responseObserver);
    }

    /**
     */
    public void isDeletableWhitelist(adamant.global.v1.IsDeletableWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsDeletableWhitelistMethod(), responseObserver);
    }

    /**
     */
    public void updateWhitelist(adamant.global.v1.UpdateWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWhitelistMethod(), responseObserver);
    }

    /**
     */
    public void updateWhitelistAddresses(adamant.global.v1.UpdateWhitelistAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWhitelistAddressesMethod(), responseObserver);
    }

    /**
     */
    public void deleteWhitelist(adamant.global.v1.DeleteWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWhitelistMethod(), responseObserver);
    }

    /**
     */
    public void createTransferLimit(adamant.global.v1.CreateTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransferLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransferLimitMethod(), responseObserver);
    }

    /**
     */
    public void getTransferLimit(adamant.global.v1.GetTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransferLimitMethod(), responseObserver);
    }

    /**
     */
    public void listTransferLimits(adamant.global.v1.ListTransferLimitsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransferLimitsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransferLimitsMethod(), responseObserver);
    }

    /**
     */
    public void isDeletableTransferLimit(adamant.global.v1.IsDeletableTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableTransferLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsDeletableTransferLimitMethod(), responseObserver);
    }

    /**
     */
    public void updateTransferLimit(adamant.global.v1.UpdateTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTransferLimitMethod(), responseObserver);
    }

    /**
     */
    public void updateTransferLimitName(adamant.global.v1.UpdateTransferLimitNameRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTransferLimitNameMethod(), responseObserver);
    }

    /**
     */
    public void deleteTransferLimit(adamant.global.v1.DeleteTransferLimitRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTransferLimitMethod(), responseObserver);
    }

    /**
     */
    public void reviewTransferLimitProposal(adamant.global.v1.ReviewTransferLimitProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewTransferLimitProposalMethod(), responseObserver);
    }

    /**
     */
    public void createPolicy(adamant.global.v1.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreatePolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePolicyMethod(), responseObserver);
    }

    /**
     */
    public void getPolicy(adamant.global.v1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     */
    public void listPolicies(adamant.global.v1.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPoliciesMethod(), responseObserver);
    }

    /**
     */
    public void isDeletablePolicy(adamant.global.v1.IsDeletablePolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletablePolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsDeletablePolicyMethod(), responseObserver);
    }

    /**
     */
    public void updatePolicy(adamant.global.v1.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePolicyMethod(), responseObserver);
    }

    /**
     */
    public void deletePolicy(adamant.global.v1.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePolicyMethod(), responseObserver);
    }

    /**
     */
    public void reviewPolicyProposal(adamant.global.v1.ReviewPolicyProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewPolicyProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Utility
     * </pre>
     */
    public void getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpendableBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getTotalBalance(adamant.global.v1.GetTotalBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TotalBalance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTotalBalanceMethod(), responseObserver);
    }

    /**
     */
    public void listBalanceSnapshots(adamant.global.v1.ListBalanceSnapshotsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBalanceSnapshotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBalanceSnapshotsMethod(), responseObserver);
    }

    /**
     */
    public void calculateFee(adamant.global.v1.CalculateFeeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateFeeMethod(), responseObserver);
    }

    /**
     */
    public void getMembersDeactivatabilities(adamant.global.v1.GetMembersDeactivatabilitiesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetMembersDeactivatabilitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMembersDeactivatabilitiesMethod(), responseObserver);
    }

    /**
     */
    public void getRecommendedFeeRate(adamant.global.v1.GetRecommendedFeeRateRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetRecommendedFeeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecommendedFeeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    public void validateAddress(adamant.global.v1.ValidateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ValidateAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateWalletRequest,
                adamant.global.v1.CreateWalletResponse>(
                  this, METHODID_CREATE_WALLET)))
          .addMethod(
            getGetWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetWalletRequest,
                adamant.global.v1.Model.Wallet>(
                  this, METHODID_GET_WALLET)))
          .addMethod(
            getCancelWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CancelWalletRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL_WALLET)))
          .addMethod(
            getArchiveWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ArchiveWalletRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ARCHIVE_WALLET)))
          .addMethod(
            getUnArchiveWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UnArchiveWalletRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UN_ARCHIVE_WALLET)))
          .addMethod(
            getListWalletsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListWalletsRequest,
                adamant.global.v1.ListWalletsResponse>(
                  this, METHODID_LIST_WALLETS)))
          .addMethod(
            getListWalletsByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListWalletsByFilterRequest,
                adamant.global.v1.ListWalletsResponse>(
                  this, METHODID_LIST_WALLETS_BY_FILTER)))
          .addMethod(
            getListBaseWalletsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListBaseWalletsRequest,
                adamant.global.v1.ListBaseWalletsResponse>(
                  this, METHODID_LIST_BASE_WALLETS)))
          .addMethod(
            getUpdateWalletNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateWalletNameRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_WALLET_NAME)))
          .addMethod(
            getUpdateWalletValidationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateWalletValidationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_WALLET_VALIDATION)))
          .addMethod(
            getUpdateWalletPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateWalletPolicyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_WALLET_POLICY)))
          .addMethod(
            getReviewWalletProposalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ReviewWalletProposalRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REVIEW_WALLET_PROPOSAL)))
          .addMethod(
            getFlushBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.FlushBalanceRequest,
                adamant.global.v1.FlushBalanceResponse>(
                  this, METHODID_FLUSH_BALANCE)))
          .addMethod(
            getApproveWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ApproveWalletRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_APPROVE_WALLET)))
          .addMethod(
            getApproveTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ApproveTransactionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_APPROVE_TRANSACTION)))
          .addMethod(
            getCreateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateAddressRequest,
                adamant.global.v1.CreateAddressResponse>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getGetAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetAddressRequest,
                adamant.global.v1.Model.Address>(
                  this, METHODID_GET_ADDRESS)))
          .addMethod(
            getGetAddressByAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetAddressByAddressRequest,
                adamant.global.v1.Model.Address>(
                  this, METHODID_GET_ADDRESS_BY_ADDRESS)))
          .addMethod(
            getGetAddressByIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetAddressByIndexRequest,
                adamant.global.v1.Model.Address>(
                  this, METHODID_GET_ADDRESS_BY_INDEX)))
          .addMethod(
            getListAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListAddressesRequest,
                adamant.global.v1.ListAddressesResponse>(
                  this, METHODID_LIST_ADDRESSES)))
          .addMethod(
            getListAddressesWithBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListAddressesWithBalanceRequest,
                adamant.global.v1.ListAddressesWithBalanceResponse>(
                  this, METHODID_LIST_ADDRESSES_WITH_BALANCE)))
          .addMethod(
            getUpdateAddressBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateAddressBalanceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ADDRESS_BALANCE)))
          .addMethod(
            getGetEthereumFeeAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetEthereumFeeAddressRequest,
                adamant.global.v1.Model.EthereumFeeAddress>(
                  this, METHODID_GET_ETHEREUM_FEE_ADDRESS)))
          .addMethod(
            getRegisterKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.RegisterKeyRequest,
                adamant.global.v1.RegisterKeyResponse>(
                  this, METHODID_REGISTER_KEY)))
          .addMethod(
            getCreateTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateTransactionRequest,
                adamant.global.v1.CreateTransactionResponse>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getCreateXRPInitTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateXRPInitTransactionsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_XRPINIT_TRANSACTIONS)))
          .addMethod(
            getSignTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.SignTransactionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SIGN_TRANSACTION)))
          .addMethod(
            getSignXRPInitTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.SignXRPInitTransactionsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SIGN_XRPINIT_TRANSACTIONS)))
          .addMethod(
            getSendTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.SendTransactionRequest,
                adamant.global.v1.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            getSendXRPInitTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.SendXRPInitTransactionsRequest,
                adamant.global.v1.SendXRPInitTransactionsResponse>(
                  this, METHODID_SEND_XRPINIT_TRANSACTIONS)))
          .addMethod(
            getCancelTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CancelTransactionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL_TRANSACTION)))
          .addMethod(
            getGetTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetTransactionRequest,
                adamant.global.v1.Model.Transaction>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            getGetTransactionByTxIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetTransactionByTxIDRequest,
                adamant.global.v1.Model.Transaction>(
                  this, METHODID_GET_TRANSACTION_BY_TX_ID)))
          .addMethod(
            getListTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListTransactionsRequest,
                adamant.global.v1.ListTransactionsResponse>(
                  this, METHODID_LIST_TRANSACTIONS)))
          .addMethod(
            getListTransactionsByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListTransactionsByFilterRequest,
                adamant.global.v1.ListTransactionsResponse>(
                  this, METHODID_LIST_TRANSACTIONS_BY_FILTER)))
          .addMethod(
            getGetSignInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetSignInfoRequest,
                adamant.global.v1.Model.SignInfo>(
                  this, METHODID_GET_SIGN_INFO)))
          .addMethod(
            getListSignInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListSignInfoRequest,
                adamant.global.v1.ListSignInfoResponse>(
                  this, METHODID_LIST_SIGN_INFO)))
          .addMethod(
            getListXRPInitSignInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListXRPInitSignInfoRequest,
                adamant.global.v1.ListXRPInitSignInfoResponse>(
                  this, METHODID_LIST_XRPINIT_SIGN_INFO)))
          .addMethod(
            getListTransfersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListTransfersRequest,
                adamant.global.v1.ListTransfersResponse>(
                  this, METHODID_LIST_TRANSFERS)))
          .addMethod(
            getListTransfersByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListTransfersByFilterRequest,
                adamant.global.v1.ListTransfersResponse>(
                  this, METHODID_LIST_TRANSFERS_BY_FILTER)))
          .addMethod(
            getGetRateSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetRateSnapshotRequest,
                adamant.global.v1.Model.RateSnapshot>(
                  this, METHODID_GET_RATE_SNAPSHOT)))
          .addMethod(
            getGetLatestRateSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetLatestRateSnapshotRequest,
                adamant.global.v1.Model.RateSnapshot>(
                  this, METHODID_GET_LATEST_RATE_SNAPSHOT)))
          .addMethod(
            getSetRatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.SetRatesRequest,
                adamant.global.v1.SetRatesResponse>(
                  this, METHODID_SET_RATES)))
          .addMethod(
            getCreateLabeledAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateLabeledAddressRequest,
                adamant.global.v1.CreateLabeledAddressResponse>(
                  this, METHODID_CREATE_LABELED_ADDRESS)))
          .addMethod(
            getGetLabeledAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetLabeledAddressRequest,
                adamant.global.v1.Model.LabeledAddress>(
                  this, METHODID_GET_LABELED_ADDRESS)))
          .addMethod(
            getListLabeledAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListLabeledAddressesRequest,
                adamant.global.v1.ListLabeledAddressesResponse>(
                  this, METHODID_LIST_LABELED_ADDRESSES)))
          .addMethod(
            getIsDeletableLabeledAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.IsDeletableLabeledAddressRequest,
                adamant.global.v1.IsDeletableLabeledAddressResponse>(
                  this, METHODID_IS_DELETABLE_LABELED_ADDRESS)))
          .addMethod(
            getUpdateLabeledAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateLabeledAddressRequest,
                adamant.global.v1.Model.LabeledAddress>(
                  this, METHODID_UPDATE_LABELED_ADDRESS)))
          .addMethod(
            getDeleteAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.DeleteLabeledAddressRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ADDRESS)))
          .addMethod(
            getReviewLabeledAddressProposalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ReviewLabeledAddressProposalRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REVIEW_LABELED_ADDRESS_PROPOSAL)))
          .addMethod(
            getCreateWhitelistMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateWhitelistRequest,
                adamant.global.v1.CreateWhitelistResponse>(
                  this, METHODID_CREATE_WHITELIST)))
          .addMethod(
            getGetWhitelistMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetWhitelistRequest,
                adamant.global.v1.Model.Whitelist>(
                  this, METHODID_GET_WHITELIST)))
          .addMethod(
            getListWhitelistsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListWhitelistsRequest,
                adamant.global.v1.ListWhitelistsResponse>(
                  this, METHODID_LIST_WHITELISTS)))
          .addMethod(
            getIsDeletableWhitelistMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.IsDeletableWhitelistRequest,
                adamant.global.v1.IsDeletableWhitelistResponse>(
                  this, METHODID_IS_DELETABLE_WHITELIST)))
          .addMethod(
            getUpdateWhitelistMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateWhitelistRequest,
                adamant.global.v1.Model.Whitelist>(
                  this, METHODID_UPDATE_WHITELIST)))
          .addMethod(
            getUpdateWhitelistAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateWhitelistAddressesRequest,
                adamant.global.v1.Model.Whitelist>(
                  this, METHODID_UPDATE_WHITELIST_ADDRESSES)))
          .addMethod(
            getDeleteWhitelistMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.DeleteWhitelistRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_WHITELIST)))
          .addMethod(
            getCreateTransferLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateTransferLimitRequest,
                adamant.global.v1.CreateTransferLimitResponse>(
                  this, METHODID_CREATE_TRANSFER_LIMIT)))
          .addMethod(
            getGetTransferLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetTransferLimitRequest,
                adamant.global.v1.Model.TransferLimit>(
                  this, METHODID_GET_TRANSFER_LIMIT)))
          .addMethod(
            getListTransferLimitsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListTransferLimitsRequest,
                adamant.global.v1.ListTransferLimitsResponse>(
                  this, METHODID_LIST_TRANSFER_LIMITS)))
          .addMethod(
            getIsDeletableTransferLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.IsDeletableTransferLimitRequest,
                adamant.global.v1.IsDeletableTransferLimitResponse>(
                  this, METHODID_IS_DELETABLE_TRANSFER_LIMIT)))
          .addMethod(
            getUpdateTransferLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateTransferLimitRequest,
                adamant.global.v1.Model.TransferLimit>(
                  this, METHODID_UPDATE_TRANSFER_LIMIT)))
          .addMethod(
            getUpdateTransferLimitNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateTransferLimitNameRequest,
                adamant.global.v1.Model.TransferLimit>(
                  this, METHODID_UPDATE_TRANSFER_LIMIT_NAME)))
          .addMethod(
            getDeleteTransferLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.DeleteTransferLimitRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TRANSFER_LIMIT)))
          .addMethod(
            getReviewTransferLimitProposalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ReviewTransferLimitProposalRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REVIEW_TRANSFER_LIMIT_PROPOSAL)))
          .addMethod(
            getCreatePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreatePolicyRequest,
                adamant.global.v1.CreatePolicyResponse>(
                  this, METHODID_CREATE_POLICY)))
          .addMethod(
            getGetPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetPolicyRequest,
                adamant.global.v1.Model.Policy>(
                  this, METHODID_GET_POLICY)))
          .addMethod(
            getListPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListPoliciesRequest,
                adamant.global.v1.ListPoliciesResponse>(
                  this, METHODID_LIST_POLICIES)))
          .addMethod(
            getIsDeletablePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.IsDeletablePolicyRequest,
                adamant.global.v1.IsDeletablePolicyResponse>(
                  this, METHODID_IS_DELETABLE_POLICY)))
          .addMethod(
            getUpdatePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdatePolicyRequest,
                adamant.global.v1.Model.Policy>(
                  this, METHODID_UPDATE_POLICY)))
          .addMethod(
            getDeletePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.DeletePolicyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_POLICY)))
          .addMethod(
            getReviewPolicyProposalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ReviewPolicyProposalRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REVIEW_POLICY_PROPOSAL)))
          .addMethod(
            getGetSpendableBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetSpendableBalanceRequest,
                adamant.global.v1.GetSpendableBalanceResponse>(
                  this, METHODID_GET_SPENDABLE_BALANCE)))
          .addMethod(
            getGetTotalBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetTotalBalanceRequest,
                adamant.global.v1.Model.TotalBalance>(
                  this, METHODID_GET_TOTAL_BALANCE)))
          .addMethod(
            getListBalanceSnapshotsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ListBalanceSnapshotsRequest,
                adamant.global.v1.ListBalanceSnapshotsResponse>(
                  this, METHODID_LIST_BALANCE_SNAPSHOTS)))
          .addMethod(
            getCalculateFeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CalculateFeeRequest,
                adamant.global.v1.CalculateFeeResponse>(
                  this, METHODID_CALCULATE_FEE)))
          .addMethod(
            getGetMembersDeactivatabilitiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetMembersDeactivatabilitiesRequest,
                adamant.global.v1.GetMembersDeactivatabilitiesResponse>(
                  this, METHODID_GET_MEMBERS_DEACTIVATABILITIES)))
          .addMethod(
            getGetRecommendedFeeRateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetRecommendedFeeRateRequest,
                adamant.global.v1.GetRecommendedFeeRateResponse>(
                  this, METHODID_GET_RECOMMENDED_FEE_RATE)))
          .addMethod(
            getValidateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.ValidateAddressRequest,
                adamant.global.v1.ValidateAddressResponse>(
                  this, METHODID_VALIDATE_ADDRESS)))
          .build();
    }
  }

  /**
   */
  public static final class GlobalAPIStub extends io.grpc.stub.AbstractAsyncStub<GlobalAPIStub> {
    private GlobalAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GlobalAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GlobalAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Wallet
     * </pre>
     */
    public void createWallet(adamant.global.v1.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateWalletResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    public void getWallet(adamant.global.v1.GetWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Wallet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelWallet(adamant.global.v1.CancelWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void archiveWallet(adamant.global.v1.ArchiveWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unArchiveWallet(adamant.global.v1.UnArchiveWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnArchiveWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWallets(adamant.global.v1.ListWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWalletsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWalletsByFilter(adamant.global.v1.ListWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWalletsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBaseWallets(adamant.global.v1.ListBaseWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBaseWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBaseWalletsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWalletName(adamant.global.v1.UpdateWalletNameRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWalletNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWalletValidation(adamant.global.v1.UpdateWalletValidationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWalletValidationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWalletPolicy(adamant.global.v1.UpdateWalletPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWalletPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewWalletProposal(adamant.global.v1.ReviewWalletProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviewWalletProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flushBalance(adamant.global.v1.FlushBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Review
     * </pre>
     */
    public void approveWallet(adamant.global.v1.ApproveWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void approveTransaction(adamant.global.v1.ApproveTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Address
     * Create a new address for an existing wallet
     * </pre>
     */
    public void createAddress(adamant.global.v1.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddress(adamant.global.v1.GetAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressByAddress(adamant.global.v1.GetAddressByAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressByIndex(adamant.global.v1.GetAddressByIndexRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressByIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAddresses(adamant.global.v1.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAddressesWithBalance(adamant.global.v1.ListAddressesWithBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesWithBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAddressesWithBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAddressBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public void getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEthereumFeeAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisterKey
     * </pre>
     */
    public void registerKey(adamant.global.v1.RegisterKeyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.RegisterKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * </pre>
     */
    public void createTransaction(adamant.global.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createXRPInitTransactions(adamant.global.v1.CreateXRPInitTransactionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateXRPInitTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signTransaction(adamant.global.v1.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signXRPInitTransactions(adamant.global.v1.SignXRPInitTransactionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignXRPInitTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendTransaction(adamant.global.v1.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendXRPInitTransactions(adamant.global.v1.SendXRPInitTransactionsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SendXRPInitTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendXRPInitTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelTransaction(adamant.global.v1.CancelTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransaction(adamant.global.v1.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionByTxID(adamant.global.v1.GetTransactionByTxIDRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionByTxIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransactions(adamant.global.v1.ListTransactionsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransactionsByFilter(adamant.global.v1.ListTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransactionsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SignInfo
     * </pre>
     */
    public void getSignInfo(adamant.global.v1.GetSignInfoRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.SignInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSignInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSignInfo(adamant.global.v1.ListSignInfoRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListSignInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSignInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listXRPInitSignInfo(adamant.global.v1.ListXRPInitSignInfoRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListXRPInitSignInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListXRPInitSignInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfer
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    public void listTransfers(adamant.global.v1.ListTransfersRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransfersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransfersByFilter(adamant.global.v1.ListTransfersByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransfersByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rate
     * Get rates by snapshot id
     * </pre>
     */
    public void getRateSnapshot(adamant.global.v1.GetRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRateSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    public void getLatestRateSnapshot(adamant.global.v1.GetLatestRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestRateSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    public void setRates(adamant.global.v1.SetRatesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SetRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * policy
     * </pre>
     */
    public void createLabeledAddress(adamant.global.v1.CreateLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateLabeledAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLabeledAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLabeledAddress(adamant.global.v1.GetLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.LabeledAddress> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLabeledAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLabeledAddresses(adamant.global.v1.ListLabeledAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListLabeledAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLabeledAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isDeletableLabeledAddress(adamant.global.v1.IsDeletableLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableLabeledAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsDeletableLabeledAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLabeledAddress(adamant.global.v1.UpdateLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.LabeledAddress> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLabeledAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAddress(adamant.global.v1.DeleteLabeledAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewLabeledAddressProposal(adamant.global.v1.ReviewLabeledAddressProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviewLabeledAddressProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWhitelist(adamant.global.v1.CreateWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWhitelist(adamant.global.v1.GetWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWhitelists(adamant.global.v1.ListWhitelistsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWhitelistsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWhitelistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isDeletableWhitelist(adamant.global.v1.IsDeletableWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsDeletableWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWhitelist(adamant.global.v1.UpdateWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWhitelistAddresses(adamant.global.v1.UpdateWhitelistAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWhitelistAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWhitelist(adamant.global.v1.DeleteWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransferLimit(adamant.global.v1.CreateTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransferLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransferLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransferLimit(adamant.global.v1.GetTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransferLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransferLimits(adamant.global.v1.ListTransferLimitsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransferLimitsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransferLimitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isDeletableTransferLimit(adamant.global.v1.IsDeletableTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableTransferLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsDeletableTransferLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTransferLimit(adamant.global.v1.UpdateTransferLimitRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTransferLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTransferLimitName(adamant.global.v1.UpdateTransferLimitNameRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTransferLimitNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTransferLimit(adamant.global.v1.DeleteTransferLimitRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTransferLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewTransferLimitProposal(adamant.global.v1.ReviewTransferLimitProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviewTransferLimitProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPolicy(adamant.global.v1.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreatePolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPolicy(adamant.global.v1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPolicies(adamant.global.v1.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isDeletablePolicy(adamant.global.v1.IsDeletablePolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletablePolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsDeletablePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePolicy(adamant.global.v1.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePolicy(adamant.global.v1.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewPolicyProposal(adamant.global.v1.ReviewPolicyProposalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviewPolicyProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Utility
     * </pre>
     */
    public void getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpendableBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalBalance(adamant.global.v1.GetTotalBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.TotalBalance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTotalBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBalanceSnapshots(adamant.global.v1.ListBalanceSnapshotsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBalanceSnapshotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBalanceSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateFee(adamant.global.v1.CalculateFeeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMembersDeactivatabilities(adamant.global.v1.GetMembersDeactivatabilitiesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetMembersDeactivatabilitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMembersDeactivatabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecommendedFeeRate(adamant.global.v1.GetRecommendedFeeRateRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetRecommendedFeeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRecommendedFeeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    public void validateAddress(adamant.global.v1.ValidateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ValidateAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GlobalAPIBlockingStub extends io.grpc.stub.AbstractBlockingStub<GlobalAPIBlockingStub> {
    private GlobalAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GlobalAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GlobalAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Wallet
     * </pre>
     */
    public adamant.global.v1.CreateWalletResponse createWallet(adamant.global.v1.CreateWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWalletMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    public adamant.global.v1.Model.Wallet getWallet(adamant.global.v1.GetWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelWallet(adamant.global.v1.CancelWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty archiveWallet(adamant.global.v1.ArchiveWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty unArchiveWallet(adamant.global.v1.UnArchiveWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnArchiveWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListWalletsResponse listWallets(adamant.global.v1.ListWalletsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWalletsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListWalletsResponse listWalletsByFilter(adamant.global.v1.ListWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWalletsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListBaseWalletsResponse listBaseWallets(adamant.global.v1.ListBaseWalletsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBaseWalletsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateWalletName(adamant.global.v1.UpdateWalletNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWalletNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateWalletValidation(adamant.global.v1.UpdateWalletValidationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWalletValidationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateWalletPolicy(adamant.global.v1.UpdateWalletPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWalletPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty reviewWalletProposal(adamant.global.v1.ReviewWalletProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviewWalletProposalMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.FlushBalanceResponse flushBalance(adamant.global.v1.FlushBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Review
     * </pre>
     */
    public com.google.protobuf.Empty approveWallet(adamant.global.v1.ApproveWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty approveTransaction(adamant.global.v1.ApproveTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Address
     * Create a new address for an existing wallet
     * </pre>
     */
    public adamant.global.v1.CreateAddressResponse createAddress(adamant.global.v1.CreateAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Address getAddress(adamant.global.v1.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Address getAddressByAddress(adamant.global.v1.GetAddressByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressByAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Address getAddressByIndex(adamant.global.v1.GetAddressByIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressByIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListAddressesResponse listAddresses(adamant.global.v1.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListAddressesWithBalanceResponse listAddressesWithBalance(adamant.global.v1.ListAddressesWithBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAddressesWithBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAddressBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public adamant.global.v1.Model.EthereumFeeAddress getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEthereumFeeAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisterKey
     * </pre>
     */
    public adamant.global.v1.RegisterKeyResponse registerKey(adamant.global.v1.RegisterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transaction
     * </pre>
     */
    public adamant.global.v1.CreateTransactionResponse createTransaction(adamant.global.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createXRPInitTransactions(adamant.global.v1.CreateXRPInitTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateXRPInitTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty signTransaction(adamant.global.v1.SignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty signXRPInitTransactions(adamant.global.v1.SignXRPInitTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignXRPInitTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.SendTransactionResponse sendTransaction(adamant.global.v1.SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.SendXRPInitTransactionsResponse sendXRPInitTransactions(adamant.global.v1.SendXRPInitTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendXRPInitTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelTransaction(adamant.global.v1.CancelTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Transaction getTransaction(adamant.global.v1.GetTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Transaction getTransactionByTxID(adamant.global.v1.GetTransactionByTxIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionByTxIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListTransactionsResponse listTransactions(adamant.global.v1.ListTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListTransactionsResponse listTransactionsByFilter(adamant.global.v1.ListTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransactionsByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SignInfo
     * </pre>
     */
    public adamant.global.v1.Model.SignInfo getSignInfo(adamant.global.v1.GetSignInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSignInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListSignInfoResponse listSignInfo(adamant.global.v1.ListSignInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSignInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListXRPInitSignInfoResponse listXRPInitSignInfo(adamant.global.v1.ListXRPInitSignInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListXRPInitSignInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfer
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    public adamant.global.v1.ListTransfersResponse listTransfers(adamant.global.v1.ListTransfersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransfersMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListTransfersResponse listTransfersByFilter(adamant.global.v1.ListTransfersByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransfersByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rate
     * Get rates by snapshot id
     * </pre>
     */
    public adamant.global.v1.Model.RateSnapshot getRateSnapshot(adamant.global.v1.GetRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRateSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    public adamant.global.v1.Model.RateSnapshot getLatestRateSnapshot(adamant.global.v1.GetLatestRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestRateSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    public adamant.global.v1.SetRatesResponse setRates(adamant.global.v1.SetRatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * policy
     * </pre>
     */
    public adamant.global.v1.CreateLabeledAddressResponse createLabeledAddress(adamant.global.v1.CreateLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLabeledAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.LabeledAddress getLabeledAddress(adamant.global.v1.GetLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLabeledAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListLabeledAddressesResponse listLabeledAddresses(adamant.global.v1.ListLabeledAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLabeledAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.IsDeletableLabeledAddressResponse isDeletableLabeledAddress(adamant.global.v1.IsDeletableLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsDeletableLabeledAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.LabeledAddress updateLabeledAddress(adamant.global.v1.UpdateLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLabeledAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAddress(adamant.global.v1.DeleteLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty reviewLabeledAddressProposal(adamant.global.v1.ReviewLabeledAddressProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviewLabeledAddressProposalMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateWhitelistResponse createWhitelist(adamant.global.v1.CreateWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Whitelist getWhitelist(adamant.global.v1.GetWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListWhitelistsResponse listWhitelists(adamant.global.v1.ListWhitelistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWhitelistsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.IsDeletableWhitelistResponse isDeletableWhitelist(adamant.global.v1.IsDeletableWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsDeletableWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Whitelist updateWhitelist(adamant.global.v1.UpdateWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Whitelist updateWhitelistAddresses(adamant.global.v1.UpdateWhitelistAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWhitelistAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteWhitelist(adamant.global.v1.DeleteWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransferLimitResponse createTransferLimit(adamant.global.v1.CreateTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransferLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.TransferLimit getTransferLimit(adamant.global.v1.GetTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransferLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListTransferLimitsResponse listTransferLimits(adamant.global.v1.ListTransferLimitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransferLimitsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.IsDeletableTransferLimitResponse isDeletableTransferLimit(adamant.global.v1.IsDeletableTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsDeletableTransferLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.TransferLimit updateTransferLimit(adamant.global.v1.UpdateTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTransferLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.TransferLimit updateTransferLimitName(adamant.global.v1.UpdateTransferLimitNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTransferLimitNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTransferLimit(adamant.global.v1.DeleteTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTransferLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty reviewTransferLimitProposal(adamant.global.v1.ReviewTransferLimitProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviewTransferLimitProposalMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreatePolicyResponse createPolicy(adamant.global.v1.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Policy getPolicy(adamant.global.v1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListPoliciesResponse listPolicies(adamant.global.v1.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPoliciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.IsDeletablePolicyResponse isDeletablePolicy(adamant.global.v1.IsDeletablePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsDeletablePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Policy updatePolicy(adamant.global.v1.UpdatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePolicy(adamant.global.v1.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty reviewPolicyProposal(adamant.global.v1.ReviewPolicyProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviewPolicyProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Utility
     * </pre>
     */
    public adamant.global.v1.GetSpendableBalanceResponse getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpendableBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.TotalBalance getTotalBalance(adamant.global.v1.GetTotalBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTotalBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListBalanceSnapshotsResponse listBalanceSnapshots(adamant.global.v1.ListBalanceSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBalanceSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CalculateFeeResponse calculateFee(adamant.global.v1.CalculateFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.GetMembersDeactivatabilitiesResponse getMembersDeactivatabilities(adamant.global.v1.GetMembersDeactivatabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMembersDeactivatabilitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.GetRecommendedFeeRateResponse getRecommendedFeeRate(adamant.global.v1.GetRecommendedFeeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecommendedFeeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    public adamant.global.v1.ValidateAddressResponse validateAddress(adamant.global.v1.ValidateAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GlobalAPIFutureStub extends io.grpc.stub.AbstractFutureStub<GlobalAPIFutureStub> {
    private GlobalAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GlobalAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GlobalAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Wallet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateWalletResponse> createWallet(
        adamant.global.v1.CreateWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWalletMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Wallet> getWallet(
        adamant.global.v1.GetWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelWallet(
        adamant.global.v1.CancelWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> archiveWallet(
        adamant.global.v1.ArchiveWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unArchiveWallet(
        adamant.global.v1.UnArchiveWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnArchiveWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListWalletsResponse> listWallets(
        adamant.global.v1.ListWalletsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWalletsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListWalletsResponse> listWalletsByFilter(
        adamant.global.v1.ListWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWalletsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListBaseWalletsResponse> listBaseWallets(
        adamant.global.v1.ListBaseWalletsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBaseWalletsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateWalletName(
        adamant.global.v1.UpdateWalletNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWalletNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateWalletValidation(
        adamant.global.v1.UpdateWalletValidationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWalletValidationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateWalletPolicy(
        adamant.global.v1.UpdateWalletPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWalletPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reviewWalletProposal(
        adamant.global.v1.ReviewWalletProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviewWalletProposalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.FlushBalanceResponse> flushBalance(
        adamant.global.v1.FlushBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Review
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> approveWallet(
        adamant.global.v1.ApproveWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> approveTransaction(
        adamant.global.v1.ApproveTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Address
     * Create a new address for an existing wallet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateAddressResponse> createAddress(
        adamant.global.v1.CreateAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Address> getAddress(
        adamant.global.v1.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Address> getAddressByAddress(
        adamant.global.v1.GetAddressByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressByAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Address> getAddressByIndex(
        adamant.global.v1.GetAddressByIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressByIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListAddressesResponse> listAddresses(
        adamant.global.v1.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListAddressesWithBalanceResponse> listAddressesWithBalance(
        adamant.global.v1.ListAddressesWithBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAddressesWithBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAddressBalance(
        adamant.global.v1.UpdateAddressBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAddressBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.EthereumFeeAddress> getEthereumFeeAddress(
        adamant.global.v1.GetEthereumFeeAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEthereumFeeAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisterKey
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.RegisterKeyResponse> registerKey(
        adamant.global.v1.RegisterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> createTransaction(
        adamant.global.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createXRPInitTransactions(
        adamant.global.v1.CreateXRPInitTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateXRPInitTransactionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> signTransaction(
        adamant.global.v1.SignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> signXRPInitTransactions(
        adamant.global.v1.SignXRPInitTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignXRPInitTransactionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.SendTransactionResponse> sendTransaction(
        adamant.global.v1.SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.SendXRPInitTransactionsResponse> sendXRPInitTransactions(
        adamant.global.v1.SendXRPInitTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendXRPInitTransactionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelTransaction(
        adamant.global.v1.CancelTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Transaction> getTransaction(
        adamant.global.v1.GetTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Transaction> getTransactionByTxID(
        adamant.global.v1.GetTransactionByTxIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionByTxIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransactionsResponse> listTransactions(
        adamant.global.v1.ListTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransactionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransactionsResponse> listTransactionsByFilter(
        adamant.global.v1.ListTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransactionsByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SignInfo
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.SignInfo> getSignInfo(
        adamant.global.v1.GetSignInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSignInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListSignInfoResponse> listSignInfo(
        adamant.global.v1.ListSignInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSignInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListXRPInitSignInfoResponse> listXRPInitSignInfo(
        adamant.global.v1.ListXRPInitSignInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListXRPInitSignInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfer
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransfersResponse> listTransfers(
        adamant.global.v1.ListTransfersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransfersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransfersResponse> listTransfersByFilter(
        adamant.global.v1.ListTransfersByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransfersByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rate
     * Get rates by snapshot id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.RateSnapshot> getRateSnapshot(
        adamant.global.v1.GetRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRateSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.RateSnapshot> getLatestRateSnapshot(
        adamant.global.v1.GetLatestRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestRateSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.SetRatesResponse> setRates(
        adamant.global.v1.SetRatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * policy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateLabeledAddressResponse> createLabeledAddress(
        adamant.global.v1.CreateLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLabeledAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.LabeledAddress> getLabeledAddress(
        adamant.global.v1.GetLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLabeledAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListLabeledAddressesResponse> listLabeledAddresses(
        adamant.global.v1.ListLabeledAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLabeledAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.IsDeletableLabeledAddressResponse> isDeletableLabeledAddress(
        adamant.global.v1.IsDeletableLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsDeletableLabeledAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.LabeledAddress> updateLabeledAddress(
        adamant.global.v1.UpdateLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLabeledAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAddress(
        adamant.global.v1.DeleteLabeledAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reviewLabeledAddressProposal(
        adamant.global.v1.ReviewLabeledAddressProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviewLabeledAddressProposalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateWhitelistResponse> createWhitelist(
        adamant.global.v1.CreateWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Whitelist> getWhitelist(
        adamant.global.v1.GetWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListWhitelistsResponse> listWhitelists(
        adamant.global.v1.ListWhitelistsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWhitelistsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.IsDeletableWhitelistResponse> isDeletableWhitelist(
        adamant.global.v1.IsDeletableWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsDeletableWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Whitelist> updateWhitelist(
        adamant.global.v1.UpdateWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Whitelist> updateWhitelistAddresses(
        adamant.global.v1.UpdateWhitelistAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWhitelistAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteWhitelist(
        adamant.global.v1.DeleteWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransferLimitResponse> createTransferLimit(
        adamant.global.v1.CreateTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransferLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.TransferLimit> getTransferLimit(
        adamant.global.v1.GetTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransferLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransferLimitsResponse> listTransferLimits(
        adamant.global.v1.ListTransferLimitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransferLimitsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.IsDeletableTransferLimitResponse> isDeletableTransferLimit(
        adamant.global.v1.IsDeletableTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsDeletableTransferLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.TransferLimit> updateTransferLimit(
        adamant.global.v1.UpdateTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTransferLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.TransferLimit> updateTransferLimitName(
        adamant.global.v1.UpdateTransferLimitNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTransferLimitNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTransferLimit(
        adamant.global.v1.DeleteTransferLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTransferLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reviewTransferLimitProposal(
        adamant.global.v1.ReviewTransferLimitProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviewTransferLimitProposalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreatePolicyResponse> createPolicy(
        adamant.global.v1.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Policy> getPolicy(
        adamant.global.v1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListPoliciesResponse> listPolicies(
        adamant.global.v1.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.IsDeletablePolicyResponse> isDeletablePolicy(
        adamant.global.v1.IsDeletablePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsDeletablePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Policy> updatePolicy(
        adamant.global.v1.UpdatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePolicy(
        adamant.global.v1.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reviewPolicyProposal(
        adamant.global.v1.ReviewPolicyProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviewPolicyProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Utility
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.GetSpendableBalanceResponse> getSpendableBalance(
        adamant.global.v1.GetSpendableBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpendableBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.TotalBalance> getTotalBalance(
        adamant.global.v1.GetTotalBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTotalBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListBalanceSnapshotsResponse> listBalanceSnapshots(
        adamant.global.v1.ListBalanceSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBalanceSnapshotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CalculateFeeResponse> calculateFee(
        adamant.global.v1.CalculateFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.GetMembersDeactivatabilitiesResponse> getMembersDeactivatabilities(
        adamant.global.v1.GetMembersDeactivatabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMembersDeactivatabilitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.GetRecommendedFeeRateResponse> getRecommendedFeeRate(
        adamant.global.v1.GetRecommendedFeeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRecommendedFeeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ValidateAddressResponse> validateAddress(
        adamant.global.v1.ValidateAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WALLET = 0;
  private static final int METHODID_GET_WALLET = 1;
  private static final int METHODID_CANCEL_WALLET = 2;
  private static final int METHODID_ARCHIVE_WALLET = 3;
  private static final int METHODID_UN_ARCHIVE_WALLET = 4;
  private static final int METHODID_LIST_WALLETS = 5;
  private static final int METHODID_LIST_WALLETS_BY_FILTER = 6;
  private static final int METHODID_LIST_BASE_WALLETS = 7;
  private static final int METHODID_UPDATE_WALLET_NAME = 8;
  private static final int METHODID_UPDATE_WALLET_VALIDATION = 9;
  private static final int METHODID_UPDATE_WALLET_POLICY = 10;
  private static final int METHODID_REVIEW_WALLET_PROPOSAL = 11;
  private static final int METHODID_FLUSH_BALANCE = 12;
  private static final int METHODID_APPROVE_WALLET = 13;
  private static final int METHODID_APPROVE_TRANSACTION = 14;
  private static final int METHODID_CREATE_ADDRESS = 15;
  private static final int METHODID_GET_ADDRESS = 16;
  private static final int METHODID_GET_ADDRESS_BY_ADDRESS = 17;
  private static final int METHODID_GET_ADDRESS_BY_INDEX = 18;
  private static final int METHODID_LIST_ADDRESSES = 19;
  private static final int METHODID_LIST_ADDRESSES_WITH_BALANCE = 20;
  private static final int METHODID_UPDATE_ADDRESS_BALANCE = 21;
  private static final int METHODID_GET_ETHEREUM_FEE_ADDRESS = 22;
  private static final int METHODID_REGISTER_KEY = 23;
  private static final int METHODID_CREATE_TRANSACTION = 24;
  private static final int METHODID_CREATE_XRPINIT_TRANSACTIONS = 25;
  private static final int METHODID_SIGN_TRANSACTION = 26;
  private static final int METHODID_SIGN_XRPINIT_TRANSACTIONS = 27;
  private static final int METHODID_SEND_TRANSACTION = 28;
  private static final int METHODID_SEND_XRPINIT_TRANSACTIONS = 29;
  private static final int METHODID_CANCEL_TRANSACTION = 30;
  private static final int METHODID_GET_TRANSACTION = 31;
  private static final int METHODID_GET_TRANSACTION_BY_TX_ID = 32;
  private static final int METHODID_LIST_TRANSACTIONS = 33;
  private static final int METHODID_LIST_TRANSACTIONS_BY_FILTER = 34;
  private static final int METHODID_GET_SIGN_INFO = 35;
  private static final int METHODID_LIST_SIGN_INFO = 36;
  private static final int METHODID_LIST_XRPINIT_SIGN_INFO = 37;
  private static final int METHODID_LIST_TRANSFERS = 38;
  private static final int METHODID_LIST_TRANSFERS_BY_FILTER = 39;
  private static final int METHODID_GET_RATE_SNAPSHOT = 40;
  private static final int METHODID_GET_LATEST_RATE_SNAPSHOT = 41;
  private static final int METHODID_SET_RATES = 42;
  private static final int METHODID_CREATE_LABELED_ADDRESS = 43;
  private static final int METHODID_GET_LABELED_ADDRESS = 44;
  private static final int METHODID_LIST_LABELED_ADDRESSES = 45;
  private static final int METHODID_IS_DELETABLE_LABELED_ADDRESS = 46;
  private static final int METHODID_UPDATE_LABELED_ADDRESS = 47;
  private static final int METHODID_DELETE_ADDRESS = 48;
  private static final int METHODID_REVIEW_LABELED_ADDRESS_PROPOSAL = 49;
  private static final int METHODID_CREATE_WHITELIST = 50;
  private static final int METHODID_GET_WHITELIST = 51;
  private static final int METHODID_LIST_WHITELISTS = 52;
  private static final int METHODID_IS_DELETABLE_WHITELIST = 53;
  private static final int METHODID_UPDATE_WHITELIST = 54;
  private static final int METHODID_UPDATE_WHITELIST_ADDRESSES = 55;
  private static final int METHODID_DELETE_WHITELIST = 56;
  private static final int METHODID_CREATE_TRANSFER_LIMIT = 57;
  private static final int METHODID_GET_TRANSFER_LIMIT = 58;
  private static final int METHODID_LIST_TRANSFER_LIMITS = 59;
  private static final int METHODID_IS_DELETABLE_TRANSFER_LIMIT = 60;
  private static final int METHODID_UPDATE_TRANSFER_LIMIT = 61;
  private static final int METHODID_UPDATE_TRANSFER_LIMIT_NAME = 62;
  private static final int METHODID_DELETE_TRANSFER_LIMIT = 63;
  private static final int METHODID_REVIEW_TRANSFER_LIMIT_PROPOSAL = 64;
  private static final int METHODID_CREATE_POLICY = 65;
  private static final int METHODID_GET_POLICY = 66;
  private static final int METHODID_LIST_POLICIES = 67;
  private static final int METHODID_IS_DELETABLE_POLICY = 68;
  private static final int METHODID_UPDATE_POLICY = 69;
  private static final int METHODID_DELETE_POLICY = 70;
  private static final int METHODID_REVIEW_POLICY_PROPOSAL = 71;
  private static final int METHODID_GET_SPENDABLE_BALANCE = 72;
  private static final int METHODID_GET_TOTAL_BALANCE = 73;
  private static final int METHODID_LIST_BALANCE_SNAPSHOTS = 74;
  private static final int METHODID_CALCULATE_FEE = 75;
  private static final int METHODID_GET_MEMBERS_DEACTIVATABILITIES = 76;
  private static final int METHODID_GET_RECOMMENDED_FEE_RATE = 77;
  private static final int METHODID_VALIDATE_ADDRESS = 78;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GlobalAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GlobalAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_WALLET:
          serviceImpl.createWallet((adamant.global.v1.CreateWalletRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateWalletResponse>) responseObserver);
          break;
        case METHODID_GET_WALLET:
          serviceImpl.getWallet((adamant.global.v1.GetWalletRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Wallet>) responseObserver);
          break;
        case METHODID_CANCEL_WALLET:
          serviceImpl.cancelWallet((adamant.global.v1.CancelWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ARCHIVE_WALLET:
          serviceImpl.archiveWallet((adamant.global.v1.ArchiveWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UN_ARCHIVE_WALLET:
          serviceImpl.unArchiveWallet((adamant.global.v1.UnArchiveWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_WALLETS:
          serviceImpl.listWallets((adamant.global.v1.ListWalletsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse>) responseObserver);
          break;
        case METHODID_LIST_WALLETS_BY_FILTER:
          serviceImpl.listWalletsByFilter((adamant.global.v1.ListWalletsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse>) responseObserver);
          break;
        case METHODID_LIST_BASE_WALLETS:
          serviceImpl.listBaseWallets((adamant.global.v1.ListBaseWalletsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListBaseWalletsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WALLET_NAME:
          serviceImpl.updateWalletName((adamant.global.v1.UpdateWalletNameRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_WALLET_VALIDATION:
          serviceImpl.updateWalletValidation((adamant.global.v1.UpdateWalletValidationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_WALLET_POLICY:
          serviceImpl.updateWalletPolicy((adamant.global.v1.UpdateWalletPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REVIEW_WALLET_PROPOSAL:
          serviceImpl.reviewWalletProposal((adamant.global.v1.ReviewWalletProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FLUSH_BALANCE:
          serviceImpl.flushBalance((adamant.global.v1.FlushBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse>) responseObserver);
          break;
        case METHODID_APPROVE_WALLET:
          serviceImpl.approveWallet((adamant.global.v1.ApproveWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_APPROVE_TRANSACTION:
          serviceImpl.approveTransaction((adamant.global.v1.ApproveTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((adamant.global.v1.CreateAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateAddressResponse>) responseObserver);
          break;
        case METHODID_GET_ADDRESS:
          serviceImpl.getAddress((adamant.global.v1.GetAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_BY_ADDRESS:
          serviceImpl.getAddressByAddress((adamant.global.v1.GetAddressByAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_BY_INDEX:
          serviceImpl.getAddressByIndex((adamant.global.v1.GetAddressByIndexRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address>) responseObserver);
          break;
        case METHODID_LIST_ADDRESSES:
          serviceImpl.listAddresses((adamant.global.v1.ListAddressesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesResponse>) responseObserver);
          break;
        case METHODID_LIST_ADDRESSES_WITH_BALANCE:
          serviceImpl.listAddressesWithBalance((adamant.global.v1.ListAddressesWithBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesWithBalanceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS_BALANCE:
          serviceImpl.updateAddressBalance((adamant.global.v1.UpdateAddressBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ETHEREUM_FEE_ADDRESS:
          serviceImpl.getEthereumFeeAddress((adamant.global.v1.GetEthereumFeeAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress>) responseObserver);
          break;
        case METHODID_REGISTER_KEY:
          serviceImpl.registerKey((adamant.global.v1.RegisterKeyRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.RegisterKeyResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((adamant.global.v1.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_CREATE_XRPINIT_TRANSACTIONS:
          serviceImpl.createXRPInitTransactions((adamant.global.v1.CreateXRPInitTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION:
          serviceImpl.signTransaction((adamant.global.v1.SignTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SIGN_XRPINIT_TRANSACTIONS:
          serviceImpl.signXRPInitTransactions((adamant.global.v1.SignXRPInitTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((adamant.global.v1.SendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_SEND_XRPINIT_TRANSACTIONS:
          serviceImpl.sendXRPInitTransactions((adamant.global.v1.SendXRPInitTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.SendXRPInitTransactionsResponse>) responseObserver);
          break;
        case METHODID_CANCEL_TRANSACTION:
          serviceImpl.cancelTransaction((adamant.global.v1.CancelTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((adamant.global.v1.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_TX_ID:
          serviceImpl.getTransactionByTxID((adamant.global.v1.GetTransactionByTxIDRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction>) responseObserver);
          break;
        case METHODID_LIST_TRANSACTIONS:
          serviceImpl.listTransactions((adamant.global.v1.ListTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSACTIONS_BY_FILTER:
          serviceImpl.listTransactionsByFilter((adamant.global.v1.ListTransactionsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse>) responseObserver);
          break;
        case METHODID_GET_SIGN_INFO:
          serviceImpl.getSignInfo((adamant.global.v1.GetSignInfoRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.SignInfo>) responseObserver);
          break;
        case METHODID_LIST_SIGN_INFO:
          serviceImpl.listSignInfo((adamant.global.v1.ListSignInfoRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListSignInfoResponse>) responseObserver);
          break;
        case METHODID_LIST_XRPINIT_SIGN_INFO:
          serviceImpl.listXRPInitSignInfo((adamant.global.v1.ListXRPInitSignInfoRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListXRPInitSignInfoResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSFERS:
          serviceImpl.listTransfers((adamant.global.v1.ListTransfersRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSFERS_BY_FILTER:
          serviceImpl.listTransfersByFilter((adamant.global.v1.ListTransfersByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse>) responseObserver);
          break;
        case METHODID_GET_RATE_SNAPSHOT:
          serviceImpl.getRateSnapshot((adamant.global.v1.GetRateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot>) responseObserver);
          break;
        case METHODID_GET_LATEST_RATE_SNAPSHOT:
          serviceImpl.getLatestRateSnapshot((adamant.global.v1.GetLatestRateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot>) responseObserver);
          break;
        case METHODID_SET_RATES:
          serviceImpl.setRates((adamant.global.v1.SetRatesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.SetRatesResponse>) responseObserver);
          break;
        case METHODID_CREATE_LABELED_ADDRESS:
          serviceImpl.createLabeledAddress((adamant.global.v1.CreateLabeledAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateLabeledAddressResponse>) responseObserver);
          break;
        case METHODID_GET_LABELED_ADDRESS:
          serviceImpl.getLabeledAddress((adamant.global.v1.GetLabeledAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.LabeledAddress>) responseObserver);
          break;
        case METHODID_LIST_LABELED_ADDRESSES:
          serviceImpl.listLabeledAddresses((adamant.global.v1.ListLabeledAddressesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListLabeledAddressesResponse>) responseObserver);
          break;
        case METHODID_IS_DELETABLE_LABELED_ADDRESS:
          serviceImpl.isDeletableLabeledAddress((adamant.global.v1.IsDeletableLabeledAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableLabeledAddressResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LABELED_ADDRESS:
          serviceImpl.updateLabeledAddress((adamant.global.v1.UpdateLabeledAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.LabeledAddress>) responseObserver);
          break;
        case METHODID_DELETE_ADDRESS:
          serviceImpl.deleteAddress((adamant.global.v1.DeleteLabeledAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REVIEW_LABELED_ADDRESS_PROPOSAL:
          serviceImpl.reviewLabeledAddressProposal((adamant.global.v1.ReviewLabeledAddressProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_WHITELIST:
          serviceImpl.createWhitelist((adamant.global.v1.CreateWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateWhitelistResponse>) responseObserver);
          break;
        case METHODID_GET_WHITELIST:
          serviceImpl.getWhitelist((adamant.global.v1.GetWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist>) responseObserver);
          break;
        case METHODID_LIST_WHITELISTS:
          serviceImpl.listWhitelists((adamant.global.v1.ListWhitelistsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListWhitelistsResponse>) responseObserver);
          break;
        case METHODID_IS_DELETABLE_WHITELIST:
          serviceImpl.isDeletableWhitelist((adamant.global.v1.IsDeletableWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableWhitelistResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WHITELIST:
          serviceImpl.updateWhitelist((adamant.global.v1.UpdateWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist>) responseObserver);
          break;
        case METHODID_UPDATE_WHITELIST_ADDRESSES:
          serviceImpl.updateWhitelistAddresses((adamant.global.v1.UpdateWhitelistAddressesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Whitelist>) responseObserver);
          break;
        case METHODID_DELETE_WHITELIST:
          serviceImpl.deleteWhitelist((adamant.global.v1.DeleteWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_TRANSFER_LIMIT:
          serviceImpl.createTransferLimit((adamant.global.v1.CreateTransferLimitRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransferLimitResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSFER_LIMIT:
          serviceImpl.getTransferLimit((adamant.global.v1.GetTransferLimitRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit>) responseObserver);
          break;
        case METHODID_LIST_TRANSFER_LIMITS:
          serviceImpl.listTransferLimits((adamant.global.v1.ListTransferLimitsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransferLimitsResponse>) responseObserver);
          break;
        case METHODID_IS_DELETABLE_TRANSFER_LIMIT:
          serviceImpl.isDeletableTransferLimit((adamant.global.v1.IsDeletableTransferLimitRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletableTransferLimitResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TRANSFER_LIMIT:
          serviceImpl.updateTransferLimit((adamant.global.v1.UpdateTransferLimitRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit>) responseObserver);
          break;
        case METHODID_UPDATE_TRANSFER_LIMIT_NAME:
          serviceImpl.updateTransferLimitName((adamant.global.v1.UpdateTransferLimitNameRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.TransferLimit>) responseObserver);
          break;
        case METHODID_DELETE_TRANSFER_LIMIT:
          serviceImpl.deleteTransferLimit((adamant.global.v1.DeleteTransferLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REVIEW_TRANSFER_LIMIT_PROPOSAL:
          serviceImpl.reviewTransferLimitProposal((adamant.global.v1.ReviewTransferLimitProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_POLICY:
          serviceImpl.createPolicy((adamant.global.v1.CreatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreatePolicyResponse>) responseObserver);
          break;
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((adamant.global.v1.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Policy>) responseObserver);
          break;
        case METHODID_LIST_POLICIES:
          serviceImpl.listPolicies((adamant.global.v1.ListPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListPoliciesResponse>) responseObserver);
          break;
        case METHODID_IS_DELETABLE_POLICY:
          serviceImpl.isDeletablePolicy((adamant.global.v1.IsDeletablePolicyRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.IsDeletablePolicyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POLICY:
          serviceImpl.updatePolicy((adamant.global.v1.UpdatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Policy>) responseObserver);
          break;
        case METHODID_DELETE_POLICY:
          serviceImpl.deletePolicy((adamant.global.v1.DeletePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REVIEW_POLICY_PROPOSAL:
          serviceImpl.reviewPolicyProposal((adamant.global.v1.ReviewPolicyProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SPENDABLE_BALANCE:
          serviceImpl.getSpendableBalance((adamant.global.v1.GetSpendableBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_BALANCE:
          serviceImpl.getTotalBalance((adamant.global.v1.GetTotalBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.TotalBalance>) responseObserver);
          break;
        case METHODID_LIST_BALANCE_SNAPSHOTS:
          serviceImpl.listBalanceSnapshots((adamant.global.v1.ListBalanceSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListBalanceSnapshotsResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_FEE:
          serviceImpl.calculateFee((adamant.global.v1.CalculateFeeRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse>) responseObserver);
          break;
        case METHODID_GET_MEMBERS_DEACTIVATABILITIES:
          serviceImpl.getMembersDeactivatabilities((adamant.global.v1.GetMembersDeactivatabilitiesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetMembersDeactivatabilitiesResponse>) responseObserver);
          break;
        case METHODID_GET_RECOMMENDED_FEE_RATE:
          serviceImpl.getRecommendedFeeRate((adamant.global.v1.GetRecommendedFeeRateRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetRecommendedFeeRateResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_ADDRESS:
          serviceImpl.validateAddress((adamant.global.v1.ValidateAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ValidateAddressResponse>) responseObserver);
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

  private static abstract class GlobalAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GlobalAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return adamant.global.v1.GlobalAPIProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GlobalAPI");
    }
  }

  private static final class GlobalAPIFileDescriptorSupplier
      extends GlobalAPIBaseDescriptorSupplier {
    GlobalAPIFileDescriptorSupplier() {}
  }

  private static final class GlobalAPIMethodDescriptorSupplier
      extends GlobalAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GlobalAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (GlobalAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GlobalAPIFileDescriptorSupplier())
              .addMethod(getCreateWalletMethod())
              .addMethod(getGetWalletMethod())
              .addMethod(getCancelWalletMethod())
              .addMethod(getArchiveWalletMethod())
              .addMethod(getUnArchiveWalletMethod())
              .addMethod(getListWalletsMethod())
              .addMethod(getListWalletsByFilterMethod())
              .addMethod(getListBaseWalletsMethod())
              .addMethod(getUpdateWalletNameMethod())
              .addMethod(getUpdateWalletValidationMethod())
              .addMethod(getUpdateWalletPolicyMethod())
              .addMethod(getReviewWalletProposalMethod())
              .addMethod(getFlushBalanceMethod())
              .addMethod(getApproveWalletMethod())
              .addMethod(getApproveTransactionMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGetAddressMethod())
              .addMethod(getGetAddressByAddressMethod())
              .addMethod(getGetAddressByIndexMethod())
              .addMethod(getListAddressesMethod())
              .addMethod(getListAddressesWithBalanceMethod())
              .addMethod(getUpdateAddressBalanceMethod())
              .addMethod(getGetEthereumFeeAddressMethod())
              .addMethod(getRegisterKeyMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getCreateXRPInitTransactionsMethod())
              .addMethod(getSignTransactionMethod())
              .addMethod(getSignXRPInitTransactionsMethod())
              .addMethod(getSendTransactionMethod())
              .addMethod(getSendXRPInitTransactionsMethod())
              .addMethod(getCancelTransactionMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getGetTransactionByTxIDMethod())
              .addMethod(getListTransactionsMethod())
              .addMethod(getListTransactionsByFilterMethod())
              .addMethod(getGetSignInfoMethod())
              .addMethod(getListSignInfoMethod())
              .addMethod(getListXRPInitSignInfoMethod())
              .addMethod(getListTransfersMethod())
              .addMethod(getListTransfersByFilterMethod())
              .addMethod(getGetRateSnapshotMethod())
              .addMethod(getGetLatestRateSnapshotMethod())
              .addMethod(getSetRatesMethod())
              .addMethod(getCreateLabeledAddressMethod())
              .addMethod(getGetLabeledAddressMethod())
              .addMethod(getListLabeledAddressesMethod())
              .addMethod(getIsDeletableLabeledAddressMethod())
              .addMethod(getUpdateLabeledAddressMethod())
              .addMethod(getDeleteAddressMethod())
              .addMethod(getReviewLabeledAddressProposalMethod())
              .addMethod(getCreateWhitelistMethod())
              .addMethod(getGetWhitelistMethod())
              .addMethod(getListWhitelistsMethod())
              .addMethod(getIsDeletableWhitelistMethod())
              .addMethod(getUpdateWhitelistMethod())
              .addMethod(getUpdateWhitelistAddressesMethod())
              .addMethod(getDeleteWhitelistMethod())
              .addMethod(getCreateTransferLimitMethod())
              .addMethod(getGetTransferLimitMethod())
              .addMethod(getListTransferLimitsMethod())
              .addMethod(getIsDeletableTransferLimitMethod())
              .addMethod(getUpdateTransferLimitMethod())
              .addMethod(getUpdateTransferLimitNameMethod())
              .addMethod(getDeleteTransferLimitMethod())
              .addMethod(getReviewTransferLimitProposalMethod())
              .addMethod(getCreatePolicyMethod())
              .addMethod(getGetPolicyMethod())
              .addMethod(getListPoliciesMethod())
              .addMethod(getIsDeletablePolicyMethod())
              .addMethod(getUpdatePolicyMethod())
              .addMethod(getDeletePolicyMethod())
              .addMethod(getReviewPolicyProposalMethod())
              .addMethod(getGetSpendableBalanceMethod())
              .addMethod(getGetTotalBalanceMethod())
              .addMethod(getListBalanceSnapshotsMethod())
              .addMethod(getCalculateFeeMethod())
              .addMethod(getGetMembersDeactivatabilitiesMethod())
              .addMethod(getGetRecommendedFeeRateMethod())
              .addMethod(getValidateAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
