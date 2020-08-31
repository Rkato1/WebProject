package kh.point.model.vo;

public class Gold extends Grade{
	
	public Gold() {
		super();
	}
	
	public Gold(String str, String str1, int i) {
		super(str,str1,i);
	}
	
	@Override
	public double getBonus() {
		return 0.05*getPoint();
	}
}
