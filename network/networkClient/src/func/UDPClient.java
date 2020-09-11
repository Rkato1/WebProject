package func;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public void main() {
		int port = 8888;
		DatagramSocket socket = null;
		DatagramPacket inPacket = null;
		DatagramPacket outPacket = null;
		byte inMsg[] = new byte[1024];
		String msg = "UDP Client";
		byte outMsg[] = msg.getBytes();
		try {
			//���񽺸� ��û�ϴ� ���� ��ü������ port��ȣ�� �Է����� ����
			socket = new DatagramSocket();
			InetAddress serverAddres = InetAddress.getByName("127.0.0.1");
			outPacket = new DatagramPacket(outMsg, outMsg.length,serverAddres,port);
			socket.send(outPacket);
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);
			String recMsg = new String(inMsg).trim();
			System.out.println("���� : "+recMsg);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			socket.close();
		}
	}
}
