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
		
		int num1 = 2147483647;
		long res = (long)num1 + 1;
		//int 범위를 초과했기 때문에 원하는 값을 도출하기 위해 강제 형변환을 해줘야함
		System.out.println(res);
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2;
		//java에서 계산시 기본 int로 치환해서 오류
		int b3 = b1 + b2;
		byte b4 = (byte)(b1 + b2);
		//해결 방법 , 위는 연산 이후 형변환, 아래는 형변환 이후 연산(처리가 조금 다름, 범위 초과우려)
		
		System.out.println("11");
		System.out.println("22");
		System.out.print("11");
		System.out.print("22");
		//println은 출력 후 줄 바꿈, print는 출력만		
	}
	public void func2() {
		String name = "김현식";
		int age = 28;
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살입니다.");
		System.out.printf("제 이름은 %s이고 나이는 %d살입니다.", name, age);
		//printf는 %로 자료형 구별에 편함
		//%d 정수, %o 8진수, %x 16진수
		//%f 실수(소수점아래6자리)  %e 지수형태표현
		//%g %e, %f 중 더 짧은 표현을 사용
		//%A 16진수 실수
		//%c 문자, %s 문자열
		//\ back slash escape문자
		//\t tab만큼 공간확보 \n 줄 바꿈
		//\' \" '와 "를 출력할 때 사용 \\ \출력
	}
	public void func3() {
		int iNum = 100;
		long lNum = 9999000000000l;
		float fNum = 486.520f;
		double dNum = 5697.890123;
		char cTemp = 'A';
		String sTemp = "Hello JAVA";
		boolean bTemp = true;
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(cTemp);
		System.out.println(sTemp);
		System.out.println(bTemp);
	}
	public void func4() {
		String sName = "김현식";
		int age = 28;
		char cGender = 'M';
		String sAddress = "경기도";
		String sPhoneNumber = "01012345678";
		String sEMail = "silvestr0720@gmail.com";
		String sName0 = "홍길동";
		int age0 = 20;
		char cGender0 = 'M';
		String sAddress0 = "서울";
		String sPhoneNumber0 = "01087654321";
		String sEMail0 = "honggildong@gmail.com";
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
		System.out.println("------------------------------------------------------------------------");
		System.out.print(sName + "\t");
		System.out.print(age + "\t");
		System.out.print(cGender + "\t");
		System.out.print(sAddress + "\t");
		System.out.print(sPhoneNumber + "\t");
		System.out.print(sEMail + "\n");
		System.out.println("------------------------------------------------------------------------");
		System.out.print(sName0 + "\t");
		System.out.print(age0 + "\t");
		System.out.print(cGender0 + "\t");
		System.out.print(sAddress0 + "\t");
		System.out.print(sPhoneNumber0 + "\t");
		System.out.print(sEMail0 + "\n");
	}
}
