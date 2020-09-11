package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UCPClientstrchk {
	public void main() {
		String serverIp = "1.220.236.74";
		int serverPort = 18080;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("채팅서버 접속 중...");
			socket = new Socket(serverIp, serverPort);
			System.out.println("[접속 완료]");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			while(true) {
				String recMsg = dis.readUTF();
				System.out.println(recMsg);
				if(recMsg.charAt(recMsg.length()-1)=='?') {
					String sendMsg = sc.nextLine();
					dos.writeUTF(sendMsg);
					if(sendMsg.equals("exit")) {
						break;
					}
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
