package kh.point.vo;

import java.util.Scanner;

public class Vip {
	String name;
	String grade;
	int point;
	
	Scanner sc;
	
	public Vip() {
		sc = new Scanner(System.in);
	}
	
	public Vip(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return this.name;
	}
	public void setGrade(String grade) {
		this.grade = grade; 
	}
	public String getGrade() {
		return this.grade;
	}
	public void setPoint(int point) {
		this.point = point; 
	}
	public int getPoint() {
		return this.point;
	}
	//보너스개념
	//버그 같은데 자꾸 소수점 오지게 나옴
	public double getBonus() {
		return 0.07*this.point;
	}
}
