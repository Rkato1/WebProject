package kh.java.api;

import java.util.Random;
import java.util.StringTokenizer;

public class StringTest {
	public void stringBufferTest() {
		StringBuffer sb = new StringBuffer();
		//�Ҵ�� ���ڿ� ������� ����
		System.out.println(sb.capacity());
		//���� ����� ���ڿ��� ����
		System.out.println(sb.length());
		
		//StringBuffer�� �Ҵ�
		//���ڿ��� ���� �߰��Ǵ� ������
		sb.append("���ڿ��Ҵ�");
		System.out.println(sb.length());
		sb.append(" �� �� ");
		System.out.println(sb.length());
		sb.append("�߰�");
		System.out.println(sb.length());
		System.out.println(sb);
		
		//sb.insert(offset, c)
		//�����ϴ� �޼ҵ�(��ġ, ������ ���ڿ�)		
		sb.insert(5, "a");
		System.out.println(sb);
		
		//sb.replace(start, end, str)
		//��ü�ϴ� ����
		//������, ����, ��ü�� ���ڿ�
		sb.replace(5, 6, "b");
		System.out.println(sb);
		
		//������
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//����(�������� ����)
		//sb.delete(start, end)
		sb.delete(5, sb.length());
		System.out.println(sb);
	}
	
	public void token() {
		String str = "a/20/��b c��";
		//�����ڸ� �������� ���ڿ��� ������ �޴°���(���ڿ�,������)
		//�������̶� ���� �����͸� �����ϴ� ������ �ƴ�
		StringTokenizer st = new StringTokenizer(str, "/");
		//st.countTokens()
		//�����ڷ� ������ �� ��� ���������� ������ ��ȯ
		System.out.println(st.countTokens());//3
		//��ū������ ���ڿ� ����(0�� �μ��� �ִ�)
		System.out.println(st.nextToken());
		//���� �����ִ� ��ū�� �ִ��� Ȯ���� ��ȯ(t/f)
		System.out.println(st.hasMoreTokens());
		
		//�� ���������� ����
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
		//����Թ��
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
	
	//������ȣ����
	public void test() {
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		//sb.append(�ڷ���)
		for(int i=0;i<6;i++) {
			//0~9
			sb.append(r.nextInt(10));
		}
		System.out.println("["+sb+"]");
	}
	
	public void mathTest() {
		//Math�� ��ü�� �������� �ʾƵ� �ٷ� ��밡��
		
		//���밪(�Ǽ�,����)
		//Math.abs(arg0);
		//�ø�
		//Math.ceil(a);
		//����
		//Math.floor(a);
		//�ݿø�
		//Math.ceil(round);
		//0.0~1.0���̰� ���
		//Math.random();
		//a,b �� �� ū�� ��ȯ
		//Math.max(a,b);
		//a,b �� �� ������ ��ȯ
		//Math.min(a,b);		
	}
}
