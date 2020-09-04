package model.vo;

public class Silver extends Grade{
	public Silver() {
		super();
	}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonus() {
		return 0.02*getPoint();
	}
}
