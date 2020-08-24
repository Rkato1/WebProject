package kh.java.func;

import java.util.Random;
import java.util.Scanner;

//난수 - 임의의 수 Random
//임의의 값 또는 무작위로 만들어지는 알 수 없는 값

public class RandomTest {
	public void randomTest1() {
		//난수 사용 준비
		Random r = new Random();
		
		for(int i=0; i<5; i++) {
			//int 범위 내의 숫자 중 임의의 값을 정수형 변수에 대입 
			//int ranNum = r.nextInt();
			//범위 제한(0~9)
			int ranNum = r.nextInt(10);
			//1부터 10까지의 난수를 정수형 변수에 대입
			int ranNum1 = r.nextInt(10) + 1;
			//20~35
			int ranNum2 = r.nextInt(16) + 20;
		
			//System.out.println(i+1 + "번째 난수는 " + ranNum);
			System.out.println(i+1 + "번째 난수는 " + ranNum1);
		}
	}
	
	public void randomTest2() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 동전 앞 뒤 맞추기 ===");
		System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
		int inum = sc.nextInt();
		int ranNum = r.nextInt(2) + 1;
		
		if(ranNum == inum) {
			System.out.println("\n맞췄습니다^^");
		}
		else{
			System.out.println("\n땡!틀렸습니다!");
		}
	}
	
	public void stringTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자열 입력 : ");
		String str = sc.next();
		System.out.print("두번째 문자열 입력 : ");
		String str1 = sc.next();
		
		//문자열의 비교는 경우가 조금 다름
		//if(str == str1) {
		//equals 메소드를 사용해야 같다고 비교 가능
		if(str.equals(str1)) {
			System.out.println("문자열이 같다!");
		}
		else {
			System.out.println("문자열이 다르다!");
		}
	}
	
	public void randomTest3() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		int inum = sc.nextInt();
		int ranNum = r.nextInt(3) + 1;
		String str1 = "";
		String str2 = "";
		char c = ' ';
		
		
		//승리조건
		//inum - ranNum이 -2나 1이면 이김
		//반대로  -1이나 2면 컴퓨터가 이김
		
		//비교하는 방법
		if(inum == 1) {
			str1 = "가위";
			switch(ranNum) {
			case 1:
				str2 = "가위";
				c = 'T';
				break;
			case 2:
				str2 = "바위";
				c = 'L';
				break;
			case 3:
				str2 = "보";
				c = 'W';
				break;
			default:
				break;
			}
		}
		else if(inum == 2) {
			str1 = "바위";
			switch(ranNum) {
			case 1:
				str2 = "가위";
				c = 'W';
				break;
			case 2:
				str2 = "바위";
				c = 'T';
				break;
			case 3:
				str2 = "보";
				c = 'L';
				break;
			default:
				break;
			}
		}
		else if(inum == 3) {
			str1 = "보";
			switch(ranNum) {
			case 1:
				str2 = "가위";
				c = 'L';
				break;
			case 2:
				str2 = "바위";
				c = 'W';
				break;
			case 3:
				str2 = "보";
				c = 'T';
				break;
			default:
				break;
			}
		}
		else {
			System.out.println("잘못된 입력");
		}
		System.out.println("======== 결과 ========");
		System.out.println("당신은 " + str1 + "를 냈습니다.");
		System.out.println("컴퓨터는 " + str2 + "를 냈습니다.");
		System.out.println("======================");
		if(c == 'W') {
			System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
		}
		else if(c == 'L') {
			System.out.println("당신이 졌습니다.ㅠ.ㅠ");
		}
		else if(c == 'T') {
			System.out.println("비겼습니다.ㅠ.ㅠ");
		}
		else {
			System.out.println("오류발생");
		}
		
	}
}
