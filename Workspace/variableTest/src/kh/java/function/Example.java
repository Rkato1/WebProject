package kh.java.function;

import java.util.Scanner;

public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.println("========== 결과 ==========");
		System.out.printf("더하기 결과 : %d\n", first + second);
		System.out.printf("빼기 결과 : %d\n", first - second);
		System.out.printf("곱하기 결과 : %d\n", first * second);
		System.out.printf("나누기 몫 : %d\n", first / second);
		System.out.printf("나누기 나머지 : %d\n", first % second);
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		double first = sc.nextDouble();
		System.out.print("세로 길이 입력 : ");
		double second = sc.nextDouble();
		System.out.println("========== 결과 ==========");
		System.out.printf("면적 : %f\n", first * second);
		System.out.printf("둘레 : %f\n", 2 * (first + second));
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어단어 입력 : ");
		String str = sc.nextLine();
		System.out.printf("첫번째 문자 : %c\n", str.charAt(0));
		System.out.printf("두번째 문자 : %c\n", str.charAt(1));
		System.out.printf("세번째 문자 : %c\n", str.charAt(2));
		
	}
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.printf("%c의 유니코드 값 : %d\n", ch, (int)ch);
	}
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		double first = sc.nextDouble();
		System.out.print("수학 점수 입력 : ");
		double second = sc.nextDouble();
		System.out.print("영어 점수 입력 : ");
		double third = sc.nextDouble();
		System.out.println("========== 결과 ==========");
		System.out.printf("총점 : %d\n", (int)(first + second + third));
		System.out.printf("평균 : %d\n", (int)((first + second + third)/3));
		
	}
}
