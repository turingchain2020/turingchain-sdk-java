package one.turingchain.javasdk.performance;

import one.turingchain.javasdk.client.RpcClient;

public class RpcQPS {
	
    static String ip = "localhost";
    static RpcClient client = new RpcClient(ip, 9671);    
    
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Thread newThread = new Thread(new RpcRunner(String.valueOf(i), client));
			newThread.start();
		}
	}
}
