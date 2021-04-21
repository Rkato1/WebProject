package kh.java.func;

public class TV {
	//속성:크기,전원,채널,볼륨
	//전역변수로 생성
	public int inch;		//초기화 0
	public boolean power;	//false
	public int channel;		//0
	public int volume;		//0
	
	//생성자 생성(여러개 생성가능)
	//따로 선언하지 않으면 jvm이 자동으로 만듬
	//하지만 선언한 이후에는 다 설정해줘야함
	//변수의 초기값설정
	//반대의 개념은 소멸자
	//java는 언어 특성상 존재하지 않음
	//GC가 알아서 처리함
	public TV() {
		this.inch = 100;
	}
	
	public TV(int inch) {
		this.inch = inch;
	}
	
	//기능전원(on/off)
	public void powerOnOff() {
		//이 친구는 줄여 쓸 수 없음
		//논리값 반전
		power = !power;
		if(power) {
			System.out.println("전원킴");
		}
		else {
			System.out.println("전원끔");
		}
	}
	
	//채널업-다운
	public void channelUp() {
		channel++;
		System.out.println("현재 채널 : "+channel);
	}
	public void channelDown() {
		channel--;
		System.out.println("현재 채널 : "+channel);
	}
	
	//볼륨업-다운
	public void volumeUp() {
		volume++;
		System.out.println("현재 크기 : "+volume);
	}
	public void volumeDown() {
		volume--;
		System.out.println("현재 크기 : "+volume);
	}
}
