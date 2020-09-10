package func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//강사님 코드
public class WordGame {
	Scanner sc;
	ArrayList<String> words;
	Random r;
	public WordGame() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		r = new Random();
		words = new ArrayList<String>();
		BufferedReader br = null;
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
		System.out.println("총 "+words.size()+"개 단어입력");
	}
	
	public void main() {
		int w=0,l=0;
		while(true) {
			System.out.println("\n----- 끝말잇기 -----\n");
			System.out.println("1.게임 시작");
			System.out.println("2.전적 확인");
			System.out.println("3.프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				String result = startwordGame();
				if(result == null) {
					
				}else if(result.equals("win")) {
					w++;
					//System.out.println("승리");
				}else {
					l++;
					//System.out.println("패배");
				}
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

	private String startwordGame() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("\n--- 선공/후공 선택 ---\n");
			System.out.println("1.선공");
			System.out.println("2.후공");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				String user = userInput(null);
				if(user.equals("lose")) {
					return user;
				}else {
					String result = gameLoop(user,true);
					return result;
				}
			case 2:
				String com = comInput(null);
				String result = gameLoop(com, false);
				return result;
			default:
				System.out.println("1~2 사이 정수 입력. 메인메뉴로 돌아감");
				return null;
			}
		}
	}
	
	//컴퓨터 단어를 매개변수로 받아서 다음단어를 입력하는 코드
	public String userInput(String com) {
		//3번 세기위한 변수
		int count = 0;
		if(com!=null) {
			while(true) {
				System.out.print("[USER] : ");
				String user = sc.next();
				if(user.toLowerCase().equals("gg")) {
					return "lose";
				}
				count++;
				//컴퓨터의 가장 끝글자와 유저의 가장 처음 글자가 같은경우
				if(com.charAt(com.length()-1) == user.charAt(0)) {
					int result = searchWord(user);
					if(result!=-1) {
						return user;
					}
				}
				if(count == 3) {
					return "lose";
				}
				System.out.println("잘못된 입력, 다시 입력,"+(3-count)+"번의 기회 남음");
			}
		}else {
			while(true) {
				System.out.print("[USER] : ");
				String user = sc.next();
				if(user.toLowerCase().equals("gg")) {
					return "lose";
				}
				count++;
				int result = searchWord(user);
				if(result!=-1) {
					return user;
				}
				if(count == 3) {
					return "lose";
				}
				System.out.println("잘못된 입력, 다시 입력,"+(3-count)+"번의 기회 남음");
			}
		}
	}
	
	//컴퓨터 단어를 매개변수로 받아서 다음단어를 입력하는 코드
	public String comInput(String user) {
		if(user!=null) {
			//유저의 끝 글자로 시작하는 단어를 담을 list
			ArrayList<String> comWords = new ArrayList<String>();
			for(String str : words) {
				//끝말잇기 조건이 된다
				if(user.charAt(user.length()-1)==str.charAt(0)) {
					comWords.add(str);
				}
			}
			if(comWords.isEmpty()) {
				return "win";
			}
			//같은 뜻
//			if(comWords.size()==0) {
//				return "win";
//			}
			int random = r.nextInt(comWords.size());
			String com = comWords.get(random);
			System.out.println("[COMPUTER] : "+com);
			return com;
		}else{
			int random = r.nextInt(words.size());
			String com = words.get(random);
			System.out.println("[COMPUTER] : "+com);
			return com;
		}
	}
	
	private String gameLoop(String str, boolean b) {
		String result = str;
		//선공인경우
		if(b) {
			while(true) {
				result = comInput(result);
				if(result.equals("win")) {
					System.out.println("당신의 승리!");
					return result;
				}
				result = userInput(result);
				if(result.equals("lose")) {
					System.out.println("패배");
					return result;
				}
			}
		}
		//후공인 경우
		else {
			while(true) {
				result = userInput(result);
				if(result.equals("\"lose\"")) {
					System.out.println("패배");
					return result;
				}
				result = userInput(result);
				if(result.equals("win")) {
					System.out.println("당신의 승리!");
					return result;
				}
			}
		}
	}

	private int searchWord(String word) {
		for(int i=0;i<words.size();i++) {
			if(words.get(i).equals(word)) {
				return i;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}
}
