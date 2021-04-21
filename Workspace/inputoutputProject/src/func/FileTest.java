package func;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public void fileTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		//파일이 존재하면
		if(file.exists()) {
			System.out.println("파일이름 : "+file.getName());
			System.out.println("해당 디렉토리 : "+file.getParent());
			System.out.println("파일 상대경로 : "+file.getPath());
			System.out.println("파일 절대경로 : "+file.getAbsolutePath());
			System.out.println("파일 크기 : "+file.length()+"Byte");
		}else {
			System.out.println("해당 파일이 존재하지 않습니다.");
		}
	}
}
