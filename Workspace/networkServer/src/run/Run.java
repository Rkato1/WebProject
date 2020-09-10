package run;

import func.TCPChatServer;
import func.TCPServer;
//netstat -nao | findstr :7777
//cmd창에서 치면됨
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCPServer tcpServer = new TCPServer();
		//tcpServer.main();
		TCPChatServer tcpChatServer = new TCPChatServer();
		//tcpChatServer.main();
		tcpChatServer.main2();
	}

}
