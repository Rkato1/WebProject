package func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ImageStream {
	public void main() {
		//텍스트를 읽기 위한 보조스트림객체 
		BufferedReader br = null;
		//보조스트림 추가
		BufferedOutputStream bos = null;
		//파일 내보내기 위한 객체
		//FileOutputStream fos = null;
		try {
			//파일 읽기 위한 메인스트림 생성
			FileReader fr = new FileReader("quiz.txt");
			//속도를 위해 보조스트림 추가
			br = new BufferedReader(fr);
			//파일을 이미지 형태로 내보내기 위한 객체
			//fos = new FileOutputStream("img.gif");
			bos = new BufferedOutputStream(new FileOutputStream("img.gif"));
			//1줄짜리 파일이므로 한번만 수행
			String str = br.readLine();
			//공백 기준으로 문자열 컷
			StringTokenizer sT = new StringTokenizer(str, " ");
			ArrayList<Byte> al = new ArrayList<Byte>();
			//남아있다면(끝날떄까지)
			while(sT.hasMoreTokens()) {
				String no = sT.nextToken();
				//16진수 byte로 변환
				byte b = (byte)Integer.parseInt(no,16);
				al.add(b);
			}
			//파일내보내기
			for(Byte by : al) {
				bos.write(by);
				//원래 몇퍼센트 완성된지를 보여주고 싶었지만 뭔가 꼬임
				//System.out.println(((double)al.indexOf(by)/al.size())+"%완료");
				//fos.write(by);
			}
			System.out.println("완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bos.close();
				//fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
