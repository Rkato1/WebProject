package kh.func;
import java.util.Scanner;

public class IfSwitch {
	
	public void ifTest() {
		//Ű����� ���� �Է¹ޱ� ���� ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10�� �Է��غ����� : ");
		int inum = sc.nextInt();
		//���� �Է� ���� ���� 10�� ���
		if(inum == 10) {
			System.out.print("�Է��� ���� 10");
		}
		else
		{
			System.out.print("�Է��� ���� 10�� �ƴ� " + inum);
		}
	}
	
	public void test() {
		System.out.print("========= ���� ���� ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������  �Է� �ϼ��� : ");
		int inum = sc.nextInt();
		
		if(inum > 0) {
			System.out.println("����� �Է��� �� " + inum + "��(��) ����Դϴ�.");
		}
		//else if(inum == 0) {
		if(inum == 0) {
			System.out.println("����� �Է��� �� " + inum + "��(��) 0�Դϴ�.");
		}
		//else {
		if(inum < 0) {
			System.out.println("����� �Է��� �� " + inum + "��(��) �����Դϴ�.");
		}
	}
	
	public void test1() {
		System.out.print("========= �μ� �� ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������  �Է� �ϼ��� : ");
		int inum = sc.nextInt();
		System.out.print("�ι�° ������  �Է� �ϼ��� : ");
		int inum1 = sc.nextInt();
		
		if(inum > inum1) {
			System.out.println(inum + ">" + inum1);
			System.out.println("ù��° ���� �� Ů�ϴ�.");
		}
		if(inum == inum1) {
			System.out.println(inum + "=" + inum1);
			System.out.println("�� ���� �����ϴ�.");
		}
		if(inum < inum1) {
			System.out.println(inum + "<" + inum1);
			System.out.println("�ι�° ���� �� Ů�ϴ�.");
		}
	}
	
	public void test2() {
		System.out.print("========= �μ� �� ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ڸ�  �Է� �ϼ���(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		System.out.print("ù��° ������  �Է� �ϼ��� : ");
		int inum = sc.nextInt();
		System.out.print("�ι�° ������  �Է� �ϼ��� : ");
		int inum1 = sc.nextInt();
		
		if(ch == '+') {
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum + inum1);
			//System.out.println(inum + "+" + inum1 + "=" + (inum + inum1));
		}
		if(ch == '-') {
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum - inum1);
			//System.out.println(inum + "-" + inum1 + "=" + (inum - inum1));
		}
		if(ch == '*') {
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum * inum1);
			//System.out.println(inum + "*" + inum1 + "=" + (inum * inum1));
		}
		if(ch == '/') {
			System.out.printf("%d%c%d=%.6f", inum, ch, inum1, (double)inum / inum1);
			//System.out.println(inum + "/" + inum1 + "=" + ((double)inum / inum1));
		}
		
		/*
		sc.nextLine();
		String stemp = sc.nextLine();
		if(stemp.equals("abcd")) {
			System.out.println("abcd");
		}
		else {
			System.out.println("not abcd");
		}
		*/
	}
	
	public void test3() {
		System.out.print("========= ���̰��� ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ͻ� �� �ο��� ����Դϱ�? : ");
		int inum = sc.nextInt();
		System.out.print("��� ����Դϱ�?(1�δ� 15000��) : ");
		int inum1 = sc.nextInt();
		System.out.print("���̴� ����Դϱ�?(1�δ� 5000��) : ");
		int inum2 = sc.nextInt();
		
		if(inum == inum1 + inum2) {
			System.out.println("�����Ͻ� �� �ݾ��� " + (inum1*15000 + inum2*5000) + "�� �Դϴ�.");
		}
		else {
			System.out.println("�ο����� ���� �ʽ��ϴ�.");
		}
	}
	
	public void test4() {
		int itemp = 0;
		//���ᰳ�� �������� ����
		
		System.out.print("========= ���� ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����\n");
		System.out.print("����� ����� �����ϱ��(1.apple,2.��Ƽ�� �⽺)?");
		int inum = sc.nextInt();
		if(inum == 1) {
			System.out.println("����!!!");
			itemp++;
		}
		else {
			System.out.println("��!!");
		}
		
		System.out.print("�ι�° ����\n");
		System.out.print("�ٳ����� ��� ������ ���� ������(1.���,2.����)?");
		int inum1 = sc.nextInt();
		if(inum1 == 2) {
			System.out.println("����!!!");
			itemp++;
			System.out.printf("�� %d������ ������ϴ�.", itemp);
		}
		else {
			System.out.println("��!!");
			System.out.printf("�� %d������ ������ϴ�.", itemp);
		}
	}
	
	public void test5() {
		System.out.print("========= �ɸ��׽�Ʈ =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� �����Ͻʴϱ�(1.yes,2.no)?");		
		int inum = sc.nextInt();
		if(inum == 1) {
			System.out.print("����� ��踦 �ǿ�ϱ�(1.yes,2.no)?");		
			int inum1 = sc.nextInt();
			if(inum1 == 1) {
				System.out.println("���� �ǰ��� ���� �ʽ��ϴ�.");
			}
			else if(inum1 == 2) {
				System.out.println("���� ���� ���� �ʽ��ϴ�.");
			}
			else {
				System.out.println("�߸��� ����");
			}
		}
		else if(inum ==2) {
			System.out.print("����� �̼�ģ���� �ֽ��ϱ�(1.yes,2.no)?");		
			int inum1 = sc.nextInt();
			if(inum1 == 1) {
				System.out.println("��..��");
			}
			else if(inum1 == 2) {
				System.out.println("������ �Ф�");
			}
			else {
				System.out.println("�߸��� ����");
			}
		}
		else {
			System.out.println("�߸��� ����");
		}	
	}
	
	public void test6() {
		System.out.print("========= ��/�ҹ��� ��ȯ ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");		
		char ch = sc.next().charAt(0);
		if(ch >= 65 && ch < 91) {
		//if(ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮�ڸ� �Է� �Ͽ����ϴ�.");
			System.out.println("�ҹ��ڷ� ��ȯ : " + (char)(ch + 32));
			//System.out.println("�ҹ��ڷ� ��ȯ : " + (char)(ch ^ 32));
			//xor����
		}
		else if(ch >= 97 && ch < 123) {
		//else if(ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ��ڸ� �Է� �Ͽ����ϴ�.");
			System.out.println("�빮�ڷ� ��ȯ : " + (char)(ch - 32));
			//System.out.println("�빮�ڷ� ��ȯ : " + (char)(ch ^ 32));
			//xor����
		}
		else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �����ڸ� �Է����ּ���");
		}
	}
	
	public void test7() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int inum = sc.nextInt();
		System.out.print("===== �� ��=====\n");
		if(inum == 0) {
			System.out.printf("[%d]��(��) 3�� ����� 4�� ����� �ƴմϴ�.", inum);
		}
		else {
			if((inum % 3 == 0) && (inum % 4 == 0)) {
				System.out.printf("[%d]��(��) 3�� ����鼭 4�� ����Դϴ�.", inum);
			}
			else if(inum % 3 == 0) {
				System.out.printf("[%d]��(��) 3�� ����Դϴ�.", inum);
			}
			else if(inum % 4 == 0) {
				System.out.printf("[%d]��(��) 4�� ����Դϴ�.", inum);
			}
			else {
				System.out.printf("[%d]��(��) 3�� ����� 4�� ����� �ƴմϴ�.", inum);
			}
		}
	}
	
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 ������ ������ �Է��ϼ��� : ");
		int inum = sc.nextInt();
		
		switch(inum) {
		case 1:
			System.out.print("1�� �Է��߽��ϴ�.");
			break;
		case 2:
			System.out.print("2�� �Է��߽��ϴ�.");
			break;
		case 3:
			System.out.print("3�� �Է��߽��ϴ�.");
			break;
		default:
			System.out.print("�߸��Է��߽��ϴ�.");
			break;
		}
	}
	
	public void test9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϼ��� �˰���� ���� �Է��ϼ��� : ");
		int inum = sc.nextInt();
		
		//break�� �Ϻη� ���༭ ��µǰ� ����� ���
		switch(inum) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(inum + "������ 29�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(inum + "������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		/*
		case 1:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(inum + "������ 29�ϱ��� �ֽ��ϴ�.");
			break;
		case 3:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:
			System.out.println(inum + "������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 5:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 6:
			System.out.println(inum + "������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 7:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 8:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 9:
			System.out.println(inum + "������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 10:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 11:
			System.out.println(inum + "������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 12:
			System.out.println(inum + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
			*/
		}
	}
	
	public void test10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���б� ���� �ý����Դϴ�.\n������ �Է��ϼ���(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A':
			System.out.println("�����ϼ̽��ϴ�. ���б��� 100%�����ص帮�ڽ��ϴ�.");
			break;
		case 'B':
			System.out.println("�ƽ�����. ���б��� 50%�����ص帮�ڽ��ϴ�.");
			break;
		case 'C':
			System.out.println("���б��� �ٶ�ø� ���� ������ ���ּ���.");
			break;
		case 'D':
			System.out.println("ũ��.......");
			break;
		case 'F':
			System.out.println("�л����Դϴ�!!!");
			break;
		}
	}
	
	public void test11() {
		System.out.print("========= �μ� �� ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ڸ�  �Է� �ϼ���(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		System.out.print("ù��° ������  �Է� �ϼ��� : ");
		int inum = sc.nextInt();
		System.out.print("�ι�° ������  �Է� �ϼ��� : ");
		int inum1 = sc.nextInt();
		
		switch(ch) {
		case '+':
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum + inum1);
			break;
		case '-':
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum - inum1);
			break;
		case '*':
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum * inum1);
			break;
		case '/':
			System.out.printf("%d%c%d=%f", inum, ch, inum1, (double)inum / inum1);
			break;
		}		
	}
	
	public void test12() {
		System.out.print("========= �μ� �� ���α׷� =========\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		int inum = sc.nextInt();
		
		switch(inum/10) {
		case 9:
			System.out.println(inum + "�� ==> A ���");
			break;
		case 8:
			System.out.println(inum + "�� ==> B ���");
			break;
		case 7:
			System.out.println(inum + "�� ==> C ���");
			break;
		case 6:
			System.out.println(inum + "�� ==> D ���");
			break;
		default:
			if(inum < 0 || inum > 100) {
				System.out.println("�߸��� �Է�(0~100���� �Է�)");
			}
			else {
				System.out.println(inum + "�� ==> F ���");	
			}
			break;
		}
		
	}
}
