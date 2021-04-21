package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPtestServer {
	public void main() {
		// 1.서버에서 사용할 포트번호 지정
		// 0~65535
		int port = 9999;
		// 2.서버용 소켓객체생성
		ServerSocket serverSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		// 매개변수로 포트번호
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓 객체 생성 완료!!");

			// 3.클라이언트 접속요청대기
			System.out.println("클라이언트 접속 대기상태....");
			// 4.접속 요청이 오면 수락하고 해당 클라이언트에 대한 소켓객체생성
			Socket clinetSocket = serverSocket.accept();
			// 5.연결된 클라이언트와 입력 및 출력 스트림 생성(클라이언트용)
			OutputStream out = clinetSocket.getOutputStream();
			InputStream in = clinetSocket.getInputStream();
			// 6.보조스트림을 통한 성능개선
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			// clinet가 보낸 메시지를 수신하여 변수에 저장
			String clientMsg = dis.readUTF();
			System.out.println("받은 결과 " + clientMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 8.통신종료
			try {
				dos.close();
				dis.close();
				// 클라이언트에서 소켓 닫으니까 여기선 서버것만 닫아도됨
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
