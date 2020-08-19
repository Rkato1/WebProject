package kh.func;

import java.util.Scanner;

public class Func {
	public void oper1() {
		//대입연산자(우측 값을 좌측 변수에 대입한다)
		int num1 = 10;
		//10
		System.out.println(num1);
		//num1 = num1 + 10;
		num1 += 10;
		//20
		System.out.println(num1);
		//+=, -=, *=, /=(몫), %=(나머지) 모두 같음
		
		//산술연산자
		//++a, --a 전위연산자 값을 1증감 후 연산을 진행
		//a++, a-- 후위연산자 값을 연산 진행 후 1증감
		int a = 1;
		System.out.println("기본값" + a);
		System.out.println("전위연산자 결과 : " + ++a);
		a = 1;
		System.out.println("후위연산자 결과 : " + a++);
		
		//관계연산자
		// <,	>,	<=,			>=,		 ==,  !=
		// 작다, 크다,	작거나 같다,	크거나 같다, 같다, 같지 않다
		
		//논리연산자
		//&&(or), ||(and), !(not)
		
		//비트논리연산자
		//&(or) |(and)
		//^(xor) 두 비트가 같으면 0, 다르면 1
		
		//shift연산자
		// <<(비트 좌측이동), >>(비트 우측이동) 좌측 빈공간 양수면0, 음수면1
		// >>>(비트우측이동) 좌측 빈공간 모두 0
		
		//3항연산자
		// ? a:b, T면 a, F면 b
	}
	
	public void oper2() {
		int a = 10;
		int b = 10;
		int c;
		c = (a++) + (++b) + a;
		//현재 java에서는 32가 나오고
		//c에서는 31이 나오는데
		//c는 한 줄을 연산 하나로 보고
		//java는 각각 보기 때문
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	
	public void oper3() {
		char a = 'a';//97
		//char b = (char)(a-32);//65 'A'
		char b = (char)(a^32);//65 'A'
		//xor연산을 사용해서 대문자로 변환
		//(char)(a-32) 소문자를 대문자로
		System.out.println(b);
	}
	
	public void oper4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1<num2 ? num1 : num2;
		System.out.println("두 수 중 작은 수는 : " + result);
	}
	
	public void oper5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("두 수를 더한 수 : " + (num1 + num2));
		System.out.println("두 수를 뺀 수 : " + (num1 - num2));
		System.out.println("두 수를 곱한 수 : " + (num1 * num2));
		System.out.printf("두 수를 나눈 수 : %.2f", ((double)num1 / num2));
	}
	
	public void oper6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int num1 = sc.nextInt();
		//3항연산자 처리
		String stemp = num1 > 19 ? "성인입니다. 어서오세요" : "미성년자는 입장불가입니다";
		System.out.println(stemp);
		//if문 처리
		/*
		if(num1 > 19) {
			System.out.println("성인입니다.어서오세요");
		}
		else
		{
			System.out.println("미성년자는 입장불가입니다");
		}
		*/
	}
	
	public void oper7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int num3 = sc.nextInt();
		
		int itemp = num1 + num2 + num3;
		double dtemp = (double)itemp / 3;
		System.out.println("합계 : " + itemp);
		System.out.printf("평균 : %.2f\n", dtemp);
		//3항연산자 처리
		String stemp = (int)dtemp >= 60 ? "합격" : "불합격";
		System.out.println(stemp);
		//if문 처리
		/*
		if((int)dtemp >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		*/
	}
	
	public void oper8() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" 정수 입력 : ");
		int num1 = sc.nextInt();
		//3항연산자 처리
		String stemp = num1 % 2 == 1 ? "홀수!": "짝수!";
		System.out.println(stemp);
		//if문 처리
		if(num1 % 2 == 1) {
			System.out.println("홀수!");
		}
		else {
			System.out.println("짝수!");
		}
	}
}

