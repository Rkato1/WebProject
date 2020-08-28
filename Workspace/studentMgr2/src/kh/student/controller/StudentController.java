package kh.student.controller;

import java.util.Scanner;

import kh.student.model.vo.Student;

public class StudentController {
	Scanner sc;
	
	//학생정보를 저장할 배열
	Student stu[];
	
	//parameter접근용 변수
	int index;
	
	//생성자(초기화 및 값 할당)
	public StudentController() {
		sc = new Scanner(System.in);
		stu = new Student[10];
	}
	
	//첫 화면 출력
	public void main() {
		while(true) {
			System.out.println("==== 학생 관리 프로그램 v1 ====");
			System.out.println("1.학생 정보 등록");
			System.out.println("2.학생 정보 출력(등록된 학생 전체 출력)");
			System.out.println("3.학생 정보 출력(이름으로 검색하여 1명 정보 출력)");
			System.out.println("4.학생 정보 수정");
			System.out.println("5.학생 정보 삭제");
			System.out.println("0.프로그램 종료");
			System.out.print("선택 > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				insertStudent();
				break;
			case 2:
				selectAllStudent();
				break;
			case 3:
				selectStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
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
	
	//학생 정보 입력받아 배열에 저장하는 메소드
	public void insertStudent() {
		if(index!=10) {
			System.out.println("\n==== 학생 정보 입력====\n");
			
			//입력
			System.out.print("이름 입력 : ");
			String str = sc.next();
			
			System.out.print("나이 입력 : ");
			int i = sc.nextInt();
			//줄바꿈(next는 두 번 연속으로 쓰면 무한루프 에러남)
			sc.nextLine();
			System.out.print("주소 입력 : ");
			String str1 = sc.next();
			sc.nextLine();
			
			//초기화
			/*
			stu[index] = new Student();
			stu[index].setName(str);
			stu[index].setAge(i);
			stu[index].setAddr(str1);
			*/
			//위 아래 모두 같지만 효율성은 밑이 더 좋다
			stu[index] = new Student(str, i, str1);
			
			index++;
		}else {
			System.out.println("학생 정보가 가득 찼습니다.");
		}
	}
	
	//학생 정보를 전부 출력하는 메소드
	public void selectAllStudent() {
		if(index == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		System.out.println("이름\t나이\t주소");
		for(int i=0; i<index; i++) {
			System.out.print(stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getAddr() + "\n");
		}
	}
	
	//학생 이름을 검색해서 정보를 출력하는 메소드
	public void selectStudent(){
		if(index == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		//검색 결과 판별 위한 임시변수
		boolean isSearch=false;
		System.out.println("==== 학생 정보 출력(1명) ====");
		System.out.print("검색할 학생의 이름을 입력 : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.println("이름\t나이\t주소");
			System.out.print(stu[itemp].getName() + "\t" + stu[itemp].getAge() + "\t" + stu[itemp].getAddr() + "\n");
		}

		//줄바꿈 초기화
		sc.nextLine();
		//검색 결과가 있을수도 있고, 없을수도 있음
		if(!isSearch) {
			System.out.println("검색 결과 없음");
		}
	}
	
	//학생 정보를 수정하는 메소드
	public void updateStudent() {
		if(index == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		//검색 결과 판별 위한 임시변수
		boolean isSearch=false;
		System.out.println("==== 학생 정보 수정 ====");
		System.out.print("수정할 학생의 이름을 입력 : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			System.out.print("수정할 이름 입력 : ");
			stu[itemp].setName(sc.next());
			System.out.print("수정할 나이 입력 : ");
			stu[itemp].setAge(sc.nextInt());				
			System.out.print("수정할 주소 입력 : ");
			stu[itemp].setAddr(sc.next());
		}
		
		//줄바꿈 초기화
		sc.nextLine();
		//검색 결과가 있을수도 있고, 없을수도 있음
		if(!isSearch) {
			System.out.println("검색 결과 없음");
		}
	}
	
	//학생 정보를 삭제하는 메소드
	public void deleteStudent() {
		if(index == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		//검색 결과 판별 위한 임시변수
		boolean isSearch=false;
		System.out.println("==== 학생 정보 삭제 ====");
		System.out.print("삭제할 학생의 이름을 입력 : ");
		int itemp = searchIndex(sc.next());
		if(itemp != -1) {
			for(int i=itemp;i<index-1;i++) {
				stu[i].setName(stu[i+1].getName());
				stu[i].setAge(stu[i+1].getAge());
				stu[i].setAddr(stu[i+1].getAddr());				
			}
			index--;
		}

		//줄바꿈 초기화
		sc.nextLine();
		//검색 결과가 있을수도 있고, 없을수도 있음
		if(!isSearch) {
			System.out.println("검색 결과 없음");
		}
	}
	
	//조회할 이름을 매개변수로 받아 배열의
	//몇 번째 인덱스에 있는지 조회하여 인덱스 번호리턴
	public int searchIndex(String name) {
		for(int i=0;i<index;i++) {
			if(stu[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
