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
		ui = new UserInfo("기본값",0,"기본값");
		Score score = new Score(50,50,50);
		ui.setScore(score);
		// TODO Auto-generated constructor stub
	}
	public void main() {
		while(true) {
			System.out.println("1. 유저 정보 입력 후 내보내기");
			System.out.println("2. 유저 정보 읽어오기");
			System.out.println("3. 현재 유저 정보 출력");
			System.out.print("선택 > ");
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
				System.out.println("1~3 사이 정수 제대로 입력");
				continue;
			}
		}
	}	
	public void printUser() {
		// TODO Auto-generated method stub
		System.out.println("이름 : "+ui.getName());
		System.out.println("나이 : "+ui.getAge());
		System.out.println("주소 : "+ui.getAddr());
		System.out.println("국어점수 : "+ui.getScore().getKor());
		System.out.println("영어점수 : "+ui.getScore().getEng());
		System.out.println("수학점수 : "+ui.getScore().getMath());
	}
	public void outputUser() {
		// TODO Auto-generated method stub
		System.out.print("유저 이름 입력 : ");
		String name = sc.next();		
		System.out.print("유저 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("유저 주소 입력 : ");
		String addr = sc.next();
		UserInfo u = new UserInfo(name, age, addr);
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		Score s = new Score(kor, math, eng);
		u.setScore(s);
		//객체 내보내기 위한 보조스트림
		ObjectOutputStream oos = null;
		//메인스트림
		try {
			FileOutputStream fos = new FileOutputStream("object.txt");
			oos = new ObjectOutputStream(fos);
			//모든 객체를 내보낼때 사용함(매개변수는 object타입)
			//직렬화
			oos.writeObject(u);
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
	
	public void inputUser() {
		// TODO Auto-generated method stub
		//객체를 읽어오기 위한 보조스트림
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("object.txt");
			ois = new ObjectInputStream(fis);
			//저장된 객체 불러오기(object형태이므로 다운캐스팅선언)
			//역직렬화
			this.ui = (UserInfo)ois.readObject();
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
