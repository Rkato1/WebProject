package kh.point.model.vo;

public class Grade {
	String name;
	String grade;
	int point;
	
	//alt+shift+s->r
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//alt + shift + s->C
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//alt+shift+s->o
	public Grade(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public double getBonus() {
		return 0.0;
	}
}
