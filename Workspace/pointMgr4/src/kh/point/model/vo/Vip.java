package kh.point.model.vo;

public class Vip extends Grade{
	public Vip() {
		super();
	}
	
	public Vip(String str, String str1, int i) {
		super(str,str1,i);
	}

	@Override
	public double getBonus() {
		return 0.07*getPoint();
	}
}
