package run;

import func.TCPChatClient;
import func.TCPClient;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCPClient tcpClient = new TCPClient();
		//tcpClient.main();
		TCPChatClient tcpChatClient = new TCPChatClient();
		//tcpChatClient.main();
		tcpChatClient.main2();
	}

}
