package model.vo;

public class Movie {
	//영화번호
	int mNum;
	//영화 제목
	String mName;
	//영화상영시간
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
