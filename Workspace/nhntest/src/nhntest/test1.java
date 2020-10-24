package nhntest;

import java.util.ArrayList;

public class test1 {
  private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
	boolean game = false;
	if(numOfAllPlayers<6 || numOfAllPlayers>26){
		System.out.println("총 인원수 초과");
	} else if(numOfQuickPlayers<=0 || numOfQuickPlayers>numOfAllPlayers/2) {
		System.out.println("달리기 빠른 사람의 수 초과");
	}else if(namesOfQuickPlayers.length!=numOfQuickPlayers) {
		for(char c : namesOfQuickPlayers){
			if(c=='A') {
				System.out.println("A는 첫번째 게임에서 무조건 술래이며 달리기가 빠른 사람이 될수 없습니다.");
			}
		}
		System.out.println("달리기 빠른 사람들의 이름의 수가 부족하거나 많음");
	}else if(numOfGames<=0 || numOfGames>100){
		System.out.println("게임 진행횟수 초과");
	}else {
		if(numOfMovesPerGame.length != numOfGames) {
			System.out.println("게임 진행횟수와 이동하는 칸수의 총 회수가 값이 다릅니다.");
		}
		for(int i=0; i<numOfMovesPerGame.length; i++) {
			if(numOfMovesPerGame[i]>100 || numOfMovesPerGame[i]<-100) {
				System.out.println("정해진 칸수 범위초과");
			}else {
				game = true;
			}
		}
	}
	if(game) {
		char tagger='A';
		ArrayList<Character> gamerList = new ArrayList<Character>();
		for(int i=1; i<namesOfQuickPlayers.length; i++) {
			gamerList.add(namesOfQuickPlayers[i]);
		}
		//게임에서 시작하는 자리위치(처음에는 0이니까)
		int startPoint = 0;
		//술래에 걸린 회수
		ArrayList<Integer> taggerPoint = new ArrayList<Integer>();
		//A는 처음에 무조건 술래니까
		for(int i=0; i<numOfAllPlayers; i++) {
			if(i==0) {
				taggerPoint.add(i, 1);
			}else {
				taggerPoint.add(i, 0);
			}
		}
		//게임진행횟수만큼
		for(int i=0; i<numOfGames; i++) {
			//각 게임에서 이동하는 칸수
			int games = numOfMovesPerGame[i];
			//칸수는 -가 존재시 리스트에 바로 대입이 안됨
			if(games>numOfAllPlayers-1) {
				int tempInt = numOfAllPlayers % games;
				games = tempInt;
			}else if(games<0) {
				int tempInt = numOfAllPlayers % games;
				games = 5+tempInt;
			}else {
				
			}
			//얘가 빠른애인지 검사 후 술래와 위치변동
			for(char ch : namesOfQuickPlayers) {
				if(ch==gamerList.get(games)) {
					tagger='A';
				}else {
					char chTemp = tagger;
					tagger=gamerList.get(games);
					//값변화 1증가
					int count = taggerPoint.get(games)+1;
					taggerPoint.set(games, count);
					gamerList.remove(games);
					gamerList.add(games, chTemp);
				}
			}
			startPoint = games;
		}
		
		for(int i=0; i<numOfAllPlayers; i++) {
			System.out.println(gamerList.get(i)+" "+taggerPoint.get(i));
		}
	}
  }
}
