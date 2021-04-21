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
		//1.서버 아이피주소 및 포트번호 지정
		//현재는 자기 자신을 호출하므로 localhost
		String serverIp = "127.0.0.1";
		//서버가 응답을 기다리는 포트번호
		int serverPort = 7777;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;		
		
		try {
			//2.Socket 객체를 생성하면서 서버에 요청
			socket = new Socket(serverIp, serverPort);
			//3.서버와의 입출력 스트림생성
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//4.보조스트림을 통한 성능개선
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			//5.스트림을 통한 입력 및 출력 
			String serverMsg = dis.readUTF();
			dos.writeUTF("클라이언트");
			System.out.println("서버 메세지 : "+serverMsg);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6.통신 종료
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
