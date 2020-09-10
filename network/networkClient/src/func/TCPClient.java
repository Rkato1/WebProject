package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public void main() {
		//1.���� �������ּ� �� ��Ʈ��ȣ ����
		//����� �ڱ� �ڽ��� ȣ���ϹǷ� localhost
		String serverIp = "127.0.0.1";
		//������ ������ ��ٸ��� ��Ʈ��ȣ
		int serverPort = 7777;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;		
		
		try {
			//2.Socket ��ü�� �����ϸ鼭 ������ ��û
			socket = new Socket(serverIp, serverPort);
			//3.�������� ����� ��Ʈ������
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//4.������Ʈ���� ���� ���ɰ���
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			//5.��Ʈ���� ���� �Է� �� ��� 
			String serverMsg = dis.readUTF();
			dos.writeUTF("Ŭ���̾�Ʈ");
			System.out.println("���� �޼��� : "+serverMsg);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6.��� ����
			try {
				dis.close();
				dos.close();				
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}	
}
