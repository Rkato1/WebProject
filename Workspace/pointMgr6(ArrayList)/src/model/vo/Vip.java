package model.vo;

public class Vip extends Grade{
	public Vip() {
		super();
	}
	
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonus() {
		return 0.07*getPoint();
	}
}
