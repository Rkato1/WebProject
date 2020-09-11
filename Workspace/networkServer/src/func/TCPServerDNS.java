package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class TCPServerDNS {
	HashMap<String, String> hashmap;
	
	public TCPServerDNS() {
		hashmap = new HashMap<String, String>();
		hashmap.put("www.naver.com", "210.89.160.88");
		hashmap.put("www.google.co.kr", "216.58.200.67");
		hashmap.put("www.iei.or.kr", "211.43.14.187");
		hashmap.put("www.nate.com", "120.50.131.112");
		hashmap.put("www.daum.net", "211.231.99.80");
	}
	
	public void main() {
		int port = 5678;
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
			String clientMsg = checkDNS(dis.readUTF());
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

	private String checkDNS(String readUTF) {
		// TODO Auto-generated method stub
		for(String str : hashmap.keySet()) {
			if(str.equals(readUTF)) {
				return hashmap.get(str);
			}
		}
		return "�Է��� ���� �����ϴ�.";
	}
}
