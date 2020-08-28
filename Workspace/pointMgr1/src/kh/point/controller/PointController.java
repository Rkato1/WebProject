package kh.point.controller;

import java.util.Scanner;

import kh.point.vo.Gold;
import kh.point.vo.Silver;
import kh.point.vo.Vip;

public class PointController {
	Scanner sc;
	
	Silver s[];
	Gold g[];
	Vip v[];
	
	//parameter접근용 변수
	int sIndex;
	int gIndex;
	int vIndex;
	//검색된 등급 결과에 따라 값이 달라지는 변수
	//silver,1 gold,2 vip,3
	int searchResult;
	
	//생성자(초기화 및 값 할당)
	public PointController() {
		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
	}
	
	//첫 화면 출력
	public void main() {
		while(true) {
			System.out.println("\n\n---- 회원 관리 프로그램 v1 ----\n");
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
		System.out.print("회원 등급 입력[silver/gold/vip] : ");
		String str1 = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		switch(str1) {
		case "silver":
			s[sIndex] = new Silver(str, str1, i);		
			sIndex++;
			break;
		case "gold":
			g[sIndex] = new Gold(str, str1, i);		
			gIndex++;
			break;
		case "vip":
			v[sIndex] = new Vip(str, str1, i);		
			vIndex++;
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	
	//회원 정보를 전부 출력하는 메소드
	public void selectAllMember() {
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		System.out.println("이름\t등급\t포인트\t보너스");
		for(int i=0; i<sIndex; i++) {
			System.out.print(s[i].getName() + "\t" + s[i].getGrade() + "\t" + s[i].getPoint() + "\t" + s[i].getBonus() + "\n");
		}
		System.out.println();
		System.out.println("이름\t등급\t포인트\t보너스");
		for(int i=0; i<gIndex; i++) {
			System.out.print(g[i].getName() + "\t" + g[i].getGrade() + "\t" + g[i].getPoint() + "\t" + g[i].getBonus() + "\n");
		}
		System.out.println();
		System.out.println("이름\t등급\t포인트\t보너스");
		for(int i=0; i<vIndex; i++) {
			System.out.print(v[i].getName() + "\t" + v[i].getGrade() + "\t" + v[i].getPoint() + "\t"+ v[i].getBonus() + "\n");
		}
	}
	
	//회원 이름을 검색해서 정보를 출력하는 메소드
	public void selectMember(){
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		System.out.println("==== 회원 정보 조회 ====");
		System.out.print("검색할 회원의 이름을 입력 : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.println("이름\t등급\t포인트");
			if(searchResult==1) {
				System.out.print(s[itemp].getName() + "\t" + s[itemp].getGrade() + "\t" + s[itemp].getPoint() + "\n");
			}else if(searchResult==2) {
				System.out.print(g[itemp].getName() + "\t" + g[itemp].getGrade() + "\t" + g[itemp].getPoint() + "\n");
			}else if(searchResult==3) {
				System.out.print(v[itemp].getName() + "\t" + v[itemp].getGrade() + "\t" + v[itemp].getPoint() + "\n");
			}
		}else {
			System.out.println("검색 결과 없음");
		}
		//줄바꿈 초기화
		sc.nextLine();
	}
	
	//회원 정보를 수정하는 메소드
	public void updateMember() {
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		//검색 결과 판별 위한 임시변수
		boolean isSearch=false;
		System.out.println("==== 회원 정보 수정 ====");
		System.out.print("수정할 회원의 이름을 입력 : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.print("수정할 이름 입력 : ");
			s[itemp].setName(sc.next());
			System.out.print("수정할 등급 입력 : ");
			s[itemp].setGrade(sc.next());				
			System.out.print("수정할 포인트 입력 : ");
			s[itemp].setPoint(sc.nextInt());			
		}
		
		//줄바꿈 초기화
		sc.nextLine();
		//검색 결과가 있을수도 있고, 없을수도 있음
		if(!isSearch) {
			System.out.println("검색 결과 없음");
		}
	}
	
	//회원 정보를 삭제하는 메소드
	public void deleteMember() {
		if(sIndex == 0 && gIndex == 0 && vIndex == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		//검색 결과 판별 위한 임시변수
		boolean isSearch=false;
		System.out.println("---- 회원 정보 삭제 ----");
		System.out.print("삭제할 회원의 이름을 입력 : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			if(searchResult == 1) {
				for(int i=itemp;i<sIndex-1;i++) {
					s[i]=s[i+1];									
				}
				sIndex--;
			}else if(searchResult == 2) {
				for(int i=itemp;i<gIndex-1;i++) {
					g[i]=g[i+1];				
				}
				gIndex--;
			}else if(searchResult == 3) {
				for(int i=itemp;i<vIndex-1;i++) {
					v[i]=v[i+1];				
				}
				vIndex--;
			}
		}

		//줄바꿈 초기화
		sc.nextLine();
		//검색 결과가 있을수도 있고, 없을수도 있음
		if(!isSearch) {
			System.out.println("검색 결과 없음");
		}
	}
	
	//조회할 이름을 매개변수로 받아 배열의
	//몇 번째 인덱스에 있는지 조회하여 인덱스 번호리턴
	public int searchIndex(String name) {
		for(int i=0;i<sIndex;i++) {
			if(s[i].getName().equals(name)) {
				searchResult = 1;
				return i;
				//다른방법 100~109
				//return 100+i;
			}
		}
		for(int i=0;i<gIndex;i++) {
			if(g[i].getName().equals(name)) {
				searchResult = 2;
				return i;
				//다른방법 10~19
				//return 10+i;
			}
		}
		for(int i=0;i<vIndex;i++) {
			if(v[i].getName().equals(name)) {
				searchResult = 3;
				//0~9
				return i;
			}
		}
		return -1;
	}
}