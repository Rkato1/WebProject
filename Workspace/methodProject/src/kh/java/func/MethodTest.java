package kh.java.func;

import java.util.Scanner;

public class MethodTest {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("저는 MethodTest클래스의 main메소드입니다.");
		//동일 클래스 내의 다른 메소드 호출
		method1();
		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();
		method2(num);
		
		System.out.print("첫번쨰 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		method3(num1,num2);
		int tot = method5(num1,num2);
	}
	
	//인자가 0개인 메소드
	public void method1(){
		System.out.println("저는 method1() 입니다.");
	}
	
	//인자가 1개인 메소드
	public void method2(int i) {
		System.out.println("입력하신 정수는 " + i + "입니다.");
	}
	
	//인자가 2개인 메소드(같은 종류)
	public void method3(int i, int j) {
		System.out.println("첫번째 정수는 : "+ i);
		System.out.println("두번째 정수는 : "+ j);
	}
	
	//인자가 2개인 메소드(다른 종류)
	//넘기는 변수 순서는 인자 순서에 맞춰야함
	public void method4(String str, int i) {
		System.out.println("입력한 문자열을 : \""+str+"\"]");
		System.out.println("입력한 숫자는 : "+i);
	}

	//명시형의 차이(void도 return을 쓸수는 있음)
	//void가 아닌 경우 모두 return값이 존재해야함	
	int method5(int i, int j) {		
		return i+j;
	}
}