package kh.point.vo;

public class Vvip extends Silver{
	//ctrl+shift+c or ctrl+/-주석처리

	public Vvip() {
		
	}
	
	public Vvip(String str, String str1, int i) {
		//상위 클래스의 생성자
		super(str,str1,i);
	}
	
	@Override
	public double getBonus() {
		return 0.1 * getPoint();
	}
}