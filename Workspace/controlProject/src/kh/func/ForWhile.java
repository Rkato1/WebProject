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
		
		//for
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		*/
		
		//while
		int i = 0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	public void test1() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까?");
		int j = sc.nextInt();
		//for
		/*
		for(int i = 0; i < j; i++) {
			System.out.println("안녕하세요");
		}
		*/
		
		//while
		int i = 0;
		while(i<j) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);		
		int j = sc.nextInt();
		System.out.println(j + "단 입니다.");
		//for
		/*
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
		*/
		
		//while
		int i = 1;
		while(i<=9) {
			System.out.println(j + " * " + i + " = " + i*j);
			i++;
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까? ");
		int j = sc.nextInt();
		System.out.println(j + "단 입니다.");
		
		//for
		/*
		for(int i = 1; i <= 9; i++) {
			System.out.println(j + " * " + i + " = " + i*j);
		}
		*/
		
		//while
		int i = 1;
		while(i<=9) {
			System.out.println(j + " * " + i + " = " + i*j);
			i++;
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		//for
		/*
		for(int i = 0; i < 5; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			int j = sc.nextInt();
			tot += j;
		}
		*/
		
		//while
		int k = 0;
		while(k<5) {
			System.out.print("정수 값을 입력하시오 : ");
			int j = sc.nextInt();
			tot += j;
			k++;
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
		//for
		/*
		for(int k = i; k <= j; k++) {
			tot += k;
		}
		*/
		
		//while
		
		int k = i;
		while(k<=j) {
			tot += k;
			k++;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", i, j, tot);
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int i = sc.nextInt();
		int tot = 0;
		//for
		/*
		for(int j = 1; j <= i; j++) {
			if(j%2==0) {
				tot += j;
			}
		}
		*/
		//do while
		int j = 1;	
			
		while(j<=i) {
			if(j%2==0) {
				tot += j;
			}
			j++;
		}
		System.out.printf("짝수들의 합은 : %d", tot);
	}
	
	public void whileTest() {
		int i = 0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
			if(i == 3) {
				break;
			}
		}
		
		do {
			System.out.println("안녕하세요 2트");
			i++;
		}
		while(i<5);
		//조건문이 뒤에 있기 때문에 같은 조건이라도 1번을 더 반복함
	}
	
	public void forTest2() {
		//각 단
		/*
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=2; j<=9; j++) {
				System.out.print(i+"*" +j + "=" + i*j + " ");
			}
			System.out.println();
		}
		*/
		
		//각 단 ver2
		for(int i=1; i<=9; i++) {
			//System.out.println(i+"단");
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*" +i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	public void forTest3() {
		//별찍기1
		/*
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		*/
		
		//별찍기2
		/*
		for(int i=0; i<5; i++) {
			System.out.println("*");
		}
		*/
		
		//별찍기3
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//별찍기4
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		*/
		
		//별찍기5
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		*/
		
		//별찍기6
		/*
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(i+1+j);
			}
			System.out.println();
		}
		*/
		
		//별찍기7
		/*
		for(int j=4; j>=0; j--) {
			for(int i=0; i<5; i++) {
				System.out.print(i+1+j);
			}
			System.out.println();
		}
		*/
		
		//별찍기8
		/*
		int i, j, k;
		
		for(j=0; j<5; j++) {
			for(i=0; i<j+1; i++) {
				System.out.print("*");
			}
			for(k=4; k<5-i; k--) {
				System.out.print("");
			}
			System.out.println();
		}
		*/
		
		//별찍기9
		/*
		int i, j, k;
				
		for(j=0; j<5; j++) {
			for(i=0; i<5-j; i++) {
				System.out.print("*");
			}
			for(k=4; k<5-i; k--) {
				System.out.print("");
			}
			System.out.println();
		}
		*/
		
		//별찍기10
		/*
		int i, j, k;
		
		for(j=5; j>0; j--) {
			for(i=0; i<5-j; i++) {
				System.out.print(" ");
			}
			for(k=0; k<j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//별찍기11
		/*
		int i, j, k;
		
		for(j=5; j>0; j--) {
			for(i=0; i<j-1; i++) {
				System.out.print(" ");
			}
			for(k=0; k<6-j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//별찍기12
		/*
		int i, j, k;
		for(j=0; j<10; j++) {
			if(j <= 5) {
				for(i=1; i<j+1; i++) {
					System.out.print("*");
				}
				for(k=4; k<5-i; k--) {
					System.out.print(" ");
				}
			}
			else {
				for(i=4; i>j-6; i--) {
					System.out.print("*");
				}
				for(k=4; k<j-5; k--) {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		*/
		
		//별찍기 13
		/*
		int i, j, k;
		for(j=0; j<9; j++) {
			if(j <= 4) {
				for(i=10; i>j+5; i--) {
					System.out.print("*");
				}
				for(k=4; k<j-5; k--) {
					System.out.print(" ");
				}
			}
			else {
				for(i=1; i<j-2; i++) {
					System.out.print("*");
				}
				for(k=4; k<5-i; k--) {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		*/
		
		//별찍기14, 모래시계
		/*
		int h, i, j, k, itemp = 0;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=0; i<h; i++) {
					System.out.print("*");
				}
				for(j=10; j > itemp; j--) {
					System.out.print(" ");
				}
				for(k=0; k<h; k++) {
					System.out.print("*");
				}
				itemp+=2;
			}
			else {
				for(i=4; i>h-4; i--) {
					System.out.print("*");
				}
				for(j=10; j > itemp-4; j--) {
					System.out.print(" ");
				}
				for(k=4; k>h-4; k--) {
					System.out.print("*");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//별찍기15 반모래시계, 아래
		/*
		int h, i, j, k, itemp = 1;
		for(h=0; h<5; h++) {
			for(i=4; i>h; i--) {
				System.out.print(" ");
			}
			for(j=0; j < itemp; j++) {
				System.out.print("*");
			}
			for(k=4; k>h; k--) {
				System.out.print(" ");
			}
			itemp+=2;
			System.out.println();
		}
		*/
		
		//별찍기16 반모래시계, 위
		/*
		int h, i, j, k, itemp = 9;
		for(h=0; h<5; h++) {
			for(i=5; i>5-h; i--) {
				System.out.print(" ");
			}
			for(j=0; j < itemp; j++) {
				System.out.print("*");
			}
			for(k=5; k>5-h; k--) {
				System.out.print(" ");
			}
			itemp-=2;
			System.out.println();
		}
		*/
		
		//별찍기17 모래시계
		/*
		int h, i, j, k, itemp = 1;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=4; i>h; i--) {
					System.out.print(" ");
				}
				for(j=0; j < itemp; j++) {
					System.out.print("*");
				}
				for(k=4; k>h; k--) {
					System.out.print(" ");
				}
				itemp+=2;
			}
			else {
				for(i=0; i<h-4; i++) {
					System.out.print(" ");
				}
				for(j=4; j < itemp; j++) {
					System.out.print("*");
				}
				for(k=0; k<h-4; k++) {
					System.out.print(" ");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//별찍기18 공백마름모
		/*
		int h, i, j, k, itemp = 1;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=5; i>h; i--) {
					System.out.print("*");
				}
				for(j=1; j <= itemp; j++) {
					System.out.print(" ");
				}
				for(k=5; k>h; k--) {
					System.out.print("*");
				}
				itemp+=2;
			}
			else {
				for(i=0; i<h-3; i++) {
					System.out.print("*");
				}
				for(j=4; j < itemp; j++) {
					System.out.print(" ");
				}
				for(k=0; k<h-3; k++) {
					System.out.print("*");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//모래시계19 공백모래시계
		/*
		int h, i, j, k, itemp = 9;
		for(h=0; h<10; h++) {
			if(h <= 4) {
				for(i=0; i<h; i++) {
					System.out.print("*");
				}
				for(j=itemp; j > 0; j--) {
					System.out.print(" ");
				}
				for(k=0; k<h; k++) {
					System.out.print("*");
				}
				itemp-=2;
			}
			else {
				for(i=5; i>h-5; i--) {
					System.out.print("*");
				}
				for(j=0; j <= itemp + 1; j++) {
					System.out.print(" ");
				}
				for(k=5; k>h-5; k--) {
					System.out.print("*");
				}
				itemp+=2;
			}
			System.out.println();
		}
		*/
		
		/*
		//모래시계 19, 공백모래시계
		int h, i, j, k, itemp = 1;
		for(h=0; h<9; h++) {
			if(h <= 4) {
				for(i=0; i<h+1; i++) {
					System.out.print("*");
				}
				for(j=10; j > itemp; j--) {
					System.out.print(" ");
				}
				for(k=0; k<h+1; k++) {
					System.out.print("*");
				}
				itemp+=2;
			}
			else {
				for(i=4; i>h-5; i--) {
					System.out.print("*");
				}
				for(j=10; j > itemp-4; j--) {
					System.out.print(" ");
				}
				for(k=4; k>h-5; k--) {
					System.out.print("*");
				}
				itemp-=2;
			}
			System.out.println();
		}
		*/
		
		//무한반복 생성코드
		//for문
		/*
		for(;;) {
			System.out.println("무한반복");
		}
		*/
		
		//while문
		/*
		while(true) {
			System.out.println("무한반복");
		}
		*/
		
		//분기점
		/*
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			System.out.print("숫자 입력(1을 입력하면 그만출력함) : ");
			int j = sc.nextInt();
			if(j == 1) {
				System.out.println("1 입력 break; 실행");
				//탈출하는 분기점 코드
				//반복문 종료
				break;
			}
			else {
				System.out.println( j + " 입력 continue; 실행");
				//계속 실행하게 만드는 분기점 코드
				//밑에 뭐가 있어도 바로 최상단으로 이동
				//for문은 증감처리부터 다시 시작
				//while문은 최상단부터 다시 시작
				//continue이후코드는 실행되지 않음
				continue;
			}
		}
		*/
	}
	
	public void forWhileTest4() {
		for(int i=0; i<=5; i++) {
			System.out.println(i + ".외부 for문");
			for(int j=0; j<=5; j++) {
				if(i==3) {
					break;
				}
				System.out.println(j + ".내부 for문");
			}
		}
	}	
}
