package kh.java.func;

import java.util.Scanner;

public class MethodTest2 {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		//���� ��Ű���� import�� ���� ���� �ʾƵ�
		//ȣ���� �����ϴ�
		//Ÿ ������Ʈ������ import�� �Ҽ� ����
		//library������ ����ؾ���
		Calc c = new Calc();
		int result = c.plus(num1, num2);
		System.out.println("�� ���� ���� : "+result);
	}
	
	public void method1() {
		//string�� ������������ �⺻��ó�� ����
		//�迭�� ������
		int arr[] = {1,2,3,4,5};
		//��������(�ּҰ� ����), ���� �� ������
		//int arr1[] = arr;
		
		//call by value
		//arr[2]�� ���� ������ ��ȯ
		//�׷��Ƿ� arr[2]�� ���� ������ ����
		method2(arr[2]);
		System.out.println("call by value => "+arr[2]);
		method3(arr);
		System.out.println("call by reference => "+arr[2]);
	}
	
	public void method2(int i) {
		i = 10;
	}
	
	public void method3(int arr[]) {
		arr[2]=10;
	}
}
