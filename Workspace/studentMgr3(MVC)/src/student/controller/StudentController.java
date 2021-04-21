package student.controller;

import student.model.vo.Student;
import student.view.StudentView;

public class StudentController {
	Student st[];
	int index;
	StudentView view;
	
	public StudentController() {
		st = new Student[10];
		view = new StudentView();
	}
	
	public void main() {
		while(true){
			int itemp = view.showMenu();
			switch(itemp) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			default:
				System.out.println("잘못된 숫자. 다시 입력");
				break;
			}
		}
	}
	
	public void insertStudent() {
		st[index++] = view.insertStudent();
	}
	
	public void printAllStudent() {
		view.printAllStudent(st, index);
	}
	
	public void printStudent() {
		String name = view.getName("조회");
		int searchIndex = searchIndex(name);
		if(searchIndex==-1) {
			view.noSearch();
		}else {
			//view.printStudent(st, searchIndex);
			view.printStudent(st[searchIndex]);
		}
	}
	
	public void updateStudent() {
		String name = view.getName("수정");
		int searchIndex = searchIndex(name);
		if(searchIndex==-1) {
			view.noSearch();
		}else {
			Student s = view.insertStudent();
			st[searchIndex] = s;
			//view.updateStudent(st[searchIndex]);
		}
	}
	
	public void deleteStudent() {
		String name = view.getName("삭제");
		int searchIndex = searchIndex(name);
		if(searchIndex==-1) {
			view.noSearch();
		}else {
			for(int i=searchIndex;i<index-1;i++) {
				st[i]=st[i+1];
			}
			index--;
		}
	}
	
	public int searchIndex(String name) {
		for(int i=0;i<index;i++) {
			if(st[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
