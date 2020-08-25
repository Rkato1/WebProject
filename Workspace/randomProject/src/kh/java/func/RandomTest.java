package kh.java.func;

import java.util.Random;
import java.util.Scanner;

//���� - ������ �� Random
//������ �� �Ǵ� �������� ��������� �� �� ���� ��

public class RandomTest {
	
	//�ݾ��� ���� ��������
	int money = 10;
	
	//������ ���� ���� ������
	int w = 0;
	int l = 0;
	int d = 0;
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
	
	public void upDownGame() {		
		Scanner sc = new Scanner(System.in);
		boolean gm = true;
		//��Ͻý����� ����� ����
		//������ �ʱ⿡ �۾����� �ʾƼ� �׳� �ּ�ó��
		//���� �����ڸ� loop���� �޾Ƽ� ó��
		int rank = 0;
		int iTemp = 0;
		
		while(gm) {
			System.out.println("===Up & Down Game ===");
			System.out.print("1. Game Start\n2. Game Score\n3. End Game\n");
			int inum = sc.nextInt();
			
			System.out.println("���� > "+ inum);
		
			switch(inum) {
			case 1:
				iTemp = upDownGameLoop();
				//rank�� 0�� ����� ������
				//���ʿ� 0���� �ʱ�ȭ �Ǿ��� ����
				if(rank > iTemp || rank == 0) {
					rank = iTemp;
				}
				break;
			case 2:
				System.out.println("���� �ְ� ����� " + rank + "�Դϴ�.");
				//gm = false;
				break;
			case 3:
				System.out.println("������ ����˴ϴ�.");
				gm = false;
				break;
			}
		}
	}
	
	int upDownGameLoop() {
		System.out.println("<< Game Start >>");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int ranNum = r.nextInt(99) + 1;
		for(;;) {
			System.out.print(i+1 + " ȸ�� ��ȣ �Է� : ");
			int j = sc.nextInt();
			if(j>=100 && j<1) {
				System.out.println("�Է¹��� ����");
			}
			else {
				if(j > i) {
					System.out.println("<< DOWN >>");
				}
				else if(j < i) {
					System.out.println("<< UP >>");
				}
				else {
					System.out.println("<< ���� >>");
					break;
				}
			}
			i++;
		}
		return i;
	}
	
	public void baskinRobbins31Game() {
		Scanner sc = new Scanner(System.in);
		boolean gm = true;
		while(gm) {
			System.out.println("Baskin Robbins31 Game");
			System.out.print("1. Game Start\n2. Game Score\n3. End Game\n");
			int inum = sc.nextInt();
			
			System.out.println("> "+ inum);
		
			switch(inum) {
			case 1:
				baskinRobbins31Logic();
				break;
			case 2:
				//System.out.println("������ �̱���.");
				gameScore();
				gm = false;
				break;
			case 3:
				System.out.println("������ ����˴ϴ�.");
				gm = false;
				break;
			}
		}
	}
	
	void baskinRobbins31Logic() {
		System.out.println("<< Game Start >>");
		boolean gm = true;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		int temp = 1;
		while(gm) {
			System.out.print("Input Number(1~3) : ");
			i = sc.nextInt();
			for(int k = 0; k<i; k++) {
				System.out.print(temp + "!\n");
				if(temp == 31) {
					System.out.println("31! ���� �¸�");
					System.out.println("<< ���� ���� >>");
					w++;
					gm = false;
					break;
				}
				temp++;
			}
			if(gm != false) {
				int ranNum = r.nextInt(3) + 1;
				System.out.println("<Computer Turn>");
				for(int k = 0; k<ranNum; k++) {
					System.out.print(temp + "!\n");
					if(temp == 31) {
						System.out.println("31! ���� �й�");
						System.out.println("<< ���� ���� >>");
						gm = false;
						l++;
						break;
					}
					temp++;
				}
			}
		}
	}
	
	void gameScore() {
		System.out.println("<< ����� ���� >>");
		System.out.printf("W I N : %d\n", w);
		System.out.printf("L O S E : %d\n", l);
		System.out.printf("D R A W : %d\n", d);
	}
	
	void gameMan(int userTot, int comTot) {
		
		int u = userTot;
		int c = comTot;
		if(u==c) {
			System.out.println("���");
			d++;
		}
		else if(u>c) {
			System.out.println("����� �¸�");
			w++;
		}
		else {
			System.out.println("����� �й�");
			l++;
		}
	}
	
	void battingMan(int wTemp, int lTemp, int mTemp) {
		int m1 = mTemp;
		int w1 = wTemp;
		int l1 = lTemp;
		if(w>w1) {
			money += m1;
			System.out.println("���� �� : "+ money);
		}
		else{
			if(l>l1) {
				money -= m1;
				System.out.println("���� �� : "+ money);
			}
			else {
				System.out.println("���� �� : "+ money);
			}
		}
	}
	
	public void diceGame() {
		Scanner sc = new Scanner(System.in);
		boolean gm = true;
		
		if(money < 0) {
			gm = false;			
		}
		else {
			while(gm) {
				System.out.println("== Dice Game ==");
				System.out.print("1. Game Start\n2. Game Score\n3. End Game\n");
				int inum = sc.nextInt();
			
				System.out.println("> "+ inum);
		
				switch(inum) {
				case 1:
					money-=1;
					diceGameLogic();
					break;
				case 2:
					//System.out.println("������ �̱���.");
					gameScore();
					gm = false;
					break;
			case 3:
					System.out.println("������ ����˴ϴ�.");
					gm = false;
					break;
				}
			}
		}
	}
	
	void diceGameLogic() {
		System.out.println("<< Game Start >>");
		boolean gm = true;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		if(money<0) {
			gm=false;
		}
		while(gm) {
			int uTot=0, cTot=0;
			for(int k=0; k<3; k++) {
				int i = r.nextInt(6)+1;
				uTot+=i;
				int j = r.nextInt(6)+1;
				cTot+=j;
			}
			System.out.println("����� �ֻ����� �� : "+ uTot);
			System.out.print("������ �ϰڽ��ϱ�(y/n)");
			char ch = sc.next().charAt(0);
			//System.out.println("��ǻ�� �ֻ����� �� : "+ cTot);
			if(ch=='y') {
				boolean btemp = true;
				int mTemp=0;
				while(btemp) {
					System.out.printf("�󸶸� �Žðڽ��ϱ�?(0~%d)", money);
					mTemp = sc.nextInt();
					if(mTemp<=money && mTemp>=0) {
						btemp = false;
					}
					else {
						System.out.println("�ݾ��ʰ� Ȥ�� �߸��� ����");
						//continue;
					}
				}
				int wTemp = w;
				int lTemp = l;
				gameMan(uTot, cTot);
				battingMan(wTemp, lTemp, mTemp);				
				gm=false;
			}
			else if(ch=='n') {
				gameMan(uTot, cTot);
				//battingMan(w, l, 0);
				gm=false;
			}
			else {
				System.out.println("�߸��� �Է�");
			}			
		}
	}
}
