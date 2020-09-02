package student.view;

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
		System.out.print("�л� �̸� �Է� ");
		String name = sc.next();
		System.out.print("�л� ���� �Է� ");
		int age = sc.nextInt();
		System.out.print("�л� �ּ� �Է� ");
		String addr= sc.next();
		Student st = new Student(name, age, addr);
		return st;
	}
	
	public void printAllStudent(Student st[], int index) {
		// TODO Auto-generated method stub
		System.out.println("\n--- ���� �л� ���� ���---");
		System.out.println("�̸�\t����\t�ּ�");
		for(int i=0;i<index;i++) {
			System.out.println(st[i].getName()+"\t"+st[i].getAge()+"\t"+st[i].getAddr());
		}
	}

	//public void printStudent(Student st[], int index) {
	public void printStudent(Student st) {
		System.out.println("\n--- �л� ���� ���---");		
		System.out.println("�̸�\t����\t�ּ�");
		//System.out.println(st[index].getName()+"\t"+st[index].getAge()+"\t"+st[index].getAddr());
		System.out.println(st.getName()+"\t"+st.getAge()+"\t"+st.getAddr());
	}

	public String getName(String str) {
		// TODO Auto-generated method stub
		System.out.print(str+"�� �л� �̸� �Է� ");
		String name = sc.next();
		return name;
	}
	
	public void printMsg(String str) {
		System.out.println(str);
	}
	
	public void noSearch() {
		// TODO Auto-generated method stub
		printMsg("�˻��������");
		//���� �ʿ�� ������ ���Ǽ�
		//System.out.println("�˻��������");
	}
}
