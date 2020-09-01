package vo;

public class Gold extends Grade{

	public Gold(String str, String str1, int p) {
		super(str, str1, p);
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0.05*getPoint();
	}
	
}
