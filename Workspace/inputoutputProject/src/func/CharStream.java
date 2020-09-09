package func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStream {
	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		
		try {
			fw = new FileWriter(fileName);
			System.out.println("["+ fileName+"] ���Ͽ� ������ ���� �Է� : ");
			System.out.println("����� exit �Է�");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit\r\n")) {
					break;
				}
				fw.write(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//�ѱ۵� �ȱ���
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		//��μ���
		String path = "C:\\Users\\user\\Desktop\\";
		BufferedWriter bw = null;
		
		try {
			//FileWriter fw = new FileWriter(path+fileName);
			//bw = new BufferedWriter(fw);
			//��ġ��
			bw = new BufferedWriter(new FileWriter(path+fileName));
			System.out.println("["+ fileName+"] ���Ͽ� ������ ���� �Է� : ");
			System.out.println("����� exit �Է�");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				bw.write(str);
				//�ٹٲ�
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void charStreamReader() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ε��� ���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while(true) {
				//br.readLine()
				//���Ͽ��� ������ �о line������ ����
				String line = br.readLine();
				//������ �� �о�����
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
