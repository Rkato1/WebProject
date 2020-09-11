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
		//1.포트번호지정
		int port = 5678;
		ServerSocket serverSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("[채팅서버 시작]");
			while(true) {
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
					//시간은 그때그때 바뀜
					Date serverDate = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					System.out.print("("+sdf.format(serverDate)+")[서버] : ");
					//기존 상호 채팅
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
					//기존 상호 채팅
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
		//한줄컷
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
				System.out.println("[클라이언트] : "+checkDNS(recMsg));
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
		return "입력한 값은 없습니다.";
	}
}
