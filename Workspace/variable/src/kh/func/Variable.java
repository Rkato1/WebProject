package kh.func;

import java.util.Scanner;
//Scanner ����� ����ϱ� ���� import ����

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
	
	public void scan() {
		System.out.print("���ϴ� ���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		//Scanner�� ����ϱ� ���� Ŭ���� ����
		int num = sc.nextInt();
		//���� �Է¹ޱ�(���� �����ϱ� ���� �������� ����)
		System.out.println(num);
		
		System.out.print("���ϴ� �Ǽ� �Է� : ");
		double num1 = sc.nextDouble();
		//�Ǽ� �Է¹ޱ�(���� �����ϱ� ���� �������� ����)
		System.out.println(num1);
		
		System.out.print("���ϴ� ���ڿ� �Է� : ");
		String stemp = sc.next();
		//���ڿ� �Է¹ޱ�(���� �����ϱ� ���� �������� ����)
		//sc.next()�� ���� ����� ������ �Ұ�����(�߻��� �Է� ����)
		System.out.println(stemp);
		
		System.out.print("���ϴ� ���ڿ� �Է� : ");
		sc.nextLine();
		//���� Buffer�� �����ִ� ���๮�� ó��
		//������ loop �߻����� �־����
		String stemp0 = sc.nextLine();
		//���ڿ� �Է¹ޱ�(���� �����ϱ� ���� �������� ����)
		//sc.nextLine() ���� ����
		System.out.println(stemp0);
		
		System.out.print("���ϴ� ���� �Է� : ");
		char ch = sc.next().charAt(0);
		//���ڿ� �Է¹ޱ�(�� �� ù ��° ���ڸ� �޾ƿ�)
		System.out.println(ch);
	}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("Ű(�Ǽ�) �Է� : ");
		double height = sc.nextDouble();
		System.out.print("������(�Ǽ�) �Է� : ");
		double weight = sc.nextDouble();
		System.out.print("���� �Է� : ");
		char gender = sc.next().charAt(0);
		
		System.out.printf("�̸� : %s, ���� : %d, �ּ� : %s, Ű : %d, ������ : %.1f, ���� : %c\n", name, age, address, (int)height, weight, gender);
		//.1f�� �Ҽ��� ù° �ڸ����� ���
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է� : ");
		int inum = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int inum1 = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int inum2 = sc.nextInt();
		int itemp = inum + inum1 + inum2;
		double dtemp = itemp / 3;
		System.out.printf("��� ������ �� ���� %d���̰� ����� %.2f �Դϴ�!", itemp, dtemp);
	}
}
