package kh.java.start;

import kh.java.controller.StudentController;
import kh.java.func.ObjTest;

public class Run {

	public static void main(String[] args) {
		ObjTest ot = new ObjTest();
		System.out.println(ot);
		System.out.println(ot.toString());
		ObjTest ot1 = new ObjTest();
		System.out.println(ot1);
		System.out.println(ot1.toString());
		
		//StudentController sc = new StudentController();
		//sc.main();
		// TODO Auto-generated method stub

		/*
		//메모리에 TV객체 생성->인스턴스 tv
		TV tv = new TV();
		TV tv1 = new TV(30);
		
		//가진 속성 접근해서 출력
		System.out.println(tv.inch);
		System.out.println(tv.power);
		System.out.println(tv.channel);
		System.out.println(tv.volume);
		tv.powerOnOff();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		
		//생성자(초기화 담당), new키워드
		//리턴값 존재하지않음(void와 다름)
		//생성자의 이름은 클래스명과 동일
		Student st = new Student();
		//private라 접근 불가능
		//st.name = "김현식";
		//따라서 getter, setter메소드를 활용
		st.setName("김현식");
		st.setAge(28);
		st.setAddr("경기");
		System.out.println("이름 : "+st.getName());
		System.out.println("나이 : "+st.getAge());
		System.out.println("주소 : "+st.getAddr());
		
		Student st1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		st1.setName(sc.next());
		System.out.println("나이 입력 : ");
		st1.setAge(sc.nextInt());
		System.out.println("주소 입력 : ");
		st1.setAddr(sc.next());
		*/
	}

}
