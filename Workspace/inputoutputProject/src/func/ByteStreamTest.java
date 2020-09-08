package func;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
	
	//���Ͽ� ���� ��� �������� �Լ�
	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		//���� �������� Ŭ����
		FileOutputStream fOut = null;
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		
		try {
			//���ϻ���(�̹� �����ϴ� ��� �����)
			fOut = new FileOutputStream(fileName);
			System.out.println("["+ fileName+"] ���Ͽ� ������ ���� �Է� : ");
			System.out.println("����� exit �Է�");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				//windows ����ó�� ���� �߰�(���Ͽ��� �۾� �ٹٲ��� ���� �߰�)
				//�۾��� �Է¹޾� ����
				String str = sc.nextLine()+"\r\n";
				//�����ȣ�� ���Դٸ�
				if(str.equals("exit\r\n")) {
					break;
				}
				//������ �۾��� ������ �迭(string to byte)
				byte arr[] = str.getBytes();
				//���Ͽ� �����͸� �������� �ڵ�
				fOut.write(arr);
			}
		}
		//window���ѿ� ���� ���ϻ����� �Ұ����� ���
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����� ���� �߻���
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� : ");
		String fileName = sc.nextLine();
		DataOutputStream dos = null;
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos);
			System.out.println("["+fileName+"] ���Ͽ� ����� ���� �Է� : ");
			System.out.println("����� exit �Է�");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				//�ٷ� �������� ����
				dos.writeChars(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//������Ʈ�� close, �ֽ�Ʈ���� �ڵ����� close
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
