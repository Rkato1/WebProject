package kh.point.vo;

public class Vip extends Silver{
	
	public Vip() {
		
	}
	
	public Vip(String str, String str1, int i) {
		//���� Ŭ������ ������
		super(str,str1,i);
	}
	
	@Override
	public double getBonus() {
		//return 0.07 * super.point;
		return 0.07 * getPoint();
	}
}
