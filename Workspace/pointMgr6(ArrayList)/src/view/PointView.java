package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.vo.Gold;
import model.vo.Grade;
import model.vo.Silver;
import model.vo.Vip;

public class PointView {
	Scanner sc;

	public PointView() {
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {
		System.out.println("\n\n---- ȸ�� ���� ���α׷� vALT ----\n");
		System.out.println("1.ȸ�� ���");
		System.out.println("2.ȸ�� ��ü ���� ���");
		System.out.println("3.ȸ�� 1�� ���� ���");
		System.out.println("4.ȸ�� ���� ����");
		System.out.println("5.ȸ�� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("���� > ");
		int itemp = sc.nextInt();
		return itemp;
	}
	public Grade insertMember() {
		System.out.println("\n==== ȸ�� ���� �Է�====\n");		
		System.out.print("ȸ�� �̸� �Է� : ");
		String name = sc.next();		
		System.out.print("ȸ�� ��� �Է�[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("ȸ�� ����Ʈ �Է� : ");
		int point = sc.nextInt();
		switch(grade) {
		case"silver":
			return new Silver(name, grade, point);
		case "gold":			
			return new Gold(name, grade, point);
		case "vip":			
			return new Vip(name, grade, point);
		default:
			System.out.println("�߸��� ��� �Է�");
			break;
		}
		return null;
	}
	
	public void cannotSearch() {
		System.out.println("�Էµ� ������ ����");
	}
	
	public void noSearch() {
		System.out.println("�˻��������");
	}

	public void selectAllMember(ArrayList<Grade> members) {
		System.out.println("\n---- ��ü ȸ�� ���� ��� ----\n");
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
		for(Grade g : members) {
			System.out.print(g);
		}		
	}
	
	
	public void selectMember(Grade member) {		
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
		System.out.print(member);
	}
	
	public String searchName(String str) {
		System.out.println("==== ȸ�� ���� "+str+" ====");
		System.out.print(str+"�� ȸ���� �̸��� �Է� : ");
		return sc.next();
	}

	public void updateMember() {
		// TODO Auto-generated method stub
		
	}	
}
