package kh.java.func;

import java.util.Scanner;

public class MethodTest {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� MethodTestŬ������ main�޼ҵ��Դϴ�.");
		//���� Ŭ���� ���� �ٸ� �޼ҵ� ȣ��
		method1();
		System.out.print("������ �Է��ϼ��� :");
		int num = sc.nextInt();
		method2(num);
		
		System.out.print("ù���� ������ �Է��ϼ��� :");
		int num1 = sc.nextInt();
		System.out.print("�ι��� ������ �Է��ϼ��� :");
		int num2 = sc.nextInt();
		method3(num1,num2);
		int tot = method5(num1,num2);
	}
	
	//���ڰ� 0���� �޼ҵ�
	public void method1(){
		System.out.println("���� method1() �Դϴ�.");
	}
	
	//���ڰ� 1���� �޼ҵ�
	public void method2(int i) {
		System.out.println("�Է��Ͻ� ������ " + i + "�Դϴ�.");
	}
	
	//���ڰ� 2���� �޼ҵ�(���� ����)
	public void method3(int i, int j) {
		System.out.println("ù��° ������ : "+ i);
		System.out.println("�ι�° ������ : "+ j);
	}
	
	//���ڰ� 2���� �޼ҵ�(�ٸ� ����)
	//�ѱ�� ���� ������ ���� ������ �������
	public void method4(String str, int i) {
		System.out.println("�Է��� ���ڿ��� : \""+str+"\"]");
		System.out.println("�Է��� ���ڴ� : "+i);
	}

	//������� ����(void�� return�� ������ ����)
	//void�� �ƴ� ��� ��� return���� �����ؾ���	
	int method5(int i, int j) {		
		return i+j;
	}
}