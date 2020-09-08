package func;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public void test() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("1���� �� �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("2���� �� �Է� : ");
			int num2 = sc.nextInt();
			int result = num1/num2;
			System.out.println("��� : "+result);
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���");
		}
		catch(ArithmeticException e) {
			System.out.println("0���δ� �� �����ϴ�");
		}
		catch(Exception e){
			System.out.println("���� �߻� : "+e);
		}
	}
	
	public void menuPrint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�ȳ��ϼ���. ���");
		System.out.println("2.�ݰ�����. ���");
		System.out.println("3.�߰���. ���");
		System.out.print("���� > ");
		try {
			print(sc.nextInt());
		}catch(Exception e){
			System.out.println("�����Է��ϼ���\n"+e);
		}finally {
			System.out.println("������ ���ԵǴ� ���");
		}
	}
	
	public void print(int sel) {
		switch(sel) {
		case 1:
			System.out.println("�ȳ��ϼ���.");
			break;
		case 2:
			System.out.println("�ݰ�����.");
			break;
		case 3:
			System.out.println("�߰���.");
			break;
		default:
			System.out.println("1~3 �� �������ּ���.");
			break;
		}
	}
	
	public void test2() {
		try {
			FileReader fr = new FileReader("test.txt");
			//���� �����
			System.out.println("��������");			
		}
		//���� �������� ����
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���Ͼ���");
		}
	}
	
	//class�� �����ҋ� throws Ű����� ����ó�� ���� 
	//���ܸ��� ���� Ŭ������ �ڿ� ������
	public void test3() throws FileNotFoundException{
		FileReader fr = new FileReader("test.txt");
	}
	
	public void test4() {
		//�����߻�
		//test3();
		//����ҰŸ� try{} catch{}�� ������� �����
		FileReader fr = null;
		try {
			fr = new FileReader("test.txt");
			System.out.println("��������");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���Ͼ���");
		} finally {
			try {
				//���� �ݾƾ���
				fr.close();
				System.out.println("���ϴ���");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void test5() {
		//try with resource
		try(FileReader fr = new FileReader("test.txt")){
			//�̷��� close()�ڵ� �ʿ����
			System.out.println("��������");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���Ͼ���");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����¿���");
		}
	}
}