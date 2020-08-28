package kh.student.model.vo;

public class Student {
	
	//이름, 나이, 주소
	String name;
	int age;
	String addr;
	
	//기본생성자
	public Student(){
		
	}
	
	//매개변수 있는 생성자
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//각 변수별 getter/setter	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
