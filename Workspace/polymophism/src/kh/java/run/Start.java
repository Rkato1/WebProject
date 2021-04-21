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
		
		
		//상속관계로 이루어져 다형성이 적용된 경우,
		//메소드 오버라이딩이 되어있으면, 오버라이딩 된 메소드코드가 우선적으로 수행
		//=>동적 바인딩
		//다형성
		Animal t1 = new Tiger();
		t1.breath(); //휴~
		//upcating에 의해서 부모타입 객체에 있는
		//변수와 메소드만 사용가능함 
		//있기는 한데 쓸수는 없음
		//t1.hunting();
		//굳이 쓴다면 다운캐스팅을 사용(부모자식간)
		//캐스팅-클래스간의 형변환
		((Tiger)t1).hunting();
		
		
		//다형성 이용 예시
		//Object는 모든 클래스의 조상클래스
		Object o1 = new Animal();
		Object o2 = new Tiger();
		Object o3 = new Scanner(System.in);
		Object o4 = new Random();		
		 
	}

}
