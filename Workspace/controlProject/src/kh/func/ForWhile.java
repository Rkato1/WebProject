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
		
		//for
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		*/
		
		//while
		int i = 0;
		while(i<5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
	}
	
	public void test1() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ����Ͻðڽ��ϱ�?");
		int j = sc.nextInt();
		//for
		/*
		for(int i = 0; i < j; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		*/
		
		//while
		int i = 0;
		while(i<j) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);		
		int j = sc.nextInt();
		System.out.println(j + "�� �Դϴ�.");
		//for
		/*
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
		*/
		
		//while
		int i = 1;
		while(i<=9) {
			System.out.println(j + " * " + i + " = " + i*j);
			i++;
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		int j = sc.nextInt();
		System.out.println(j + "�� �Դϴ�.");
		
		//for
		/*
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
		*/
		
		//while
		int i = 1;
		while(i<=9) {
			System.out.println(j + " * " + i + " = " + i*j);
			i++;
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		//for
		/*
		for(int i = 0; i < 5; i++) {
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			int j = sc.nextInt();
			tot += j;
		}
		*/
		
		//while
		int k = 0;
		while(k<5) {
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			int j = sc.nextInt();
			tot += j;
			k++;
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
		//for
		/*
		for(int k = i; k <= j; k++) {
			tot += k;
		}
		*/
		
		//while
		
		int k = i;
		while(k<=j) {
			tot += k;
			k++;
		}
		System.out.printf("%d ~ %d�� ������ �� : %d", i, j, tot);
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int i = sc.nextInt();
		int tot = 0;
		//for
		/*
		for(int j = 1; j <= i; j++) {
			if(j%2==0) {
				tot += j;
			}
		}
		*/
		//do while
		int j = 1;	
			
		while(j<=i) {
			if(j%2==0) {
				tot += j;
			}
			j++;
		}
		System.out.printf("¦������ ���� : %d", tot);
	}
	
	public void whileTest() {
		int i = 0;
		while(i<5) {
			System.out.println("�ȳ��ϼ���");
			i++;
			if(i == 3) {
				break;
			}
		}
		
		do {
			System.out.println("�ȳ��ϼ��� 2Ʈ");
			i++;
		}
		while(i<5);
		//���ǹ��� �ڿ� �ֱ� ������ ���� �����̶� 1���� �� �ݺ���
	}
	
	public void forTest2() {
		//�� ��
		/*
		for(int i=2; i<=9; i++) {
			System.out.println(i+"��");
			for(int j=2; j<=9; j++) {
				System.out.print(i+"*" +j + "=" + i*j + " ");
			}
			System.out.println();
		}
		*/
		
		//�� �� ver2
		for(int i=1; i<=9; i++) {
			//System.out.println(i+"��");
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*" +i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	public void forTest3() {
		//�����1
		/*
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		*/
		
		//�����2
		/*
		for(int i=0; i<5; i++) {
			System.out.println("*");
		}
		*/
		
		//�����3
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//�����4
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		*/
		
		//�����5
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		*/
		
		//�����6
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(i+1+j);
			}
			System.out.println();
		}
		*/
		
		//�����7
		/*
		for(int j=4; j>=0; j--) {
			for(int i=0; i<5; i++) {
				System.out.print(i+1+j);
			}
			System.out.println();
		}
		*/
		
		//�����8
		/*
		int i, j, k;
		
		for(j=0; j<5; j++) {
			for(i=0; i<j+1; i++) {
				System.out.print("*");
			}
			for(k=4; k<5-i; k--) {
				System.out.print("");
			}
			System.out.println();
		}
		*/
		
		//�����9
		/*
		int i, j, k;
				
		for(j=0; j<5; j++) {
			for(i=0; i<5-j; i++) {
				System.out.print("*");
			}
			for(k=4; k<5-i; k--) {
				System.out.print("");
			}
			System.out.println();
		}
		*/
		
		//�����10
		/*
		int i, j, k;
		
		for(j=5; j>0; j--) {
			for(i=0; i<5-j; i++) {
				System.out.print(" ");
			}
			for(k=0; k<j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//�����11
		/*
		int i, j, k;
		
		for(j=5; j>0; j--) {
			for(i=0; i<j-1; i++) {
				System.out.print(" ");
			}
			for(k=0; k<6-j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//�����12
		/*
		int i, j, k;
		for(j=0; j<10; j++) {
			if(j <= 5) {
				for(i=1; i<j+1; i++) {
					System.out.print("*");
				}
				for(k=4; k<5-i; k--) {
					System.out.print(" ");
				}
			}
			else {
				for(i=4; i>j-6; i--) {
					System.out.print("*");
				}
				for(k=4; k<j-5; k--) {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		*/
		
		//����� 13
		/*
		int i, j, k;
		for(j=0; j<9; j++) {
			if(j <= 4) {
				for(i=10; i>j+5; i--) {
					System.out.print("*");
				}
				for(k=4; k<j-5; k--) {
					System.out.print(" ");
				}
			}
			else {
				for(i=1; i<j-2; i++) {
					System.out.print("*");
				}
				for(k=4; k<5-i; k--) {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		*/
		
		//�����14, �𷡽ð�
		/*
		int h, i, j, k, itemp = 0;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=0; i<h; i++) {
					System.out.print("*");
				}
				for(j=10; j > itemp; j--) {
					System.out.print(" ");
				}
				for(k=0; k<h; k++) {
					System.out.print("*");
				}
				itemp+=2;
			}
			else {
				for(i=4; i>h-4; i--) {
					System.out.print("*");
				}
				for(j=10; j > itemp-4; j--) {
					System.out.print(" ");
				}
				for(k=4; k>h-4; k--) {
					System.out.print("*");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//�����15 �ݸ𷡽ð�, �Ʒ�
		/*
		int h, i, j, k, itemp = 1;
		for(h=0; h<5; h++) {
			for(i=4; i>h; i--) {
				System.out.print(" ");
			}
			for(j=0; j < itemp; j++) {
				System.out.print("*");
			}
			for(k=4; k>h; k--) {
				System.out.print(" ");
			}
			itemp+=2;
			System.out.println();
		}
		*/
		
		//�����16 �ݸ𷡽ð�, ��
		/*
		int h, i, j, k, itemp = 9;
		for(h=0; h<5; h++) {
			for(i=5; i>5-h; i--) {
				System.out.print(" ");
			}
			for(j=0; j < itemp; j++) {
				System.out.print("*");
			}
			for(k=5; k>5-h; k--) {
				System.out.print(" ");
			}
			itemp-=2;
			System.out.println();
		}
		*/
		
		//�����17 �𷡽ð�
		/*
		int h, i, j, k, itemp = 1;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=4; i>h; i--) {
					System.out.print(" ");
				}
				for(j=0; j < itemp; j++) {
					System.out.print("*");
				}
				for(k=4; k>h; k--) {
					System.out.print(" ");
				}
				itemp+=2;
			}
			else {
				for(i=0; i<h-4; i++) {
					System.out.print(" ");
				}
				for(j=4; j < itemp; j++) {
					System.out.print("*");
				}
				for(k=0; k<h-4; k++) {
					System.out.print(" ");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//�����18 ���鸶����
		/*
		int h, i, j, k, itemp = 1;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=5; i>h; i--) {
					System.out.print("*");
				}
				for(j=1; j <= itemp; j++) {
					System.out.print(" ");
				}
				for(k=5; k>h; k--) {
					System.out.print("*");
				}
				itemp+=2;
			}
			else {
				for(i=0; i<h-3; i++) {
					System.out.print("*");
				}
				for(j=4; j < itemp; j++) {
					System.out.print(" ");
				}
				for(k=0; k<h-3; k++) {
					System.out.print("*");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//�𷡽ð�19 ����𷡽ð�
		/*
		int h, i, j, k, itemp = 9;
		for(h=0; h<10; h++) {
			if(h <= 4) {
				for(i=0; i<h; i++) {
					System.out.print("*");
				}
				for(j=itemp; j > 0; j--) {
					System.out.print(" ");
				}
				for(k=0; k<h; k++) {
					System.out.print("*");
				}
				itemp-=2;
			}
			else {
				for(i=5; i>h-5; i--) {
					System.out.print("*");
				}
				for(j=0; j <= itemp + 1; j++) {
					System.out.print(" ");
				}
				for(k=5; k>h-5; k--) {
					System.out.print("*");
				}
				itemp+=2;
			}
			System.out.println();
		}
		*/
		
		/*
		//�𷡽ð� 19, ����𷡽ð�
		int h, i, j, k, itemp = 1;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=0; i<h+1; i++) {
					System.out.print("*");
				}
				for(j=10; j > itemp; j--) {
					System.out.print(" ");
				}
				for(k=0; k<h+1; k++) {
					System.out.print("*");
				}
				itemp+=2;
			}
			else {
				for(i=4; i>h-5; i--) {
					System.out.print("*");
				}
				for(j=10; j > itemp-4; j--) {
					System.out.print(" ");
				}
				for(k=4; k>h-5; k--) {
					System.out.print("*");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//���ѹݺ� �����ڵ�
		//for��
		/*
		for(;;) {
			System.out.println("���ѹݺ�");
		}
		*/
		
		//while��
		/*
		while(true) {
			System.out.println("���ѹݺ�");
		}
		*/
		
		//�б���
		/*
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			System.out.print("���� �Է�(1�� �Է��ϸ� �׸������) : ");
			int j = sc.nextInt();
			if(j == 1) {
				System.out.println("1 �Է� break; ����");
				//Ż���ϴ� �б��� �ڵ�
				//�ݺ��� ����
				break;
			}
			else {
				System.out.println( j + " �Է� continue; ����");
				//��� �����ϰ� ����� �б��� �ڵ�
				//�ؿ� ���� �־ �ٷ� �ֻ������ �̵�
				//for���� ����ó������ �ٽ� ����
				//while���� �ֻ�ܺ��� �ٽ� ����
				//continue�����ڵ�� ������� ����
				continue;
			}
		}
		*/
	}
	
	public void forWhileTest4() {
		for(int i=0; i<=5; i++) {
			System.out.println(i + ".�ܺ� for��");
			for(int j=0; j<=5; j++) {
				if(i==3) {
					break;
				}
				System.out.println(j + ".���� for��");
			}
		}
	}	
}
