package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public void main() {
		//1.�������� ����� ��Ʈ��ȣ ����
		//0~65535
		int port = 7777;
		//2.������ ���ϰ�ü����
		ServerSocket serverSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		//�Ű������� ��Ʈ��ȣ
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("�������� ��ü ���� �Ϸ�!!");

			//3.Ŭ���̾�Ʈ ���ӿ�û���	
			System.out.println("Ŭ���̾�Ʈ ���� ������....");
			//4.���� ��û�� ���� �����ϰ� �ش� Ŭ���̾�Ʈ�� ���� ���ϰ�ü����
			Socket clinetSocket = serverSocket.accept();
			//5.����� Ŭ���̾�Ʈ�� �Է� �� ��� ��Ʈ�� ����(Ŭ���̾�Ʈ��)
			OutputStream out = clinetSocket.getOutputStream();
			InputStream in = clinetSocket.getInputStream();
			//6.������Ʈ���� ���� ���ɰ���
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			//7.��Ʈ���� ���� �Է� �� ���
			//clinet�� �޼��� ����
			dos.writeUTF("����");
			//clinet�� ���� �޽����� �����Ͽ� ������ ����
			String clientMsg = dis.readUTF();
			System.out.println("Ŭ���̾�Ʈ �޼��� : "+clientMsg);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//8.�������
			try {
				dos.close();
				dis.close();
				//Ŭ���̾�Ʈ���� ���� �����ϱ� ���⼱ �����͸� �ݾƵ���
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}		
	}	
}
