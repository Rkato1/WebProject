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
		//매개변수로 포트번호
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓 객체 생성 완료!!");

			//3.클라이언트 접속요청대기	
			System.out.println("클라이언트 접속 대기상태....");
			//4.접속 요청이 오면 수락하고 해당 클라이언트에 대한 소켓객체생성
			Socket clinetSocket = serverSocket.accept();
			//5.연결된 클라이언트와 입력 및 출력 스트림 생성(클라이언트용)
			OutputStream out = clinetSocket.getOutputStream();
			InputStream in = clinetSocket.getInputStream();
			//6.보조스트림을 통한 성능개선
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			//7.스트림을 통한 입력 및 출력
			//clinet에 메세지 전송
			dos.writeUTF("서버");
			//clinet가 보낸 메시지를 수신하여 변수에 저장
			String clientMsg = checkDNS(dis.readUTF());
			System.out.println("클라이언트 메세지 : "+clientMsg);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//8.통신종료
			try {
				dos.close();
				dis.close();
				//클라이언트에서 소켓 닫으니까 여기선 서버것만 닫아도됨
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
