package kh.func;

import java.util.Scanner;

public class Func {
	public void oper1() {
		//���Կ�����(���� ���� ���� ������ �����Ѵ�)
		int num1 = 10;
		//10
		System.out.println(num1);
		//num1 = num1 + 10;
		num1 += 10;
		//20
		System.out.println(num1);
		//+=, -=, *=, /=(��), %=(������) ��� ����
		
		//���������
		//++a, --a ���������� ���� 1���� �� ������ ����
		//a++, a-- ���������� ���� ���� ���� �� 1����
		int a = 1;
		System.out.println("�⺻��" + a);
		System.out.println("���������� ��� : " + ++a);
		a = 1;
		System.out.println("���������� ��� : " + a++);
		
		//���迬����
		// <,	>,	<=,			>=,		 ==,  !=
		// �۴�, ũ��,	�۰ų� ����,	ũ�ų� ����, ����, ���� �ʴ�
		
		//��������
		//&&(or), ||(and), !(not)
		
		//��Ʈ��������
		//&(or) |(and)
		//^(xor) �� ��Ʈ�� ������ 0, �ٸ��� 1
		
		//shift������
		// <<(��Ʈ �����̵�), >>(��Ʈ �����̵�) ���� ����� �����0, ������1
		// >>>(��Ʈ�����̵�) ���� ����� ��� 0
		
		//3�׿�����
		// ? a:b, T�� a, F�� b
	}
	
	public void oper2() {
		int a = 10;
		int b = 10;
		int c;
		c = (a++) + (++b) + a;
		//���� java������ 32�� ������
		//c������ 31�� �����µ�
		//c�� �� ���� ���� �ϳ��� ����
		//java�� ���� ���� ����
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	
	public void oper3() {
		char a = 'a';//97
		//char b = (char)(a-32);//65 'A'
		char b = (char)(a^32);//65 'A'
		//xor������ ����ؼ� �빮�ڷ� ��ȯ
		//(char)(a-32) �ҹ��ڸ� �빮�ڷ�
		System.out.println(b);
	}
	
	public void oper4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι��� ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int result = num1<num2 ? num1 : num2;
		System.out.println("�� �� �� ���� ���� : " + result);
	}
	
	public void oper5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι��� �� �Է� : ");
		int num2 = sc.nextInt();
		System.out.println("�� ���� ���� �� : " + (num1 + num2));
		System.out.println("�� ���� �� �� : " + (num1 - num2));
		System.out.println("�� ���� ���� �� : " + (num1 * num2));
		System.out.printf("�� ���� ���� �� : %.2f", ((double)num1 / num2));
	}
	
	public void oper6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		//3�׿����� ó��
		String stemp = num1 > 19 ? "�����Դϴ�. �������" : "�̼����ڴ� ����Ұ��Դϴ�";
		System.out.println(stemp);
		//if�� ó��
		/*
		if(num1 > 19) {
			System.out.println("�����Դϴ�.�������");
		}
		else
		{
			System.out.println("�̼����ڴ� ����Ұ��Դϴ�");
		}
		*/
	}
	
	public void oper7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int num3 = sc.nextInt();
		
		int itemp = num1 + num2 + num3;
		double dtemp = (double)itemp / 3;
		System.out.println("�հ� : " + itemp);
		System.out.printf("��� : %.2f\n", dtemp);
		//3�׿����� ó��
		String stemp = (int)dtemp >= 60 ? "�հ�" : "���հ�";
		System.out.println(stemp);
		//if�� ó��
		/*
		if((int)dtemp >= 60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
		*/
	}
	
	public void oper8() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ���� �Է� : ");
		int num1 = sc.nextInt();
		//3�׿����� ó��
		String stemp = num1 % 2 == 1 ? "Ȧ��!": "¦��!";
		System.out.println(stemp);
		//if�� ó��
		if(num1 % 2 == 1) {
			System.out.println("Ȧ��!");
		}
		else {
			System.out.println("¦��!");
		}
	}
}

