package kh.java.controller;

import java.util.Scanner;

import kh.java.func.Student;

public class StudentController {
	//vo처리
	//getter, setter 굳이 안해도 됨
	
	//전역변수 선언
	private Student s;
	private Scanner sc;
	
	public StudentController() {
		s = new Student();
		sc = new Scanner(System.in);
	}
	
	//객체배열
	//클래스병[] 변수명 = new 클래스명(크기);
	//할당 후 값 저장(초기화)을 하지 않으면 전부 null
	//A[] a = new A(2);
	//a[0] = new A();
	
	//CRUD프로그램
	//데이터를 저장, 출력, 수정, 삭제
	//Create,Read,Update,Delete
	public void main() {
		while(true) {
			System.out.println("==학생관리 프로그램==");
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 출력");
			System.out.println("3.학생 정보 수정");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				showStudent();
				break;
			case 3:
				showStudent();
				updateStudent();
				break;
			case 4:
				deleteStudent();
				break;
			case 5:
				return;//메소드를 종료시킴
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
	
	//값을 입력받아 변수에 넣어주는 메소드
	public void insertStudent() {
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		s.setName(name);
		System.out.print("학생 나이 입력 : ");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.print("학생 주소 입력 : ");
		//줄바꿈으로 입력 초기화
		sc.nextLine();
		String addr = sc.next();
		s.setAddr(addr);
		System.out.println("정보입력완료");
	}
	
	//입력받은 값을 보여주는 메소드
	public void showStudent() {
		System.out.println("학생의 이름은 : " + s.getName());
		System.out.println("학생의 나이는 : " + s.getAge());
		System.out.println("학생의 주소는 : " + s.getAddr());
	}
	
	//기존 값을 변경하는 메소드
	public void updateStudent() {		
		System.out.println("수정항목 선택");
		System.out.println("1. 이름");
		System.out.println("2. 나이");
		System.out.println("3. 주소");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1:
			System.out.print("수정할 이름 입력 : ");
			String name = sc.next();
			s.setName(name);
			break;
		case 2:
			System.out.print("수정할 나이 입력 : ");
			int age = sc.nextInt();
			s.setAge(age);
			break;
		case 3:
			System.out.print("수정할 주소 입력 : ");
			String addr = sc.next();
			s.setAddr(addr);
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	
	//값을 삭제(초기화)하는 메소드
	public void deleteStudent() {
		System.out.print("진짜 삭제하시겠습니까(y/n)?");
		char ch = sc.next().charAt(0);
		if(ch=='y') {
			s.setName(null);
			s.setAge(0);
			s.setAddr(null);
		}
	}
}
