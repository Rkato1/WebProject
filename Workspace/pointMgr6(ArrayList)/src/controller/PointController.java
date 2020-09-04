package controller;

import java.util.ArrayList;

import model.vo.Grade;
import view.PointView;


public class PointController {
	ArrayList<Grade> members;	
	int searchResult = -1;
	PointView pv;
	public PointController() {
		members = new ArrayList<Grade>();
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
		members.add(pv.insertMember());
	}	
	
	//ȸ�� ������ ���� ����ϴ� �޼ҵ�
	public void selectAllMember() {
		if(members.isEmpty()) {
			pv.cannotSearch();
			return;
		}
		pv.selectAllMember(members);			
	}
	
	//ȸ�� �̸��� �˻��ؼ� ������ ����ϴ� �޼ҵ�
	public void selectMember(){
		if(members.isEmpty()) {
			pv.cannotSearch();
			return;
		}
		String str = pv.searchName("��ȸ");
		searchResult = searchIndex(str);
		if(searchResult != -1) {
			pv.selectMember(members.get(searchResult));			
		}else {
			pv.noSearch();
		}
	}
	
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public void updateMember() {
		if(members.isEmpty()) {
			pv.cannotSearch();
			return;
		}
		String str = pv.searchName("����");
		searchResult = searchIndex(str);
		pv.updateMember();
		if(searchResult!=-1) {
			members.remove(searchResult);
			members.add(pv.insertMember());
		}else {
			pv.noSearch();
		}
	}
	
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public void deleteMember() {
		if(members.isEmpty()) {
			pv.cannotSearch();
			return;
		}
		String str = pv.searchName("����");
		searchResult = searchIndex(str);
		if(searchResult != -1) {
			members.remove(searchResult);
		}else {
			pv.noSearch();
		}
	}
	
	//��ȸ�� �̸��� �Ű������� �޾� �迭��
	//�� ��° �ε����� �ִ��� ��ȸ�Ͽ� �ε��� ��ȣ����
	public int searchIndex(String name) {
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getName().equals(name)) {
				searchResult = i;
				return searchResult;
			}
		}
		return -1;
	}
}
