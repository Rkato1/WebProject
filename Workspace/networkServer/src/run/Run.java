package run;

import func.ChattingServer;
import func.TCPChatServer;
import func.TCPChatServer2;
import func.TCPNumBaseballGameServer;
import func.TCPServer;
import func.TCPServerDNS;
import func.TCPtestServer;
import func.UDPServer;
//netstat -nao | findstr :7777
//cmd창에서 치면됨
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCPServer tcpServer = new TCPServer();
		tcpServer.main();
		TCPChatServer tcpChatServer = new TCPChatServer();
		//tcpChatServer.main();
		//tcpChatServer.main2();
		TCPChatServer2 tcpChatServer2 = new TCPChatServer2();
		//tcpChatServer2.main();
		//tcpChatServer2.main2();
		TCPServerDNS tcpServerDNS = new TCPServerDNS();
		//tcpServerDNS.main();
		UDPServer udpServer = new UDPServer();
		//udpServer.main();\
		TCPNumBaseballGameServer tcpNumBaseballGame = new TCPNumBaseballGameServer();
		//tcpNumBaseballGame.main();
		ChattingServer test = new ChattingServer();
		//test.chattingServer();
		
		TCPtestServer tcpMan = new TCPtestServer();
		//tcpMan.main();
	}

}
