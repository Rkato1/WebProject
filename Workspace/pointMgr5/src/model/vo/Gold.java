package model.vo;

public class Gold extends Grade{
	public Gold() {
		super();
	}
	
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonus() {
		return 0.05*getPoint();
	}
}
