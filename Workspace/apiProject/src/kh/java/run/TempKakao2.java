package kh.java.run;

import java.util.ArrayList;

public class TempKakao2 {
	public void main() {
		String[] orders = {"ABCFG","AC","CDE","ACDE","BCFG","ACDEH"};
		int[] course = {2,3,4};
		String[] answer = solution(orders, course);
		for(String str : answer) {
			System.out.println(str);
		}
	}
	public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<String> order = new ArrayList<String>();
        if(orders.length>=2 && orders.length<=20) {
        	for(int i=0; i<orders.length;i++) {
        		if(orders[i].length()>=2 && orders[i].length()<=10) {
        			order.add(orders[i]);
        		}
        	}
        	for(int i=0;i<course.length;i++) {
        		
        	}
        }
        return answer;
    }
}
