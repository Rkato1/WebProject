package model.vo;

public class Popcorn extends Product{

	String taste;
	
	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public Popcorn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Popcorn(int pNum, String pName, int quantity, int price) {
		super(pNum, pName, quantity, price);
		// TODO Auto-generated constructor stub
	}
}
