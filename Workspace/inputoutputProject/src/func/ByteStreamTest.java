package func;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
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
				//������ �۾��� ������ �迭
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
}
