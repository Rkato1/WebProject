package student.view;

import java.util.ArrayList;
import java.util.Scanner;

import student.model.vo.Student;

public class StudentView {

	Scanner sc;
	
	public StudentView() {
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {
		// TODO Auto-generated method stub
		System.out.print("\n--- �л� ���� ���α׷� ---\n");
		System.out.println("1. �л� ���� ���");
		System.out.println("2. ��ü �л� ����");
		System.out.println("3. �л� ���� ���(1��)");
		System.out.println("4. �л� ���� ����");
		System.out.println("5. �л� ���� ����");
		System.out.print("���� > ");
		int itemp = sc.nextInt();
		return itemp;
	}
	
	public Student insertStudent() {
		// TODO Auto-generated method stub
		System.out.print("\n--- �л� ���� ��� ---\n");
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("�л� ���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�л� �ּ� �Է� : ");
		String addr= sc.next();
		Student st = new Student(name, age, addr);
		return st;
	}
	
	public void printAllStudent(ArrayList<Student> st) {
		// TODO Auto-generated method stub
		System.out.println("\n--- ���� �л� ���� ���---");
		System.out.println("�̸�\t����\t�ּ�");
		//foreach��
		for(Student s : st) {
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getAddr());
		}
		/*
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i).getName()+"\t"+st.get(i).getAge()+"\t"+st.get(i).getAddr());
		}
		*/
	}
	
	public void printStudent(Student st) {
		System.out.println("\n--- �л� ���� ���---");		
		System.out.println("�̸�\t����\t�ּ�");
		System.out.println(st.getName()+"\t"+st.getAge()+"\t"+st.getAddr());
	}

	public String getName(String str) {
		// TODO Auto-generated method stub
		System.out.print(str+"�� �л� �̸� �Է� : ");
		String name = sc.next();
		return name;
	}
	
	public void printMsg(String str) {
		System.out.println(str);
	}
	
	public void noSearch() {
		printMsg("�˻��������");
	}
}
