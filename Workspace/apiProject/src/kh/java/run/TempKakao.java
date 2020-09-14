package kh.java.run;

import java.util.ArrayList;

public class TempKakao {
	public void main() {
		String stemp = "...!@BaT#*..y.abcdefghijklm"; 
		String str = solution(stemp);
		System.out.println(str);
	}
	
	String solution(String new_id) {		
	    String answer = "";
	    int count=0;
	    answer = new_id.toLowerCase();
	    ArrayList<Character> arr = new ArrayList<Character>();
	    for(char ch : answer.toCharArray()) {	    	
	    	//영어소문자 및 숫자
	    	if((ch>=97&&ch<=122)||(ch>=48&&ch<=57)) {
	    		arr.add(ch);
	    		//특수문자처리
	    	}else if(ch=='-'||ch=='_'||ch=='.') {
	    		arr.add(ch);
	    	}else {
	    		
	    	}
	    	count++;
	    }
	    for(int i=0; i<arr.size(); i++) {
	    	//마침표연속시 제거
	    	if(i!=0&&(arr.get(i).equals('.')&&arr.get(i-1).equals('.'))) {
	    		arr.remove(i);
	    	}	    	
	    	if(arr.get(0).equals('.')) {
	    		arr.remove(0);
    		}else if(arr.get(arr.size()-1).equals('.')) {
    			arr.remove(i);
    		}else {
    			
    		}
	    }
	    if(arr.isEmpty()) {
	    	arr.add('a');
	    }
	    if(arr.size()>15) {
	    	for(int i=arr.size()-1;i>14;i--) {	    		
	    		arr.remove(i);
	    	}
	    	if(arr.get(arr.size()-1).equals('.')) {
	    		arr.remove(arr.size()-1);
	    	}
	    }
	    if(arr.size()<3) {
	    	do {
	    		arr.add(arr.get(arr.size()-1));
	    	}while(arr.size()<3);
	    }
	    answer="";
	    for(char chs : arr) {
	    	answer += chs;
	    }
	    return answer;
	}
}
