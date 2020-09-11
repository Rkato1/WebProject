package func;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	
	//속도 중시 byte
	public void main() {
		//1.서버에서 사용할 포트번호 지정
		int port = 8888;
		//2.DatagramSocket 객체생성
		DatagramSocket socket = null;
		//Data 받기 위한 패킷객체
		DatagramPacket inPacket = null;
		//Data 보내기 위한 패킷객체
		DatagramPacket outPacket = null;
		//들어오는 메시지 저장공간
		byte inMsg[] = new byte[1024];
		String msg = "UDP Server";
		//나가는 메시지 저장공간
		byte outMsg[] = msg.getBytes();
		try {
			//UDP소켓생성(port listen)
			socket = new DatagramSocket(port);
			System.out.println("서버 소켓 생성 완료");
			//(바이트 배열, 길이)
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			//클라이언트 메세지를 받기위해 기다림
			socket.receive(inPacket);
			//byte배열을 String으로 변환
			//뒤에 사용하지 않는 공간 자르는 메소드 , trim()
			String clientMsg = new String(inMsg).trim();
			System.out.println(clientMsg);
			//3.연결할 클라이언트 IP주소를 가진 InetAddress객체 생성
			//클라이언트 ip 및 포트 추출
			InetAddress clientIp = inPacket.getAddress();
			int clientPort = inPacket.getPort();
			//5.전송할 메시지를 DatagramPacket객체에 저장
			outPacket = new DatagramPacket(outMsg, outMsg.length, clientIp, clientPort);
			//6.소켓을 이용하여 전송
			socket.send(outPacket);			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//7.소켓종료
			socket.close();
		}
	}
}
