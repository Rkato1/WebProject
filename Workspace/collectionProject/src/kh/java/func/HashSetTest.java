package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetTest {
	public void main() {
		HashSet<Integer> data = new HashSet<Integer>();
		//���� �Է�(�ߺ��� ������ ����)->true
		data.add(10);
		//���� �Է�(�ߺ��� ������ ����)->false
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		System.out.println(data.size());
		//������ �������� ����
		System.out.println(data);
		
		//index��ȣ�� �Ⱦ��� ������ ������ ����
		//ArrayList�� HashSet�� �޾ƿͼ� ����ϱ� ������
		ArrayList<Integer> list = new ArrayList<Integer>(data);
		for(int i : list) {
			System.out.println(i);
		}
		
		//iterator�� �̿��Ͽ� Set�� �ִ� ������ ����
		Iterator<Integer> iterData = data.iterator();
		while(iterData.hasNext()) {
			//�� ���� ���� �������� ����
			//�� ���Ŀ� ���� ������������ ���� ������
			System.out.println(iterData.next());
		}
		
		//foreach�� �ٷ� ����� ������ �Ϲ� for���� ��� �Ұ�
		for(int i:data) {
			System.out.println(i);
		}
	}
	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> user = new HashSet<Integer>();
		//���°��ȣ�Է�
		int i=1;
		while(user.size() != 6) {
			System.out.print(i+"��° ��ȣ �Է� : ");
			int iNum = sc.nextInt();
			//�ߺ�üũ
			if(user.add(iNum)) {
				i++;
			}
		}
		//����ó�� ���� �������
		ArrayList<Integer> userList = new ArrayList<Integer>(user);
		Collections.sort(userList);
		for(int j:userList) {
			System.out.print(j+"\t");
		}
		System.out.println();
		System.out.println(userList);
	}
}
