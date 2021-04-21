package func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dict2Word {
	//사전에 들어갈 임시 문자열들을 저장할 리스트
	ArrayList<String> words;
	Scanner sc;
	
	int i1, i2;
	public Dict2Word() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		words = new ArrayList<String>();
	}
	
	public void inputText() {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("dict.txt");
			br = new BufferedReader(fr);
			while(true) {
				//파일에서 한줄을 읽어서 line변수에 저장
				String str = br.readLine();
				//끝까지 다 읽었으면
				if(str == null) {
					break;
				}
				i1++;
				boolean b = true;
				if(str.length()>1) {
					for(int i=0;i<str.length();i++) {
						if(str.charAt(i)<'가'||str.charAt(i)>'힣') {
							b = false;
							break;
						}
					}
				}else {
					b = false;
				}if(b) {
					i2++;
					words.add(str);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				System.out.println("바뀌기전"+i1);
				System.out.println("바뀐이후"+i2);
				outputText();				
				//cutWords2();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void cutWords() {
		//U+AC00~U+D7AF
		int count=0;
		for(String str : words) {
			count++;
		}
		System.out.println("제거전 : "+count);
		for(int i=0; i<words.size(); i++) {
			String stemp = convertUnicode(words.get(i));
			char ch[] = stemp.toCharArray();
			//길이 2미만 제외
			if(words.get(i).length()<2) {
				words.remove(i);
			}else{
				for(int j=0;j<ch.length;j++) {
					//한글 완성형 구분
					if(ch[j]<0xAC00 && ch[j]>0xD7AF) {
						words.remove(i);
					}
				}
			}
		}
		count=0;
		for(String str : words) {
			count++;
		}
		System.out.println("제거후 : "+count);
		outputText();
	}
		
	public void outputText() {
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("word.txt");
			bw = new BufferedWriter(fw);
			int i = 0;
			while(true) {
				String str = words.get(i);
				bw.write(str);
				//줄바꿈
				bw.newLine();
				i++;
				if(i==words.size()) {
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				System.out.println("종료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 유니코드에서 String으로 변환
	public static String convertString(String val) {
		// 변환할 문자를 저장할 버퍼 선언
		StringBuffer sb = new StringBuffer();
		// 글자를 하나하나 탐색한다.
		for (int i = 0; i < val.length(); i++) {
			// 조합이 \\u로 시작하면 6글자를 변환한다. \\uxxxx
			if ('\\' == val.charAt(i) && 'u' == val.charAt(i + 1)) {
				// 그 뒤 네글자는 유니코드의 16진수 코드이다. int형으로 바꾸어서 다시 char 타입으로 강제 변환한다.
				Character r = (char) Integer.parseInt(val.substring(i + 2, i + 6), 16);
				// 변환된 글자를 버퍼에 넣는다.
				sb.append(r);
				// for의 증가 값 1과 5를 합해 6글자를 점프
				i += 5;
			} else {
				// ascii코드면 그대로 버퍼에 넣는다.
				sb.append(val.charAt(i));
			}
		}
		// 결과 리턴
		return sb.toString();
	}
		
	// String에서 유니코드로 변환
	private static String convertUnicode(String val) {
		// 변환할 문자를 저장할 버퍼 선언
		StringBuffer sb = new StringBuffer();
		// 글자를 하나하나 탐색한다.
		for (int i = 0; i < val.length(); i++) {
			// 글자 추츨 int값으로 가져온다.
			int code = val.codePointAt(i);
			// 128이하면 ascii코드로 변환하지 않는다.
			if (code < 128) {
			sb.append(String.format("%c", code));
			} else {
			// 16진수 유니코드로 변환한다.
			sb.append(String.format("\\u%04x", code));
			}
		}
		// 결과 리턴
		return sb.toString();
	}
}