package kh.func;

import java.util.Scanner;

public class ForWhile {
	public void forTest() {
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.println("hi");
		}
		
		for(int i=5; i>=0; i--) {
			System.out.println("Hello");
		}
		*/
		for(int i = 0; i<100; i++) {
			System.out.println(i+1);
		}
	}
	
	public void test() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	public void test1() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까?");
		int j = sc.nextInt();
		for(int i = 0; i < j; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);		
		int j = sc.nextInt();
		System.out.println(j + "단 입니다.");
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까? ");
		int j = sc.nextInt();
		System.out.println(j + "단 입니다.");
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			int j = sc.nextInt();
			tot += j;
		}
		System.out.println("입력한 5개의 정수의 합 : " + tot);
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int i = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int j = sc.nextInt();
		int tot = 0;
		for(int k = i; k <= j; k++) {
			tot += k;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", i, j, tot);
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int i = sc.nextInt();
		int tot = 0;
		for(int j = 1; j <= i; j++) {
			if(j%2==0) {
				tot += j;
			}
		}
		System.out.printf("짝수들의 합은 : %d", tot);
	}
}
