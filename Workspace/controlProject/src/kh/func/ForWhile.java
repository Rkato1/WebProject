package kh.func;

import java.util.Scanner;

public class ForWhile {
	public void forTest() {
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.println("hi");
		}
		
		for(int i=5; i>=0; i--) {
			System.out.println("Hello");
		}
		*/
		for(int i = 0; i<100; i++) {
			System.out.println(i+1);
		}
	}
	
	public void test() {
		for(int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	
	public void test1() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ����Ͻðڽ��ϱ�?");
		int j = sc.nextInt();
		for(int i = 0; i < j; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);		
		int j = sc.nextInt();
		System.out.println(j + "�� �Դϴ�.");
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		int j = sc.nextInt();
		System.out.println(j + "�� �Դϴ�.");
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			int j = sc.nextInt();
			tot += j;
		}
		System.out.println("�Է��� 5���� ������ �� : " + tot);
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int i = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int j = sc.nextInt();
		int tot = 0;
		for(int k = i; k <= j; k++) {
			tot += k;
		}
		System.out.printf("%d ~ %d�� ������ �� : %d", i, j, tot);
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int i = sc.nextInt();
		int tot = 0;
		for(int j = 1; j <= i; j++) {
			if(j%2==0) {
				tot += j;
			}
		}
		System.out.printf("¦������ ���� : %d", tot);
	}
}
