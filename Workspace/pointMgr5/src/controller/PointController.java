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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}		
	}
	
	//ȸ�� ���� �Է¹޾� �迭�� �����ϴ� �޼ҵ�
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
				System.out.println("�߸��� ��� �Է�");
				break;
			}			
		}
		*/
		
		//ȸ�� ������ ���� ����ϴ� �޼ҵ�
		public void selectAllMember() {
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			pv.selectAllMember(members, index);			
		}
		
		//ȸ�� �̸��� �˻��ؼ� ������ ����ϴ� �޼ҵ�
		public void selectMember(){
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			String str = pv.searchName("��ȸ");
			searchResult = searchIndex(str);
			if(searchResult != -1) {
				pv.selectMember(members[searchResult]);			
			}else {
				pv.noSearch();
			}
		}
		
		//ȸ�� ������ �����ϴ� �޼ҵ�
		public void updateMember() {
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			String str = pv.searchName("����");
			searchResult = searchIndex(str);
			pv.updateMember();
			if(searchResult!=-1) {
				Grade g = pv.insertMember(index++);
				members[searchResult] = g;
			}else {
				pv.noSearch();
			}
		}
		
		//ȸ�� ������ �����ϴ� �޼ҵ�
		public void deleteMember() {
			if(index == 0) {
				pv.cannotSearch();
				return;
			}
			String str = pv.searchName("����");
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
		
		//��ȸ�� �̸��� �Ű������� �޾� �迭��
		//�� ��° �ε����� �ִ��� ��ȸ�Ͽ� �ε��� ��ȣ����
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
