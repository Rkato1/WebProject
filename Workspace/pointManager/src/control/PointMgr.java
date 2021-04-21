package control;

import java.util.Scanner;

import vo.Gold;
import vo.Grade;
import vo.Silver;
import vo.Vip;

public class PointMgr {
	Scanner sc;
	Grade members[];
	int index;
	int searchResult = -1;
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		members = new Grade[30];
	}
	
	public void main() {
		while(true) {
			System.out.println("\n\n---- 회원 관리 프로그램 v상속 ----\n");
			System.out.println("1.회원 등록");
			System.out.println("2.회원 전체 정보 출력");
			System.out.println("3.회원 1명 정보 출력");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 삭제");
			System.out.println("0.프로그램 종료");
			System.out.print("선택 > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				insertMember();
				break;
			case 2:
				selectAllMember();
				break;
			case 3:
				selectMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}		
	}
	
	//회원 정보 입력받아 배열에 저장하는 메소드
		public void insertMember() {
			if(index>=30) {
				System.out.println("인원초과");
				return;
			}
			
			System.out.println("\n==== 회원 정보 입력====\n");
			String str = "";
			boolean isOverlap = true;
			while(isOverlap) {
				//입력
				System.out.print("회원 이름 입력 : ");
				str = sc.next();	
				isOverlap = overlapName(str);
				sc.nextLine();
			}
			System.out.print("회원 등급 입력[silver/gold/vip] : ");
			String str1 = sc.next();
			System.out.print("회원 포인트 입력 : ");
			int i = sc.nextInt();
			sc.nextLine();
			
			division(str, str1, i, index);
			index++;
		}
		
		//회원 정보를 전부 출력하는 메소드
		public void selectAllMember() {
			if(index == 0) {
				System.out.println("입력된 정보가 없습니다.");
				return;
			}
			System.out.println("\n---- 전체 회원 정보 출력 ----\n");
			System.out.println("이름\t등급\t포인트\t보너스");
			for(int i=0; i<index; i++) {
				System.out.print(members[i].getName() + "\t" +
								members[i].getGrade() + "\t" +
								members[i].getPoint() + "\t" +
								members[i].getBonus() + "\n");
			}
		}
		
		//회원 이름을 검색해서 정보를 출력하는 메소드
		public void selectMember(){
			if(index == 0) {
				System.out.println("입력된 정보가 없습니다.");
				return;
			}
			
			System.out.println("==== 회원 정보 조회 ====");
			System.out.print("검색할 회원의 이름을 입력 : ");
			int itemp = searchIndex(sc.next());
			if(itemp != -1) {
				System.out.println("이름\t등급\t포인트\t보너스");
				System.out.print(members[itemp].getName() + "\t" + members[itemp].getGrade() + "\t" + members[itemp].getPoint() + "\t" + members[itemp].getBonus() + "\n");				
			}else {
				System.out.println("검색 결과 없음");
			}
			//줄바꿈 초기화
			sc.nextLine();
		}
		
		//회원 정보를 수정하는 메소드
		public void updateMember() {
			if(index == 0) {
				System.out.println("입력된 정보가 없습니다.");
				return;
			}
			
			System.out.println("==== 회원 정보 수정 ====");
			System.out.print("수정할 회원의 이름을 입력 : ");
			int itemp = searchIndex(sc.next());
			if(itemp != -1) {
				System.out.print("");
				System.out.print("회원 이름 입력 : ");
				String str = sc.next();
				//줄바꿈(next는 두 번 연속으로 쓰면 무한루프 에러남)
				sc.nextLine();
				System.out.print("회원 등급 입력[silver/gold/vip] : ");
				String str1 = sc.next();
				System.out.print("회원 포인트 입력 : ");
				int p = sc.nextInt();
				division(str, str1, p, itemp);
			}else {
				System.out.println("검색 결과 없음");
			}
			//줄바꿈 초기화
			sc.nextLine();
		}
		
		//회원 정보를 삭제하는 메소드
		public void deleteMember() {
			if(index == 0) {
				System.out.println("입력된 정보가 없습니다.");
				return;
			}
			System.out.println("---- 회원 정보 삭제 ----");
			System.out.print("삭제할 회원의 이름을 입력 : ");
			int itemp = searchIndex(sc.next());
			if(itemp != -1) {
				for(int i=itemp;i<index-1;i++) {
					members[i]=members[i+1];
				}
				index--;				
			}else {
				System.out.println("검색 결과 없음");
			}
			//줄바꿈 초기화
			sc.nextLine();
		}
		
		//조회할 이름을 매개변수로 받아 배열의
		//몇 번째 인덱스에 있는지 조회하여 인덱스 번호리턴
		public int searchIndex(String name) {
			for(int i=0;i<index;i++) {
				if(members[i].getName().equals(name)) {
					searchResult = 1;
					return i;
				}
			}
			return -1;
		}
		
		//수정 입력 할때 정보를 넣는 메소드
		public void division(String name, String grade, int point, int index) {
			switch(grade) {
			case "silver":
				members[index] = new Silver(name, grade, point);
				break;
			case "gold":
				members[index] = new Gold(name, grade, point);
				break;
			case "vip":
				members[index] = new Vip(name, grade, point);
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		
		//다형성->부모타입변수에 자식타입 객체를 저장
		public Grade division2(String name, String grade, int point, int index) {
			switch(grade) {
			case "silver":
				return new Silver(name, grade, point);
			case "gold":
				return new Gold(name, grade, point);
			case "vip":
				return new Vip(name, grade, point);
			default:
				System.out.println("잘못된 입력");
				return null;
			}
		}
		
		//이름 중복체크 메소드
		public boolean overlapName(String str) {
			if(index == 0) {
				return false;
			}
			for(int i=0; i<index; i++) {
				if(str.equals(members[i].getName())) {
					System.out.println("이미 존재하는 이름");
					return true;
				}
			}
			return false;
		}
}
