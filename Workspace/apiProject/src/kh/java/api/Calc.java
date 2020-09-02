package kh.java.api;

import java.util.Scanner;

public class Calc {

	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		String num1 = sc.next();
		System.out.print("두번째 정수 입력 : ");
		String num2 = sc.next();
		System.out.print("연산자 입력(+,-,*,/) : ");
		String oper = sc.next();
		Integer i = Integer.valueOf(num1);
		Integer i1 = Integer.valueOf(num2);
		Double d = Double.valueOf(num1);
		switch(oper) {
		case "+":
			System.out.println(num1+oper+num2+"="+(i.intValue()+i1.intValue()));
			break;
		case "-":
			System.out.println(num1+oper+num2+"="+(i.intValue()-i1.intValue()));
			break;
		case "*":
			System.out.println(num1+oper+num2+"="+i.intValue()*i1.intValue());
			break;
		case "/":
			System.out.println(num1+oper+num2+"="+d.doubleValue()/i1.intValue());
			break;
		default:
			System.out.println("잘못된 연산자 입력");
			break;
		}
	}
}
