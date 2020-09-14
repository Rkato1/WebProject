package run;

import func.ChattingClient;
import func.TCPChatClient;
import func.TCPClient;
import func.TCPClient2;
import func.TCPNumBaseballGameClient;
import func.UCPClientstrchk;
import func.UDPClient;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCPClient tcpClient = new TCPClient();
		//tcpClient.main();
		TCPChatClient tcpChatClient = new TCPChatClient();
		//tcpChatClient.main();
		//tcpChatClient.main2();
		TCPClient2 tcpClient2 = new TCPClient2();
		//tcpClient2.main();		
		UDPClient udpClient = new UDPClient();
		//udpClient.main();
		UCPClientstrchk test = new UCPClientstrchk();
		//test.main();
		TCPNumBaseballGameClient tcpNumBaseballGameClient = new TCPNumBaseballGameClient();
		//tcpNumBaseballGameClient.main();
		ChattingClient tests = new ChattingClient();
		tests.chattingClient();
	}

}
