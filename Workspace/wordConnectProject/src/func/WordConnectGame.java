package func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//짜던코드
public class WordConnectGame {
	Scanner sc;
	ArrayList<String> words;
	BufferedReader br = null;
	
	//승패 변수
	int w, l;
	//잘못기입했을때의 수
	int count;
	//로직체크
	boolean btemp = true;
	//첫글자와 끝글자 저장
	char ch=' ', ch1;
	public WordConnectGame() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		words = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader("word.txt");
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				//끝까지 다 읽었으면
				if(line == null) {
					break;
				}
				words.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void main() {
		while(true) {
			System.out.println("\n----- 끝말잇기 -----\n");
			System.out.println("1.게임 시작");
			System.out.println("2.전적 확인");
			System.out.println("3.프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				wordGameChoose();
				break;
			case 2:
				System.out.printf("승리 : %d승\n패배 : %d패\n", w, l);
				break;
			case 3:
				System.out.println("시스템 종료");
				return;
			default:
				System.out.println("1~3 사이 정수 입력");
				break;
			}
		}
	}

	private void wordGameChoose() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("\n--- 선공/후공 선택 ---\n");
			System.out.println("1.선공");
			System.out.println("2.후공");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				wordGame(0);
				break;
			case 2:
				wordGame(1);
				break;
			default:
				System.out.println("1~2 사이 정수 입력. 메인메뉴로 돌아감");
				return;
			}
		}
	}

	private void wordGame(int i) {
		// TODO Auto-generated method stub
		while(true) {
			if(i%2==0) {
				while(btemp) {					
					System.out.print("[USER] : ");
					String user = sc.next();					
					btemp = GameLogic(user,i);
					/*
					for(String str : words) {
						if(str.equals(user)) {
							btemp = false;
						}
					}
					*/
				}
			}else {
				while(btemp) {
					int index = (int)(Math.random()*words.size());
					String com = words.get(index);					
					btemp = GameLogic(com,i);
					if(btemp==false) {
						System.out.print("[COMPUTER] : "+com);
					}
				}
			}
			System.out.println();
			btemp = true;
			i++;
		}
	}

	private boolean GameLogic(String str,int i) {
		if(str.equals("gg")) {
			gameEnd();
		}
		//끝말잇기니까 이전 끝이 시작이 됨
		ch1 = ch;
		ch = str.charAt(0);
		if(ch1==' ') {
			return false;
		}else {
			if(i%2==0) {
				if(str.length()<2) {
					count++;
					System.out.println("올바르지 않은 단어입니다. 다시 입력해주세요.");			
					if(count==3) {
						gameEnd();
					}
				}else {
					if(str.charAt(0)!=ch1) {
						count++;
						System.out.println("올바르지 않은 단어입니다. 다시 입력해주세요.");			
						if(count==3) {
							gameEnd();
						}
					}
					return true;
				}
			}else {
				if(str.charAt(0)!=ch1) {
					return true;
				}
			}
		}
		return true;
	}
	
	private void gameEnd() {
		count=0;
		System.out.println("패배");
		l++;
		main();
	}
}
