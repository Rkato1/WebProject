package kh.java.api;

import java.util.Random;
import java.util.StringTokenizer;

public class StringTest {
	public void stringBufferTest() {
		StringBuffer sb = new StringBuffer();
		//할당된 문자열 저장소의 길이
		System.out.println(sb.capacity());
		//실제 저장된 문자열의 길이
		System.out.println(sb.length());
		
		//StringBuffer로 할당
		//문자열의 끝에 추가되는 개념임
		sb.append("문자열할당");
		System.out.println(sb.length());
		sb.append(" 공 백 ");
		System.out.println(sb.length());
		sb.append("추가");
		System.out.println(sb.length());
		System.out.println(sb);
		
		//sb.insert(offset, c)
		//삽입하는 메소드(위치, 삽입할 문자열)		
		sb.insert(5, "a");
		System.out.println(sb);
		
		//sb.replace(start, end, str)
		//대체하는 개념
		//시작점, 끝점, 대체할 문자열
		sb.replace(5, 6, "b");
		System.out.println(sb);
		
		//뒤집기
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//삭제(시작점과 끝점)
		//sb.delete(start, end)
		sb.delete(5, sb.length());
		System.out.println(sb);
	}
	
	public void token() {
		String str = "a/20/ㅎb cㅇ";
		//구분자를 기준으로 문자열을 나눠서 받는개념(문자열,구분자)
		//참조형이라 실제 데이터를 분할하는 개념이 아님
		StringTokenizer st = new StringTokenizer(str, "/");
		//st.countTokens()
		//구분자로 나눠서 총 몇개로 나눠졌는지 개수를 반환
		System.out.println(st.countTokens());//3
		//토큰꺼내옴 문자열 리턴(0번 인수에 있는)
		System.out.println(st.nextToken());
		//현재 남아있는 토큰이 있는지 확인후 반환(t/f)
		System.out.println(st.hasMoreTokens());
		
		//다 뽑힐때까지 나옴
		/*
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		*/
	}
	
	public void tokenExam() {
		String str = "J a v a P r o g r a m";
		char ch[] = new char[str.length()];
		/*
		//강사님방법
		StringBuffer sb = new StringBuffer();
		char arr[] = new char[st.countTokens()];
		for(int j=0; j<arr.length;j++) {
			arr[j] = st.nextToken().charAt(0);
			if('a'<=arr[j] && arr[j]<='z') {
				arr[i] ^= 32;
			}
			sb.append(arr[j]);
		}
		System.out.println(sb);
		*/
		int i=0;
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			ch[i] = st.nextToken().charAt(0);
			i++;
		}
		for(int j=0;j<ch.length;j++) {
			if(ch[j] >= 'a' && ch[j] <= 'z') { 
				System.out.print((char)(ch[j]-32));
			}else {
				System.out.print(ch[j]);
			}
		}
	}
	
	//인증번호느낌
	public void test() {
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		//sb.append(자료형)
		for(int i=0;i<6;i++) {
			//0~9
			sb.append(r.nextInt(10));
		}
		System.out.println("["+sb+"]");
	}
	
	public void mathTest() {
		//Math는 객체를 생성하지 않아도 바로 사용가능
		
		//절대값(실수,정수)
		//Math.abs(arg0);
		//올림
		//Math.ceil(a);
		//내림
		//Math.floor(a);
		//반올림
		//Math.ceil(round);
		//0.0~1.0사이값 출력
		//Math.random();
		//a,b 중 더 큰값 반환
		//Math.max(a,b);
		//a,b 중 더 작은값 반환
		//Math.min(a,b);		
	}
}
