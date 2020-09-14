package kh.java.run;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TempKakao3 {
	public int[] solution(String[] info, String[] query) {
		ArrayList<String> infoList = new ArrayList<String>();
		if(info.length>=1&&info.length<=50000) {
			for(int i=0; i<info.length; i++) {
				StringTokenizer st = new StringTokenizer(info[i], " ");
				if(st.hasMoreTokens()) {
					infoList.add(st.nextToken());
				}
			}
		}
		ArrayList<String> queryList = new ArrayList<String>();
		if(query.length>=1&&query.length<=100000) {
			for(int i=0; i<query.length; i++) {
				StringTokenizer st = new StringTokenizer(query[i], " and ");
				if(st.hasMoreTokens()) {
					queryList.add(st.nextToken());
				}
			}
		}		
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		for(int i=0;i<queryList.size();i++) {
			int tot=0;
			int count0=0,count1=0,count2=0,count3=0,count4=0;
			for(int j=0;j<infoList.size();j++) {
				switch(j%5) {
				case 1:
					if((queryList.get(j).equals('-'))||queryList.get(j).equals(infoList.get(i))) {
						count1++;
					}
					break;
				case 2:
					if((queryList.get(j).equals('-'))||queryList.get(j).equals(infoList.get(i))) {
						count2++;
					}
					break;
				case 3:
					if((queryList.get(j).equals('-'))||queryList.get(j).equals(infoList.get(i))) {
						count3++;
					}
					break;
				case 4:
					if((queryList.get(j).equals('-'))||queryList.get(j).equals(infoList.get(i))) {
						count4++;
					}
					break;
				case 0:
					if((queryList.get(j).equals('-'))||queryList.get(j).equals(infoList.get(i))) {
						count0++;
					}
					break;
				}
				tot = count0+count1+count2+count3+count4;
				if(tot == 5) {
					if(answerList.get(i)==null) {
						answerList.add(1);			
					}else {
						int k = answerList.get(i)+1;
						answerList.set(i, k);
					}
				}
			}			
		}
        int[] answer = {};
		for(int i : answerList) {
			answer[i] = i;
		}
        return answer;
    }
}
