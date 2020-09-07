package kh.java.func;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	public void main() {
		//Key, Value
		//HashMap<K,V>
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//값 대입
		//Key기준으로 정렬
		map.put(2,"안녕");
		map.put(0,"Hello");
		map.put(1,"Hi");
		System.out.println(map.get(2));
		System.out.println(map.get(1));
		System.out.println(map.get(0));
		map.put(3,"H!I!");
		System.out.println(map);
		//동일한 key값이 있을시 덮어쓰기됨
		map.put(2,"안녕못함");
		System.out.println(map);
		//key값이 없으면 null이 나옴
		System.out.println(map.get(4));
		
		//삭제(키값)
		map.remove(1);
		System.out.println(map);
		//현재 ()에 들어간 Key값이 존재하는지 여부 반환
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(3));
	}
	
	public void main2() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		System.out.println(map.get("two"));
		//덮어쓰기
		map.put("three", 5);
		System.out.println(map.get("three"));
		
		map.put("asdf", 101010);
		map.put("kh", 999);
		//map에 들어있는 키값들을 가져옴
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for(String str : keys) {
			System.out.println("Key : "+str+" / Value : "+map.get(str));
		}
	}
}
