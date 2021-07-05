package one.turingchain.javasdk.model.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: grpc.proto")
public final class turingchainGrpc {

  private turingchainGrpc() {}

  public static final String SERVICE_NAME = "types.turingchain";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getGetBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlocks",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getGetBlocksMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getGetBlocksMethod;
    if ((getGetBlocksMethod = turingchainGrpc.getGetBlocksMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetBlocksMethod = turingchainGrpc.getGetBlocksMethod) == null) {
          turingchainGrpc.getGetBlocksMethod = getGetBlocksMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetBlocks"))
              .build();
        }
      }
    }
    return getGetBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header> getGetLastHeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastHeader",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header> getGetLastHeaderMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header> getGetLastHeaderMethod;
    if ((getGetLastHeaderMethod = turingchainGrpc.getGetLastHeaderMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetLastHeaderMethod = turingchainGrpc.getGetLastHeaderMethod) == null) {
          turingchainGrpc.getGetLastHeaderMethod = getGetLastHeaderMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastHeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetLastHeader"))
              .build();
        }
      }
    }
    return getGetLastHeaderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateRawTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRawTransaction",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateRawTransactionMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateRawTransactionMethod;
    if ((getCreateRawTransactionMethod = turingchainGrpc.getCreateRawTransactionMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getCreateRawTransactionMethod = turingchainGrpc.getCreateRawTransactionMethod) == null) {
          turingchainGrpc.getCreateRawTransactionMethod = getCreateRawTransactionMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRawTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("CreateRawTransaction"))
              .build();
        }
      }
    }
    return getCreateRawTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateRawTxGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRawTxGroup",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateRawTxGroupMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateRawTxGroupMethod;
    if ((getCreateRawTxGroupMethod = turingchainGrpc.getCreateRawTxGroupMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getCreateRawTxGroupMethod = turingchainGrpc.getCreateRawTxGroupMethod) == null) {
          turingchainGrpc.getCreateRawTxGroupMethod = getCreateRawTxGroupMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRawTxGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("CreateRawTxGroup"))
              .build();
        }
      }
    }
    return getCreateRawTxGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail> getQueryTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTransaction",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail> getQueryTransactionMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail> getQueryTransactionMethod;
    if ((getQueryTransactionMethod = turingchainGrpc.getQueryTransactionMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getQueryTransactionMethod = turingchainGrpc.getQueryTransactionMethod) == null) {
          turingchainGrpc.getQueryTransactionMethod = getQueryTransactionMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("QueryTransaction"))
              .build();
        }
      }
    }
    return getQueryTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTransaction",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSendTransactionMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSendTransactionMethod;
    if ((getSendTransactionMethod = turingchainGrpc.getSendTransactionMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getSendTransactionMethod = turingchainGrpc.getSendTransactionMethod) == null) {
          turingchainGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("SendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos> getGetTransactionByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionByAddr",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos> getGetTransactionByAddrMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos> getGetTransactionByAddrMethod;
    if ((getGetTransactionByAddrMethod = turingchainGrpc.getGetTransactionByAddrMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetTransactionByAddrMethod = turingchainGrpc.getGetTransactionByAddrMethod) == null) {
          turingchainGrpc.getGetTransactionByAddrMethod = getGetTransactionByAddrMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetTransactionByAddr"))
              .build();
        }
      }
    }
    return getGetTransactionByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails> getGetTransactionByHashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionByHashes",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails> getGetTransactionByHashesMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails> getGetTransactionByHashesMethod;
    if ((getGetTransactionByHashesMethod = turingchainGrpc.getGetTransactionByHashesMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetTransactionByHashesMethod = turingchainGrpc.getGetTransactionByHashesMethod) == null) {
          turingchainGrpc.getGetTransactionByHashesMethod = getGetTransactionByHashesMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionByHashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetTransactionByHashes"))
              .build();
        }
      }
    }
    return getGetTransactionByHashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getGetMemPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMemPool",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getGetMemPoolMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getGetMemPoolMethod;
    if ((getGetMemPoolMethod = turingchainGrpc.getGetMemPoolMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetMemPoolMethod = turingchainGrpc.getGetMemPoolMethod) == null) {
          turingchainGrpc.getGetMemPoolMethod = getGetMemPoolMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMemPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetMemPool"))
              .build();
        }
      }
    }
    return getGetMemPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts> getGetAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccounts",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts> getGetAccountsMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts> getGetAccountsMethod;
    if ((getGetAccountsMethod = turingchainGrpc.getGetAccountsMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetAccountsMethod = turingchainGrpc.getGetAccountsMethod) == null) {
          turingchainGrpc.getGetAccountsMethod = getGetAccountsMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetAccounts"))
              .build();
        }
      }
    }
    return getGetAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getGetAccountMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getGetAccountMethod;
    if ((getGetAccountMethod = turingchainGrpc.getGetAccountMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetAccountMethod = turingchainGrpc.getGetAccountMethod) == null) {
          turingchainGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getNewAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewAccount",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getNewAccountMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getNewAccountMethod;
    if ((getNewAccountMethod = turingchainGrpc.getNewAccountMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getNewAccountMethod = turingchainGrpc.getNewAccountMethod) == null) {
          turingchainGrpc.getNewAccountMethod = getNewAccountMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("NewAccount"))
              .build();
        }
      }
    }
    return getNewAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails> getWalletTransactionListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WalletTransactionList",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails> getWalletTransactionListMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails> getWalletTransactionListMethod;
    if ((getWalletTransactionListMethod = turingchainGrpc.getWalletTransactionListMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getWalletTransactionListMethod = turingchainGrpc.getWalletTransactionListMethod) == null) {
          turingchainGrpc.getWalletTransactionListMethod = getWalletTransactionListMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WalletTransactionList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("WalletTransactionList"))
              .build();
        }
      }
    }
    return getWalletTransactionListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getImportPrivkeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportPrivkey",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getImportPrivkeyMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getImportPrivkeyMethod;
    if ((getImportPrivkeyMethod = turingchainGrpc.getImportPrivkeyMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getImportPrivkeyMethod = turingchainGrpc.getImportPrivkeyMethod) == null) {
          turingchainGrpc.getImportPrivkeyMethod = getImportPrivkeyMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportPrivkey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("ImportPrivkey"))
              .build();
        }
      }
    }
    return getImportPrivkeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getSendToAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendToAddress",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getSendToAddressMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getSendToAddressMethod;
    if ((getSendToAddressMethod = turingchainGrpc.getSendToAddressMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getSendToAddressMethod = turingchainGrpc.getSendToAddressMethod) == null) {
          turingchainGrpc.getSendToAddressMethod = getSendToAddressMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendToAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("SendToAddress"))
              .build();
        }
      }
    }
    return getSendToAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSetTxFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTxFee",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSetTxFeeMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSetTxFeeMethod;
    if ((getSetTxFeeMethod = turingchainGrpc.getSetTxFeeMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getSetTxFeeMethod = turingchainGrpc.getSetTxFeeMethod) == null) {
          turingchainGrpc.getSetTxFeeMethod = getSetTxFeeMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTxFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("SetTxFee"))
              .build();
        }
      }
    }
    return getSetTxFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getSetLablMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLabl",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getSetLablMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getSetLablMethod;
    if ((getSetLablMethod = turingchainGrpc.getSetLablMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getSetLablMethod = turingchainGrpc.getSetLablMethod) == null) {
          turingchainGrpc.getSetLablMethod = getSetLablMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLabl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("SetLabl"))
              .build();
        }
      }
    }
    return getSetLablMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes> getMergeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MergeBalance",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes> getMergeBalanceMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes> getMergeBalanceMethod;
    if ((getMergeBalanceMethod = turingchainGrpc.getMergeBalanceMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getMergeBalanceMethod = turingchainGrpc.getMergeBalanceMethod) == null) {
          turingchainGrpc.getMergeBalanceMethod = getMergeBalanceMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MergeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("MergeBalance"))
              .build();
        }
      }
    }
    return getMergeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSetPasswdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPasswd",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSetPasswdMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSetPasswdMethod;
    if ((getSetPasswdMethod = turingchainGrpc.getSetPasswdMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getSetPasswdMethod = turingchainGrpc.getSetPasswdMethod) == null) {
          turingchainGrpc.getSetPasswdMethod = getSetPasswdMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPasswd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("SetPasswd"))
              .build();
        }
      }
    }
    return getSetPasswdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getLockMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getLockMethod;
    if ((getLockMethod = turingchainGrpc.getLockMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getLockMethod = turingchainGrpc.getLockMethod) == null) {
          turingchainGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("Lock"))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getUnLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnLock",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getUnLockMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getUnLockMethod;
    if ((getUnLockMethod = turingchainGrpc.getUnLockMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getUnLockMethod = turingchainGrpc.getUnLockMethod) == null) {
          turingchainGrpc.getUnLockMethod = getUnLockMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("UnLock"))
              .build();
        }
      }
    }
    return getUnLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getGetLastMemPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastMemPool",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getGetLastMemPoolMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getGetLastMemPoolMethod;
    if ((getGetLastMemPoolMethod = turingchainGrpc.getGetLastMemPoolMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetLastMemPoolMethod = turingchainGrpc.getGetLastMemPoolMethod) == null) {
          turingchainGrpc.getGetLastMemPoolMethod = getGetLastMemPoolMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastMemPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetLastMemPool"))
              .build();
        }
      }
    }
    return getGetLastMemPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee> getGetProperFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperFee",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee> getGetProperFeeMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee> getGetProperFeeMethod;
    if ((getGetProperFeeMethod = turingchainGrpc.getGetProperFeeMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetProperFeeMethod = turingchainGrpc.getGetProperFeeMethod) == null) {
          turingchainGrpc.getGetProperFeeMethod = getGetProperFeeMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetProperFee"))
              .build();
        }
      }
    }
    return getGetProperFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus> getGetWalletStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWalletStatus",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus> getGetWalletStatusMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus> getGetWalletStatusMethod;
    if ((getGetWalletStatusMethod = turingchainGrpc.getGetWalletStatusMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetWalletStatusMethod = turingchainGrpc.getGetWalletStatusMethod) == null) {
          turingchainGrpc.getGetWalletStatusMethod = getGetWalletStatusMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWalletStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetWalletStatus"))
              .build();
        }
      }
    }
    return getGetWalletStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview> getGetBlockOverviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockOverview",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview> getGetBlockOverviewMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview> getGetBlockOverviewMethod;
    if ((getGetBlockOverviewMethod = turingchainGrpc.getGetBlockOverviewMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetBlockOverviewMethod = turingchainGrpc.getGetBlockOverviewMethod) == null) {
          turingchainGrpc.getGetBlockOverviewMethod = getGetBlockOverviewMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockOverview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetBlockOverview"))
              .build();
        }
      }
    }
    return getGetBlockOverviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview> getGetAddrOverviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddrOverview",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview> getGetAddrOverviewMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview> getGetAddrOverviewMethod;
    if ((getGetAddrOverviewMethod = turingchainGrpc.getGetAddrOverviewMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetAddrOverviewMethod = turingchainGrpc.getGetAddrOverviewMethod) == null) {
          turingchainGrpc.getGetAddrOverviewMethod = getGetAddrOverviewMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddrOverview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetAddrOverview"))
              .build();
        }
      }
    }
    return getGetAddrOverviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getGetBlockHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockHash",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getGetBlockHashMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getGetBlockHashMethod;
    if ((getGetBlockHashMethod = turingchainGrpc.getGetBlockHashMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetBlockHashMethod = turingchainGrpc.getGetBlockHashMethod) == null) {
          turingchainGrpc.getGetBlockHashMethod = getGetBlockHashMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetBlockHash"))
              .build();
        }
      }
    }
    return getGetBlockHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> getGenSeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenSeed",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> getGenSeedMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> getGenSeedMethod;
    if ((getGenSeedMethod = turingchainGrpc.getGenSeedMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGenSeedMethod = turingchainGrpc.getGenSeedMethod) == null) {
          turingchainGrpc.getGenSeedMethod = getGenSeedMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenSeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GenSeed"))
              .build();
        }
      }
    }
    return getGenSeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> getGetSeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSeed",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> getGetSeedMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> getGetSeedMethod;
    if ((getGetSeedMethod = turingchainGrpc.getGetSeedMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetSeedMethod = turingchainGrpc.getGetSeedMethod) == null) {
          turingchainGrpc.getGetSeedMethod = getGetSeedMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetSeed"))
              .build();
        }
      }
    }
    return getGetSeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSaveSeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveSeed",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSaveSeedMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getSaveSeedMethod;
    if ((getSaveSeedMethod = turingchainGrpc.getSaveSeedMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getSaveSeedMethod = turingchainGrpc.getSaveSeedMethod) == null) {
          turingchainGrpc.getSaveSeedMethod = getSaveSeedMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveSeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("SaveSeed"))
              .build();
        }
      }
    }
    return getSaveSeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance,
      one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBalance",
      requestType = one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance.class,
      responseType = one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance,
      one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance, one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts> getGetBalanceMethod;
    if ((getGetBalanceMethod = turingchainGrpc.getGetBalanceMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetBalanceMethod = turingchainGrpc.getGetBalanceMethod) == null) {
          turingchainGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance, one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getQueryChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryChain",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getQueryChainMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getQueryChainMethod;
    if ((getQueryChainMethod = turingchainGrpc.getQueryChainMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getQueryChainMethod = turingchainGrpc.getQueryChainMethod) == null) {
          turingchainGrpc.getQueryChainMethod = getQueryChainMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("QueryChain"))
              .build();
        }
      }
    }
    return getQueryChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getExecWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecWallet",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getExecWalletMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getExecWalletMethod;
    if ((getExecWalletMethod = turingchainGrpc.getExecWalletMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getExecWalletMethod = turingchainGrpc.getExecWalletMethod) == null) {
          turingchainGrpc.getExecWalletMethod = getExecWalletMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("ExecWallet"))
              .build();
        }
      }
    }
    return getExecWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getQueryConsensusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryConsensus",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getQueryConsensusMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getQueryConsensusMethod;
    if ((getQueryConsensusMethod = turingchainGrpc.getQueryConsensusMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getQueryConsensusMethod = turingchainGrpc.getQueryConsensusMethod) == null) {
          turingchainGrpc.getQueryConsensusMethod = getQueryConsensusMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryConsensus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("QueryConsensus"))
              .build();
        }
      }
    }
    return getQueryConsensusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = turingchainGrpc.getCreateTransactionMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getCreateTransactionMethod = turingchainGrpc.getCreateTransactionMethod) == null) {
          turingchainGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx> getGetHexTxByHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHexTxByHash",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.class,
      responseType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx> getGetHexTxByHashMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx> getGetHexTxByHashMethod;
    if ((getGetHexTxByHashMethod = turingchainGrpc.getGetHexTxByHashMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetHexTxByHashMethod = turingchainGrpc.getGetHexTxByHashMethod) == null) {
          turingchainGrpc.getGetHexTxByHashMethod = getGetHexTxByHashMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHexTxByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetHexTxByHash"))
              .build();
        }
      }
    }
    return getGetHexTxByHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString> getDumpPrivkeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DumpPrivkey",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString> getDumpPrivkeyMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString> getDumpPrivkeyMethod;
    if ((getDumpPrivkeyMethod = turingchainGrpc.getDumpPrivkeyMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getDumpPrivkeyMethod = turingchainGrpc.getDumpPrivkeyMethod) == null) {
          turingchainGrpc.getDumpPrivkeyMethod = getDumpPrivkeyMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DumpPrivkey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("DumpPrivkey"))
              .build();
        }
      }
    }
    return getDumpPrivkeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getDumpPrivkeysFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DumpPrivkeysFile",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getDumpPrivkeysFileMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getDumpPrivkeysFileMethod;
    if ((getDumpPrivkeysFileMethod = turingchainGrpc.getDumpPrivkeysFileMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getDumpPrivkeysFileMethod = turingchainGrpc.getDumpPrivkeysFileMethod) == null) {
          turingchainGrpc.getDumpPrivkeysFileMethod = getDumpPrivkeysFileMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DumpPrivkeysFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("DumpPrivkeysFile"))
              .build();
        }
      }
    }
    return getDumpPrivkeysFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getImportPrivkeysFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportPrivkeysFile",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getImportPrivkeysFileMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getImportPrivkeysFileMethod;
    if ((getImportPrivkeysFileMethod = turingchainGrpc.getImportPrivkeysFileMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getImportPrivkeysFileMethod = turingchainGrpc.getImportPrivkeysFileMethod) == null) {
          turingchainGrpc.getImportPrivkeysFileMethod = getImportPrivkeysFileMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportPrivkeysFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("ImportPrivkeysFile"))
              .build();
        }
      }
    }
    return getImportPrivkeysFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo> getVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Version",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo> getVersionMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo> getVersionMethod;
    if ((getVersionMethod = turingchainGrpc.getVersionMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getVersionMethod = turingchainGrpc.getVersionMethod) == null) {
          turingchainGrpc.getVersionMethod = getVersionMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Version"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("Version"))
              .build();
        }
      }
    }
    return getVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getIsSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsSync",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getIsSyncMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getIsSyncMethod;
    if ((getIsSyncMethod = turingchainGrpc.getIsSyncMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getIsSyncMethod = turingchainGrpc.getIsSyncMethod) == null) {
          turingchainGrpc.getIsSyncMethod = getIsSyncMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("IsSync"))
              .build();
        }
      }
    }
    return getIsSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq,
      one.turingchain.javasdk.model.protobuf.P2pService.PeerList> getGetPeerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPeerInfo",
      requestType = one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq.class,
      responseType = one.turingchain.javasdk.model.protobuf.P2pService.PeerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq,
      one.turingchain.javasdk.model.protobuf.P2pService.PeerList> getGetPeerInfoMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq, one.turingchain.javasdk.model.protobuf.P2pService.PeerList> getGetPeerInfoMethod;
    if ((getGetPeerInfoMethod = turingchainGrpc.getGetPeerInfoMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetPeerInfoMethod = turingchainGrpc.getGetPeerInfoMethod) == null) {
          turingchainGrpc.getGetPeerInfoMethod = getGetPeerInfoMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq, one.turingchain.javasdk.model.protobuf.P2pService.PeerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPeerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.P2pService.PeerList.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetPeerInfo"))
              .build();
        }
      }
    }
    return getGetPeerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq,
      one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo> getNetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetInfo",
      requestType = one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq.class,
      responseType = one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq,
      one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo> getNetInfoMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq, one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo> getNetInfoMethod;
    if ((getNetInfoMethod = turingchainGrpc.getNetInfoMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getNetInfoMethod = turingchainGrpc.getNetInfoMethod) == null) {
          turingchainGrpc.getNetInfoMethod = getNetInfoMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq, one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("NetInfo"))
              .build();
        }
      }
    }
    return getNetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getIsNtpClockSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsNtpClockSync",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getIsNtpClockSyncMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getIsNtpClockSyncMethod;
    if ((getIsNtpClockSyncMethod = turingchainGrpc.getIsNtpClockSyncMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getIsNtpClockSyncMethod = turingchainGrpc.getIsNtpClockSyncMethod) == null) {
          turingchainGrpc.getIsNtpClockSyncMethod = getIsNtpClockSyncMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsNtpClockSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("IsNtpClockSync"))
              .build();
        }
      }
    }
    return getIsNtpClockSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32> getGetFatalFailureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFatalFailure",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32> getGetFatalFailureMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32> getGetFatalFailureMethod;
    if ((getGetFatalFailureMethod = turingchainGrpc.getGetFatalFailureMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetFatalFailureMethod = turingchainGrpc.getGetFatalFailureMethod) == null) {
          turingchainGrpc.getGetFatalFailureMethod = getGetFatalFailureMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFatalFailure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetFatalFailure"))
              .build();
        }
      }
    }
    return getGetFatalFailureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetLastBlockSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastBlockSequence",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetLastBlockSequenceMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetLastBlockSequenceMethod;
    if ((getGetLastBlockSequenceMethod = turingchainGrpc.getGetLastBlockSequenceMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetLastBlockSequenceMethod = turingchainGrpc.getGetLastBlockSequenceMethod) == null) {
          turingchainGrpc.getGetLastBlockSequenceMethod = getGetLastBlockSequenceMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastBlockSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetLastBlockSequence"))
              .build();
        }
      }
    }
    return getGetLastBlockSequenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetSequenceByHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSequenceByHash",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetSequenceByHashMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetSequenceByHashMethod;
    if ((getGetSequenceByHashMethod = turingchainGrpc.getGetSequenceByHashMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetSequenceByHashMethod = turingchainGrpc.getGetSequenceByHashMethod) == null) {
          turingchainGrpc.getGetSequenceByHashMethod = getGetSequenceByHashMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSequenceByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetSequenceByHash"))
              .build();
        }
      }
    }
    return getGetSequenceByHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails> getGetBlockByHashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByHashes",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails> getGetBlockByHashesMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails> getGetBlockByHashesMethod;
    if ((getGetBlockByHashesMethod = turingchainGrpc.getGetBlockByHashesMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetBlockByHashesMethod = turingchainGrpc.getGetBlockByHashesMethod) == null) {
          turingchainGrpc.getGetBlockByHashesMethod = getGetBlockByHashesMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByHashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetBlockByHashes"))
              .build();
        }
      }
    }
    return getGetBlockByHashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq> getGetBlockBySeqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockBySeq",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq> getGetBlockBySeqMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq> getGetBlockBySeqMethod;
    if ((getGetBlockBySeqMethod = turingchainGrpc.getGetBlockBySeqMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetBlockBySeqMethod = turingchainGrpc.getGetBlockBySeqMethod) == null) {
          turingchainGrpc.getGetBlockBySeqMethod = getGetBlockBySeqMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockBySeq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetBlockBySeq"))
              .build();
        }
      }
    }
    return getGetBlockBySeqMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getCloseQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseQueue",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getCloseQueueMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getCloseQueueMethod;
    if ((getCloseQueueMethod = turingchainGrpc.getCloseQueueMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getCloseQueueMethod = turingchainGrpc.getCloseQueueMethod) == null) {
          turingchainGrpc.getCloseQueueMethod = getCloseQueueMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("CloseQueue"))
              .build();
        }
      }
    }
    return getCloseQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance,
      one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance> getGetAllExecBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllExecBalance",
      requestType = one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance.class,
      responseType = one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance,
      one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance> getGetAllExecBalanceMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance, one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance> getGetAllExecBalanceMethod;
    if ((getGetAllExecBalanceMethod = turingchainGrpc.getGetAllExecBalanceMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetAllExecBalanceMethod = turingchainGrpc.getGetAllExecBalanceMethod) == null) {
          turingchainGrpc.getGetAllExecBalanceMethod = getGetAllExecBalanceMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance, one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllExecBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetAllExecBalance"))
              .build();
        }
      }
    }
    return getGetAllExecBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getSignRawTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignRawTx",
      requestType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getSignRawTxMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getSignRawTxMethod;
    if ((getSignRawTxMethod = turingchainGrpc.getSignRawTxMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getSignRawTxMethod = turingchainGrpc.getSignRawTxMethod) == null) {
          turingchainGrpc.getSignRawTxMethod = getSignRawTxMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignRawTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("SignRawTx"))
              .build();
        }
      }
    }
    return getSignRawTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getCreateNoBalanceTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNoBalanceTransaction",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getCreateNoBalanceTransactionMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getCreateNoBalanceTransactionMethod;
    if ((getCreateNoBalanceTransactionMethod = turingchainGrpc.getCreateNoBalanceTransactionMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getCreateNoBalanceTransactionMethod = turingchainGrpc.getCreateNoBalanceTransactionMethod) == null) {
          turingchainGrpc.getCreateNoBalanceTransactionMethod = getCreateNoBalanceTransactionMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNoBalanceTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("CreateNoBalanceTransaction"))
              .build();
        }
      }
    }
    return getCreateNoBalanceTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getQueryRandNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryRandNum",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getQueryRandNumMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getQueryRandNumMethod;
    if ((getQueryRandNumMethod = turingchainGrpc.getQueryRandNumMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getQueryRandNumMethod = turingchainGrpc.getQueryRandNumMethod) == null) {
          turingchainGrpc.getQueryRandNumMethod = getQueryRandNumMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash, one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryRandNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("QueryRandNum"))
              .build();
        }
      }
    }
    return getQueryRandNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetForkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFork",
      requestType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey.class,
      responseType = one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey,
      one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetForkMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getGetForkMethod;
    if ((getGetForkMethod = turingchainGrpc.getGetForkMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetForkMethod = turingchainGrpc.getGetForkMethod) == null) {
          turingchainGrpc.getGetForkMethod = getGetForkMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey, one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetFork"))
              .build();
        }
      }
    }
    return getGetForkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getCreateNoBalanceTxsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNoBalanceTxs",
      requestType = one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs.class,
      responseType = one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs,
      one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getCreateNoBalanceTxsMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> getCreateNoBalanceTxsMethod;
    if ((getCreateNoBalanceTxsMethod = turingchainGrpc.getCreateNoBalanceTxsMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getCreateNoBalanceTxsMethod = turingchainGrpc.getCreateNoBalanceTxsMethod) == null) {
          turingchainGrpc.getCreateNoBalanceTxsMethod = getCreateNoBalanceTxsMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs, one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNoBalanceTxs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("CreateNoBalanceTxs"))
              .build();
        }
      }
    }
    return getCreateNoBalanceTxsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getGetParaTxByTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParaTxByTitle",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getGetParaTxByTitleMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getGetParaTxByTitleMethod;
    if ((getGetParaTxByTitleMethod = turingchainGrpc.getGetParaTxByTitleMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetParaTxByTitleMethod = turingchainGrpc.getGetParaTxByTitleMethod) == null) {
          turingchainGrpc.getGetParaTxByTitleMethod = getGetParaTxByTitleMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParaTxByTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetParaTxByTitle"))
              .build();
        }
      }
    }
    return getGetParaTxByTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle> getLoadParaTxByTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadParaTxByTitle",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle> getLoadParaTxByTitleMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle> getLoadParaTxByTitleMethod;
    if ((getLoadParaTxByTitleMethod = turingchainGrpc.getLoadParaTxByTitleMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getLoadParaTxByTitleMethod = turingchainGrpc.getLoadParaTxByTitleMethod) == null) {
          turingchainGrpc.getLoadParaTxByTitleMethod = getLoadParaTxByTitleMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadParaTxByTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("LoadParaTxByTitle"))
              .build();
        }
      }
    }
    return getLoadParaTxByTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getGetParaTxByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParaTxByHeight",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getGetParaTxByHeightMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getGetParaTxByHeightMethod;
    if ((getGetParaTxByHeightMethod = turingchainGrpc.getGetParaTxByHeightMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetParaTxByHeightMethod = turingchainGrpc.getGetParaTxByHeightMethod) == null) {
          turingchainGrpc.getGetParaTxByHeightMethod = getGetParaTxByHeightMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParaTxByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetParaTxByHeight"))
              .build();
        }
      }
    }
    return getGetParaTxByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers> getGetHeadersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHeaders",
      requestType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks.class,
      responseType = one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks,
      one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers> getGetHeadersMethod() {
    io.grpc.MethodDescriptor<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers> getGetHeadersMethod;
    if ((getGetHeadersMethod = turingchainGrpc.getGetHeadersMethod) == null) {
      synchronized (turingchainGrpc.class) {
        if ((getGetHeadersMethod = turingchainGrpc.getGetHeadersMethod) == null) {
          turingchainGrpc.getGetHeadersMethod = getGetHeadersMethod =
              io.grpc.MethodDescriptor.<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks, one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHeaders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers.getDefaultInstance()))
              .setSchemaDescriptor(new turingchainMethodDescriptorSupplier("GetHeaders"))
              .build();
        }
      }
    }
    return getGetHeadersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static turingchainStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<turingchainStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<turingchainStub>() {
        @java.lang.Override
        public turingchainStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new turingchainStub(channel, callOptions);
        }
      };
    return turingchainStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static turingchainBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<turingchainBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<turingchainBlockingStub>() {
        @java.lang.Override
        public turingchainBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new turingchainBlockingStub(channel, callOptions);
        }
      };
    return turingchainBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static turingchainFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<turingchainFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<turingchainFutureStub>() {
        @java.lang.Override
        public turingchainFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new turingchainFutureStub(channel, callOptions);
        }
      };
    return turingchainFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class turingchainImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * turingchain 对外提供服务的接口
     *区块链接口
     * </pre>
     */
    public void getBlocks(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取最新的区块头
     * </pre>
     */
    public void getLastHeader(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLastHeaderMethod(), responseObserver);
    }

    /**
     * <pre>
     *交易接口
     * </pre>
     */
    public void createRawTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRawTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createRawTxGroup(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRawTxGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据哈希查询交易
     * </pre>
     */
    public void queryTransaction(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public void sendTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过地址获取交易信息
     * </pre>
     */
    public void getTransactionByAddr(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionByAddrMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过哈希数组获取对应的交易
     * </pre>
     */
    public void getTransactionByHashes(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionByHashesMethod(), responseObserver);
    }

    /**
     * <pre>
     *缓存接口
     * </pre>
     */
    public void getMemPool(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMemPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     *钱包接口
     *获取钱包账户信息
     * </pre>
     */
    public void getAccounts(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     *根据账户lable信息获取账户地址
     * </pre>
     */
    public void getAccount(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *创建钱包账户
     * </pre>
     */
    public void newAccount(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getNewAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取钱包的交易列表
     * </pre>
     */
    public void walletTransactionList(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getWalletTransactionListMethod(), responseObserver);
    }

    /**
     * <pre>
     *导入钱包私钥
     * </pre>
     */
    public void importPrivkey(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getImportPrivkeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public void sendToAddress(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> responseObserver) {
      asyncUnimplementedUnaryCall(getSendToAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     *设置交易手续费
     * </pre>
     */
    public void setTxFee(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTxFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     *设置标签
     * </pre>
     */
    public void setLabl(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getSetLablMethod(), responseObserver);
    }

    /**
     * <pre>
     *合并钱包余额
     * </pre>
     */
    public void mergeBalance(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes> responseObserver) {
      asyncUnimplementedUnaryCall(getMergeBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *设置钱包密码
     * </pre>
     */
    public void setPasswd(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPasswdMethod(), responseObserver);
    }

    /**
     * <pre>
     *给钱包上锁
     * </pre>
     */
    public void lock(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     *给钱包解锁
     * </pre>
     */
    public void unLock(one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getUnLockMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取最新的Mempool
     * </pre>
     */
    public void getLastMemPool(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLastMemPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取最新的ProperFee
     * </pre>
     */
    public void getProperFee(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProperFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取钱包状态
     * </pre>
     */
    public void getWalletStatus(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWalletStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *区块浏览器接口
     * /
     * </pre>
     */
    public void getBlockOverview(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockOverviewMethod(), responseObserver);
    }

    /**
     */
    public void getAddrOverview(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAddrOverviewMethod(), responseObserver);
    }

    /**
     */
    public void getBlockHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * seed
     * 创建seed
     * </pre>
     */
    public void genSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> responseObserver) {
      asyncUnimplementedUnaryCall(getGenSeedMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取seed
     * </pre>
     */
    public void getSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSeedMethod(), responseObserver);
    }

    /**
     * <pre>
     *保存seed
     * </pre>
     */
    public void saveSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveSeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Balance Query
     *获取余额
     * </pre>
     */
    public void getBalance(one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     */
    public void queryChain(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryChainMethod(), responseObserver);
    }

    /**
     */
    public void execWallet(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getExecWalletMethod(), responseObserver);
    }

    /**
     */
    public void queryConsensus(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryConsensusMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction(one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取交易的十六进制编码
     * </pre>
     */
    public void getHexTxByHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHexTxByHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * 导出私钥
     * </pre>
     */
    public void dumpPrivkey(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString> responseObserver) {
      asyncUnimplementedUnaryCall(getDumpPrivkeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 导出全部私钥到文件
     * </pre>
     */
    public void dumpPrivkeysFile(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getDumpPrivkeysFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * 从文件中批量导入私钥
     * </pre>
     */
    public void importPrivkeysFile(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getImportPrivkeysFileMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取程序版本
     * </pre>
     */
    public void version(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     *是否同步
     * </pre>
     */
    public void isSync(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getIsSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取当前节点连接的其他节点信息
     * </pre>
     */
    public void getPeerInfo(one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.P2pService.PeerList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPeerInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取当前节点的网络信息
     * </pre>
     */
    public void netInfo(one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getNetInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ntpclock是否同步
     * </pre>
     */
    public void isNtpClockSync(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getIsNtpClockSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取系统致命故障信息
     * </pre>
     */
    public void getFatalFailure(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFatalFailureMethod(), responseObserver);
    }

    /**
     */
    public void getLastBlockSequence(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLastBlockSequenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * get add block's sequence by hash
     * </pre>
     */
    public void getSequenceByHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSequenceByHashMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过block hash 获取对应的blocks信息
     * </pre>
     */
    public void getBlockByHashes(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHashesMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过block seq 获取对应的blocks hash 信息
     * </pre>
     */
    public void getBlockBySeq(one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64 request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockBySeqMethod(), responseObserver);
    }

    /**
     * <pre>
     *关闭turingchain
     * </pre>
     */
    public void closeQueue(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseQueueMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取地址所以合约下的余额
     * </pre>
     */
    public void getAllExecBalance(one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllExecBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *签名交易
     * </pre>
     */
    public void signRawTx(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> responseObserver) {
      asyncUnimplementedUnaryCall(getSignRawTxMethod(), responseObserver);
    }

    /**
     */
    public void createNoBalanceTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNoBalanceTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取随机HASH
     * </pre>
     */
    public void queryRandNum(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryRandNumMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取是否达到fork高度
     * </pre>
     */
    public void getFork(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> responseObserver) {
      asyncUnimplementedUnaryCall(getGetForkMethod(), responseObserver);
    }

    /**
     */
    public void createNoBalanceTxs(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNoBalanceTxsMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过seq以及title获取对应平行连的交易
     * </pre>
     */
    public void getParaTxByTitle(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetParaTxByTitleMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取拥有此title交易的区块高度
     * </pre>
     */
    public void loadParaTxByTitle(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadParaTxByTitleMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过区块高度列表+title获取平行链交易
     * </pre>
     */
    public void getParaTxByHeight(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetParaTxByHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取区块头信息
     * </pre>
     */
    public void getHeaders(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHeadersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBlocksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_GET_BLOCKS)))
          .addMethod(
            getGetLastHeaderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header>(
                  this, METHODID_GET_LAST_HEADER)))
          .addMethod(
            getCreateRawTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>(
                  this, METHODID_CREATE_RAW_TRANSACTION)))
          .addMethod(
            getCreateRawTxGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>(
                  this, METHODID_CREATE_RAW_TX_GROUP)))
          .addMethod(
            getQueryTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail>(
                  this, METHODID_QUERY_TRANSACTION)))
          .addMethod(
            getSendTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            getGetTransactionByAddrMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos>(
                  this, METHODID_GET_TRANSACTION_BY_ADDR)))
          .addMethod(
            getGetTransactionByHashesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails>(
                  this, METHODID_GET_TRANSACTION_BY_HASHES)))
          .addMethod(
            getGetMemPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList>(
                  this, METHODID_GET_MEM_POOL)))
          .addMethod(
            getGetAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts>(
                  this, METHODID_GET_ACCOUNTS)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getNewAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>(
                  this, METHODID_NEW_ACCOUNT)))
          .addMethod(
            getWalletTransactionListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails>(
                  this, METHODID_WALLET_TRANSACTION_LIST)))
          .addMethod(
            getImportPrivkeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>(
                  this, METHODID_IMPORT_PRIVKEY)))
          .addMethod(
            getSendToAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>(
                  this, METHODID_SEND_TO_ADDRESS)))
          .addMethod(
            getSetTxFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_SET_TX_FEE)))
          .addMethod(
            getSetLablMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>(
                  this, METHODID_SET_LABL)))
          .addMethod(
            getMergeBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes>(
                  this, METHODID_MERGE_BALANCE)))
          .addMethod(
            getSetPasswdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_SET_PASSWD)))
          .addMethod(
            getLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_LOCK)))
          .addMethod(
            getUnLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_UN_LOCK)))
          .addMethod(
            getGetLastMemPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList>(
                  this, METHODID_GET_LAST_MEM_POOL)))
          .addMethod(
            getGetProperFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee>(
                  this, METHODID_GET_PROPER_FEE)))
          .addMethod(
            getGetWalletStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus>(
                  this, METHODID_GET_WALLET_STATUS)))
          .addMethod(
            getGetBlockOverviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview>(
                  this, METHODID_GET_BLOCK_OVERVIEW)))
          .addMethod(
            getGetAddrOverviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview>(
                  this, METHODID_GET_ADDR_OVERVIEW)))
          .addMethod(
            getGetBlockHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>(
                  this, METHODID_GET_BLOCK_HASH)))
          .addMethod(
            getGenSeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed>(
                  this, METHODID_GEN_SEED)))
          .addMethod(
            getGetSeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed>(
                  this, METHODID_GET_SEED)))
          .addMethod(
            getSaveSeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_SAVE_SEED)))
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance,
                one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getQueryChainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_QUERY_CHAIN)))
          .addMethod(
            getExecWalletMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_EXEC_WALLET)))
          .addMethod(
            getQueryConsensusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_QUERY_CONSENSUS)))
          .addMethod(
            getCreateTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getGetHexTxByHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx>(
                  this, METHODID_GET_HEX_TX_BY_HASH)))
          .addMethod(
            getDumpPrivkeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString>(
                  this, METHODID_DUMP_PRIVKEY)))
          .addMethod(
            getDumpPrivkeysFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_DUMP_PRIVKEYS_FILE)))
          .addMethod(
            getImportPrivkeysFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_IMPORT_PRIVKEYS_FILE)))
          .addMethod(
            getVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo>(
                  this, METHODID_VERSION)))
          .addMethod(
            getIsSyncMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_IS_SYNC)))
          .addMethod(
            getGetPeerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq,
                one.turingchain.javasdk.model.protobuf.P2pService.PeerList>(
                  this, METHODID_GET_PEER_INFO)))
          .addMethod(
            getNetInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq,
                one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo>(
                  this, METHODID_NET_INFO)))
          .addMethod(
            getIsNtpClockSyncMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_IS_NTP_CLOCK_SYNC)))
          .addMethod(
            getGetFatalFailureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32>(
                  this, METHODID_GET_FATAL_FAILURE)))
          .addMethod(
            getGetLastBlockSequenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>(
                  this, METHODID_GET_LAST_BLOCK_SEQUENCE)))
          .addMethod(
            getGetSequenceByHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>(
                  this, METHODID_GET_SEQUENCE_BY_HASH)))
          .addMethod(
            getGetBlockByHashesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails>(
                  this, METHODID_GET_BLOCK_BY_HASHES)))
          .addMethod(
            getGetBlockBySeqMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq>(
                  this, METHODID_GET_BLOCK_BY_SEQ)))
          .addMethod(
            getCloseQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>(
                  this, METHODID_CLOSE_QUEUE)))
          .addMethod(
            getGetAllExecBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance,
                one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance>(
                  this, METHODID_GET_ALL_EXEC_BALANCE)))
          .addMethod(
            getSignRawTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>(
                  this, METHODID_SIGN_RAW_TX)))
          .addMethod(
            getCreateNoBalanceTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>(
                  this, METHODID_CREATE_NO_BALANCE_TRANSACTION)))
          .addMethod(
            getQueryRandNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>(
                  this, METHODID_QUERY_RAND_NUM)))
          .addMethod(
            getGetForkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey,
                one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>(
                  this, METHODID_GET_FORK)))
          .addMethod(
            getCreateNoBalanceTxsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs,
                one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>(
                  this, METHODID_CREATE_NO_BALANCE_TXS)))
          .addMethod(
            getGetParaTxByTitleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails>(
                  this, METHODID_GET_PARA_TX_BY_TITLE)))
          .addMethod(
            getLoadParaTxByTitleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle>(
                  this, METHODID_LOAD_PARA_TX_BY_TITLE)))
          .addMethod(
            getGetParaTxByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails>(
                  this, METHODID_GET_PARA_TX_BY_HEIGHT)))
          .addMethod(
            getGetHeadersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks,
                one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers>(
                  this, METHODID_GET_HEADERS)))
          .build();
    }
  }

  /**
   */
  public static final class turingchainStub extends io.grpc.stub.AbstractAsyncStub<turingchainStub> {
    private turingchainStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected turingchainStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new turingchainStub(channel, callOptions);
    }

    /**
     * <pre>
     * turingchain 对外提供服务的接口
     *区块链接口
     * </pre>
     */
    public void getBlocks(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取最新的区块头
     * </pre>
     */
    public void getLastHeader(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLastHeaderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *交易接口
     * </pre>
     */
    public void createRawTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRawTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRawTxGroup(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRawTxGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据哈希查询交易
     * </pre>
     */
    public void queryTransaction(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public void sendTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过地址获取交易信息
     * </pre>
     */
    public void getTransactionByAddr(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过哈希数组获取对应的交易
     * </pre>
     */
    public void getTransactionByHashes(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionByHashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *缓存接口
     * </pre>
     */
    public void getMemPool(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMemPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *钱包接口
     *获取钱包账户信息
     * </pre>
     */
    public void getAccounts(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据账户lable信息获取账户地址
     * </pre>
     */
    public void getAccount(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *创建钱包账户
     * </pre>
     */
    public void newAccount(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取钱包的交易列表
     * </pre>
     */
    public void walletTransactionList(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWalletTransactionListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *导入钱包私钥
     * </pre>
     */
    public void importPrivkey(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportPrivkeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public void sendToAddress(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendToAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置交易手续费
     * </pre>
     */
    public void setTxFee(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTxFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置标签
     * </pre>
     */
    public void setLabl(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetLablMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *合并钱包余额
     * </pre>
     */
    public void mergeBalance(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMergeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置钱包密码
     * </pre>
     */
    public void setPasswd(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPasswdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *给钱包上锁
     * </pre>
     */
    public void lock(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *给钱包解锁
     * </pre>
     */
    public void unLock(one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取最新的Mempool
     * </pre>
     */
    public void getLastMemPool(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLastMemPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取最新的ProperFee
     * </pre>
     */
    public void getProperFee(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProperFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取钱包状态
     * </pre>
     */
    public void getWalletStatus(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWalletStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *区块浏览器接口
     * /
     * </pre>
     */
    public void getBlockOverview(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockOverviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddrOverview(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAddrOverviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * seed
     * 创建seed
     * </pre>
     */
    public void genSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenSeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取seed
     * </pre>
     */
    public void getSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *保存seed
     * </pre>
     */
    public void saveSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveSeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Balance Query
     *获取余额
     * </pre>
     */
    public void getBalance(one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryChain(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execWallet(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryConsensus(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryConsensusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction(one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取交易的十六进制编码
     * </pre>
     */
    public void getHexTxByHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHexTxByHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 导出私钥
     * </pre>
     */
    public void dumpPrivkey(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDumpPrivkeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 导出全部私钥到文件
     * </pre>
     */
    public void dumpPrivkeysFile(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDumpPrivkeysFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 从文件中批量导入私钥
     * </pre>
     */
    public void importPrivkeysFile(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportPrivkeysFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取程序版本
     * </pre>
     */
    public void version(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *是否同步
     * </pre>
     */
    public void isSync(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取当前节点连接的其他节点信息
     * </pre>
     */
    public void getPeerInfo(one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.P2pService.PeerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPeerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取当前节点的网络信息
     * </pre>
     */
    public void netInfo(one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ntpclock是否同步
     * </pre>
     */
    public void isNtpClockSync(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsNtpClockSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取系统致命故障信息
     * </pre>
     */
    public void getFatalFailure(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFatalFailureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastBlockSequence(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLastBlockSequenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get add block's sequence by hash
     * </pre>
     */
    public void getSequenceByHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSequenceByHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过block hash 获取对应的blocks信息
     * </pre>
     */
    public void getBlockByHashes(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过block seq 获取对应的blocks hash 信息
     * </pre>
     */
    public void getBlockBySeq(one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64 request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockBySeqMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *关闭turingchain
     * </pre>
     */
    public void closeQueue(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取地址所以合约下的余额
     * </pre>
     */
    public void getAllExecBalance(one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllExecBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *签名交易
     * </pre>
     */
    public void signRawTx(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignRawTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNoBalanceTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNoBalanceTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取随机HASH
     * </pre>
     */
    public void queryRandNum(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryRandNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取是否达到fork高度
     * </pre>
     */
    public void getFork(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetForkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNoBalanceTxs(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNoBalanceTxsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过seq以及title获取对应平行连的交易
     * </pre>
     */
    public void getParaTxByTitle(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetParaTxByTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取拥有此title交易的区块高度
     * </pre>
     */
    public void loadParaTxByTitle(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadParaTxByTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过区块高度列表+title获取平行链交易
     * </pre>
     */
    public void getParaTxByHeight(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetParaTxByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取区块头信息
     * </pre>
     */
    public void getHeaders(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request,
        io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHeadersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class turingchainBlockingStub extends io.grpc.stub.AbstractBlockingStub<turingchainBlockingStub> {
    private turingchainBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected turingchainBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new turingchainBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * turingchain 对外提供服务的接口
     *区块链接口
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply getBlocks(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request) {
      return blockingUnaryCall(
          getChannel(), getGetBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取最新的区块头
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header getLastHeader(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getGetLastHeaderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *交易接口
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx createRawTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx request) {
      return blockingUnaryCall(
          getChannel(), getCreateRawTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx createRawTxGroup(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup request) {
      return blockingUnaryCall(
          getChannel(), getCreateRawTxGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据哈希查询交易
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail queryTransaction(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return blockingUnaryCall(
          getChannel(), getQueryTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply sendTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过地址获取交易信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos getTransactionByAddr(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionByAddrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过哈希数组获取对应的交易
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails getTransactionByHashes(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionByHashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *缓存接口
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList getMemPool(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool request) {
      return blockingUnaryCall(
          getChannel(), getGetMemPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *钱包接口
     *获取钱包账户信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts getAccounts(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *根据账户lable信息获取账户地址
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount getAccount(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *创建钱包账户
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount newAccount(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount request) {
      return blockingUnaryCall(
          getChannel(), getNewAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取钱包的交易列表
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails walletTransactionList(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList request) {
      return blockingUnaryCall(
          getChannel(), getWalletTransactionListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *导入钱包私钥
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount importPrivkey(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey request) {
      return blockingUnaryCall(
          getChannel(), getImportPrivkeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash sendToAddress(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress request) {
      return blockingUnaryCall(
          getChannel(), getSendToAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *设置交易手续费
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply setTxFee(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee request) {
      return blockingUnaryCall(
          getChannel(), getSetTxFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *设置标签
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount setLabl(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel request) {
      return blockingUnaryCall(
          getChannel(), getSetLablMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *合并钱包余额
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes mergeBalance(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance request) {
      return blockingUnaryCall(
          getChannel(), getMergeBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *设置钱包密码
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply setPasswd(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd request) {
      return blockingUnaryCall(
          getChannel(), getSetPasswdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *给钱包上锁
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply lock(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *给钱包解锁
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply unLock(one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock request) {
      return blockingUnaryCall(
          getChannel(), getUnLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取最新的Mempool
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList getLastMemPool(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getGetLastMemPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取最新的ProperFee
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee getProperFee(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee request) {
      return blockingUnaryCall(
          getChannel(), getGetProperFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取钱包状态
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus getWalletStatus(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getGetWalletStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *区块浏览器接口
     * /
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview getBlockOverview(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockOverviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview getAddrOverview(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request) {
      return blockingUnaryCall(
          getChannel(), getGetAddrOverviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash getBlockHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * seed
     * 创建seed
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed genSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang request) {
      return blockingUnaryCall(
          getChannel(), getGenSeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取seed
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed getSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw request) {
      return blockingUnaryCall(
          getChannel(), getGetSeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *保存seed
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply saveSeed(one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw request) {
      return blockingUnaryCall(
          getChannel(), getSaveSeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Balance Query
     *获取余额
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts getBalance(one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply queryChain(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request) {
      return blockingUnaryCall(
          getChannel(), getQueryChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply execWallet(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request) {
      return blockingUnaryCall(
          getChannel(), getExecWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply queryConsensus(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request) {
      return blockingUnaryCall(
          getChannel(), getQueryConsensusMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx createTransaction(one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取交易的十六进制编码
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx getHexTxByHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return blockingUnaryCall(
          getChannel(), getGetHexTxByHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 导出私钥
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString dumpPrivkey(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString request) {
      return blockingUnaryCall(
          getChannel(), getDumpPrivkeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 导出全部私钥到文件
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply dumpPrivkeysFile(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request) {
      return blockingUnaryCall(
          getChannel(), getDumpPrivkeysFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 从文件中批量导入私钥
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply importPrivkeysFile(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request) {
      return blockingUnaryCall(
          getChannel(), getImportPrivkeysFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取程序版本
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo version(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *是否同步
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply isSync(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getIsSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取当前节点连接的其他节点信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.P2pService.PeerList getPeerInfo(one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPeerInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取当前节点的网络信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo netInfo(one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getNetInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ntpclock是否同步
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply isNtpClockSync(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getIsNtpClockSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取系统致命故障信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32 getFatalFailure(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getGetFatalFailureMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64 getLastBlockSequence(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getGetLastBlockSequenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get add block's sequence by hash
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64 getSequenceByHash(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return blockingUnaryCall(
          getChannel(), getGetSequenceByHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过block hash 获取对应的blocks信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails getBlockByHashes(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过block seq 获取对应的blocks hash 信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq getBlockBySeq(one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64 request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockBySeqMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *关闭turingchain
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply closeQueue(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return blockingUnaryCall(
          getChannel(), getCloseQueueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取地址所以合约下的余额
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance getAllExecBalance(one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance request) {
      return blockingUnaryCall(
          getChannel(), getGetAllExecBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *签名交易
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx signRawTx(one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx request) {
      return blockingUnaryCall(
          getChannel(), getSignRawTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx createNoBalanceTransaction(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx request) {
      return blockingUnaryCall(
          getChannel(), getCreateNoBalanceTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取随机HASH
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash queryRandNum(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash request) {
      return blockingUnaryCall(
          getChannel(), getQueryRandNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取是否达到fork高度
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64 getFork(one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey request) {
      return blockingUnaryCall(
          getChannel(), getGetForkMethod(), getCallOptions(), request);
    }

    /**
     */
    public one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx createNoBalanceTxs(one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs request) {
      return blockingUnaryCall(
          getChannel(), getCreateNoBalanceTxsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过seq以及title获取对应平行连的交易
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails getParaTxByTitle(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle request) {
      return blockingUnaryCall(
          getChannel(), getGetParaTxByTitleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取拥有此title交易的区块高度
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle loadParaTxByTitle(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle request) {
      return blockingUnaryCall(
          getChannel(), getLoadParaTxByTitleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过区块高度列表+title获取平行链交易
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails getParaTxByHeight(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight request) {
      return blockingUnaryCall(
          getChannel(), getGetParaTxByHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取区块头信息
     * </pre>
     */
    public one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers getHeaders(one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request) {
      return blockingUnaryCall(
          getChannel(), getGetHeadersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class turingchainFutureStub extends io.grpc.stub.AbstractFutureStub<turingchainFutureStub> {
    private turingchainFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected turingchainFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new turingchainFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * turingchain 对外提供服务的接口
     *区块链接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> getBlocks(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取最新的区块头
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header> getLastHeader(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLastHeaderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *交易接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> createRawTransaction(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRawTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> createRawTxGroup(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRawTxGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据哈希查询交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail> queryTransaction(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> sendTransaction(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过地址获取交易信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos> getTransactionByAddr(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionByAddrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过哈希数组获取对应的交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails> getTransactionByHashes(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionByHashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *缓存接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getMemPool(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMemPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *钱包接口
     *获取钱包账户信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts> getAccounts(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *根据账户lable信息获取账户地址
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> getAccount(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *创建钱包账户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> newAccount(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getNewAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取钱包的交易列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails> walletTransactionList(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList request) {
      return futureUnaryCall(
          getChannel().newCall(getWalletTransactionListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *导入钱包私钥
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> importPrivkey(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey request) {
      return futureUnaryCall(
          getChannel().newCall(getImportPrivkeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> sendToAddress(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress request) {
      return futureUnaryCall(
          getChannel().newCall(getSendToAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *设置交易手续费
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> setTxFee(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTxFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *设置标签
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount> setLabl(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel request) {
      return futureUnaryCall(
          getChannel().newCall(getSetLablMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *合并钱包余额
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes> mergeBalance(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance request) {
      return futureUnaryCall(
          getChannel().newCall(getMergeBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *设置钱包密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> setPasswd(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPasswdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *给钱包上锁
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> lock(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *给钱包解锁
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> unLock(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock request) {
      return futureUnaryCall(
          getChannel().newCall(getUnLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取最新的Mempool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList> getLastMemPool(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLastMemPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取最新的ProperFee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee> getProperFee(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProperFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取钱包状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus> getWalletStatus(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWalletStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *区块浏览器接口
     * /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview> getBlockOverview(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockOverviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview> getAddrOverview(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAddrOverviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> getBlockHash(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * seed
     * 创建seed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> genSeed(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang request) {
      return futureUnaryCall(
          getChannel().newCall(getGenSeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取seed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed> getSeed(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *保存seed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> saveSeed(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveSeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Balance Query
     *获取余额
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts> getBalance(
        one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> queryChain(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> execWallet(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request) {
      return futureUnaryCall(
          getChannel().newCall(getExecWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> queryConsensus(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryConsensusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx> createTransaction(
        one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取交易的十六进制编码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx> getHexTxByHash(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHexTxByHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 导出私钥
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString> dumpPrivkey(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString request) {
      return futureUnaryCall(
          getChannel().newCall(getDumpPrivkeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 导出全部私钥到文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> dumpPrivkeysFile(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request) {
      return futureUnaryCall(
          getChannel().newCall(getDumpPrivkeysFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 从文件中批量导入私钥
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> importPrivkeysFile(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile request) {
      return futureUnaryCall(
          getChannel().newCall(getImportPrivkeysFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取程序版本
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo> version(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *是否同步
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> isSync(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getIsSyncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取当前节点连接的其他节点信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.P2pService.PeerList> getPeerInfo(
        one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPeerInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取当前节点的网络信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo> netInfo(
        one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getNetInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ntpclock是否同步
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> isNtpClockSync(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getIsNtpClockSyncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取系统致命故障信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32> getFatalFailure(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFatalFailureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getLastBlockSequence(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLastBlockSequenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get add block's sequence by hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getSequenceByHash(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSequenceByHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过block hash 获取对应的blocks信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails> getBlockByHashes(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过block seq 获取对应的blocks hash 信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq> getBlockBySeq(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64 request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockBySeqMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *关闭turingchain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply> closeQueue(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseQueueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取地址所以合约下的余额
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance> getAllExecBalance(
        one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllExecBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *签名交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> signRawTx(
        one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx request) {
      return futureUnaryCall(
          getChannel().newCall(getSignRawTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> createNoBalanceTransaction(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNoBalanceTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取随机HASH
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash> queryRandNum(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryRandNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取是否达到fork高度
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64> getFork(
        one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey request) {
      return futureUnaryCall(
          getChannel().newCall(getGetForkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx> createNoBalanceTxs(
        one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNoBalanceTxsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过seq以及title获取对应平行连的交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getParaTxByTitle(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle request) {
      return futureUnaryCall(
          getChannel().newCall(getGetParaTxByTitleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取拥有此title交易的区块高度
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle> loadParaTxByTitle(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadParaTxByTitleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过区块高度列表+title获取平行链交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails> getParaTxByHeight(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight request) {
      return futureUnaryCall(
          getChannel().newCall(getGetParaTxByHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取区块头信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers> getHeaders(
        one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHeadersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BLOCKS = 0;
  private static final int METHODID_GET_LAST_HEADER = 1;
  private static final int METHODID_CREATE_RAW_TRANSACTION = 2;
  private static final int METHODID_CREATE_RAW_TX_GROUP = 3;
  private static final int METHODID_QUERY_TRANSACTION = 4;
  private static final int METHODID_SEND_TRANSACTION = 5;
  private static final int METHODID_GET_TRANSACTION_BY_ADDR = 6;
  private static final int METHODID_GET_TRANSACTION_BY_HASHES = 7;
  private static final int METHODID_GET_MEM_POOL = 8;
  private static final int METHODID_GET_ACCOUNTS = 9;
  private static final int METHODID_GET_ACCOUNT = 10;
  private static final int METHODID_NEW_ACCOUNT = 11;
  private static final int METHODID_WALLET_TRANSACTION_LIST = 12;
  private static final int METHODID_IMPORT_PRIVKEY = 13;
  private static final int METHODID_SEND_TO_ADDRESS = 14;
  private static final int METHODID_SET_TX_FEE = 15;
  private static final int METHODID_SET_LABL = 16;
  private static final int METHODID_MERGE_BALANCE = 17;
  private static final int METHODID_SET_PASSWD = 18;
  private static final int METHODID_LOCK = 19;
  private static final int METHODID_UN_LOCK = 20;
  private static final int METHODID_GET_LAST_MEM_POOL = 21;
  private static final int METHODID_GET_PROPER_FEE = 22;
  private static final int METHODID_GET_WALLET_STATUS = 23;
  private static final int METHODID_GET_BLOCK_OVERVIEW = 24;
  private static final int METHODID_GET_ADDR_OVERVIEW = 25;
  private static final int METHODID_GET_BLOCK_HASH = 26;
  private static final int METHODID_GEN_SEED = 27;
  private static final int METHODID_GET_SEED = 28;
  private static final int METHODID_SAVE_SEED = 29;
  private static final int METHODID_GET_BALANCE = 30;
  private static final int METHODID_QUERY_CHAIN = 31;
  private static final int METHODID_EXEC_WALLET = 32;
  private static final int METHODID_QUERY_CONSENSUS = 33;
  private static final int METHODID_CREATE_TRANSACTION = 34;
  private static final int METHODID_GET_HEX_TX_BY_HASH = 35;
  private static final int METHODID_DUMP_PRIVKEY = 36;
  private static final int METHODID_DUMP_PRIVKEYS_FILE = 37;
  private static final int METHODID_IMPORT_PRIVKEYS_FILE = 38;
  private static final int METHODID_VERSION = 39;
  private static final int METHODID_IS_SYNC = 40;
  private static final int METHODID_GET_PEER_INFO = 41;
  private static final int METHODID_NET_INFO = 42;
  private static final int METHODID_IS_NTP_CLOCK_SYNC = 43;
  private static final int METHODID_GET_FATAL_FAILURE = 44;
  private static final int METHODID_GET_LAST_BLOCK_SEQUENCE = 45;
  private static final int METHODID_GET_SEQUENCE_BY_HASH = 46;
  private static final int METHODID_GET_BLOCK_BY_HASHES = 47;
  private static final int METHODID_GET_BLOCK_BY_SEQ = 48;
  private static final int METHODID_CLOSE_QUEUE = 49;
  private static final int METHODID_GET_ALL_EXEC_BALANCE = 50;
  private static final int METHODID_SIGN_RAW_TX = 51;
  private static final int METHODID_CREATE_NO_BALANCE_TRANSACTION = 52;
  private static final int METHODID_QUERY_RAND_NUM = 53;
  private static final int METHODID_GET_FORK = 54;
  private static final int METHODID_CREATE_NO_BALANCE_TXS = 55;
  private static final int METHODID_GET_PARA_TX_BY_TITLE = 56;
  private static final int METHODID_LOAD_PARA_TX_BY_TITLE = 57;
  private static final int METHODID_GET_PARA_TX_BY_HEIGHT = 58;
  private static final int METHODID_GET_HEADERS = 59;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final turingchainImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(turingchainImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BLOCKS:
          serviceImpl.getBlocks((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_GET_LAST_HEADER:
          serviceImpl.getLastHeader((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Header>) responseObserver);
          break;
        case METHODID_CREATE_RAW_TRANSACTION:
          serviceImpl.createRawTransaction((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTx) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>) responseObserver);
          break;
        case METHODID_CREATE_RAW_TX_GROUP:
          serviceImpl.createRawTxGroup((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.CreateTransactionGroup) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>) responseObserver);
          break;
        case METHODID_QUERY_TRANSACTION:
          serviceImpl.queryTransaction((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetail>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.Transaction) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ADDR:
          serviceImpl.getTransactionByAddr((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxInfos>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_HASHES:
          serviceImpl.getTransactionByHashes((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.TransactionDetails>) responseObserver);
          break;
        case METHODID_GET_MEM_POOL:
          serviceImpl.getMemPool((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqGetMempool) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNTS:
          serviceImpl.getAccounts((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccounts>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqGetAccount) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>) responseObserver);
          break;
        case METHODID_NEW_ACCOUNT:
          serviceImpl.newAccount((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqNewAccount) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>) responseObserver);
          break;
        case METHODID_WALLET_TRANSACTION_LIST:
          serviceImpl.walletTransactionList((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletTransactionList) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletTxDetails>) responseObserver);
          break;
        case METHODID_IMPORT_PRIVKEY:
          serviceImpl.importPrivkey((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletImportPrivkey) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>) responseObserver);
          break;
        case METHODID_SEND_TO_ADDRESS:
          serviceImpl.sendToAddress((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSendToAddress) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>) responseObserver);
          break;
        case METHODID_SET_TX_FEE:
          serviceImpl.setTxFee((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetFee) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_SET_LABL:
          serviceImpl.setLabl((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetLabel) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletAccount>) responseObserver);
          break;
        case METHODID_MERGE_BALANCE:
          serviceImpl.mergeBalance((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletMergeBalance) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHashes>) responseObserver);
          break;
        case METHODID_SET_PASSWD:
          serviceImpl.setPasswd((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqWalletSetPasswd) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_LOCK:
          serviceImpl.lock((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_UN_LOCK:
          serviceImpl.unLock((one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletUnLock) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_GET_LAST_MEM_POOL:
          serviceImpl.getLastMemPool((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyTxList>) responseObserver);
          break;
        case METHODID_GET_PROPER_FEE:
          serviceImpl.getProperFee((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqProperFee) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReplyProperFee>) responseObserver);
          break;
        case METHODID_GET_WALLET_STATUS:
          serviceImpl.getWalletStatus((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.WalletStatus>) responseObserver);
          break;
        case METHODID_GET_BLOCK_OVERVIEW:
          serviceImpl.getBlockOverview((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockOverview>) responseObserver);
          break;
        case METHODID_GET_ADDR_OVERVIEW:
          serviceImpl.getAddrOverview((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.ReqAddr) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.AddrOverview>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HASH:
          serviceImpl.getBlockHash((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqInt) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>) responseObserver);
          break;
        case METHODID_GEN_SEED:
          serviceImpl.genSeed((one.turingchain.javasdk.model.protobuf.WalletProtobuf.GenSeedLang) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed>) responseObserver);
          break;
        case METHODID_GET_SEED:
          serviceImpl.getSeed((one.turingchain.javasdk.model.protobuf.WalletProtobuf.GetSeedByPw) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySeed>) responseObserver);
          break;
        case METHODID_SAVE_SEED:
          serviceImpl.saveSeed((one.turingchain.javasdk.model.protobuf.WalletProtobuf.SaveSeedByPw) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqBalance) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.AccountProtobuf.Accounts>) responseObserver);
          break;
        case METHODID_QUERY_CHAIN:
          serviceImpl.queryChain((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_EXEC_WALLET:
          serviceImpl.execWallet((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_QUERY_CONSENSUS:
          serviceImpl.queryConsensus((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ChainExecutor) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((one.turingchain.javasdk.model.protobuf.ExecuterProtobuf.CreateTxIn) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.UnsignTx>) responseObserver);
          break;
        case METHODID_GET_HEX_TX_BY_HASH:
          serviceImpl.getHexTxByHash((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.HexTx>) responseObserver);
          break;
        case METHODID_DUMP_PRIVKEY:
          serviceImpl.dumpPrivkey((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqString) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyString>) responseObserver);
          break;
        case METHODID_DUMP_PRIVKEYS_FILE:
          serviceImpl.dumpPrivkeysFile((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_IMPORT_PRIVKEYS_FILE:
          serviceImpl.importPrivkeysFile((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqPrivkeysFile) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_VERSION:
          serviceImpl.version((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.VersionInfo>) responseObserver);
          break;
        case METHODID_IS_SYNC:
          serviceImpl.isSync((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_GET_PEER_INFO:
          serviceImpl.getPeerInfo((one.turingchain.javasdk.model.protobuf.P2pService.P2PGetPeerReq) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.P2pService.PeerList>) responseObserver);
          break;
        case METHODID_NET_INFO:
          serviceImpl.netInfo((one.turingchain.javasdk.model.protobuf.P2pService.P2PGetNetInfoReq) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.P2pService.NodeNetInfo>) responseObserver);
          break;
        case METHODID_IS_NTP_CLOCK_SYNC:
          serviceImpl.isNtpClockSync((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_GET_FATAL_FAILURE:
          serviceImpl.getFatalFailure((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.Int32>) responseObserver);
          break;
        case METHODID_GET_LAST_BLOCK_SEQUENCE:
          serviceImpl.getLastBlockSequence((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>) responseObserver);
          break;
        case METHODID_GET_SEQUENCE_BY_HASH:
          serviceImpl.getSequenceByHash((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHash) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HASHES:
          serviceImpl.getBlockByHashes((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqHashes) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockDetails>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_SEQ:
          serviceImpl.getBlockBySeq((one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.BlockSeq>) responseObserver);
          break;
        case METHODID_CLOSE_QUEUE:
          serviceImpl.closeQueue((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqNil) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Reply>) responseObserver);
          break;
        case METHODID_GET_ALL_EXEC_BALANCE:
          serviceImpl.getAllExecBalance((one.turingchain.javasdk.model.protobuf.AccountProtobuf.ReqAllExecBalance) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.AccountProtobuf.AllExecBalance>) responseObserver);
          break;
        case METHODID_SIGN_RAW_TX:
          serviceImpl.signRawTx((one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReqSignRawTx) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>) responseObserver);
          break;
        case METHODID_CREATE_NO_BALANCE_TRANSACTION:
          serviceImpl.createNoBalanceTransaction((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTx) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>) responseObserver);
          break;
        case METHODID_QUERY_RAND_NUM:
          serviceImpl.queryRandNum((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqRandHash) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReplyHash>) responseObserver);
          break;
        case METHODID_GET_FORK:
          serviceImpl.getFork((one.turingchain.javasdk.model.protobuf.CommonProtobuf.ReqKey) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.CommonProtobuf.Int64>) responseObserver);
          break;
        case METHODID_CREATE_NO_BALANCE_TXS:
          serviceImpl.createNoBalanceTxs((one.turingchain.javasdk.model.protobuf.TransactionAllProtobuf.NoBalanceTxs) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.WalletProtobuf.ReplySignRawTx>) responseObserver);
          break;
        case METHODID_GET_PARA_TX_BY_TITLE:
          serviceImpl.getParaTxByTitle((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByTitle) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails>) responseObserver);
          break;
        case METHODID_LOAD_PARA_TX_BY_TITLE:
          serviceImpl.loadParaTxByTitle((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqHeightByTitle) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReplyHeightByTitle>) responseObserver);
          break;
        case METHODID_GET_PARA_TX_BY_HEIGHT:
          serviceImpl.getParaTxByHeight((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqParaTxByHeight) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ParaTxDetails>) responseObserver);
          break;
        case METHODID_GET_HEADERS:
          serviceImpl.getHeaders((one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.ReqBlocks) request,
              (io.grpc.stub.StreamObserver<one.turingchain.javasdk.model.protobuf.BlockchainProtobuf.Headers>) responseObserver);
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

  private static abstract class turingchainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    turingchainBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return one.turingchain.javasdk.model.protobuf.GrpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("turingchain");
    }
  }

  private static final class turingchainFileDescriptorSupplier
      extends turingchainBaseDescriptorSupplier {
    turingchainFileDescriptorSupplier() {}
  }

  private static final class turingchainMethodDescriptorSupplier
      extends turingchainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    turingchainMethodDescriptorSupplier(String methodName) {
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
      synchronized (turingchainGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new turingchainFileDescriptorSupplier())
              .addMethod(getGetBlocksMethod())
              .addMethod(getGetLastHeaderMethod())
              .addMethod(getCreateRawTransactionMethod())
              .addMethod(getCreateRawTxGroupMethod())
              .addMethod(getQueryTransactionMethod())
              .addMethod(getSendTransactionMethod())
              .addMethod(getGetTransactionByAddrMethod())
              .addMethod(getGetTransactionByHashesMethod())
              .addMethod(getGetMemPoolMethod())
              .addMethod(getGetAccountsMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getNewAccountMethod())
              .addMethod(getWalletTransactionListMethod())
              .addMethod(getImportPrivkeyMethod())
              .addMethod(getSendToAddressMethod())
              .addMethod(getSetTxFeeMethod())
              .addMethod(getSetLablMethod())
              .addMethod(getMergeBalanceMethod())
              .addMethod(getSetPasswdMethod())
              .addMethod(getLockMethod())
              .addMethod(getUnLockMethod())
              .addMethod(getGetLastMemPoolMethod())
              .addMethod(getGetProperFeeMethod())
              .addMethod(getGetWalletStatusMethod())
              .addMethod(getGetBlockOverviewMethod())
              .addMethod(getGetAddrOverviewMethod())
              .addMethod(getGetBlockHashMethod())
              .addMethod(getGenSeedMethod())
              .addMethod(getGetSeedMethod())
              .addMethod(getSaveSeedMethod())
              .addMethod(getGetBalanceMethod())
              .addMethod(getQueryChainMethod())
              .addMethod(getExecWalletMethod())
              .addMethod(getQueryConsensusMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getGetHexTxByHashMethod())
              .addMethod(getDumpPrivkeyMethod())
              .addMethod(getDumpPrivkeysFileMethod())
              .addMethod(getImportPrivkeysFileMethod())
              .addMethod(getVersionMethod())
              .addMethod(getIsSyncMethod())
              .addMethod(getGetPeerInfoMethod())
              .addMethod(getNetInfoMethod())
              .addMethod(getIsNtpClockSyncMethod())
              .addMethod(getGetFatalFailureMethod())
              .addMethod(getGetLastBlockSequenceMethod())
              .addMethod(getGetSequenceByHashMethod())
              .addMethod(getGetBlockByHashesMethod())
              .addMethod(getGetBlockBySeqMethod())
              .addMethod(getCloseQueueMethod())
              .addMethod(getGetAllExecBalanceMethod())
              .addMethod(getSignRawTxMethod())
              .addMethod(getCreateNoBalanceTransactionMethod())
              .addMethod(getQueryRandNumMethod())
              .addMethod(getGetForkMethod())
              .addMethod(getCreateNoBalanceTxsMethod())
              .addMethod(getGetParaTxByTitleMethod())
              .addMethod(getLoadParaTxByTitleMethod())
              .addMethod(getGetParaTxByHeightMethod())
              .addMethod(getGetHeadersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
