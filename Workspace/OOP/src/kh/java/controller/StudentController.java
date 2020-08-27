package kh.java.controller;

import java.util.Scanner;

import kh.java.func.Student;

public class StudentController {
	//voó��
	//getter, setter ���� ���ص� ��
	
	//�������� ����
	private Student s;
	private Scanner sc;
	
	public StudentController() {
		s = new Student();
		sc = new Scanner(System.in);
	}
	
	public void main() {
		while(true) {
			System.out.println("==�л����� ���α׷�==");
			System.out.println("1.�л� ���� �Է�");
			System.out.println("2.�л� ���� ���");
			System.out.println("3.�л� ���� ����");
			System.out.println("4.�л� ���� ����");
			System.out.println("5.���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				showStudent();
				break;
			case 3:
				showStudent();
				updateStudent();
				break;
			case 4:
				deleteStudent();
				break;
			case 5:
				return;//�޼ҵ带 �����Ŵ
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}
	}
	
	//���� �Է¹޾� ������ �־��ִ� �޼ҵ�
	public void insertStudent() {
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		s.setName(name);
		System.out.print("�л� ���� �Է� : ");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.print("�л� �ּ� �Է� : ");
		//�ٹٲ����� �Է� �ʱ�ȭ
		sc.nextLine();
		String addr = sc.next();
		s.setAddr(addr);
		System.out.println("�����Է¿Ϸ�");
	}
	
	//�Է¹��� ���� �����ִ� �޼ҵ�
	public void showStudent() {
		System.out.println("�л��� �̸��� : " + s.getName());
		System.out.println("�л��� ���̴� : " + s.getAge());
		System.out.println("�л��� �ּҴ� : " + s.getAddr());
	}
	
	//���� ���� �����ϴ� �޼ҵ�
	public void updateStudent() {		
		System.out.println("�����׸� ����");
		System.out.println("1. �̸�");
		System.out.println("2. ����");
		System.out.println("3. �ּ�");
		System.out.print("���� > ");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1:
			System.out.print("������ �̸� �Է� : ");
			String name = sc.next();
			s.setName(name);
			break;
		case 2:
			System.out.print("������ ���� �Է� : ");
			int age = sc.nextInt();
			s.setAge(age);
			break;
		case 3:
			System.out.print("������ �ּ� �Է� : ");
			String addr = sc.next();
			s.setAddr(addr);
			break;
		default:
			System.out.println("�߸��� �Է�");
			break;
		}
	}
	
	//���� ����(�ʱ�ȭ)�ϴ� �޼ҵ�
	public void deleteStudent() {
		System.out.print("��¥ �����Ͻðڽ��ϱ�(y/n)?");
		char ch = sc.next().charAt(0);
		if(ch=='y') {
			s.setName(null);
			s.setAge(0);
			s.setAddr(null);
		}
	}
}
