package vo;

public class Vip extends Grade{
	
	public Vip(String str, String str1, int p) {
		super(str, str1, p);
	}
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0.07*getPoint();
	}

}
