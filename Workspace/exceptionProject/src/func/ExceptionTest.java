package func;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public void test() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("1번쨰 수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("2번쨰 수 입력 : ");
			int num2 = sc.nextInt();
			int result = num1/num2;
			System.out.println("결과 : "+result);
		}
		catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로는 못 나눕니다");
		}
		catch(Exception e){
			System.out.println("에러 발생 : "+e);
		}
	}
	
	public void menuPrint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.안녕하세요. 출력");
		System.out.println("2.반가워요. 출력");
		System.out.println("3.잘가요. 출력");
		System.out.print("선택 > ");
		try {
			print(sc.nextInt());
		}catch(Exception e){
			System.out.println("정수입력하세요\n"+e);
		}finally {
			System.out.println("무조건 오게되는 블록");
		}
	}
	
	public void print(int sel) {
		switch(sel) {
		case 1:
			System.out.println("안녕하세요.");
			break;
		case 2:
			System.out.println("반가워요.");
			break;
		case 3:
			System.out.println("잘가요.");
			break;
		default:
			System.out.println("1~3 중 선택해주세요.");
			break;
		}
	}
	
	public void test2() {
		try {
			FileReader fr = new FileReader("test.txt");
			//파일 존재시
			System.out.println("파일있음");			
		}
		//파일 없을때의 예외
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일없음");
		}
	}
	
	//class를 선언할떄 throws 키워드로 예외처리 가능 
	//예외명이 적힌 클래스를 뒤에 적어줌
	public void test3() throws FileNotFoundException{
		FileReader fr = new FileReader("test.txt");
	}
	
	public void test4() {
		//에러발생
		//test3();
		//사용할거면 try{} catch{}로 감싸줘야 사용함
		FileReader fr = null;
		try {
			fr = new FileReader("test.txt");
			System.out.println("파일있음");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일없음");
		} finally {
			try {
				//열면 닫아야함
				fr.close();
				System.out.println("파일닫힘");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void test5() {
		//try with resource
		try(FileReader fr = new FileReader("test.txt")){
			//이러면 close()코드 필요없음
			System.out.println("파일존재");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입출력에러");
		}
	}
}