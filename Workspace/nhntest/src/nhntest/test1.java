package nhntest;

import java.util.ArrayList;

public class test1 {
  private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
	boolean game = false;
	if(numOfAllPlayers<6 || numOfAllPlayers>26){
		System.out.println("�� �ο��� �ʰ�");
	} else if(numOfQuickPlayers<=0 || numOfQuickPlayers>numOfAllPlayers/2) {
		System.out.println("�޸��� ���� ����� �� �ʰ�");
	}else if(namesOfQuickPlayers.length!=numOfQuickPlayers) {
		for(char c : namesOfQuickPlayers){
			if(c=='A') {
				System.out.println("A�� ù��° ���ӿ��� ������ �����̸� �޸��Ⱑ ���� ����� �ɼ� �����ϴ�.");
			}
		}
		System.out.println("�޸��� ���� ������� �̸��� ���� �����ϰų� ����");
	}else if(numOfGames<=0 || numOfGames>100){
		System.out.println("���� ����Ƚ�� �ʰ�");
	}else {
		if(numOfMovesPerGame.length != numOfGames) {
			System.out.println("���� ����Ƚ���� �̵��ϴ� ĭ���� �� ȸ���� ���� �ٸ��ϴ�.");
		}
		for(int i=0; i<numOfMovesPerGame.length; i++) {
			if(numOfMovesPerGame[i]>100 || numOfMovesPerGame[i]<-100) {
				System.out.println("������ ĭ�� �����ʰ�");
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
		//���ӿ��� �����ϴ� �ڸ���ġ(ó������ 0�̴ϱ�)
		int startPoint = 0;
		//������ �ɸ� ȸ��
		ArrayList<Integer> taggerPoint = new ArrayList<Integer>();
		//A�� ó���� ������ �����ϱ�
		for(int i=0; i<numOfAllPlayers; i++) {
			if(i==0) {
				taggerPoint.add(i, 1);
			}else {
				taggerPoint.add(i, 0);
			}
		}
		//��������Ƚ����ŭ
		for(int i=0; i<numOfGames; i++) {
			//�� ���ӿ��� �̵��ϴ� ĭ��
			int games = numOfMovesPerGame[i];
			//ĭ���� -�� ����� ����Ʈ�� �ٷ� ������ �ȵ�
			if(games>numOfAllPlayers-1) {
				int tempInt = numOfAllPlayers % games;
				games = tempInt;
			}else if(games<0) {
				int tempInt = numOfAllPlayers % games;
				games = 5+tempInt;
			}else {
				
			}
			//�갡 ���������� �˻� �� ������ ��ġ����
			for(char ch : namesOfQuickPlayers) {
				if(ch==gamerList.get(games)) {
					tagger='A';
				}else {
					char chTemp = tagger;
					tagger=gamerList.get(games);
					//����ȭ 1����
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
