package func;

import java.io.Serializable;

//��ü�� ���� ���ؼ� �������̽� ���
public class UserInfo implements Serializable{
	//������ ������ ���������� ���������� ������ ���� �Ҵ�(����ȭ, ������ȭ�� �ʼ�)
	static final long serialVersionUID  = 111111L;
	String name;
	int age;
	//transient�� ����ϸ� ����ȭ���� ����
	//transient int age;
	String addr;
	
	//ctrl+/ ���ּ� on/off
	//����ȭ������ ���� ���� Ŭ����
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
