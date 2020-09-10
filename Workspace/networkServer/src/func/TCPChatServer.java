package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPChatServer {
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
				System.out.print("[����] : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if(sendMsg.equals("exit")) {
					break;
				}
				String recMsg = dis.readUTF();
				if(recMsg.equals("exit")) {
					break;
				}
				System.out.println("["+nickName+"] : "+recMsg);
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
				System.out.println("[Ŭ���̾�Ʈ] : "+recMsg);
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
}
