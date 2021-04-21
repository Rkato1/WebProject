package kh.point.controller;

import java.util.Scanner;

import kh.point.model.vo.Gold;
import kh.point.model.vo.Grade;
import kh.point.model.vo.Silver;
import kh.point.model.vo.Vip;
import kh.point.model.vo.Vvip;

public class PointController {
	Scanner sc;
	Grade[] members;
	int index;
	int searchResult = -1;
	public PointController() {
		sc = new Scanner(System.in);
		members = new Grade[40];
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
			System.out.println("\n==== 회원 정보 입력====\n");
			
			//입력
			System.out.print("회원 이름 입력 : ");
			String str = sc.next();			
			//줄바꿈(next는 두 번 연속으로 쓰면 무한루프 에러남)
			sc.nextLine();
			System.out.print("회원 등급 입력[silver/gold/vip/vvip] : ");
			String str1 = sc.next();
			System.out.print("회원 포인트 입력 : ");
			int i = sc.nextInt();
			sc.nextLine();
			
			switch(str1) {
			case"silver":
				members[index++] = new Silver(str, str1, i);
				break;
			case "gold":
				members[index++] = new Gold(str, str1, i);
				break;
			case "vip":
				members[index++] = new Vip(str, str1, i);
				break;
			case "vvip":
				members[index++] = new Vvip(str, str1, i);
			default:
				System.out.println("잘못된 입력");
				break;
			}
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
				System.out.print("회원 등급 입력[silver/gold/vip/vvip] : ");
				String str1 = sc.next();
				System.out.print("회원 포인트 입력 : ");
				int p = sc.nextInt();
				
				switch(str1) {
				case "silver":
					members[itemp] = new Silver(str, str1, p);
					break;
				case "gold":
					members[itemp] = new Gold(str, str1, p);
					break;
				case "vip":
					members[itemp] = new Vip(str, str1, p);
					break;
				case "vvip":
					members[itemp] = new Vvip(str, str1, p);
					break;
				}				
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
}