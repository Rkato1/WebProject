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
	//������ �� �ӽ� ���ڿ����� ������ ����Ʈ
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
				//���Ͽ��� ������ �о line������ ����
				String str = br.readLine();
				//������ �� �о�����
				if(str == null) {
					break;
				}
				i1++;
				boolean b = true;
				if(str.length()>1) {
					for(int i=0;i<str.length();i++) {
						if(str.charAt(i)<'��'||str.charAt(i)>'�R') {
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
				System.out.println("�ٲ����"+i1);
				System.out.println("�ٲ�����"+i2);
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
		System.out.println("������ : "+count);
		for(int i=0; i<words.size(); i++) {
			String stemp = convertUnicode(words.get(i));
			char ch[] = stemp.toCharArray();
			//���� 2�̸� ����
			if(words.get(i).length()<2) {
				words.remove(i);
			}else{
				for(int j=0;j<ch.length;j++) {
					//�ѱ� �ϼ��� ����
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
		System.out.println("������ : "+count);
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
				//�ٹٲ�
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
				System.out.println("����");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// �����ڵ忡�� String���� ��ȯ
	public static String convertString(String val) {
		// ��ȯ�� ���ڸ� ������ ���� ����
		StringBuffer sb = new StringBuffer();
		// ���ڸ� �ϳ��ϳ� Ž���Ѵ�.
		for (int i = 0; i < val.length(); i++) {
			// ������ \\u�� �����ϸ� 6���ڸ� ��ȯ�Ѵ�. \\uxxxx
			if ('\\' == val.charAt(i) && 'u' == val.charAt(i + 1)) {
				// �� �� �ױ��ڴ� �����ڵ��� 16���� �ڵ��̴�. int������ �ٲپ �ٽ� char Ÿ������ ���� ��ȯ�Ѵ�.
				Character r = (char) Integer.parseInt(val.substring(i + 2, i + 6), 16);
				// ��ȯ�� ���ڸ� ���ۿ� �ִ´�.
				sb.append(r);
				// for�� ���� �� 1�� 5�� ���� 6���ڸ� ����
				i += 5;
			} else {
				// ascii�ڵ�� �״�� ���ۿ� �ִ´�.
				sb.append(val.charAt(i));
			}
		}
		// ��� ����
		return sb.toString();
	}
		
	// String���� �����ڵ�� ��ȯ
	private static String convertUnicode(String val) {
		// ��ȯ�� ���ڸ� ������ ���� ����
		StringBuffer sb = new StringBuffer();
		// ���ڸ� �ϳ��ϳ� Ž���Ѵ�.
		for (int i = 0; i < val.length(); i++) {
			// ���� ���� int������ �����´�.
			int code = val.codePointAt(i);
			// 128���ϸ� ascii�ڵ�� ��ȯ���� �ʴ´�.
			if (code < 128) {
			sb.append(String.format("%c", code));
			} else {
			// 16���� �����ڵ�� ��ȯ�Ѵ�.
			sb.append(String.format("\\u%04x", code));
			}
		}
		// ��� ����
		return sb.toString();
	}
}