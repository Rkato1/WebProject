package func;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public void fileTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		//������ �����ϸ�
		if(file.exists()) {
			System.out.println("�����̸� : "+file.getName());
			System.out.println("�ش� ���丮 : "+file.getParent());
			System.out.println("���� ����� : "+file.getPath());
			System.out.println("���� ������ : "+file.getAbsolutePath());
			System.out.println("���� ũ�� : "+file.length()+"Byte");
		}else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}
}
