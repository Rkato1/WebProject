package kh.func;

import java.util.Scanner;
//Scanner 기능을 사용하기 위해 import 선언

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
	
	public void scan() {
		System.out.print("원하는 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		//Scanner를 사용하기 위해 클래스 생성
		int num = sc.nextInt();
		//정수 입력받기(값을 저장하기 위한 지역변수 선언)
		System.out.println(num);
		
		System.out.print("원하는 실수 입력 : ");
		double num1 = sc.nextDouble();
		//실수 입력받기(값을 저장하기 위한 지역변수 선언)
		System.out.println(num1);
		
		System.out.print("원하는 문자열 입력 : ");
		String stemp = sc.next();
		//문자열 입력받기(값을 저장하기 위한 지역변수 선언)
		//sc.next()는 공백 존재시 구분이 불가능함(발생시 입력 종료)
		System.out.println(stemp);
		
		System.out.print("원하는 문자열 입력 : ");
		sc.nextLine();
		//현재 Buffer에 남아있는 개행문자 처리
		//위에서 loop 발생으로 넣어야함
		String stemp0 = sc.nextLine();
		//문자열 입력받기(값을 저장하기 위한 지역변수 선언)
		//sc.nextLine() 띄어쓰기 가능
		System.out.println(stemp0);
		
		System.out.print("원하는 문자 입력 : ");
		char ch = sc.next().charAt(0);
		//문자열 입력받기(그 중 첫 번째 인자를 받아옴)
		System.out.println(ch);
	}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("키(실수) 입력 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(실수) 입력 : ");
		double weight = sc.nextDouble();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		
		System.out.printf("이름 : %s, 나이 : %d, 주소 : %s, 키 : %d, 몸무게 : %.1f, 성별 : %c\n", name, age, address, (int)height, weight, gender);
		//.1f는 소수점 첫째 자리까지 출력
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int inum = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int inum1 = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int inum2 = sc.nextInt();
		int itemp = inum + inum1 + inum2;
		double dtemp = itemp / 3;
		System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %.2f 입니다!", itemp, dtemp);
	}
}
