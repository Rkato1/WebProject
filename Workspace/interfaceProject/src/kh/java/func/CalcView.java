package kh.java.func;

import java.util.Scanner;

public class CalcView {
	public void main() {
		Scanner sc = new Scanner(System.in);
		Calc c = new Calcimpl();
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/) : ");
		char oper = sc.next().charAt(0);
		
		switch(oper) {
		case '+':
			System.out.println("결과 :" + c.sum(num1, num2));
			break;
		case '-':
			System.out.println("결과 :" + c.sub(num1, num2));
			break;
		case '*':
			System.out.println("결과 :" + c.mul(num1, num2));
			break;
		case '/':
			System.out.println("결과 :" + c.div(num1, num2));
			break;
		}
	}
}
