package kh.java.func;

public class Student {
	private String name;
	private int age;
	private String addr;
	
	//�⺻������
	public Student() {
		 
	}
	
	//�Ű����� ������(������ �ʱ⼳��)
	public Student(String str, int i, String str2) {
		 this.name = str;
		 this.age = i;
		 this.addr = str2;
	}
	
	//name�� getter
	//�������������ڴ� public
	//returnŸ���� �ش� ������ �ڷ���
	//�Ű���������
	public String getName() {
		return name;
	}
	//setter
	//�������������� public
	//����Ÿ�� void
	//�޼ҵ��̸� set������ ->ī��ǥ���
	//�Ű������� 1�� ->�ش� ������ �ڷ���
	public void setName(String name) {
		//���������� ���������� ���� ����
		//thisŰ����� �������� �տ� ����
		this.name = name;
	}
	/*
	public String setName(String str) {
		name = str;
		return name;
	}
	*/
	
	public int getAge() {
		return age;
	}
	//public int setAge(int i) {
	public void setAge(int i) {
		this.age = i;
		//return this.age;
	}
	
	public String getAddr() {
		return addr;
	}
	//setter
	//public String setAddr(String str) {
	public void setAddr(String str) {
		this.addr = str;
		//return this.addr;
	}
}
