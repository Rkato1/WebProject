package kh.java.run;

import java.util.Random;
import java.util.Scanner;

import kh.java.func.Animal;
import kh.java.func.Tiger;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.breath();
		
		Tiger t = new Tiger();
		t.breath();
		t.hunting();
		
		
		//��Ӱ���� �̷���� �������� ����� ���,
		//�޼ҵ� �������̵��� �Ǿ�������, �������̵� �� �޼ҵ��ڵ尡 �켱������ ����
		//=>���� ���ε�
		//������
		Animal t1 = new Tiger();
		t1.breath(); //��~
		//upcating�� ���ؼ� �θ�Ÿ�� ��ü�� �ִ�
		//������ �޼ҵ常 ��밡���� 
		//�ֱ�� �ѵ� ������ ����
		//t1.hunting();
		//���� ���ٸ� �ٿ�ĳ������ ���(�θ��ڽİ�)
		//ĳ����-Ŭ�������� ����ȯ
		((Tiger)t1).hunting();
		
		
		//������ �̿� ����
		//Object�� ��� Ŭ������ ����Ŭ����
		Object o1 = new Animal();
		Object o2 = new Tiger();
		Object o3 = new Scanner(System.in);
		Object o4 = new Random();		
		 
	}

}
