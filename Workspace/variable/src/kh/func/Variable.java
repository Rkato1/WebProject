package kh.func;

public class Variable {
	public void func1() {
		boolean bool1 = true;
		boolean bool2 = false;
		//���� ����
		char ch1 = 'a';
		//���� ����
		int num = 10;
		//������ ����
		double d = 3.14;
		double d2;
		//���� ���� �� �ʱ�ȭ���� �ʰ� ����ϴ� ��� ���� �߻�
		d2 = 5.12;
		//�Ǽ��� ����
		
		long lNum = 10000000000l;
		//������ �� ū ������ ����
		float f = 3.14f;
		//������ ���� �Ǽ��� ����(���� ������ Ŀ���� �� ������� ����)
		
		final double PI = 3.14;
		//final Ű���尡 ���������� ���� �ʱ�ȭ ���� �� ������ �Ұ���
		
		String str = "abcdef";
		//���ڿ� ����
		System.out.println(str.charAt(0));
		//�� ������ ù��° �ڸ��� ����ϱ�
		
		int num1 = 2147483647;
		long res = (long)num1 + 1;
		//int ������ �ʰ��߱� ������ ���ϴ� ���� �����ϱ� ���� ���� ����ȯ�� �������
		System.out.println(res);
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2;
		//java���� ���� �⺻ int�� ġȯ�ؼ� ����
		int b3 = b1 + b2;
		byte b4 = (byte)(b1 + b2);
		//�ذ� ��� , ���� ���� ���� ����ȯ, �Ʒ��� ����ȯ ���� ����(ó���� ���� �ٸ�, ���� �ʰ����)
		
		System.out.println("11");
		System.out.println("22");
		System.out.print("11");
		System.out.print("22");
		//println�� ��� �� �� �ٲ�, print�� ��¸�
	}
}
