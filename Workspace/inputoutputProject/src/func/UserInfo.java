package func;

import java.io.Serializable;

//객체로 뺴기 위해서 인터페이스 상속
public class UserInfo implements Serializable{
	//밖으로 빼낼때 임의적으로 생성되지만 지금은 값을 할당(직렬화, 역직렬화에 필수)
	static final long serialVersionUID  = 111111L;
	String name;
	int age;
	//transient를 사용하면 직렬화에서 제외
	//transient int age;
	String addr;
	
	//ctrl+/ 블럭주석 on/off
	//직렬화선언을 하지 않은 클래스
	Score score;

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
