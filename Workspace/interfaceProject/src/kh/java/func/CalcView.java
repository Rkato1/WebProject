package kh.java.func;

import java.util.Scanner;

public class CalcView {
	public void main() {
		Scanner sc = new Scanner(System.in);
		Calc c = new Calcimpl();
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է�(+,-,*,/) : ");
		char oper = sc.next().charAt(0);
		
		switch(oper) {
		case '+':
			System.out.println("��� :" + c.sum(num1, num2));
			break;
		case '-':
			System.out.println("��� :" + c.sub(num1, num2));
			break;
		case '*':
			System.out.println("��� :" + c.mul(num1, num2));
			break;
		case '/':
			System.out.println("��� :" + c.div(num1, num2));
			break;
		}
	}
}
