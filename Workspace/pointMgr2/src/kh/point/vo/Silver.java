package kh.point.vo;

import java.util.Scanner;

public class Silver {
	String name;
	String grade;
	int point;
	
	Scanner sc;
	
	public Silver() {
		sc = new Scanner(System.in);
	}
	
	public Silver(String name, String grade, int point) {
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
	public double getBonus() {
		return 0.02*this.point;
	}
}