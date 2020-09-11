package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TCPChatClient {
	public void main() {
		String serverIp = "127.0.0.1";
		int serverPort = 5678;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("ä�ü��� ���� ��...");
			socket = new Socket(serverIp, serverPort);
			System.out.println("[���� �Ϸ�]");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			String recMsg = dis.readUTF();
			System.out.println(recMsg);
			String nickName = sc.nextLine();
			dos.writeUTF(nickName);
			System.out.println("----- ä�� ���� -----");
			System.out.println("����� exit �Է�");
			while(true) {
				//�ð��� �׶��׋� �ٲ�
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				recMsg = dis.readUTF();
				String serverDate = dis.readUTF();
				if(recMsg.equals("exit")) {
					break;
				}
				System.out.println("("+serverDate+")���� > "+recMsg);
				Date clientDate = new Date();
				System.out.print("("+sdf.format(clientDate)+")�� > ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.writeUTF(sdf.format(clientDate));
				if(sendMsg.equals("exit")) {
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
	
	public void main2() {
		String serverIp = "127.0.0.1";
		int serverPort = 5678;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("ä�ü��� ���� ��...");
			socket = new Socket(serverIp, serverPort);
			System.out.println("[���� �Ϸ�]");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			System.out.println("----- ä�� ���� -----");
			System.out.println("����� exit �Է�");
			while(true) {				
				System.out.print("�� > ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if(sendMsg.equals("exit")) {
					break;
				}
				String recMsg = dis.readUTF();
				System.out.println("[����] : "+recMsg);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
