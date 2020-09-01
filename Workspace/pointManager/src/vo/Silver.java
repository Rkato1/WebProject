package vo;

public class Silver extends Grade{	

	public Silver(String str, String str1, int p) {
		super(str, str1, p);
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0.02*getPoint();
	}

}
