package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetTest {
	public void main() {
		HashSet<Integer> data = new HashSet<Integer>();
		//값을 입력(중복이 허용되지 않음)->true
		data.add(10);
		//값을 입력(중복이 허용되지 않음)->false
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		System.out.println(data.size());
		//순서도 유지하지 않음
		System.out.println(data);
		
		//index번호를 안쓰기 때문에 꺼내기 힘듬
		//ArrayList로 HashSet을 받아와서 출력하기 용이함
		ArrayList<Integer> list = new ArrayList<Integer>(data);
		for(int i : list) {
			System.out.println(i);
		}
		
		//iterator를 이용하여 Set에 있는 데이터 추출
		Iterator<Integer> iterData = data.iterator();
		while(iterData.hasNext()) {
			//각 값에 직접 접근한후 저장
			//그 이후에 값이 없어질때까지 값을 보여줌
			System.out.println(iterData.next());
		}
		
		//foreach는 바로 출력이 되지만 일반 for문은 사용 불가
		for(int i:data) {
			System.out.println(i);
		}
	}
	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> user = new HashSet<Integer>();
		//몇번째번호입력
		int i=1;
		while(user.size() != 6) {
			System.out.print(i+"번째 번호 입력 : ");
			int iNum = sc.nextInt();
			//중복체크
			if(user.add(iNum)) {
				i++;
			}
		}
		//정렬처리 따로 해줘야함
		ArrayList<Integer> userList = new ArrayList<Integer>(user);
		Collections.sort(userList);
		for(int j:userList) {
			System.out.print(j+"\t");
		}
		System.out.println();
		System.out.println(userList);
	}
}
