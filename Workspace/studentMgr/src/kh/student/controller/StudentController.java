package kh.student.controller;

import java.util.Scanner;

public class StudentController {
	//�л� 10���� ������ �����ϰ� �����ϴ� ���α׷�
	//(�̸�, ����, �ּ�)
	//��, �л��� �̸��� �ߺ����� �ʴ´ٰ� ����
	
	//������ ���� �迭
	String name[];
	int age[];
	String addr[];
	
	//���� �迭�� ���°���� ������� �ִ��� ����ϴ� ����
	int index;
	
	//���� �Է¹ޱ� ���� ����
	Scanner sc;
	
	//������(�⺻���� ������)
	public StudentController() {
		sc = new Scanner(System.in);
		name = new String[10];
		age = new int[10];
		addr = new String[10];
	}
	
	//���� ����ȭ��(�⺻���� �޴��� ���)
	public void main() {
		while(true) {
			System.out.println("==== �л� ���� ���α׷� v1 ====");
			System.out.println("1.�л� ���� ���");
			System.out.println("2.�л� ���� ���(��ϵ� �л� ��ü ���)");
			System.out.println("3.�л� ���� ���(�̸����� �˻��Ͽ� 1�� ���� ���)");
			System.out.println("4.�л� ���� ����");
			System.out.println("5.�л� ���� ����");
			System.out.println("0.���α׷� ����");
			System.out.print("���� > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				insertStudent();
				break;
			case 2:
				selectAllStudent();
				break;
			case 3:
				selectStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
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
	
	//�л� ���� �Է¹޾� �迭�� �����ϴ� �޼ҵ�
	public void insertStudent() {
		if(index!=10) {
			System.out.println("\n==== �л� ���� �Է�====\n");
			
			//�Է�
			System.out.print("�̸� �Է� : ");
			String str = sc.next();
			//�̸� �ߺ�üũ(�����̹Ƿ� ���� ������ �������� ����)
			
			System.out.print("���� �Է� : ");
			int i = sc.nextInt();
			//�ٹٲ�(next�� �� �� �������� ���� ���ѷ��� ������)
			sc.nextLine();
			System.out.print("�ּ� �Է� : ");
			String str1 = sc.next();
			sc.nextLine();
			
			this.name[index]=str;
			this.age[index]=i;
			this.addr[index]=str1;
			
			index++;
		}else {
			System.out.println("�л� ������ ���� á���ϴ�.");
		}
	}
	
	//�л� ������ ���� ����ϴ� �޼ҵ�
	public void selectAllStudent() {
		if(index == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		System.out.println("�̸�\t����\t�ּ�");
		for(int i=0; i<index; i++) {
			System.out.print(name[i] + "\t" + age[i] + "\t" + addr[i] + "\t");
			System.out.println();
		}
	}
	
	//�л� �̸��� �˻��ؼ� ������ ����ϴ� �޼ҵ�
	public void selectStudent(){
		if(index == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		//�˻� ��� �Ǻ� ���� �ӽú���
		boolean isSearch=false;
		System.out.println("==== �л� ���� ���(1��) ====");
		System.out.print("�˻��� �л��� �̸��� �Է� : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.println("�̸�\t����\t�ּ�");
			System.out.print(name[itemp] + "\t" + age[itemp] + "\t" + addr[itemp] + "\n");
		}
		/*
		for(int i=0;i<index;i++) {
			if(sc.next().equals(name[i])) {
				System.out.println("�̸�\t����\t�ּ�");
				System.out.print(name[i] + "\t" + age[i] + "\t" + addr[i] + "\n");
				isSearch = true;
				break;
			}
		}
		*/

		//�ٹٲ� �ʱ�ȭ
		sc.nextLine();
		//�˻� ����� �������� �ְ�, �������� ����
		if(!isSearch) {
			System.out.println("�˻� ��� ����");
		}
	}
	
	//�л� ������ �����ϴ� �޼ҵ�
	public void updateStudent() {
		if(index == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		//�˻� ��� �Ǻ� ���� �ӽú���
		boolean isSearch=false;
		System.out.println("==== �л� ���� ���� ====");
		System.out.print("������ �л��� �̸��� �Է� : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.print("������ �̸� �Է� : ");
			this.name[itemp] = sc.next();
			System.out.print("������ ���� �Է� : ");
			this.age[itemp] = sc.nextInt();				
			System.out.print("������ �ּ� �Է� : ");
			this.addr[itemp] = sc.next();
		}
		/*
		for(int i=0;i<index;i++) {
			if(sc.next().equals(name[i])) {
				System.out.print("������ �̸� �Է� : ");
				this.name[i] = sc.next();
				System.out.print("������ ���� �Է� : ");
				this.age[i] = sc.nextInt();				
				System.out.print("������ �ּ� �Է� : ");
				this.addr[i] = sc.next();
				isSearch = true;
				break;
			}
		}
		*/
		//�ٹٲ� �ʱ�ȭ
		sc.nextLine();
		//�˻� ����� �������� �ְ�, �������� ����
		if(!isSearch) {
			System.out.println("�˻� ��� ����");
		}
	}
	
	//�л� ������ �����ϴ� �޼ҵ�
	public void deleteStudent() {
		if(index == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		//�˻� ��� �Ǻ� ���� �ӽú���
		boolean isSearch=false;
		System.out.println("==== �л� ���� ���� ====");
		System.out.print("������ �л��� �̸��� �Է� : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			for(int i=itemp;i<index-1;i++) {
				this.name[i]=this.name[i+1];
				this.age[i]=this.age[i+1];
				this.addr[i]=this.addr[i+1];
			}
			index--;
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
		for(int i=0;i<index;i++) {
			if(this.name[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
}