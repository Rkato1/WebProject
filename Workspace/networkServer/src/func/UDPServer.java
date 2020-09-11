package func;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	
	//�ӵ� �߽� byte
	public void main() {
		//1.�������� ����� ��Ʈ��ȣ ����
		int port = 8888;
		//2.DatagramSocket ��ü����
		DatagramSocket socket = null;
		//Data �ޱ� ���� ��Ŷ��ü
		DatagramPacket inPacket = null;
		//Data ������ ���� ��Ŷ��ü
		DatagramPacket outPacket = null;
		//������ �޽��� �������
		byte inMsg[] = new byte[1024];
		String msg = "UDP Server";
		//������ �޽��� �������
		byte outMsg[] = msg.getBytes();
		try {
			//UDP���ϻ���(port listen)
			socket = new DatagramSocket(port);
			System.out.println("���� ���� ���� �Ϸ�");
			//(����Ʈ �迭, ����)
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			//Ŭ���̾�Ʈ �޼����� �ޱ����� ��ٸ�
			socket.receive(inPacket);
			//byte�迭�� String���� ��ȯ
			//�ڿ� ������� �ʴ� ���� �ڸ��� �޼ҵ� , trim()
			String clientMsg = new String(inMsg).trim();
			System.out.println(clientMsg);
			//3.������ Ŭ���̾�Ʈ IP�ּҸ� ���� InetAddress��ü ����
			//Ŭ���̾�Ʈ ip �� ��Ʈ ����
			InetAddress clientIp = inPacket.getAddress();
			int clientPort = inPacket.getPort();
			//5.������ �޽����� DatagramPacket��ü�� ����
			outPacket = new DatagramPacket(outMsg, outMsg.length, clientIp, clientPort);
			//6.������ �̿��Ͽ� ����
			socket.send(outPacket);			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//7.��������
			socket.close();
		}
	}
}
