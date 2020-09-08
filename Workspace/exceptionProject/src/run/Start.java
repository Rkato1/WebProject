package run;

import java.io.FileNotFoundException;

import func.ExceptionTest;

public class Start {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ExceptionTest et = new ExceptionTest();
		//클래스내에서 try catch처리 해서 바로 사용가능
		et.test2();
		try {
			//반대로 클래스를 throws로 처리하면
			//try catch를 무조건 한번은 거쳐야함
			et.test3();
			System.out.println("파일있음");
		}catch(FileNotFoundException e) {
			System.out.println("파일없음");
		}
	}

}
