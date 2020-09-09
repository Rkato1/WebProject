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
		//시작하자마자 불러오기
		loadInfo();
	}
	
	public void main() {
		while(true) {
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 정보 삭제");
			System.out.println("3. 전체 회원 출력");
			System.out.println("4. 저장");
			System.out.println("5. 불러오기");
			System.out.print("선택 > ");
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
				System.out.println("1~5 사이 정수 제대로 입력");
				continue;
			}
		}
	}

	public void insertUser() {
		// TODO Auto-generated method stub
		System.out.println("\n==== 회원 정보 입력====\n");		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		String addr = sc.next();
		UserInfo ui = new UserInfo(name,age,addr);
		users.add(ui);
		System.out.println("등록 완료");
	}
	
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("\n---회원정보삭제---\n");
		System.out.print("삭제할 회원 이름 입력 : ");
		String name = sc.next();
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getName().equals(name)) {
				users.remove(i);
				System.out.println("삭제 완료");
				return;
			}
		}
		System.out.println("회원 존재하지 않음");
	}
	

	public void printAllUser() {
		// TODO Auto-generated method stub
		System.out.println("\n---전체회원정보출력---\n");
		System.out.println("이름\t나이\t주소");
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
			System.out.println("저장완료");
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
			System.out.println("불러오기 완료");
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
