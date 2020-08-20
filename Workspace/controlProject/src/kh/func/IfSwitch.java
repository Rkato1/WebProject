package kh.func;
import java.util.Scanner;

public class IfSwitch {
	
	public void ifTest() {
		//키보드로 값을 입력받기 위한 스캐너 설정
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10을 입력해보세요 : ");
		int inum = sc.nextInt();
		//만약 입력 받은 값이 10인 경우
		if(inum == 10) {
			System.out.print("입력한 값은 10");
		}
		else
		{
			System.out.print("입력한 값은 10이 아닌 " + inum);
		}
	}
	
	public void test() {
		System.out.print("========= 숫자 구별 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를  입력 하세요 : ");
		int inum = sc.nextInt();
		
		if(inum > 0) {
			System.out.println("당신이 입력한 수 " + inum + "은(는) 양수입니다.");
		}
		//else if(inum == 0) {
		if(inum == 0) {
			System.out.println("당신이 입력한 수 " + inum + "은(는) 0입니다.");
		}
		//else {
		if(inum < 0) {
			System.out.println("당신이 입력한 수 " + inum + "은(는) 음수입니다.");
		}
	}
	
	public void test1() {
		System.out.print("========= 두수 비교 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를  입력 하세요 : ");
		int inum = sc.nextInt();
		System.out.print("두번째 정수를  입력 하세요 : ");
		int inum1 = sc.nextInt();
		
		if(inum > inum1) {
			System.out.println(inum + ">" + inum1);
			System.out.println("첫번째 수가 더 큽니다.");
		}
		if(inum == inum1) {
			System.out.println(inum + "=" + inum1);
			System.out.println("두 수가 같습니다.");
		}
		if(inum < inum1) {
			System.out.println(inum + "<" + inum1);
			System.out.println("두번째 수가 더 큽니다.");
		}
	}
	
	public void test2() {
		System.out.print("========= 두수 비교 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를  입력 하세요(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		System.out.print("첫번째 정수를  입력 하세요 : ");
		int inum = sc.nextInt();
		System.out.print("두번째 정수를  입력 하세요 : ");
		int inum1 = sc.nextInt();
		
		if(ch == '+') {
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum + inum1);
			//System.out.println(inum + "+" + inum1 + "=" + (inum + inum1));
		}
		if(ch == '-') {
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum - inum1);
			//System.out.println(inum + "-" + inum1 + "=" + (inum - inum1));
		}
		if(ch == '*') {
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum * inum1);
			//System.out.println(inum + "*" + inum1 + "=" + (inum * inum1));
		}
		if(ch == '/') {
			System.out.printf("%d%c%d=%.6f", inum, ch, inum1, (double)inum / inum1);
			//System.out.println(inum + "/" + inum1 + "=" + ((double)inum / inum1));
		}
		
		/*
		sc.nextLine();
		String stemp = sc.nextLine();
		if(stemp.equals("abcd")) {
			System.out.println("abcd");
		}
		else {
			System.out.println("not abcd");
		}
		*/
	}
	
	public void test3() {
		System.out.print("========= 놀이공원 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int inum = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 15000원) : ");
		int inum1 = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 5000원) : ");
		int inum2 = sc.nextInt();
		
		if(inum == inum1 + inum2) {
			System.out.println("지불하실 총 금액은 " + (inum1*15000 + inum2*5000) + "원 입니다.");
		}
		else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}
	
	public void test4() {
		int itemp = 0;
		//맞춘개수 저장위한 변수
		
		System.out.print("========= 퀴즈 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 퀴즈\n");
		System.out.print("사과는 영어로 무엇일까요(1.apple,2.스티브 잡스)?");
		int inum = sc.nextInt();
		if(inum == 1) {
			System.out.println("정답!!!");
			itemp++;
		}
		else {
			System.out.println("땡!!");
		}
		
		System.out.print("두번째 퀴즈\n");
		System.out.print("바나나는 길어 길으면 기차 기차는(1.비싸,2.빨라)?");
		int inum1 = sc.nextInt();
		if(inum1 == 2) {
			System.out.println("정답!!!");
			itemp++;
			System.out.printf("총 %d문제를 맞췄습니다.", itemp);
		}
		else {
			System.out.println("땡!!");
			System.out.printf("총 %d문제를 맞췄습니다.", itemp);
		}
	}
	
	public void test5() {
		System.out.print("========= 심리테스트 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 술을 좋아하십니까(1.yes,2.no)?");		
		int inum = sc.nextInt();
		if(inum == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes,2.no)?");		
			int inum1 = sc.nextInt();
			if(inum1 == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			}
			else if(inum1 == 2) {
				System.out.println("술은 간에 좋지 않습니다.");
			}
			else {
				System.out.println("잘못된 숫자");
			}
		}
		else if(inum ==2) {
			System.out.print("당신은 이성친구가 있습니까(1.yes,2.no)?");		
			int inum1 = sc.nextInt();
			if(inum1 == 1) {
				System.out.println("올..ㅋ");
			}
			else if(inum1 == 2) {
				System.out.println("힘내요 ㅠㅠ");
			}
			else {
				System.out.println("잘못된 숫자");
			}
		}
		else {
			System.out.println("잘못된 숫자");
		}	
	}
	
	public void test6() {
		System.out.print("========= 대/소문자 변환 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");		
		char ch = sc.next().charAt(0);
		if(ch >= 65 && ch < 91) {
		//if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자를 입력 하였습니다.");
			System.out.println("소문자로 변환 : " + (char)(ch + 32));
			//System.out.println("소문자로 변환 : " + (char)(ch ^ 32));
			//xor연산
		}
		else if(ch >= 97 && ch < 123) {
		//else if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : " + (char)(ch - 32));
			//System.out.println("대문자로 변환 : " + (char)(ch ^ 32));
			//xor연산
		}
		else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요");
		}
	}
	
	public void test7() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int inum = sc.nextInt();
		System.out.print("===== 결 과=====\n");
		if(inum == 0) {
			System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.", inum);
		}
		else {
			if((inum % 3 == 0) && (inum % 4 == 0)) {
				System.out.printf("[%d]은(는) 3의 배수면서 4의 배수입니다.", inum);
			}
			else if(inum % 3 == 0) {
				System.out.printf("[%d]은(는) 3의 배수입니다.", inum);
			}
			else if(inum % 4 == 0) {
				System.out.printf("[%d]은(는) 4의 배수입니다.", inum);
			}
			else {
				System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.", inum);
			}
		}
	}
	
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 정수를 입력하세요 : ");
		int inum = sc.nextInt();
		
		switch(inum) {
		case 1:
			System.out.print("1을 입력했습니다.");
			break;
		case 2:
			System.out.print("2를 입력했습니다.");
			break;
		case 3:
			System.out.print("3을 입력했습니다.");
			break;
		default:
			System.out.print("잘못입력했습니다.");
			break;
		}
	}
	
	public void test9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 달을 입력하세요 : ");
		int inum = sc.nextInt();
		
		//break를 일부러 안줘서 출력되게 만드는 경우
		switch(inum) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(inum + "월달은 29일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(inum + "월달은 30일까지 있습니다.");
			break;
		/*
		case 1:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(inum + "월달은 29일까지 있습니다.");
			break;
		case 3:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
		case 4:
			System.out.println(inum + "월달은 30일까지 있습니다.");
			break;
		case 5:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
		case 6:
			System.out.println(inum + "월달은 30일까지 있습니다.");
			break;
		case 7:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
		case 8:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
		case 9:
			System.out.println(inum + "월달은 30일까지 있습니다.");
			break;
		case 10:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
		case 11:
			System.out.println(inum + "월달은 30일까지 있습니다.");
			break;
		case 12:
			System.out.println(inum + "월달은 31일까지 있습니다.");
			break;
			*/
		}
	}
	
	public void test10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("장학금 지불 시스템입니다.\n학점을 입력하세요(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A':
			System.out.println("수고하셨습니다. 장학금을 100%지급해드리겠습니다.");
			break;
		case 'B':
			System.out.println("아쉽군요. 장학금을 50%지급해드리겠습니다.");
			break;
		case 'C':
			System.out.println("장학금을 바라시면 좀더 열심히 해주세요.");
			break;
		case 'D':
			System.out.println("크흠.......");
			break;
		case 'F':
			System.out.println("학사경고입니다!!!");
			break;
		}
	}
	
	public void test11() {
		System.out.print("========= 두수 비교 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를  입력 하세요(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		System.out.print("첫번째 정수를  입력 하세요 : ");
		int inum = sc.nextInt();
		System.out.print("두번째 정수를  입력 하세요 : ");
		int inum1 = sc.nextInt();
		
		switch(ch) {
		case '+':
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum + inum1);
			break;
		case '-':
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum - inum1);
			break;
		case '*':
			System.out.printf("%d%c%d=%d", inum, ch, inum1, inum * inum1);
			break;
		case '/':
			System.out.printf("%d%c%d=%f", inum, ch, inum1, (double)inum / inum1);
			break;
		}		
	}
	
	public void test12() {
		System.out.print("========= 두수 비교 프로그램 =========\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int inum = sc.nextInt();
		
		switch(inum/10) {
		case 9:
			System.out.println(inum + "점 ==> A 등급");
			break;
		case 8:
			System.out.println(inum + "점 ==> B 등급");
			break;
		case 7:
			System.out.println(inum + "점 ==> C 등급");
			break;
		case 6:
			System.out.println(inum + "점 ==> D 등급");
			break;
		default:
			if(inum < 0 || inum > 100) {
				System.out.println("잘못된 입력(0~100사이 입력)");
			}
			else {
				System.out.println(inum + "점 ==> F 등급");	
			}
			break;
		}
		
	}
}
