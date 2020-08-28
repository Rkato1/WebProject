package kh.point.controller;

import java.util.Scanner;

import kh.point.vo.Gold;
import kh.point.vo.Silver;
import kh.point.vo.Vip;

public class PointController {
	Scanner sc;
	
	Silver s[];
	Gold g[];
	Vip v[];
	
	//parameter���ٿ� ����
	int sIndex;
	int gIndex;
	int vIndex;
	//�˻��� ��� ����� ���� ���� �޶����� ����
	//silver,1 gold,2 vip,3
	int searchResult;
	
	//������(�ʱ�ȭ �� �� �Ҵ�)
	public PointController() {
		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
	}
	
	//ù ȭ�� ���
	public void main() {
		while(true) {
			System.out.println("\n\n---- ȸ�� ���� ���α׷� v1 ----\n");
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
		System.out.print("ȸ�� ��� �Է�[silver/gold/vip] : ");
		String str1 = sc.next();
		System.out.print("ȸ�� ����Ʈ �Է� : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		switch(str1) {
		case "silver":
			s[sIndex] = new Silver(str, str1, i);		
			sIndex++;
			break;
		case "gold":
			g[sIndex] = new Gold(str, str1, i);		
			gIndex++;
			break;
		case "vip":
			v[sIndex] = new Vip(str, str1, i);		
			vIndex++;
			break;
		default:
			System.out.println("�߸��� �Է�");
			break;
		}
	}
	
	//ȸ�� ������ ���� ����ϴ� �޼ҵ�
	public void selectAllMember() {
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
		for(int i=0; i<sIndex; i++) {
			System.out.print(s[i].getName() + "\t" + s[i].getGrade() + "\t" + s[i].getPoint() + "\t" + s[i].getBonus() + "\n");
		}
		System.out.println();
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
		for(int i=0; i<gIndex; i++) {
			System.out.print(g[i].getName() + "\t" + g[i].getGrade() + "\t" + g[i].getPoint() + "\t" + g[i].getBonus() + "\n");
		}
		System.out.println();
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");
		for(int i=0; i<vIndex; i++) {
			System.out.print(v[i].getName() + "\t" + v[i].getGrade() + "\t" + v[i].getPoint() + "\t"+ v[i].getBonus() + "\n");
		}
	}
	
	//ȸ�� �̸��� �˻��ؼ� ������ ����ϴ� �޼ҵ�
	public void selectMember(){
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		System.out.println("==== ȸ�� ���� ��ȸ ====");
		System.out.print("�˻��� ȸ���� �̸��� �Է� : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.println("�̸�\t���\t����Ʈ");
			if(searchResult==1) {
				System.out.print(s[itemp].getName() + "\t" + s[itemp].getGrade() + "\t" + s[itemp].getPoint() + "\n");
			}else if(searchResult==2) {
				System.out.print(g[itemp].getName() + "\t" + g[itemp].getGrade() + "\t" + g[itemp].getPoint() + "\n");
			}else if(searchResult==3) {
				System.out.print(v[itemp].getName() + "\t" + v[itemp].getGrade() + "\t" + v[itemp].getPoint() + "\n");
			}
		}else {
			System.out.println("�˻� ��� ����");
		}
		//�ٹٲ� �ʱ�ȭ
		sc.nextLine();
	}
	
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public void updateMember() {
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		//�˻� ��� �Ǻ� ���� �ӽú���
		boolean isSearch=false;
		System.out.println("==== ȸ�� ���� ���� ====");
		System.out.print("������ ȸ���� �̸��� �Է� : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.print("������ �̸� �Է� : ");
			s[itemp].setName(sc.next());
			System.out.print("������ ��� �Է� : ");
			s[itemp].setGrade(sc.next());				
			System.out.print("������ ����Ʈ �Է� : ");
			s[itemp].setPoint(sc.nextInt());			
		}
		
		//�ٹٲ� �ʱ�ȭ
		sc.nextLine();
		//�˻� ����� �������� �ְ�, �������� ����
		if(!isSearch) {
			System.out.println("�˻� ��� ����");
		}
	}
	
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public void deleteMember() {
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		//�˻� ��� �Ǻ� ���� �ӽú���
		boolean isSearch=false;
		System.out.println("---- ȸ�� ���� ���� ----");
		System.out.print("������ ȸ���� �̸��� �Է� : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			if(searchResult == 1) {
				for(int i=itemp;i<sIndex-1;i++) {
					s[i]=s[i+1];									
				}
				sIndex--;
			}else if(searchResult == 2) {
				for(int i=itemp;i<gIndex-1;i++) {
					g[i]=g[i+1];				
				}
				gIndex--;
			}else if(searchResult == 3) {
				for(int i=itemp;i<vIndex-1;i++) {
					v[i]=v[i+1];				
				}
				vIndex--;
			}
		}

		//�ٹٲ� �ʱ�ȭ
		sc.nextLine();
		//�˻� ����� �������� �ְ�, �������� ����
		if(!isSearch) {
			System.out.println("�˻� ��� ����");
		}
	}
	
	//��ȸ�� �̸��� �Ű������� �޾� �迭��
	//�� ��° �ε����� �ִ��� ��ȸ�Ͽ� �ε��� ��ȣ����
	public int searchIndex(String name) {
		for(int i=0;i<sIndex;i++) {
			if(s[i].getName().equals(name)) {
				searchResult = 1;
				return i;
				//�ٸ���� 100~109
				//return 100+i;
			}
		}
		for(int i=0;i<gIndex;i++) {
			if(g[i].getName().equals(name)) {
				searchResult = 2;
				return i;
				//�ٸ���� 10~19
				//return 10+i;
			}
		}
		for(int i=0;i<vIndex;i++) {
			if(v[i].getName().equals(name)) {
				searchResult = 3;
				//0~9
				return i;
			}
		}
		return -1;
	}
}