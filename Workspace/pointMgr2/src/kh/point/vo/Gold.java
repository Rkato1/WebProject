package kh.point.vo;

public class Gold extends Silver{
	//Silver�� �ִ� ������ getter,setter���� ��� ������
	//�����ڴ� ��ӵ��� ����
	
	public Gold() {
		
	}
	
	public Gold(String str, String str1, int i) {
		//���� Ŭ������ ������
		super(str,str1,i);
	}
	
	@Override
	public double getBonus() {
		//return 0.05 * super.point;
		return 0.05 * getPoint();
	}
}
