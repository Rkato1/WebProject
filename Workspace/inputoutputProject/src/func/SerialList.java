package func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SerialList {
	ArrayList<UserInfo> users;
	Scanner sc;
	
	public SerialList() {
		super();
		// TODO Auto-generated constructor stub
		users = new ArrayList<UserInfo>();
		sc = new Scanner(System.in);
		//�������ڸ��� �ҷ�����
		loadInfo();
	}
	
	public void main() {
		while(true) {
			System.out.println("1. ȸ�� ���� ���");
			System.out.println("2. ȸ�� ���� ����");
			System.out.println("3. ��ü ȸ�� ���");
			System.out.println("4. ����");
			System.out.println("5. �ҷ�����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				insertUser();
				break;
			case 2:
				deleteUser();
				break;
			case 3:
				printAllUser();
				break;
			case 4:
				saveInfo();
				break;
			case 5:
				loadInfo();
				break;
			default:
				System.out.println("1~5 ���� ���� ����� �Է�");
				continue;
			}
		}
	}

	public void insertUser() {
		// TODO Auto-generated method stub
		System.out.println("\n==== ȸ�� ���� �Է�====\n");		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		String addr = sc.next();
		UserInfo ui = new UserInfo(name,age,addr);
		users.add(ui);
		System.out.println("��� �Ϸ�");
	}
	
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("\n---ȸ����������---\n");
		System.out.print("������ ȸ�� �̸� �Է� : ");
		String name = sc.next();
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getName().equals(name)) {
				users.remove(i);
				System.out.println("���� �Ϸ�");
				return;
			}
		}
		System.out.println("ȸ�� �������� ����");
	}
	

	public void printAllUser() {
		// TODO Auto-generated method stub
		System.out.println("\n---��üȸ���������---\n");
		System.out.println("�̸�\t����\t�ּ�");
		for(UserInfo uis : users) {
			System.out.println(uis.getName()+"\t"+uis.getAge()+"\t"+uis.getAddr());
		}
	}	

	public void saveInfo() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fis = new FileOutputStream("userList.txt");
			oos = new ObjectOutputStream(oos);
			oos.writeObject(users);
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

	public void loadInfo() {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("userList.txt");
			ois = new ObjectInputStream(fis);
			users = (ArrayList<UserInfo>)ois.readObject();
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
