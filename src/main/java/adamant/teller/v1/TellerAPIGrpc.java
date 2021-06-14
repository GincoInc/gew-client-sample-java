package adamant.teller.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto")
public final class TellerAPIGrpc {

  private TellerAPIGrpc() {}

  public static final String SERVICE_NAME = "adamant.teller.v1.TellerAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.CreateWalletRequest,
      adamant.global.v1.CreateWalletResponse> getCreateWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWallet",
      requestType = adamant.teller.v1.CreateWalletRequest.class,
      responseType = adamant.global.v1.CreateWalletResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.CreateWalletRequest,
      adamant.global.v1.CreateWalletResponse> getCreateWalletMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.CreateWalletRequest, adamant.global.v1.CreateWalletResponse> getCreateWalletMethod;
    if ((getCreateWalletMethod = TellerAPIGrpc.getCreateWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateWalletMethod = TellerAPIGrpc.getCreateWalletMethod) == null) {
          TellerAPIGrpc.getCreateWalletMethod = getCreateWalletMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.CreateWalletRequest, adamant.global.v1.CreateWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.CreateWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateWalletResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateWallet"))
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
    if ((getGetWalletMethod = TellerAPIGrpc.getGetWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetWalletMethod = TellerAPIGrpc.getGetWalletMethod) == null) {
          TellerAPIGrpc.getGetWalletMethod = getGetWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetWalletRequest, adamant.global.v1.Model.Wallet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Wallet.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetWallet"))
              .build();
        }
      }
    }
    return getGetWalletMethod;
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
    if ((getListWalletsMethod = TellerAPIGrpc.getListWalletsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListWalletsMethod = TellerAPIGrpc.getListWalletsMethod) == null) {
          TellerAPIGrpc.getListWalletsMethod = getListWalletsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListWalletsRequest, adamant.global.v1.ListWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWallets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListWallets"))
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
    if ((getListWalletsByFilterMethod = TellerAPIGrpc.getListWalletsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListWalletsByFilterMethod = TellerAPIGrpc.getListWalletsByFilterMethod) == null) {
          TellerAPIGrpc.getListWalletsByFilterMethod = getListWalletsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListWalletsByFilterRequest, adamant.global.v1.ListWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWalletsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListWalletsByFilter"))
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
    if ((getListBaseWalletsMethod = TellerAPIGrpc.getListBaseWalletsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListBaseWalletsMethod = TellerAPIGrpc.getListBaseWalletsMethod) == null) {
          TellerAPIGrpc.getListBaseWalletsMethod = getListBaseWalletsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListBaseWalletsRequest, adamant.global.v1.ListBaseWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBaseWallets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBaseWalletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBaseWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListBaseWallets"))
              .build();
        }
      }
    }
    return getListBaseWalletsMethod;
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
    if ((getGetSpendableBalanceMethod = TellerAPIGrpc.getGetSpendableBalanceMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetSpendableBalanceMethod = TellerAPIGrpc.getGetSpendableBalanceMethod) == null) {
          TellerAPIGrpc.getGetSpendableBalanceMethod = getGetSpendableBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetSpendableBalanceRequest, adamant.global.v1.GetSpendableBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendableBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetSpendableBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetSpendableBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetSpendableBalance"))
              .build();
        }
      }
    }
    return getGetSpendableBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.InitializeXRPWalletRequest,
      com.google.protobuf.Empty> getInitializeXRPWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeXRPWallet",
      requestType = adamant.teller.v1.InitializeXRPWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.InitializeXRPWalletRequest,
      com.google.protobuf.Empty> getInitializeXRPWalletMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.InitializeXRPWalletRequest, com.google.protobuf.Empty> getInitializeXRPWalletMethod;
    if ((getInitializeXRPWalletMethod = TellerAPIGrpc.getInitializeXRPWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getInitializeXRPWalletMethod = TellerAPIGrpc.getInitializeXRPWalletMethod) == null) {
          TellerAPIGrpc.getInitializeXRPWalletMethod = getInitializeXRPWalletMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.InitializeXRPWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeXRPWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.InitializeXRPWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("InitializeXRPWallet"))
              .build();
        }
      }
    }
    return getInitializeXRPWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.InitializeWalletRequest,
      com.google.protobuf.Empty> getInitializeWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeWallet",
      requestType = adamant.teller.v1.InitializeWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.InitializeWalletRequest,
      com.google.protobuf.Empty> getInitializeWalletMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.InitializeWalletRequest, com.google.protobuf.Empty> getInitializeWalletMethod;
    if ((getInitializeWalletMethod = TellerAPIGrpc.getInitializeWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getInitializeWalletMethod = TellerAPIGrpc.getInitializeWalletMethod) == null) {
          TellerAPIGrpc.getInitializeWalletMethod = getInitializeWalletMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.InitializeWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.InitializeWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("InitializeWallet"))
              .build();
        }
      }
    }
    return getInitializeWalletMethod;
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
    if ((getCreateAddressMethod = TellerAPIGrpc.getCreateAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateAddressMethod = TellerAPIGrpc.getCreateAddressMethod) == null) {
          TellerAPIGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateAddressRequest, adamant.global.v1.CreateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateAddress"))
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
    if ((getGetAddressMethod = TellerAPIGrpc.getGetAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetAddressMethod = TellerAPIGrpc.getGetAddressMethod) == null) {
          TellerAPIGrpc.getGetAddressMethod = getGetAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetAddress"))
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
    if ((getGetAddressByAddressMethod = TellerAPIGrpc.getGetAddressByAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetAddressByAddressMethod = TellerAPIGrpc.getGetAddressByAddressMethod) == null) {
          TellerAPIGrpc.getGetAddressByAddressMethod = getGetAddressByAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressByAddressRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetAddressByAddress"))
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
    if ((getGetAddressByIndexMethod = TellerAPIGrpc.getGetAddressByIndexMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetAddressByIndexMethod = TellerAPIGrpc.getGetAddressByIndexMethod) == null) {
          TellerAPIGrpc.getGetAddressByIndexMethod = getGetAddressByIndexMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressByIndexRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressByIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetAddressByIndex"))
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
    if ((getListAddressesMethod = TellerAPIGrpc.getListAddressesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListAddressesMethod = TellerAPIGrpc.getListAddressesMethod) == null) {
          TellerAPIGrpc.getListAddressesMethod = getListAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListAddressesRequest, adamant.global.v1.ListAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListAddresses"))
              .build();
        }
      }
    }
    return getListAddressesMethod;
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
    if ((getGetEthereumFeeAddressMethod = TellerAPIGrpc.getGetEthereumFeeAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetEthereumFeeAddressMethod = TellerAPIGrpc.getGetEthereumFeeAddressMethod) == null) {
          TellerAPIGrpc.getGetEthereumFeeAddressMethod = getGetEthereumFeeAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetEthereumFeeAddressRequest, adamant.global.v1.Model.EthereumFeeAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEthereumFeeAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetEthereumFeeAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.EthereumFeeAddress.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetEthereumFeeAddress"))
              .build();
        }
      }
    }
    return getGetEthereumFeeAddressMethod;
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
    if ((getUpdateAddressBalanceMethod = TellerAPIGrpc.getUpdateAddressBalanceMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getUpdateAddressBalanceMethod = TellerAPIGrpc.getUpdateAddressBalanceMethod) == null) {
          TellerAPIGrpc.getUpdateAddressBalanceMethod = getUpdateAddressBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateAddressBalanceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAddressBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateAddressBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("UpdateAddressBalance"))
              .build();
        }
      }
    }
    return getUpdateAddressBalanceMethod;
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
    if ((getCreateTransactionMethod = TellerAPIGrpc.getCreateTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateTransactionMethod = TellerAPIGrpc.getCreateTransactionMethod) == null) {
          TellerAPIGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateTransactionRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.SignTransactionRequest,
      com.google.protobuf.Empty> getSignTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignTransaction",
      requestType = adamant.teller.v1.SignTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.SignTransactionRequest,
      com.google.protobuf.Empty> getSignTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.SignTransactionRequest, com.google.protobuf.Empty> getSignTransactionMethod;
    if ((getSignTransactionMethod = TellerAPIGrpc.getSignTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getSignTransactionMethod = TellerAPIGrpc.getSignTransactionMethod) == null) {
          TellerAPIGrpc.getSignTransactionMethod = getSignTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.SignTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.SignTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("SignTransaction"))
              .build();
        }
      }
    }
    return getSignTransactionMethod;
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
    if ((getSendTransactionMethod = TellerAPIGrpc.getSendTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getSendTransactionMethod = TellerAPIGrpc.getSendTransactionMethod) == null) {
          TellerAPIGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SendTransactionRequest, adamant.global.v1.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("SendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
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
    if ((getCancelTransactionMethod = TellerAPIGrpc.getCancelTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCancelTransactionMethod = TellerAPIGrpc.getCancelTransactionMethod) == null) {
          TellerAPIGrpc.getCancelTransactionMethod = getCancelTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CancelTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CancelTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CancelTransaction"))
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
    if ((getGetTransactionMethod = TellerAPIGrpc.getGetTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetTransactionMethod = TellerAPIGrpc.getGetTransactionMethod) == null) {
          TellerAPIGrpc.getGetTransactionMethod = getGetTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTransactionRequest, adamant.global.v1.Model.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetTransaction"))
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
    if ((getGetTransactionByTxIDMethod = TellerAPIGrpc.getGetTransactionByTxIDMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetTransactionByTxIDMethod = TellerAPIGrpc.getGetTransactionByTxIDMethod) == null) {
          TellerAPIGrpc.getGetTransactionByTxIDMethod = getGetTransactionByTxIDMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTransactionByTxIDRequest, adamant.global.v1.Model.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionByTxID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTransactionByTxIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetTransactionByTxID"))
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
    if ((getListTransactionsMethod = TellerAPIGrpc.getListTransactionsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransactionsMethod = TellerAPIGrpc.getListTransactionsMethod) == null) {
          TellerAPIGrpc.getListTransactionsMethod = getListTransactionsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransactionsRequest, adamant.global.v1.ListTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransactions"))
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
    if ((getListTransactionsByFilterMethod = TellerAPIGrpc.getListTransactionsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransactionsByFilterMethod = TellerAPIGrpc.getListTransactionsByFilterMethod) == null) {
          TellerAPIGrpc.getListTransactionsByFilterMethod = getListTransactionsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransactionsByFilterRequest, adamant.global.v1.ListTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransactionsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransactionsByFilter"))
              .build();
        }
      }
    }
    return getListTransactionsByFilterMethod;
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
    if ((getListTransfersMethod = TellerAPIGrpc.getListTransfersMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransfersMethod = TellerAPIGrpc.getListTransfersMethod) == null) {
          TellerAPIGrpc.getListTransfersMethod = getListTransfersMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransfersRequest, adamant.global.v1.ListTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransfers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransfers"))
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
    if ((getListTransfersByFilterMethod = TellerAPIGrpc.getListTransfersByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransfersByFilterMethod = TellerAPIGrpc.getListTransfersByFilterMethod) == null) {
          TellerAPIGrpc.getListTransfersByFilterMethod = getListTransfersByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransfersByFilterRequest, adamant.global.v1.ListTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransfersByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransfersByFilter"))
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
    if ((getGetRateSnapshotMethod = TellerAPIGrpc.getGetRateSnapshotMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetRateSnapshotMethod = TellerAPIGrpc.getGetRateSnapshotMethod) == null) {
          TellerAPIGrpc.getGetRateSnapshotMethod = getGetRateSnapshotMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.RateSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetRateSnapshot"))
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
    if ((getGetLatestRateSnapshotMethod = TellerAPIGrpc.getGetLatestRateSnapshotMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetLatestRateSnapshotMethod = TellerAPIGrpc.getGetLatestRateSnapshotMethod) == null) {
          TellerAPIGrpc.getGetLatestRateSnapshotMethod = getGetLatestRateSnapshotMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetLatestRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestRateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetLatestRateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.RateSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetLatestRateSnapshot"))
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
    if ((getSetRatesMethod = TellerAPIGrpc.getSetRatesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getSetRatesMethod = TellerAPIGrpc.getSetRatesMethod) == null) {
          TellerAPIGrpc.getSetRatesMethod = getSetRatesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SetRatesRequest, adamant.global.v1.SetRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SetRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SetRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("SetRates"))
              .build();
        }
      }
    }
    return getSetRatesMethod;
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
    if ((getCalculateFeeMethod = TellerAPIGrpc.getCalculateFeeMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCalculateFeeMethod = TellerAPIGrpc.getCalculateFeeMethod) == null) {
          TellerAPIGrpc.getCalculateFeeMethod = getCalculateFeeMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CalculateFeeRequest, adamant.global.v1.CalculateFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CalculateFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CalculateFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CalculateFee"))
              .build();
        }
      }
    }
    return getCalculateFeeMethod;
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
    if ((getGetRecommendedFeeRateMethod = TellerAPIGrpc.getGetRecommendedFeeRateMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetRecommendedFeeRateMethod = TellerAPIGrpc.getGetRecommendedFeeRateMethod) == null) {
          TellerAPIGrpc.getGetRecommendedFeeRateMethod = getGetRecommendedFeeRateMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetRecommendedFeeRateRequest, adamant.global.v1.GetRecommendedFeeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecommendedFeeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRecommendedFeeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRecommendedFeeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetRecommendedFeeRate"))
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
    if ((getValidateAddressMethod = TellerAPIGrpc.getValidateAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getValidateAddressMethod = TellerAPIGrpc.getValidateAddressMethod) == null) {
          TellerAPIGrpc.getValidateAddressMethod = getValidateAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ValidateAddressRequest, adamant.global.v1.ValidateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ValidateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ValidateAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ValidateAddress"))
              .build();
        }
      }
    }
    return getValidateAddressMethod;
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
    if ((getFlushBalanceMethod = TellerAPIGrpc.getFlushBalanceMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getFlushBalanceMethod = TellerAPIGrpc.getFlushBalanceMethod) == null) {
          TellerAPIGrpc.getFlushBalanceMethod = getFlushBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.FlushBalanceRequest, adamant.global.v1.FlushBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FlushBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.FlushBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.FlushBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("FlushBalance"))
              .build();
        }
      }
    }
    return getFlushBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TellerAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TellerAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TellerAPIStub>() {
        @java.lang.Override
        public TellerAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TellerAPIStub(channel, callOptions);
        }
      };
    return TellerAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TellerAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TellerAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TellerAPIBlockingStub>() {
        @java.lang.Override
        public TellerAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TellerAPIBlockingStub(channel, callOptions);
        }
      };
    return TellerAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TellerAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TellerAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TellerAPIFutureStub>() {
        @java.lang.Override
        public TellerAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TellerAPIFutureStub(channel, callOptions);
        }
      };
    return TellerAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TellerAPIImplBase implements io.grpc.BindableService {

    /**
     */
    public void createWallet(adamant.teller.v1.CreateWalletRequest request,
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
    public void getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpendableBalanceMethod(), responseObserver);
    }

    /**
     */
    public void initializeXRPWallet(adamant.teller.v1.InitializeXRPWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeXRPWalletMethod(), responseObserver);
    }

    /**
     */
    public void initializeWallet(adamant.teller.v1.InitializeWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeWalletMethod(), responseObserver);
    }

    /**
     * <pre>
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
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public void getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEthereumFeeAddressMethod(), responseObserver);
    }

    /**
     */
    public void updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAddressBalanceMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction(adamant.global.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    public void signTransaction(adamant.teller.v1.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignTransactionMethod(), responseObserver);
    }

    /**
     */
    public void sendTransaction(adamant.global.v1.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
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
     */
    public void calculateFee(adamant.global.v1.CalculateFeeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateFeeMethod(), responseObserver);
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

    /**
     */
    public void flushBalance(adamant.global.v1.FlushBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.teller.v1.CreateWalletRequest,
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
            getGetSpendableBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetSpendableBalanceRequest,
                adamant.global.v1.GetSpendableBalanceResponse>(
                  this, METHODID_GET_SPENDABLE_BALANCE)))
          .addMethod(
            getInitializeXRPWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.teller.v1.InitializeXRPWalletRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_INITIALIZE_XRPWALLET)))
          .addMethod(
            getInitializeWalletMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.teller.v1.InitializeWalletRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_INITIALIZE_WALLET)))
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
            getGetEthereumFeeAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.GetEthereumFeeAddressRequest,
                adamant.global.v1.Model.EthereumFeeAddress>(
                  this, METHODID_GET_ETHEREUM_FEE_ADDRESS)))
          .addMethod(
            getUpdateAddressBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.UpdateAddressBalanceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ADDRESS_BALANCE)))
          .addMethod(
            getCreateTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CreateTransactionRequest,
                adamant.global.v1.CreateTransactionResponse>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getSignTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.teller.v1.SignTransactionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SIGN_TRANSACTION)))
          .addMethod(
            getSendTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.SendTransactionRequest,
                adamant.global.v1.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
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
            getCalculateFeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.CalculateFeeRequest,
                adamant.global.v1.CalculateFeeResponse>(
                  this, METHODID_CALCULATE_FEE)))
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
          .addMethod(
            getFlushBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                adamant.global.v1.FlushBalanceRequest,
                adamant.global.v1.FlushBalanceResponse>(
                  this, METHODID_FLUSH_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class TellerAPIStub extends io.grpc.stub.AbstractAsyncStub<TellerAPIStub> {
    private TellerAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TellerAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TellerAPIStub(channel, callOptions);
    }

    /**
     */
    public void createWallet(adamant.teller.v1.CreateWalletRequest request,
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
    public void getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpendableBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initializeXRPWallet(adamant.teller.v1.InitializeXRPWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeXRPWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initializeWallet(adamant.teller.v1.InitializeWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
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
     */
    public void updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAddressBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction(adamant.global.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signTransaction(adamant.teller.v1.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignTransactionMethod(), getCallOptions()), request, responseObserver);
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
     */
    public void calculateFee(adamant.global.v1.CalculateFeeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateFeeMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void flushBalance(adamant.global.v1.FlushBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TellerAPIBlockingStub extends io.grpc.stub.AbstractBlockingStub<TellerAPIBlockingStub> {
    private TellerAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TellerAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TellerAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public adamant.global.v1.CreateWalletResponse createWallet(adamant.teller.v1.CreateWalletRequest request) {
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
    public adamant.global.v1.GetSpendableBalanceResponse getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpendableBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty initializeXRPWallet(adamant.teller.v1.InitializeXRPWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeXRPWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty initializeWallet(adamant.teller.v1.InitializeWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeWalletMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
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
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public adamant.global.v1.Model.EthereumFeeAddress getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEthereumFeeAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAddressBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse createTransaction(adamant.global.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty signTransaction(adamant.teller.v1.SignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.SendTransactionResponse sendTransaction(adamant.global.v1.SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
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
     */
    public adamant.global.v1.CalculateFeeResponse calculateFee(adamant.global.v1.CalculateFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateFeeMethod(), getCallOptions(), request);
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

    /**
     */
    public adamant.global.v1.FlushBalanceResponse flushBalance(adamant.global.v1.FlushBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TellerAPIFutureStub extends io.grpc.stub.AbstractFutureStub<TellerAPIFutureStub> {
    private TellerAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TellerAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TellerAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateWalletResponse> createWallet(
        adamant.teller.v1.CreateWalletRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.GetSpendableBalanceResponse> getSpendableBalance(
        adamant.global.v1.GetSpendableBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpendableBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> initializeXRPWallet(
        adamant.teller.v1.InitializeXRPWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeXRPWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> initializeWallet(
        adamant.teller.v1.InitializeWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeWalletMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAddressBalance(
        adamant.global.v1.UpdateAddressBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAddressBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> createTransaction(
        adamant.global.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> signTransaction(
        adamant.teller.v1.SignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignTransactionMethod(), getCallOptions()), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CalculateFeeResponse> calculateFee(
        adamant.global.v1.CalculateFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateFeeMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.FlushBalanceResponse> flushBalance(
        adamant.global.v1.FlushBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WALLET = 0;
  private static final int METHODID_GET_WALLET = 1;
  private static final int METHODID_LIST_WALLETS = 2;
  private static final int METHODID_LIST_WALLETS_BY_FILTER = 3;
  private static final int METHODID_LIST_BASE_WALLETS = 4;
  private static final int METHODID_GET_SPENDABLE_BALANCE = 5;
  private static final int METHODID_INITIALIZE_XRPWALLET = 6;
  private static final int METHODID_INITIALIZE_WALLET = 7;
  private static final int METHODID_CREATE_ADDRESS = 8;
  private static final int METHODID_GET_ADDRESS = 9;
  private static final int METHODID_GET_ADDRESS_BY_ADDRESS = 10;
  private static final int METHODID_GET_ADDRESS_BY_INDEX = 11;
  private static final int METHODID_LIST_ADDRESSES = 12;
  private static final int METHODID_GET_ETHEREUM_FEE_ADDRESS = 13;
  private static final int METHODID_UPDATE_ADDRESS_BALANCE = 14;
  private static final int METHODID_CREATE_TRANSACTION = 15;
  private static final int METHODID_SIGN_TRANSACTION = 16;
  private static final int METHODID_SEND_TRANSACTION = 17;
  private static final int METHODID_CANCEL_TRANSACTION = 18;
  private static final int METHODID_GET_TRANSACTION = 19;
  private static final int METHODID_GET_TRANSACTION_BY_TX_ID = 20;
  private static final int METHODID_LIST_TRANSACTIONS = 21;
  private static final int METHODID_LIST_TRANSACTIONS_BY_FILTER = 22;
  private static final int METHODID_LIST_TRANSFERS = 23;
  private static final int METHODID_LIST_TRANSFERS_BY_FILTER = 24;
  private static final int METHODID_GET_RATE_SNAPSHOT = 25;
  private static final int METHODID_GET_LATEST_RATE_SNAPSHOT = 26;
  private static final int METHODID_SET_RATES = 27;
  private static final int METHODID_CALCULATE_FEE = 28;
  private static final int METHODID_GET_RECOMMENDED_FEE_RATE = 29;
  private static final int METHODID_VALIDATE_ADDRESS = 30;
  private static final int METHODID_FLUSH_BALANCE = 31;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TellerAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TellerAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_WALLET:
          serviceImpl.createWallet((adamant.teller.v1.CreateWalletRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateWalletResponse>) responseObserver);
          break;
        case METHODID_GET_WALLET:
          serviceImpl.getWallet((adamant.global.v1.GetWalletRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Wallet>) responseObserver);
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
        case METHODID_GET_SPENDABLE_BALANCE:
          serviceImpl.getSpendableBalance((adamant.global.v1.GetSpendableBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_XRPWALLET:
          serviceImpl.initializeXRPWallet((adamant.teller.v1.InitializeXRPWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INITIALIZE_WALLET:
          serviceImpl.initializeWallet((adamant.teller.v1.InitializeWalletRequest) request,
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
        case METHODID_GET_ETHEREUM_FEE_ADDRESS:
          serviceImpl.getEthereumFeeAddress((adamant.global.v1.GetEthereumFeeAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS_BALANCE:
          serviceImpl.updateAddressBalance((adamant.global.v1.UpdateAddressBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((adamant.global.v1.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION:
          serviceImpl.signTransaction((adamant.teller.v1.SignTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((adamant.global.v1.SendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse>) responseObserver);
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
        case METHODID_CALCULATE_FEE:
          serviceImpl.calculateFee((adamant.global.v1.CalculateFeeRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse>) responseObserver);
          break;
        case METHODID_GET_RECOMMENDED_FEE_RATE:
          serviceImpl.getRecommendedFeeRate((adamant.global.v1.GetRecommendedFeeRateRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetRecommendedFeeRateResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_ADDRESS:
          serviceImpl.validateAddress((adamant.global.v1.ValidateAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ValidateAddressResponse>) responseObserver);
          break;
        case METHODID_FLUSH_BALANCE:
          serviceImpl.flushBalance((adamant.global.v1.FlushBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse>) responseObserver);
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

  private static abstract class TellerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TellerAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return adamant.teller.v1.TellerAPIProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TellerAPI");
    }
  }

  private static final class TellerAPIFileDescriptorSupplier
      extends TellerAPIBaseDescriptorSupplier {
    TellerAPIFileDescriptorSupplier() {}
  }

  private static final class TellerAPIMethodDescriptorSupplier
      extends TellerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TellerAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (TellerAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TellerAPIFileDescriptorSupplier())
              .addMethod(getCreateWalletMethod())
              .addMethod(getGetWalletMethod())
              .addMethod(getListWalletsMethod())
              .addMethod(getListWalletsByFilterMethod())
              .addMethod(getListBaseWalletsMethod())
              .addMethod(getGetSpendableBalanceMethod())
              .addMethod(getInitializeXRPWalletMethod())
              .addMethod(getInitializeWalletMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGetAddressMethod())
              .addMethod(getGetAddressByAddressMethod())
              .addMethod(getGetAddressByIndexMethod())
              .addMethod(getListAddressesMethod())
              .addMethod(getGetEthereumFeeAddressMethod())
              .addMethod(getUpdateAddressBalanceMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getSignTransactionMethod())
              .addMethod(getSendTransactionMethod())
              .addMethod(getCancelTransactionMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getGetTransactionByTxIDMethod())
              .addMethod(getListTransactionsMethod())
              .addMethod(getListTransactionsByFilterMethod())
              .addMethod(getListTransfersMethod())
              .addMethod(getListTransfersByFilterMethod())
              .addMethod(getGetRateSnapshotMethod())
              .addMethod(getGetLatestRateSnapshotMethod())
              .addMethod(getSetRatesMethod())
              .addMethod(getCalculateFeeMethod())
              .addMethod(getGetRecommendedFeeRateMethod())
              .addMethod(getValidateAddressMethod())
              .addMethod(getFlushBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
