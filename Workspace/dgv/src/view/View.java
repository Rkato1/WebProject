package view;

import java.util.Scanner;

public class View {

	Scanner sc;

	public View() {
		super();
		sc = new Scanner(System.in);
	}

	public int showWelcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to DGV");
		System.out.println("--------------");
		System.out.println("-1. �˹ٻ�------");
		System.out.println("-2. �� ��-------");
		System.out.println("-0. �� ��-------");
		System.out.println("--------------");
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}

	public int showMenu() {
		// TODO Auto-generated method stub
		System.out.println("---- �� �� �� -----");
		System.out.println("---------------");
		System.out.println("-1. ��ȭ�߰�------");
		System.out.println("-2. ��ȭ����------");
		System.out.println("-3. ��ȭ����------");
		System.out.println("-4. �󿵿�ȭ------");
		System.out.println("---------------");
		System.out.println("----- �� �� ------");

		System.out.println("-5. �����Ȳ------");
		System.out.println("-6. ��ǰ���------");
		System.out.println("-7. ��ǰ����------");
		System.out.println("-8. ��ǰ����------");
		System.out.println("-0. ó��ȭ��------");
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}

	public int showGuest() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to DGV");
		System.out.println("---------------");
		System.out.println("-1. �� ȭ ��------");
		System.out.println("-2. ��     ��------");
		System.out.println("-0. ó��ȭ��------");
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}
	
	public int guestProcess(int itemp1) { 
		if(itemp1 == 1) {
			return movieShow();
		}else if(itemp1 == 2) {
			return storeShow();
		}else {
			return 0;
		}
	}
	public int guestProcess2(int itemp) { 
		if(itemp == 1) {
			return movieShow();
		}else if(itemp == 2) {
			return storeShow();
		}else {
			return 0;
		}
	}
	
	public int movieShow() {
		System.out.println("---------------");
		System.out.println("-1. ��ȭ����------");
		System.out.println("-2. ����Ȯ��------");
		System.out.println("-3. �������------");
		System.out.println("-0. ó��ȭ��------");
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int storeShow() {
		System.out.println("---------------");
		System.out.println("-1. ���ᱸ��------");
		System.out.println("-2. ���ı���------");
		System.out.println("-3. ���ܱ���------");
		System.out.println("-0. ó��ȭ��------");
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int showFood() {
		System.out.println("\t\t����\t\t");
		System.out.print("No.\t��ǰ��\t����\t����\n");
		//���Ĺ迭
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int showDrink() {
		System.out.println("\t\t����\t\t");
		System.out.print("No.\t��ǰ��\t����\t����\n");
		//����迭
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int showPopcorn() {
		System.out.println("\t\t����\t\t");
		System.out.print("No.\t��ǰ��\t����\t����\t��\n");
		//���ܹ迭
		System.out.print("���� > ");
		int temp = sc.nextInt();
		return temp;
	}
}
