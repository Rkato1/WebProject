package kh.java.func;

import java.util.Scanner;

public class MethodTest2 {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		//동일 패키지면 import를 따로 하지 않아도
		//호출이 가능하다
		//타 프로젝트에서는 import를 할수 없고
		//library개념을 사용해야함
		Calc c = new Calc();
		int result = c.plus(num1, num2);
		System.out.println("두 수의 합은 : "+result);
	}
	
	public void method1() {
		//string은 참조형이지만 기본형처럼 사용됨
		//배열은 참조형
		int arr[] = {1,2,3,4,5};
		//얕은복사(주소값 공유), 서로 값 영향줌
		//int arr1[] = arr;
		
		//call by value
		//arr[2]의 값을 가져다 변환
		//그러므로 arr[2]의 값은 변하지 않음
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
