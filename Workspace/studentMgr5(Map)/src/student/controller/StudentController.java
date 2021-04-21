package student.controller;

import java.util.HashMap;

import student.model.vo.Student;
import student.view.StudentView;

public class StudentController {
	HashMap<String, Student> st;
	StudentView view;
	
	public StudentController() {
		super();
		st = new HashMap<String, Student>();
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
		Student stTemp = view.insertStudent();
		st.put(stTemp.getName(), stTemp);
	}
	
	public void printAllStudent() {
		if(st.isEmpty()) {
			view.cannotSearch();
		}else {
			view.printAllStudent(st);
		}
	}
	
	public void printStudent() {
		if(st.isEmpty()) {
			view.cannotSearch();
		}else {
			String name = view.getName("조회");
			if(st.containsKey(name)) {
				view.printStudent(st.get(name));
			}else {
				view.noSearch();
			}
		}
	}
	
	public void updateStudent() {
		if(st.isEmpty()) {
			view.cannotSearch();
		}else {
			String name = view.getName("수정");
			if(st.containsKey(name)) {
				st.remove(name);
				Student stTemp = view.insertStudent();
				st.put(stTemp.getName(), stTemp);
			}else {		
				view.noSearch();
			}
		}
	}
	
	public void deleteStudent() {
		if(st.isEmpty()) {
			view.cannotSearch();
		}else {
			String name = view.getName("삭제");
			if(st.containsKey(name)) {
				st.remove(name);
			}
			else {
				view.noSearch();
			}
		}
	}
}
