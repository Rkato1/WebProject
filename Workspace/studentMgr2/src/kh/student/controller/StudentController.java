package kh.student.controller;

import java.util.Scanner;

import kh.student.model.vo.Student;

public class StudentController {
	Scanner sc;
	
	//�л������� ������ �迭
	Student stu[];
	
	//parameter���ٿ� ����
	int index;
	
	//������(�ʱ�ȭ �� �� �Ҵ�)
	public StudentController() {
		sc = new Scanner(System.in);
		stu = new Student[10];
	}
	
	//ù ȭ�� ���
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
			
			System.out.print("���� �Է� : ");
			int i = sc.nextInt();
			//�ٹٲ�(next�� �� �� �������� ���� ���ѷ��� ������)
			sc.nextLine();
			System.out.print("�ּ� �Է� : ");
			String str1 = sc.next();
			sc.nextLine();
			
			//�ʱ�ȭ
			/*
			stu[index] = new Student();
			stu[index].setName(str);
			stu[index].setAge(i);
			stu[index].setAddr(str1);
			*/
			//�� �Ʒ� ��� ������ ȿ������ ���� �� ����
			stu[index] = new Student(str, i, str1);
			
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
			System.out.print(stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getAddr() + "\n");
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
			System.out.print(stu[itemp].getName() + "\t" + stu[itemp].getAge() + "\t" + stu[itemp].getAddr() + "\n");
		}

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
			stu[itemp].setName(sc.next());
			System.out.print("������ ���� �Է� : ");
			stu[itemp].setAge(sc.nextInt());				
			System.out.print("������ �ּ� �Է� : ");
			stu[itemp].setAddr(sc.next());
		}
		
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
				stu[i].setName(stu[i+1].getName());
				stu[i].setAge(stu[i+1].getAge());
				stu[i].setAddr(stu[i+1].getAddr());				
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
			if(stu[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
