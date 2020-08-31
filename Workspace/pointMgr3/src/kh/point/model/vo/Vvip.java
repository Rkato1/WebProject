package kh.point.model.vo;

public class Vvip extends Grade{
	public Vvip() {
		super();
	}
	
	public Vvip(String str, String str1, int i) {
		super(str,str1,i);
	}

	@Override
	public double getBonus() {
		return 0.1*getPoint();
	}
}
