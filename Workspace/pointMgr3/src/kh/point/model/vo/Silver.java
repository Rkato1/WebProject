package kh.point.model.vo;

public class Silver extends Grade{
	public Silver() {
		super();
	}
	
	public Silver(String str, String str1, int i) {
		super(str,str1,i);
	}
	@Override
	public double getBonus() {
		return 0.02*getPoint();
	}
}
