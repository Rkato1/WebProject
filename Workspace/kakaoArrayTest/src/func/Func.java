package func;

import java.util.ArrayList;
import java.util.Scanner;

public class Func {
	Scanner sc;
	//캐시의 크기
	int cacheSize;
	//도시이름 입력할 변수
	String city;	
	//저장될 도시
	ArrayList<String> cities;
	//인자에 접근할 변수
	int index;
	//입력 판별 변수
	boolean btemp=true;
	//임시 저장될 캐시리스트
	ArrayList<String> cacheList;
	//총 실행시간
	int totTime;
	public Func() {
		sc = new Scanner(System.in);
		cities = new ArrayList<String>();
		cacheList = new ArrayList<String>();
	}
	
	public void main() {
		while(true) {
			System.out.print("캐시의 크기 입력 : ");
			cacheSize = sc.nextInt();
			if(cacheSize >=0 && cacheSize <= 30) {
				//0이 값으로 들어감
				//cacheList = new ArrayList<String>(cacheSize);
				break;
			}else {
				System.out.println("0부터 30사이의 값 입력");
			}
		}
		while(true) {
			System.out.print("도시 이름 입력 : ");
			city = sc.next();
			if((city.length()<21)) {
				for(int i=0; i<city.length(); i++) {
					char ch = city.charAt(i);
					if(!((ch >= 65 && ch <=90)||(ch>=97 && ch<=122))) {
						System.out.println("영문자만 입력");
						btemp = false;
						break;
					}
				}
				if(btemp == true) {					
					//엄밀히 따지자면 다른 리스트에 넣어야함
					//하지만 기존 리스트 출력하라고 하지 않아서 대충 처리
					cities.add(city.toLowerCase());
				}else {
					btemp = true;
				}
			} else {
				System.out.println("문자열 길이초과 혹은 공백 발견");
				break;
			}
			if(cities.size()>100001) {
				System.out.println("최대 입력갯수 도달");
				break;
			}
			System.out.print("더 입력하시겠습니까?(y/n): ");
			if(sc.next().charAt(0)=='n') {
				break;
			}
		}
		for(int i=0; i<cities.size(); i++) {
			if((cacheList.contains(cities.get(i))&&(cacheList.size()!=0))) {
				//Least Recently Used
				if(cacheList.size()==cacheSize) {
					System.out.println(cacheList.get(0));
					cacheList.remove(0);
					cacheList.add(cities.get(i));
				}
				totTime+=1;
			}else {
				cacheList.add(cities.get(i));
				totTime+=5;
			}
		}
		System.out.println("총 실행시간은 : "+totTime);
	}
}
