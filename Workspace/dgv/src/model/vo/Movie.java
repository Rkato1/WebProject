package model.vo;

public class Movie {
	//��ȭ��ȣ
	int mNum;
	//��ȭ ����
	String mName;
	//��ȭ�󿵽ð�
	String mTime;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int mNum, String mName, String mTime) {
		super();
		this.mNum = mNum;
		this.mName = mName;
		this.mTime = mTime;
	}
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmTime() {
		return mTime;
	}
	public void setmTime(String mTime) {
		this.mTime = mTime;
	}
}
