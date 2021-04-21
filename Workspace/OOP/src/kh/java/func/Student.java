package kh.java.func;

public class Student {
	private String name;
	private int age;
	private String addr;
	
	//기본생성자
	public Student() {
		 
	}
	
	//매개변수 생성자(변수값 초기설정)
	public Student(String str, int i, String str2) {
		 this.name = str;
		 this.age = i;
		 this.addr = str2;
	}
	
	//name의 getter
	//접근제어지시자는 public
	//return타입은 해당 변수의 자료형
	//매개변수없음
	public String getName() {
		return name;
	}
	//setter
	//접근제어지시자 public
	//리턴타입 void
	//메소드이름 set변수명 ->카멜표기법
	//매개변수는 1개 ->해당 변수의 자료형
	public void setName(String name) {
		//전역변수에 지역변수의 값을 대입
		//this키워드는 전역변수 앞에 붙임
		this.name = name;
	}
	/*
	public String setName(String str) {
		name = str;
		return name;
	}
	*/
	
	public int getAge() {
		return age;
	}
	//public int setAge(int i) {
	public void setAge(int i) {
		this.age = i;
		//return this.age;
	}
	
	public String getAddr() {
		return addr;
	}
	//setter
	//public String setAddr(String str) {
	public void setAddr(String str) {
		this.addr = str;
		//return this.addr;
	}
}
