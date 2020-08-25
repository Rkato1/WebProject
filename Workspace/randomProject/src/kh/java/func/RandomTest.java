package kh.java.func;

import java.util.Random;
import java.util.Scanner;

//난수 - 임의의 수 Random
//임의의 값 또는 무작위로 만들어지는 알 수 없는 값

public class RandomTest {
	
	//금액을 위한 전역변수
	int money = 10;
	
	//전적을 위한 전역 변수들
	int w = 0;
	int l = 0;
	int d = 0;
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
	
	public void upDownGame() {		
		Scanner sc = new Scanner(System.in);
		boolean gm = true;
		//기록시스템을 만드는 변수
		//하지만 초기에 작업하지 않아서 그냥 주석처리
		//굳이 만들자면 loop에서 받아서 처리
		int rank = 0;
		int iTemp = 0;
		
		while(gm) {
			System.out.println("===Up & Down Game ===");
			System.out.print("1. Game Start\n2. Game Score\n3. End Game\n");
			int inum = sc.nextInt();
			
			System.out.println("선택 > "+ inum);
		
			switch(inum) {
			case 1:
				iTemp = upDownGameLoop();
				//rank가 0인 경우의 조건은
				//최초에 0으로 초기화 되었기 때문
				if(rank > iTemp || rank == 0) {
					rank = iTemp;
				}
				break;
			case 2:
				System.out.println("현재 최고 기록은 " + rank + "입니다.");
				//gm = false;
				break;
			case 3:
				System.out.println("게임이 종료됩니다.");
				gm = false;
				break;
			}
		}
	}
	
	int upDownGameLoop() {
		System.out.println("<< Game Start >>");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int ranNum = r.nextInt(99) + 1;
		for(;;) {
			System.out.print(i+1 + " 회차 번호 입력 : ");
			int j = sc.nextInt();
			if(j>=100 && j<1) {
				System.out.println("입력범위 오류");
			}
			else {
				if(j > i) {
					System.out.println("<< DOWN >>");
				}
				else if(j < i) {
					System.out.println("<< UP >>");
				}
				else {
					System.out.println("<< 정답 >>");
					break;
				}
			}
			i++;
		}
		return i;
	}
	
	public void baskinRobbins31Game() {
		Scanner sc = new Scanner(System.in);
		boolean gm = true;
		while(gm) {
			System.out.println("Baskin Robbins31 Game");
			System.out.print("1. Game Start\n2. Game Score\n3. End Game\n");
			int inum = sc.nextInt();
			
			System.out.println("> "+ inum);
		
			switch(inum) {
			case 1:
				baskinRobbins31Logic();
				break;
			case 2:
				//System.out.println("점수는 미구현.");
				gameScore();
				gm = false;
				break;
			case 3:
				System.out.println("게임이 종료됩니다.");
				gm = false;
				break;
			}
		}
	}
	
	void baskinRobbins31Logic() {
		System.out.println("<< Game Start >>");
		boolean gm = true;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		int temp = 1;
		while(gm) {
			System.out.print("Input Number(1~3) : ");
			i = sc.nextInt();
			for(int k = 0; k<i; k++) {
				System.out.print(temp + "!\n");
				if(temp == 31) {
					System.out.println("31! 나의 승리");
					System.out.println("<< 게임 종료 >>");
					w++;
					gm = false;
					break;
				}
				temp++;
			}
			if(gm != false) {
				int ranNum = r.nextInt(3) + 1;
				System.out.println("<Computer Turn>");
				for(int k = 0; k<ranNum; k++) {
					System.out.print(temp + "!\n");
					if(temp == 31) {
						System.out.println("31! 나의 패배");
						System.out.println("<< 게임 종료 >>");
						gm = false;
						l++;
						break;
					}
					temp++;
				}
			}
		}
	}
	
	void gameScore() {
		System.out.println("<< 당신의 전적 >>");
		System.out.printf("W I N : %d\n", w);
		System.out.printf("L O S E : %d\n", l);
		System.out.printf("D R A W : %d\n", d);
	}
	
	void gameMan(int userTot, int comTot) {
		
		int u = userTot;
		int c = comTot;
		if(u==c) {
			System.out.println("비김");
			d++;
		}
		else if(u>c) {
			System.out.println("당신의 승리");
			w++;
		}
		else {
			System.out.println("당신의 패배");
			l++;
		}
	}
	
	void battingMan(int wTemp, int lTemp, int mTemp) {
		int m1 = mTemp;
		int w1 = wTemp;
		int l1 = lTemp;
		if(w>w1) {
			money += m1;
			System.out.println("남은 돈 : "+ money);
		}
		else{
			if(l>l1) {
				money -= m1;
				System.out.println("남은 돈 : "+ money);
			}
			else {
				System.out.println("남은 돈 : "+ money);
			}
		}
	}
	
	public void diceGame() {
		Scanner sc = new Scanner(System.in);
		boolean gm = true;
		
		if(money < 0) {
			gm = false;			
		}
		else {
			while(gm) {
				System.out.println("== Dice Game ==");
				System.out.print("1. Game Start\n2. Game Score\n3. End Game\n");
				int inum = sc.nextInt();
			
				System.out.println("> "+ inum);
		
				switch(inum) {
				case 1:
					money-=1;
					diceGameLogic();
					break;
				case 2:
					//System.out.println("점수는 미구현.");
					gameScore();
					gm = false;
					break;
			case 3:
					System.out.println("게임이 종료됩니다.");
					gm = false;
					break;
				}
			}
		}
	}
	
	void diceGameLogic() {
		System.out.println("<< Game Start >>");
		boolean gm = true;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		if(money<0) {
			gm=false;
		}
		while(gm) {
			int uTot=0, cTot=0;
			for(int k=0; k<3; k++) {
				int i = r.nextInt(6)+1;
				uTot+=i;
				int j = r.nextInt(6)+1;
				cTot+=j;
			}
			System.out.println("당신의 주사위의 합 : "+ uTot);
			System.out.print("배팅을 하겠습니까(y/n)");
			char ch = sc.next().charAt(0);
			//System.out.println("컴퓨터 주사위의 합 : "+ cTot);
			if(ch=='y') {
				boolean btemp = true;
				int mTemp=0;
				while(btemp) {
					System.out.printf("얼마를 거시겠습니까?(0~%d)", money);
					mTemp = sc.nextInt();
					if(mTemp<=money && mTemp>=0) {
						btemp = false;
					}
					else {
						System.out.println("금액초과 혹은 잘못된 범위");
						//continue;
					}
				}
				int wTemp = w;
				int lTemp = l;
				gameMan(uTot, cTot);
				battingMan(wTemp, lTemp, mTemp);				
				gm=false;
			}
			else if(ch=='n') {
				gameMan(uTot, cTot);
				//battingMan(w, l, 0);
				gm=false;
			}
			else {
				System.out.println("잘못된 입력");
			}			
		}
	}
}
