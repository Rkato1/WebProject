package kh.point.vo;

public class Vvip extends Silver{
	//ctrl+shift+c-�ּ�ó��

	public Vvip() {
		
	}
	
	public Vvip(String str, String str1, int i) {
		//���� Ŭ������ ������
		super(str,str1,i);
	}
	
	@Override
	public double getBonus() {
		return 0.1 * getPoint();
	}
}