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

public class TCPNumBaseballGameClient {
	public void main() {
		String serverIp = "127.0.0.1";
		int serverPort = 5678;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("서버 접속 중...");
			socket = new Socket(serverIp, serverPort);
			System.out.println("[접속 완료]");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			System.out.println("<<<<< Baseball Game >>>>>");
			System.out.println("<<<<< Game Start >>>>>");
			while(true) {
				System.out.print("1번쨰 숫자 입력 : ");
				int num1 = sc.nextInt();
				dos.writeInt(num1);
				System.out.print("2번쨰 숫자 입력 : ");
				int num2 = sc.nextInt();
				dos.writeInt(num2);
				System.out.print("3번쨰 숫자 입력 : ");
				int num3 = sc.nextInt();
				dos.writeInt(num3);
				String sendMsg = dis.readUTF();				
				System.out.println(sendMsg+"\n");
				if(sendMsg.equals("게임 끝")) {
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
}
