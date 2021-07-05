package one.turingchain.javasdk.client;

import one.turingchain.javasdk.utils.StorageUtil;

public class StorageTest {
    public static void main(String[] args){

        RpcClient client = new RpcClient("124.71.230.239", 9671);

        // 存证内容
        String content = "=---------aaaaaaaaaaaaaa";
        // 构造存证交易发送
        String txEncode = StorageUtil.createOnlyNotaryStorage(content.getBytes(), "storage", "privatekey");
        String txHash = client.submitTransaction(txEncode);
        System.out.println(txHash);
    }
}
