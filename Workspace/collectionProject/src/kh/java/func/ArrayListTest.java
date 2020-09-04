package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public void test() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<String> ar1 = new ArrayList<String>();
		//가장 마지막 인덱스에 추가
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
		//수정
		ar1.set(0, "1");
		//삭제(알아서 인자 조절됨)
		ar1.remove(1);
		//전체삭제
		//ar1.clear();
		
		//length사용 불가(사실상의 동적배열)
		//for(int i=0;i<ar.length;i++) {
		//대신 사용하는 것이 size메소드
		for(int i=0;i<ar.size();i++) {
			//ArrayList.get(index)
			//index번째 위치한 값 반환
			System.out.print(ar.get(i)+"\t");
		}
		System.out.println();
		for(int i=0;i<ar1.size();i++) {
			//ArrayList.get(index)
			//index번째 위치한 값 반환
			System.out.print(ar1.get(i)+"\t");
		}
		System.out.println();
		//foreach문
		for(String str : ar1) {
			System.out.print(str+"\t");
		}
		System.out.println();
		//정렬
		Collections.sort(ar);
		for(int i=0;i<ar.size();i++) {
			//ArrayList.get(index)
			//index번째 위치한 값 반환
			System.out.print(ar.get(i)+"\t");
		}
		
		//foreach문
		for(int i : ar) {
			System.out.print("\n"+i+"\t");
		}
	}
}
