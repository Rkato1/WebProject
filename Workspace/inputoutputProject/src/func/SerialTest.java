package func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerialTest {
	UserInfo ui;
	Scanner sc;
	public SerialTest() {
		super();
		sc = new Scanner(System.in);
		ui = new UserInfo("�⺻��",0,"�⺻��");
		Score score = new Score(50,50,50);
		ui.setScore(score);
		// TODO Auto-generated constructor stub
	}
	public void main() {
		while(true) {
			System.out.println("1. ���� ���� �Է� �� ��������");
			System.out.println("2. ���� ���� �о����");
			System.out.println("3. ���� ���� ���� ���");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				outputUser();
				break;
			case 2:
				inputUser();
				break;
			case 3:
				printUser();
				break;
			default:
				System.out.println("1~3 ���� ���� ����� �Է�");
				continue;
			}
		}
	}	
	public void printUser() {
		// TODO Auto-generated method stub
		System.out.println("�̸� : "+ui.getName());
		System.out.println("���� : "+ui.getAge());
		System.out.println("�ּ� : "+ui.getAddr());
		System.out.println("�������� : "+ui.getScore().getKor());
		System.out.println("�������� : "+ui.getScore().getEng());
		System.out.println("�������� : "+ui.getScore().getMath());
	}
	public void outputUser() {
		// TODO Auto-generated method stub
		System.out.print("���� �̸� �Է� : ");
		String name = sc.next();		
		System.out.print("���� ���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("���� �ּ� �Է� : ");
		String addr = sc.next();
		UserInfo u = new UserInfo(name, age, addr);
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		Score s = new Score(kor, math, eng);
		u.setScore(s);
		//��ü �������� ���� ������Ʈ��
		ObjectOutputStream oos = null;
		//���ν�Ʈ��
		try {
			FileOutputStream fos = new FileOutputStream("object.txt");
			oos = new ObjectOutputStream(fos);
			//��� ��ü�� �������� �����(�Ű������� objectŸ��)
			//����ȭ
			oos.writeObject(u);
			System.out.println("����Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void inputUser() {
		// TODO Auto-generated method stub
		//��ü�� �о���� ���� ������Ʈ��
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("object.txt");
			ois = new ObjectInputStream(fis);
			//����� ��ü �ҷ�����(object�����̹Ƿ� �ٿ�ĳ���ü���)
			//������ȭ
			this.ui = (UserInfo)ois.readObject();
			System.out.println("�ҷ����� �Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
