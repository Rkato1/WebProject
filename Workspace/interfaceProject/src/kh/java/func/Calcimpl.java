package kh.java.func;

public class Calcimpl implements Calc{
	@Override
	public int sum(int i, int j) {
		return (i+j);
	}

	@Override
	public int sub(int i, int j) {
		return (i-j);
	}
	
	@Override
	public int mul(int i, int j) {
		return (i*j);
	}
	
	@Override
	public double div(int i, int j) {
		return ((double)i/j);
	}
}
