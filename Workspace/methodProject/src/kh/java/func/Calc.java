package kh.java.func;

import java.util.Scanner;

public class Calc {
	public void main() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int iNum = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int iNum1 = sc.nextInt();
		
		//�����
		int result;
		double result2;
		System.out.print("������ �Է� : ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case '+':
			result = plus(iNum,iNum1);
			System.out.println(iNum+" "+ch+" "+iNum1+"="+result);
			break;
		case '-':
			result = minus(iNum,iNum1);
			System.out.println(iNum+" "+ch+" "+iNum1+"="+result);
			break;
		case '*':
			result = multiply(iNum,iNum1);
			System.out.println(iNum+" "+ch+" "+iNum1+"="+result);
			break;
		case '/':
			result2 = divide(iNum,iNum1);
			System.out.printf("%d %c %d = %.2f", iNum, ch, iNum1, result2);
			break;
		default:
			System.out.println("�߸��� ������");
			break;
		}
	}
	
	int plus(int i, int j) {
		return i+j;
	}
	int minus(int i, int j) {
		return i-j;
	}
	int multiply(int i, int j) {
		return i*j;
	}
	double divide(int i, int j) {
		double dtemp = (double)i;
		return dtemp/j;
	}
}
