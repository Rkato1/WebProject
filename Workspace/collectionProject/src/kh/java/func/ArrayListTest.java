package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public void test() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<String> ar1 = new ArrayList<String>();
		//���� ������ �ε����� �߰�
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(30);
		ar.add(55);
		ar.add(7);
		ar.add(720);
		ar.add(111111);
		ar1.add("a");
		ar1.add("b");
		ar1.add("c");
		//����
		ar1.set(0, "1");
		//����(�˾Ƽ� ���� ������)
		ar1.remove(1);
		//��ü����
		//ar1.clear();
		
		//length��� �Ұ�(��ǻ��� �����迭)
		//for(int i=0;i<ar.length;i++) {
		//��� ����ϴ� ���� size�޼ҵ�
		for(int i=0;i<ar.size();i++) {
			//ArrayList.get(index)
			//index��° ��ġ�� �� ��ȯ
			System.out.print(ar.get(i)+"\t");
		}
		System.out.println();
		for(int i=0;i<ar1.size();i++) {
			//ArrayList.get(index)
			//index��° ��ġ�� �� ��ȯ
			System.out.print(ar1.get(i)+"\t");
		}
		System.out.println();
		//foreach��
		for(String str : ar1) {
			System.out.print(str+"\t");
		}
		System.out.println();
		//����
		Collections.sort(ar);
		for(int i=0;i<ar.size();i++) {
			//ArrayList.get(index)
			//index��° ��ġ�� �� ��ȯ
			System.out.print(ar.get(i)+"\t");
		}
		
		//foreach��
		for(int i : ar) {
			System.out.print("\n"+i+"\t");
		}
	}
}
