package model.vo;

public class Product {
	//��ǰ��ȣ
	int pNum;
	//��ǰ��
	String pName;
	//����
	int quantity;
	//����
	int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pNum, String pName, int quantity, int price) {
		super();
		this.pNum = pNum;
		this.pName = pName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
