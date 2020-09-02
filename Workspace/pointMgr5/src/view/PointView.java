package view;

import java.util.Scanner;

import model.vo.Gold;
import model.vo.Grade;
import model.vo.Silver;
import model.vo.Vip;

public class PointView {
	Scanner sc;
	Grade g;

	public PointView() {
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {
		System.out.println("\n\n---- ȸ�� ���� ���α׷� vMVC ----\n");
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
	
	public Grade insertMember(Grade g, int index) {
		System.out.println("\n==== ȸ�� ���� �Է�====\n");		
		System.out.print("ȸ�� �̸� �Է� : ");
		g.setName(sc.next());
		System.out.print("ȸ�� ��� �Է�[silver/gold/vip] : ");
		g.setGrade(sc.next());
		System.out.print("ȸ�� ����Ʈ �Է� : ");
		g.setPoint(sc.nextInt());
		switch(g.getGrade()) {
		case"silver":
			g = new Silver(g.getName(), g.getGrade(), g.getPoint());
			return g;
		case "gold":
			g = new Gold(g.getName(), g.getGrade(), g.getPoint());
			return g;
		case "vip":
			g = new Vip(g.getName(), g.getGrade(), g.getPoint());
			return g;
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

	public void selectAllMember(Grade[] members, int index) {
		System.out.println("\n---- ��ü ȸ�� ���� ��� ----\n");
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
		for(int i=0; i<index; i++) {
			System.out.print(members[i]);
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
