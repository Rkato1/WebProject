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
	//»çÀü¿¡ µé¾î°¥ ÀÓ½Ã ¹®ÀÚ¿­µéÀ» ÀúÀåÇÒ ¸®½ºÆ®
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
				//ÆÄÀÏ¿¡¼­ ÇÑÁÙÀ» ÀÐ¾î¼­ lineº¯¼ö¿¡ ÀúÀå
				String str = br.readLine();
				//³¡±îÁö ´Ù ÀÐ¾úÀ¸¸é
				if(str == null) {
					break;
				}
				i1++;
				boolean b = true;
				if(str.length()>1) {
					for(int i=0;i<str.length();i++) {
						if(str.charAt(i)<'°¡'||str.charAt(i)>'ÆR') {
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
				System.out.println("¹Ù²î±âÀü"+i1);
				System.out.println("¹Ù²ïÀÌÈÄ"+i2);
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
		System.out.println("Á¦°ÅÀü : "+count);
		for(int i=0; i<words.size(); i++) {
			String stemp = convertUnicode(words.get(i));
			char ch[] = stemp.toCharArray();
			//±æÀÌ 2¹Ì¸¸ Á¦¿Ü
			if(words.get(i).length()<2) {
				words.remove(i);
			}else{
				for(int j=0;j<ch.length;j++) {
					//ÇÑ±Û ¿Ï¼ºÇü ±¸ºÐ
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
		System.out.println("Á¦°ÅÈÄ : "+count);
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
				//ÁÙ¹Ù²Þ
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
				System.out.println("Á¾·á");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// À¯´ÏÄÚµå¿¡¼­ StringÀ¸·Î º¯È¯
	public static String convertString(String val) {
		// º¯È¯ÇÒ ¹®ÀÚ¸¦ ÀúÀåÇÒ ¹öÆÛ ¼±¾ð
		StringBuffer sb = new StringBuffer();
		// ±ÛÀÚ¸¦ ÇÏ³ªÇÏ³ª Å½»öÇÑ´Ù.
		for (int i = 0; i < val.length(); i++) {
			// Á¶ÇÕÀÌ \\u·Î ½ÃÀÛÇÏ¸é 6±ÛÀÚ¸¦ º¯È¯ÇÑ´Ù. \\uxxxx
			if ('\\' == val.charAt(i) && 'u' == val.charAt(i + 1)) {
				// ±× µÚ ³×±ÛÀÚ´Â À¯´ÏÄÚµåÀÇ 16Áø¼ö ÄÚµåÀÌ´Ù. intÇüÀ¸·Î ¹Ù²Ù¾î¼­ ´Ù½Ã char Å¸ÀÔÀ¸·Î °­Á¦ º¯È¯ÇÑ´Ù.
				Character r = (char) Integer.parseInt(val.substring(i + 2, i + 6), 16);
				// º¯È¯µÈ ±ÛÀÚ¸¦ ¹öÆÛ¿¡ ³Ö´Â´Ù.
				sb.append(r);
				// forÀÇ Áõ°¡ °ª 1°ú 5¸¦ ÇÕÇØ 6±ÛÀÚ¸¦ Á¡ÇÁ
				i += 5;
			} else {
				// asciiÄÚµå¸é ±×´ë·Î ¹öÆÛ¿¡ ³Ö´Â´Ù.
				sb.append(val.charAt(i));
			}
		}
		// °á°ú ¸®ÅÏ
		return sb.toString();
	}
		
	// String¿¡¼­ À¯´ÏÄÚµå·Î º¯È¯
	private static String convertUnicode(String val) {
		// º¯È¯ÇÒ ¹®ÀÚ¸¦ ÀúÀåÇÒ ¹öÆÛ ¼±¾ð
		StringBuffer sb = new StringBuffer();
		// ±ÛÀÚ¸¦ ÇÏ³ªÇÏ³ª Å½»öÇÑ´Ù.
		for (int i = 0; i < val.length(); i++) {
			// ±ÛÀÚ ÃßÃú int°ªÀ¸·Î °¡Á®¿Â´Ù.
			int code = val.codePointAt(i);
			// 128ÀÌÇÏ¸é asciiÄÚµå·Î º¯È¯ÇÏÁö ¾Ê´Â´Ù.
			if (code < 128) {
			sb.append(String.format("%c", code));
			} else {
			// 16Áø¼ö À¯´ÏÄÚµå·Î º¯È¯ÇÑ´Ù.
			sb.append(String.format("\\u%04x", code));
			}
		}
		// °á°ú ¸®ÅÏ
		return sb.toString();
	}
}