package kh.point.model.vo;

//abstract �߻�ȭ Ű����
public abstract class Grade {
	String name;
	String grade;
	int point;
	
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
	
	public Grade() {
		super();
	}
	
	public Grade(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	//�߻� �޼ҵ�� �߻�Ŭ���������� ��밡����
	public abstract double getBonus();
}
