package run;

import java.io.FileNotFoundException;

import func.ExceptionTest;

public class Start {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ExceptionTest et = new ExceptionTest();
		//Ŭ���������� try catchó�� �ؼ� �ٷ� ��밡��
		et.test2();
		try {
			//�ݴ�� Ŭ������ throws�� ó���ϸ�
			//try catch�� ������ �ѹ��� ���ľ���
			et.test3();
			System.out.println("��������");
		}catch(FileNotFoundException e) {
			System.out.println("���Ͼ���");
		}
	}

}
