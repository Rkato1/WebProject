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
	public void func2() {
		String name = "������";
		int age = 28;
		System.out.println("�� �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
		System.out.printf("�� �̸��� %s�̰� ���̴� %d���Դϴ�.", name, age);
		//printf�� %�� �ڷ��� ������ ����
		//%d ����, %o 8����, %x 16����
		//%f �Ǽ�(�Ҽ����Ʒ�6�ڸ�)  %e ��������ǥ��
		//%g %e, %f �� �� ª�� ǥ���� ���
		//%A 16���� �Ǽ�
		//%c ����, %s ���ڿ�
		//\ back slash escape����
		//\t tab��ŭ ����Ȯ�� \n �� �ٲ�
		//\' \" '�� "�� ����� �� ��� \\ \���
	}
	public void func3() {
		int iNum = 100;
		long lNum = 9999000000000l;
		float fNum = 486.520f;
		double dNum = 5697.890123;
		char cTemp = 'A';
		String sTemp = "Hello JAVA";
		boolean bTemp = true;
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(cTemp);
		System.out.println(sTemp);
		System.out.println(bTemp);
	}
	public void func4() {
		String sName = "������";
		int age = 28;
		char cGender = 'M';
		String sAddress = "��⵵";
		String sPhoneNumber = "01012345678";
		String sEMail = "silvestr0720@gmail.com";
		String sName0 = "ȫ�浿";
		int age0 = 20;
		char cGender0 = 'M';
		String sAddress0 = "����";
		String sPhoneNumber0 = "01087654321";
		String sEMail0 = "honggildong@gmail.com";
		System.out.println("�̸�\t����\t����\t����\t��ȭ��ȣ\t\t�̸���");
		System.out.println("------------------------------------------------------------------------");
		System.out.print(sName + "\t");
		System.out.print(age + "\t");
		System.out.print(cGender + "\t");
		System.out.print(sAddress + "\t");
		System.out.print(sPhoneNumber + "\t");
		System.out.print(sEMail + "\n");
		System.out.println("------------------------------------------------------------------------");
		System.out.print(sName0 + "\t");
		System.out.print(age0 + "\t");
		System.out.print(cGender0 + "\t");
		System.out.print(sAddress0 + "\t");
		System.out.print(sPhoneNumber0 + "\t");
		System.out.print(sEMail0 + "\n");
	}
}
