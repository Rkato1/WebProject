package func;

import java.io.Serializable;

//±‚¡∏
//public class Score{
public class Score implements Serializable{
	static final long serialVersionUID  = 22222L;
	int kor;
	int math;
	int eng;
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Score(int kor, int math, int eng) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
