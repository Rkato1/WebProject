package kh.point.controller;

import java.util.Scanner;

import kh.point.model.vo.Gold;
import kh.point.model.vo.Grade;
import kh.point.model.vo.Silver;
import kh.point.model.vo.Vip;
import kh.point.model.vo.Vvip;

public class PointController {
	Scanner sc;
	Grade[] members;
	int index;
	int searchResult = -1;
	public PointController() {
		sc = new Scanner(System.in);
		members = new Grade[40];
	}
	
	public void main() {
		while(true) {
			System.out.println("\n\n---- ȸ�� ���� ���α׷� v��� ----\n");
			System.out.println("1.ȸ�� ���");
			System.out.println("2.ȸ�� ��ü ���� ���");
			System.out.println("3.ȸ�� 1�� ���� ���");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� ����");
			System.out.println("0.���α׷� ����");
			System.out.print("���� > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				insertMember();
				break;
			case 2:
				selectAllMember();
				break;
			case 3:
				selectMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}		
	}
	
	//ȸ�� ���� �Է¹޾� �迭�� �����ϴ� �޼ҵ�
		public void insertMember() {
			System.out.println("\n==== ȸ�� ���� �Է�====\n");
			
			//�Է�
			System.out.print("ȸ�� �̸� �Է� : ");
			String str = sc.next();			
			//�ٹٲ�(next�� �� �� �������� ���� ���ѷ��� ������)
			sc.nextLine();
			System.out.print("ȸ�� ��� �Է�[silver/gold/vip/vvip] : ");
			String str1 = sc.next();
			System.out.print("ȸ�� ����Ʈ �Է� : ");
			int i = sc.nextInt();
			sc.nextLine();
			
			switch(str1) {
			case"silver":
				members[index++] = new Silver(str, str1, i);
				break;
			case "gold":
				members[index++] = new Gold(str, str1, i);
				break;
			case "vip":
				members[index++] = new Vip(str, str1, i);
				break;
			case "vvip":
				members[index++] = new Vvip(str, str1, i);
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}
		
		//ȸ�� ������ ���� ����ϴ� �޼ҵ�
		public void selectAllMember() {
			if(index == 0) {
				System.out.println("�Էµ� ������ �����ϴ�.");
				return;
			}
			System.out.println("\n---- ��ü ȸ�� ���� ��� ----\n");
			System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
			for(int i=0; i<index; i++) {
				System.out.print(members[i].getName() + "\t" +
								members[i].getGrade() + "\t" +
								members[i].getPoint() + "\t" +
								members[i].getBonus() + "\n");
			}
		}
		
		//ȸ�� �̸��� �˻��ؼ� ������ ����ϴ� �޼ҵ�
		public void selectMember(){
			if(index == 0) {
				System.out.println("�Էµ� ������ �����ϴ�.");
				return;
			}
			
			System.out.println("==== ȸ�� ���� ��ȸ ====");
			System.out.print("�˻��� ȸ���� �̸��� �Է� : ");
			int itemp = searchIndex(sc.next());
			if(itemp != -1) {
				System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
				System.out.print(members[itemp].getName() + "\t" + members[itemp].getGrade() + "\t" + members[itemp].getPoint() + "\t" + members[itemp].getBonus() + "\n");				
			}else {
				System.out.println("�˻� ��� ����");
			}
			//�ٹٲ� �ʱ�ȭ
			sc.nextLine();
		}
		
		//ȸ�� ������ �����ϴ� �޼ҵ�
		public void updateMember() {
			if(index == 0) {
				System.out.println("�Էµ� ������ �����ϴ�.");
				return;
			}
			
			System.out.println("==== ȸ�� ���� ���� ====");
			System.out.print("������ ȸ���� �̸��� �Է� : ");
			int itemp = searchIndex(sc.next());
			if(itemp != -1) {
				System.out.print("");
				System.out.print("ȸ�� �̸� �Է� : ");
				String str = sc.next();			
				//�ٹٲ�(next�� �� �� �������� ���� ���ѷ��� ������)
				sc.nextLine();
				System.out.print("ȸ�� ��� �Է�[silver/gold/vip/vvip] : ");
				String str1 = sc.next();
				System.out.print("ȸ�� ����Ʈ �Է� : ");
				int p = sc.nextInt();
				
				switch(str1) {
				case "silver":
					members[itemp] = new Silver(str, str1, p);
					break;
				case "gold":
					members[itemp] = new Gold(str, str1, p);
					break;
				case "vip":
					members[itemp] = new Vip(str, str1, p);
					break;
				case "vvip":
					members[itemp] = new Vvip(str, str1, p);
					break;
				}				
			}else {
				System.out.println("�˻� ��� ����");
			}
			//�ٹٲ� �ʱ�ȭ
			sc.nextLine();
		}
		
		//ȸ�� ������ �����ϴ� �޼ҵ�
		public void deleteMember() {
			if(index == 0) {
				System.out.println("�Էµ� ������ �����ϴ�.");
				return;
			}
			System.out.println("---- ȸ�� ���� ���� ----");
			System.out.print("������ ȸ���� �̸��� �Է� : ");
			int itemp = searchIndex(sc.next());
			if(itemp != -1) {
				for(int i=itemp;i<index-1;i++) {
					members[i]=members[i+1];									
				}
				index--;				
			}else {
				System.out.println("�˻� ��� ����");
			}
			//�ٹٲ� �ʱ�ȭ
			sc.nextLine();
		}
		
		//��ȸ�� �̸��� �Ű������� �޾� �迭��
		//�� ��° �ε����� �ִ��� ��ȸ�Ͽ� �ε��� ��ȣ����
		public int searchIndex(String name) {
			for(int i=0;i<index;i++) {
				if(members[i].getName().equals(name)) {
					searchResult = 1;
					return i;
				}
			}
			return -1;
		}
}