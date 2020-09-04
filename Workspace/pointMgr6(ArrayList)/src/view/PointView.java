package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.vo.Gold;
import model.vo.Grade;
import model.vo.Silver;
import model.vo.Vip;

public class PointView {
	Scanner sc;

	public PointView() {
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {
		System.out.println("\n\n---- 회원 관리 프로그램 vALT ----\n");
		System.out.println("1.회원 등록");
		System.out.println("2.회원 전체 정보 출력");
		System.out.println("3.회원 1명 정보 출력");
		System.out.println("4.회원 정보 수정");
		System.out.println("5.회원 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택 > ");
		int itemp = sc.nextInt();
		return itemp;
	}
	public Grade insertMember() {
		System.out.println("\n==== 회원 정보 입력====\n");		
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();		
		System.out.print("회원 등급 입력[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case"silver":
			return new Silver(name, grade, point);
		case "gold":			
			return new Gold(name, grade, point);
		case "vip":			
			return new Vip(name, grade, point);
		default:
			System.out.println("잘못된 등급 입력");
			break;
		}
		return null;
	}
	
	public void cannotSearch() {
		System.out.println("입력된 정보가 없음");
	}
	
	public void noSearch() {
		System.out.println("검색결과없음");
	}

	public void selectAllMember(ArrayList<Grade> members) {
		System.out.println("\n---- 전체 회원 정보 출력 ----\n");
		System.out.println("이름\t등급\t포인트\t보너스");
		for(Grade g : members) {
			System.out.print(g);
		}		
	}
	
	
	public void selectMember(Grade member) {		
		System.out.println("이름\t등급\t포인트\t보너스");
		System.out.print(member);
	}
	
	public String searchName(String str) {
		System.out.println("==== 회원 정보 "+str+" ====");
		System.out.print(str+"할 회원의 이름을 입력 : ");
		return sc.next();
	}

	public void updateMember() {
		// TODO Auto-generated method stub
		
	}	
}
