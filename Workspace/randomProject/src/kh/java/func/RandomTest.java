package kh.java.func;

import java.util.Random;
import java.util.Scanner;

//���� - ������ �� Random
//������ �� �Ǵ� �������� ��������� �� �� ���� ��

public class RandomTest {
	public void randomTest1() {
		//���� ��� �غ�
		Random r = new Random();
		
		for(int i=0; i<5; i++) {
			//int ���� ���� ���� �� ������ ���� ������ ������ ���� 
			//int ranNum = r.nextInt();
			//���� ����(0~9)
			int ranNum = r.nextInt(10);
			//1���� 10������ ������ ������ ������ ����
			int ranNum1 = r.nextInt(10) + 1;
			//20~35
			int ranNum2 = r.nextInt(16) + 20;
		
			//System.out.println(i+1 + "��° ������ " + ranNum);
			System.out.println(i+1 + "��° ������ " + ranNum1);
		}
	}
	
	public void randomTest2() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== ���� �� �� ���߱� ===");
		System.out.print("���ڸ� �Է����ּ���(1.�ո� / 2.�޸�) : ");
		int inum = sc.nextInt();
		int ranNum = r.nextInt(2) + 1;
		
		if(ranNum == inum) {
			System.out.println("\n������ϴ�^^");
		}
		else{
			System.out.println("\n��!Ʋ�Ƚ��ϴ�!");
		}
	}
	
	public void stringTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڿ� �Է� : ");
		String str = sc.next();
		System.out.print("�ι�° ���ڿ� �Է� : ");
		String str1 = sc.next();
		
		//���ڿ��� �񱳴� ��찡 ���� �ٸ�
		//if(str == str1) {
		//equals �޼ҵ带 ����ؾ� ���ٰ� �� ����
		if(str.equals(str1)) {
			System.out.println("���ڿ��� ����!");
		}
		else {
			System.out.println("���ڿ��� �ٸ���!");
		}
	}
	
	public void randomTest3() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== ���� ���� �� ���� ===");
		System.out.print("���ڸ� �����ϼ���(1.���� / 2.���� / 3.��) : ");
		int inum = sc.nextInt();
		int ranNum = r.nextInt(3) + 1;
		String str1 = "";
		String str2 = "";
		char c = ' ';
		
		
		//�¸�����
		//inum - ranNum�� -2�� 1�̸� �̱�
		//�ݴ��  -1�̳� 2�� ��ǻ�Ͱ� �̱�
		
		//���ϴ� ���
		if(inum == 1) {
			str1 = "����";
			switch(ranNum) {
			case 1:
				str2 = "����";
				c = 'T';
				break;
			case 2:
				str2 = "����";
				c = 'L';
				break;
			case 3:
				str2 = "��";
				c = 'W';
				break;
			default:
				break;
			}
		}
		else if(inum == 2) {
			str1 = "����";
			switch(ranNum) {
			case 1:
				str2 = "����";
				c = 'W';
				break;
			case 2:
				str2 = "����";
				c = 'T';
				break;
			case 3:
				str2 = "��";
				c = 'L';
				break;
			default:
				break;
			}
		}
		else if(inum == 3) {
			str1 = "��";
			switch(ranNum) {
			case 1:
				str2 = "����";
				c = 'L';
				break;
			case 2:
				str2 = "����";
				c = 'W';
				break;
			case 3:
				str2 = "��";
				c = 'T';
				break;
			default:
				break;
			}
		}
		else {
			System.out.println("�߸��� �Է�");
		}
		System.out.println("======== ��� ========");
		System.out.println("����� " + str1 + "�� �½��ϴ�.");
		System.out.println("��ǻ�ʹ� " + str2 + "�� �½��ϴ�.");
		System.out.println("======================");
		if(c == 'W') {
			System.out.println("����� �̰���ϴ�.��.��");
		}
		else if(c == 'L') {
			System.out.println("����� �����ϴ�.��.��");
		}
		else if(c == 'T') {
			System.out.println("�����ϴ�.��.��");
		}
		else {
			System.out.println("�����߻�");
		}
		
	}
}
