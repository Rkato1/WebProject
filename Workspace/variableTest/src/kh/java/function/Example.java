package kh.java.function;

import java.util.Scanner;

public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int second = sc.nextInt();
		System.out.println("========== ��� ==========");
		System.out.printf("���ϱ� ��� : %d\n", first + second);
		System.out.printf("���� ��� : %d\n", first - second);
		System.out.printf("���ϱ� ��� : %d\n", first * second);
		System.out.printf("������ �� : %d\n", first / second);
		System.out.printf("������ ������ : %d\n", first % second);
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		double first = sc.nextDouble();
		System.out.print("���� ���� �Է� : ");
		double second = sc.nextDouble();
		System.out.println("========== ��� ==========");
		System.out.printf("���� : %f\n", first * second);
		System.out.printf("�ѷ� : %f\n", 2 * (first + second));
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����ܾ� �Է� : ");
		String str = sc.nextLine();
		System.out.printf("ù��° ���� : %c\n", str.charAt(0));
		System.out.printf("�ι�° ���� : %c\n", str.charAt(1));
		System.out.printf("����° ���� : %c\n", str.charAt(2));
		
	}
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0);
		System.out.printf("%c�� �����ڵ� �� : %d\n", ch, (int)ch);
	}
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		double first = sc.nextDouble();
		System.out.print("���� ���� �Է� : ");
		double second = sc.nextDouble();
		System.out.print("���� ���� �Է� : ");
		double third = sc.nextDouble();
		System.out.println("========== ��� ==========");
		System.out.printf("���� : %d\n", (int)(first + second + third));
		System.out.printf("��� : %d\n", (int)((first + second + third)/3));
		
	}
}
