package kh.point.model.vo;

public class Silver extends Grade{
	public Silver() {
		super();
	}
	
	public Silver(String str, String str1, int i) {
		super(str,str1,i);
	}
	//추상클래스는 추상메소드를 오버라이딩한 메소드를 
	//사용하지 않으면 에러남
	@Override
	public double getBonus() {
		return 0.02*getPoint();
	}
}
