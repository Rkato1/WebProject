package kh.java.api;

public class WrapperClass {
	public void test() {
		//��������
		//�⺻�ڷ���
		boolean b = true;		
		//boxing
		//Wrapper�� ��� ������ ��üȭ
		Boolean b1 = new Boolean(true);
		//unboxing
		//���� ������
		boolean b2 = b1.booleanValue();
		//autoboxing
		Boolean b3 = true;
		//autounboxing
		boolean b4 = b3;		
		
		//������(int)
		int i = 10;
		Integer i1 = new Integer(20);
		int i2 = i1.intValue();
		Integer i3 = 10;
		int i4 = i3;
		//object�� ��ӵ� Ŭ������ �̰͵� ��
		i3.equals("");
		i3.toString();
		
		//�⺻�ڷ���->���ڿ� / ���ڿ�->�⺻�ڷ������� ����
		String str = "1000";
		System.out.println(str+1);
		int itemp = Integer.parseInt(str);
		System.out.println(itemp);
		
		String str1 = "10.54";
		System.out.println(str1+1);
		double dtemp = Double.parseDouble(str1);
		System.out.println(dtemp);
		
		String str2 = "abcdef";
		char chs[] = new char[str2.length()];
		for(int j=0; j<str2.length(); j++) {
			chs[j] = str2.charAt(j);
			System.out.println(chs[j]);
		}
		
		int i5 = 999;
		double d = 3.141592;
		//WrapperŬ����
		String stemp = Integer.valueOf(i5).toString();
		System.out.println(stemp);
		stemp = Double.valueOf(d).toString();
		System.out.println(stemp);
		//String
		String stemp1 = String.valueOf(i5);
		System.out.println(stemp1);
		stemp1 = String.valueOf(d);
		System.out.println(stemp1);
	}
}
