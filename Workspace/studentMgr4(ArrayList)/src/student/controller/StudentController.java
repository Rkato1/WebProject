package student.controller;

import java.util.ArrayList;

import student.model.vo.Student;
import student.view.StudentView;

public class StudentController {
	ArrayList<Student> st;	
	StudentView view;
	
	public StudentController() {
		super();
		st = new ArrayList<Student>();
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
		st.add(view.insertStudent());
	}
	
	public void printAllStudent() {
		view.printAllStudent(st);
	}
	
	public void printStudent() {
		String name = view.getName("조회");
		int searchIndex = searchIndex(name);
		if(searchIndex==-1) {
			view.noSearch();
		}else {
			view.printStudent(st.get(searchIndex));
		}
	}
	
	public void updateStudent() {
		String name = view.getName("수정");
		int searchIndex = searchIndex(name);
		if(searchIndex==-1) {
			view.noSearch();
		}else {
			Student s = view.insertStudent();
			st.set(searchIndex, s);
		}
	}
	
	public void deleteStudent() {
		String name = view.getName("삭제");
		int searchIndex = searchIndex(name);
		if(searchIndex==-1) {
			view.noSearch();
		}else {
			st.remove(searchIndex);
		}
	}
	
	public int searchIndex(String name) {		
		for(int i=0;i<st.size();i++) {			
			if(st.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
