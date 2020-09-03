package controller;

import model.vo.Gold;
import model.vo.Grade;
import model.vo.Silver;
import model.vo.Vip;
import view.PointView;


public class PointController {
	Grade[] members;
	int index;
	int searchResult = -1;
	PointView pv;
	public PointController() {
		members = new Grade[30];
		pv = new PointView();
	}
	public void main() {
		while(true) {
			int temp = pv.showMenu();
			switch(temp) {
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
			//Grade g = pv.insertMember(index++);
			//members[index++] = g;
			members[index] = pv.insertMember(index++);
			//insertArr(g);
		}
		/*
		public void insertArr(Grade g) {
			switch(g.getGrade()) {
			case"silver":
				members[index++] = g;
				break;
			case "gold":
				members[index++] = new Gold(g.getName(), g.getGrade(), g.getPoint());
				break;
			case "vip":
				members[index++] = new Vip(g.getName(), g.getGrade(), g.getPoint());
				break;
			default:
				System.out.println("잘못된 등급 입력");
				break;
			}			
		}
		*/
		
		//회원 정보를 전부 출력하는 메소드
		public void selectAllMember() {
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			pv.selectAllMember(members, index);			
		}
		
		//회원 이름을 검색해서 정보를 출력하는 메소드
		public void selectMember(){
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			String str = pv.searchName("조회");
			searchResult = searchIndex(str);
			if(searchResult != -1) {
				pv.selectMember(members[searchResult]);			
			}else {
				pv.noSearch();
			}
		}
		
		//회원 정보를 수정하는 메소드
		public void updateMember() {
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			String str = pv.searchName("수정");
			searchResult = searchIndex(str);
			pv.updateMember();
			if(searchResult!=-1) {
				Grade g = pv.insertMember(index++);
				members[searchResult] = g;
			}else {
				pv.noSearch();
			}
		}
		
		//회원 정보를 삭제하는 메소드
		public void deleteMember() {
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			String str = pv.searchName("삭제");
			searchResult = searchIndex(str);
			if(searchResult != -1) {				
				for(int i=searchResult;i<index-1;i++) {
					members[i]=members[i+1];									
				}
				index--;
			}else {
				pv.noSearch();
			}
		}
		
		//조회할 이름을 매개변수로 받아 배열의
		//몇 번째 인덱스에 있는지 조회하여 인덱스 번호리턴
		public int searchIndex(String name) {
			for(int i=0;i<index;i++) {
				if(members[i].getName().equals(name)) {
					searchResult = i;
					return searchResult;
				}
			}
			return -1;
		}
}
