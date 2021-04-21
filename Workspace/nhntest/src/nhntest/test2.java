package nhntest;

import java.util.ArrayList;

public class test2 {
	private static void solution(int day, int width, int[][] blocks) {
	    // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
		//봉우리찾기로직
		boolean isAvailable = false;
		if(day<=0 || day>100) {
			System.out.println("공사 기간 일수 범위 초과입니다.");
		}else if(width<=0 || width>100) {
			System.out.println("작업 영역의 너비 범위 초과입니다.");
		}else {
			for(int i=0; i<blocks[i].length; i++) {
				if(blocks[i].length<=0 || blocks[i].length>100) {
					System.out.println("작업 영역의 너비 범위 초과입니다.");
				}
				for(int j=0; j<blocks[i].length; j++) {
					if(blocks[i][j]<=0 || blocks[i][j]>100) {
						System.out.println("작업 영역 중 한 칸에 하루동안 쌓을 벽돌의 개수 범위 초과입니다.");
					}else {
						isAvailable = true;
					}
				}
			}
		}
		
		if(isAvailable) {
			//시멘트의 총 양
			int cementCount = 0;
			//봉우리 탐색을 위해 저장할 리스트
			ArrayList<Integer> findCementList = new ArrayList<Integer>();
			//총 공사일 동안 쌓을 반복문
			for(int i=0; i<day; i++) {
				//전날 부은 시멘트의 개수를 추가해서 생각해야됨 2일차부터는
				for(int j=0; j<blocks[i].length; j++) {
					findCementList.add(j, blocks[i][j]);
				}
				//봉우리 기준점 리스트
				ArrayList<Integer> topList = new ArrayList<Integer>();
				//봉우리탐색로직
				for(int j=0; j<findCementList.size(); j++) {
					for(int k=j+1; k<findCementList.size(); k++) {
						int itemp = findCementList.get(j)-findCementList.get(k);
						topList.add(j, itemp);
					}
				}
				for(int j=1; j<topList.size(); j++) {
					//둘이 곱해서 음수가나오면 안되고 0이 나오면 추가로직 양수면 추가
					int itemp = topList.get(j-1) * topList.get(j);
					//시멘트수가 늘어날떄마다 기존에 벽돌에 추가해줘야함
					if(itemp<0) {
						if(j==1 && topList.get(j-1)>0) {
							cementCount+=topList.get(j-1);
							findCementList.set(j, findCementList.get(j)+topList.get(j-1));
						}
					}else if(itemp>0) {
						//둘다 ++인지 --인지구별
						if(topList.get(j-1)<0&&topList.get(j)<0) {
							int itemp1=0;
							for(int k=j; k>=0; k--) {
								if(topList.get(k)>0) {
									itemp1 = k;
									break;
								}
							}
							cementCount+=Math.abs(topList.get(j-1)+2*topList.get(j));
							findCementList.set(j, findCementList.get(j)+topList.get(j-1));							
						}else {
							//둘 다 ++인 경우니까 합산할 필요가 없음
						}
					}else {
						//0일떄 로직인데 제일 까다로움
						//좌 우중에 낮은값 *2
						//어느게 0인지 판별
						if(topList.get(j-1)==0) {
							cementCount+=2*topList.get(j-2);
						}else {
							cementCount+=2*topList.get(j+1);
						}
					}
				}
			}
			System.out.println(cementCount);
		}
	  }
}
