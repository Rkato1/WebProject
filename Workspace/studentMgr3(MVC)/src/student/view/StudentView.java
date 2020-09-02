package student.view;

import java.util.Scanner;

import student.model.vo.Student;

public class StudentView {

	Scanner sc;
	
	public StudentView() {
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {
		// TODO Auto-generated method stub
		System.out.print("\n--- 학생 관리 프로그램 ---\n");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 전체 학생 정보");
		System.out.println("3. 학생 정보 출력(1명)");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.print("선택 > ");
		int itemp = sc.nextInt();
		return itemp;
	}
	
	public Student insertStudent() {
		// TODO Auto-generated method stub
		System.out.print("\n--- 학생 정보 등록 ---\n");
		System.out.print("학생 이름 입력 ");
		String name = sc.next();
		System.out.print("학생 나이 입력 ");
		int age = sc.nextInt();
		System.out.print("학생 주소 입력 ");
		String addr= sc.next();
		Student st = new Student(name, age, addr);
		return st;
	}
	
	public void printAllStudent(Student st[], int index) {
		// TODO Auto-generated method stub
		System.out.println("\n--- 전제 학생 정보 출력---");
		System.out.println("이름\t나이\t주소");
		for(int i=0;i<index;i++) {
			System.out.println(st[i].getName()+"\t"+st[i].getAge()+"\t"+st[i].getAddr());
		}
	}

	//public void printStudent(Student st[], int index) {
	public void printStudent(Student st) {
		System.out.println("\n--- 학생 정보 출력---");		
		System.out.println("이름\t나이\t주소");
		//System.out.println(st[index].getName()+"\t"+st[index].getAge()+"\t"+st[index].getAddr());
		System.out.println(st.getName()+"\t"+st.getAge()+"\t"+st.getAddr());
	}

	public String getName(String str) {
		// TODO Auto-generated method stub
		System.out.print(str+"할 학생 이름 입력 ");
		String name = sc.next();
		return name;
	}
	
	public void printMsg(String str) {
		System.out.println(str);
	}
	
	public void noSearch() {
		// TODO Auto-generated method stub
		printMsg("검색결과없음");
		//굳이 필요는 없지만 편의성
		//System.out.println("검색결과없음");
	}
}
