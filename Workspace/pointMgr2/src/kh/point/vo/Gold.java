package kh.point.vo;

public class Gold extends Silver{
	//Silver에 있는 변수와 getter,setter까지 모두 가져옴
	//생성자는 상속되지 않음
	
	public Gold() {
		
	}
	
	public Gold(String str, String str1, int i) {
		//상위 클래스의 생성자
		super(str,str1,i);
	}
	
	@Override
	public double getBonus() {
		//return 0.05 * super.point;
		return 0.05 * getPoint();
	}
}
