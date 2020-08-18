package kh.func;

public class Variable {
	public void func1() {
		boolean bool1 = true;
		boolean bool2 = false;
		//논리형 변수
		char ch1 = 'a';
		//문자 변수
		int num = 10;
		//정수형 변수
		double d = 3.14;
		double d2;
		//변수 선언 후 초기화하지 않고 사용하는 경우 에러 발생
		d2 = 5.12;
		//실수형 변수
		
		long lNum = 10000000000l;
		//범위가 더 큰 정수형 변수
		float f = 3.14f;
		//범위가 작은 실수형 변수(오차 범위가 커져서 잘 사용하지 않음)
		
		final double PI = 3.14;
		//final 키워드가 있을때에는 최초 초기화 이후 값 변경이 불가능
		
		String str = "abcdef";
		//문자열 변수
		System.out.println(str.charAt(0));
		//이 변수의 첫번째 자리만 출력하기
	}
}
