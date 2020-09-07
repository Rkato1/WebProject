package kh.java.func;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	public void main() {
		//Key, Value
		//HashMap<K,V>
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//�� ����
		//Key�������� ����
		map.put(2,"�ȳ�");
		map.put(0,"Hello");
		map.put(1,"Hi");
		System.out.println(map.get(2));
		System.out.println(map.get(1));
		System.out.println(map.get(0));
		map.put(3,"H!I!");
		System.out.println(map);
		//������ key���� ������ ������
		map.put(2,"�ȳ����");
		System.out.println(map);
		//key���� ������ null�� ����
		System.out.println(map.get(4));
		
		//����(Ű��)
		map.remove(1);
		System.out.println(map);
		//���� ()�� �� Key���� �����ϴ��� ���� ��ȯ
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(3));
	}
	
	public void main2() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		System.out.println(map.get("two"));
		//�����
		map.put("three", 5);
		System.out.println(map.get("three"));
		
		map.put("asdf", 101010);
		map.put("kh", 999);
		//map�� ����ִ� Ű������ ������
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for(String str : keys) {
			System.out.println("Key : "+str+" / Value : "+map.get(str));
		}
	}
}
