package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class TCPChatServer2 {
	HashMap<String, String> hashmap;
	
	public TCPChatServer2() {
		hashmap = new HashMap<String, String>();
		hashmap.put("www.naver.com", "210.89.160.88");
		hashmap.put("www.google.co.kr", "216.58.200.67");
		hashmap.put("www.iei.or.kr", "211.43.14.187");
		hashmap.put("www.nate.com", "120.50.131.112");
		hashmap.put("www.daum.net", "211.231.99.80");
	}
	public void main() {
		//1.��Ʈ��ȣ����
		int port = 5678;
		ServerSocket serverSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("[ä�ü��� ����]");
			while(true) {
				System.out.println("Ŭ���̾�Ʈ ���� ��� ��..");
				Socket clientSocket = serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
				InputStream in = clientSocket.getInputStream();
				OutputStream out = clientSocket.getOutputStream();
				dis = new DataInputStream(in);
				dos = new DataOutputStream(out);
				dos.writeUTF("�г����� �Է��ϼ���");
				String nickName = dis.readUTF();
				System.out.println("----- ä�� ���� -----");
				System.out.println("����� exit �Է�");
				while(true) {
					//�ð��� �׶��׶� �ٲ�
					Date serverDate = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					System.out.print("("+sdf.format(serverDate)+")[����] : ");
					//���� ��ȣ ä��
					String sendMsg = sc.nextLine();
					dos.writeUTF(sendMsg);
					dos.writeUTF(sdf.format(serverDate));
					if(sendMsg.equals("exit")) {
						break;
					}
					String recMsg = dis.readUTF();
					String clientDate = dis.readUTF();
					if(recMsg.equals("exit")) {
						break;
					}
					System.out.println("("+clientDate+")["+nickName+"] : "+checkDNS(recMsg));
					//���� ��ȣ ä��
					//System.out.println("("+clientDate+")["+nickName+"] : "+recMsg);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				dos.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public String now() {
		//������
		//return new SimpleDateFormat("(HH:mm:ss)").format(new Date());
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("(HH:mm:ss)");		
		return sdf.format(time);
	}
	
	public void main2() {
		int port = 5678;
		ServerSocket serverSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("[ä�ü��� ����]");
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��..");
			Socket clientSocket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			InputStream in = clientSocket.getInputStream();
			OutputStream out = clientSocket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			System.out.println("----- ä�� ���� -----");
			System.out.println("����� exit �Է�");
			while(true) {
				String recMsg = dis.readUTF();
				if(recMsg.equals("exit")) {
					break;
				}
				System.out.println("[Ŭ���̾�Ʈ] : "+checkDNS(recMsg));
				dos.writeUTF(recMsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				dis.close();
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
