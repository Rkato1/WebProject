package control;

import java.util.Scanner;

import vo.Gold;
import vo.Grade;
import vo.Silver;
import vo.Vip;

public class PointMgr {
	Scanner sc;
	Grade members[];
	int index;
	int searchResult = -1;
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		members = new Grade[30];
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
			if(index>=30) {
				System.out.println("�ο��ʰ�");
				return;
			}
			
			System.out.println("\n==== ȸ�� ���� �Է�====\n");
			String str = "";
			boolean isOverlap = true;
			while(isOverlap) {
				//�Է�
				System.out.print("ȸ�� �̸� �Է� : ");
				str = sc.next();	
				isOverlap = overlapName(str);
				sc.nextLine();
			}
			System.out.print("ȸ�� ��� �Է�[silver/gold/vip] : ");
			String str1 = sc.next();
			System.out.print("ȸ�� ����Ʈ �Է� : ");
			int i = sc.nextInt();
			sc.nextLine();
			
			division(str, str1, i, index);
			index++;
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
				System.out.print("ȸ�� ��� �Է�[silver/gold/vip] : ");
				String str1 = sc.next();
				System.out.print("ȸ�� ����Ʈ �Է� : ");
				int p = sc.nextInt();
				division(str, str1, p, itemp);
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
		
		//���� �Է� �Ҷ� ������ �ִ� �޼ҵ�
		public void division(String name, String grade, int point, int index) {
			switch(grade) {
			case "silver":
				members[index] = new Silver(name, grade, point);
				break;
			case "gold":
				members[index] = new Gold(name, grade, point);
				break;
			case "vip":
				members[index] = new Vip(name, grade, point);
				break;
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}
		
		//������->�θ�Ÿ�Ժ����� �ڽ�Ÿ�� ��ü�� ����
		public Grade division2(String name, String grade, int point, int index) {
			switch(grade) {
			case "silver":
				return new Silver(name, grade, point);
			case "gold":
				return new Gold(name, grade, point);
			case "vip":
				return new Vip(name, grade, point);
			default:
				System.out.println("�߸��� �Է�");
				return null;
			}
		}
		
		//�̸� �ߺ�üũ �޼ҵ�
		public boolean overlapName(String str) {
			if(index == 0) {
				return false;
			}
			for(int i=0; i<index; i++) {
				if(str.equals(members[i].getName())) {
					System.out.println("�̹� �����ϴ� �̸�");
					return true;
				}
			}
			return false;
		}
}
