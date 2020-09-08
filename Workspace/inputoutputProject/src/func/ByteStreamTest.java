package func;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
	
	//파일에 내용 적어서 내보내는 함수
	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		//파일 내보내는 클래스
		FileOutputStream fOut = null;
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.nextLine();
		
		try {
			//파일생성(이미 존재하는 경우 덮어쓰기)
			fOut = new FileOutputStream(fileName);
			System.out.println("["+ fileName+"] 파일에 저장할 내용 입력 : ");
			System.out.println("종료는 exit 입력");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				//windows 개행처리 문자 추가(파일에서 글씨 줄바꿈을 위해 추가)
				//글씨를 입력받아 쓰기
				String str = sc.nextLine()+"\r\n";
				//종료신호가 나왔다면
				if(str.equals("exit\r\n")) {
					break;
				}
				//내보낼 글씨를 저장할 배열(string to byte)
				byte arr[] = str.getBytes();
				//파일에 데이터를 내보내는 코드
				fOut.write(arr);
			}
		}
		//window권한에 따라 파일생성이 불가능한 경우
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//입출력 오류 발생시
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 : ");
		String fileName = sc.nextLine();
		DataOutputStream dos = null;
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos);
			System.out.println("["+fileName+"] 파일에 저장될 내용 입력 : ");
			System.out.println("종료는 exit 입력");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				//바로 내보낼수 있음
				dos.writeChars(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//보조스트림 close, 주스트림은 자동으로 close
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
