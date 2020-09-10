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
		//1.포트번호지정
		int port = 5678;
		ServerSocket serverSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("[채팅서버 시작]");
			System.out.println("클라이언트 접속 대기 중..");
			Socket clientSocket = serverSocket.accept();
			System.out.println("클라이언트 접속 완료");
			InputStream in = clientSocket.getInputStream();
			OutputStream out = clientSocket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			dos.writeUTF("닉네임을 입력하세요");
			String nickName = dis.readUTF();
			System.out.println("----- 채팅 시작 -----");
			System.out.println("종료는 exit 입력");
			while(true) {
				System.out.print("[서버] : ");
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
			System.out.println("[채팅서버 시작]");
			System.out.println("클라이언트 접속 대기 중..");
			Socket clientSocket = serverSocket.accept();
			System.out.println("클라이언트 접속 완료");
			InputStream in = clientSocket.getInputStream();
			OutputStream out = clientSocket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			System.out.println("----- 채팅 시작 -----");
			System.out.println("종료는 exit 입력");
			while(true) {				
				String recMsg = dis.readUTF();
				if(recMsg.equals("exit")) {
					break;
				}
				System.out.println("[클라이언트] : "+recMsg);
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
