package view;

import java.util.Scanner;

public class View {

	Scanner sc;

	public View() {
		super();
		sc = new Scanner(System.in);
	}

	public int showWelcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to DGV");
		System.out.println("--------------");
		System.out.println("-1. 알바생------");
		System.out.println("-2. 손 님-------");
		System.out.println("-0. 종 료-------");
		System.out.println("--------------");
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}

	public int showMenu() {
		// TODO Auto-generated method stub
		System.out.println("---- 상 영 관 -----");
		System.out.println("---------------");
		System.out.println("-1. 영화추가------");
		System.out.println("-2. 영화수정------");
		System.out.println("-3. 영화삭제------");
		System.out.println("-4. 상영영화------");
		System.out.println("---------------");
		System.out.println("----- 매 점 ------");

		System.out.println("-5. 재고현황------");
		System.out.println("-6. 상품등록------");
		System.out.println("-7. 상품수정------");
		System.out.println("-8. 상품삭제------");
		System.out.println("-0. 처음화면------");
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}

	public int showGuest() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to DGV");
		System.out.println("---------------");
		System.out.println("-1. 영 화 관------");
		System.out.println("-2. 매     점------");
		System.out.println("-0. 처음화면------");
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}
	
	public int guestProcess(int itemp1) { 
		if(itemp1 == 1) {
			return movieShow();
		}else if(itemp1 == 2) {
			return storeShow();
		}else {
			return 0;
		}
	}
	public int guestProcess2(int itemp) { 
		if(itemp == 1) {
			return movieShow();
		}else if(itemp == 2) {
			return storeShow();
		}else {
			return 0;
		}
	}
	
	public int movieShow() {
		System.out.println("---------------");
		System.out.println("-1. 영화예매------");
		System.out.println("-2. 예매확인------");
		System.out.println("-3. 예매취소------");
		System.out.println("-0. 처음화면------");
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int storeShow() {
		System.out.println("---------------");
		System.out.println("-1. 음료구매------");
		System.out.println("-2. 음식구매------");
		System.out.println("-3. 팝콘구매------");
		System.out.println("-0. 처음화면------");
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int showFood() {
		System.out.println("\t\t음식\t\t");
		System.out.print("No.\t제품명\t수량\t가격\n");
		//음식배열
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int showDrink() {
		System.out.println("\t\t음료\t\t");
		System.out.print("No.\t제품명\t수량\t가격\n");
		//음료배열
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}
	public int showPopcorn() {
		System.out.println("\t\t팝콘\t\t");
		System.out.print("No.\t제품명\t수량\t가격\t맛\n");
		//팝콘배열
		System.out.print("선택 > ");
		int temp = sc.nextInt();
		return temp;
	}
}
