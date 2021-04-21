package kh.point.vo;

//extends키워드로 부모클래스로부터 상속
public class Vvip extends Vip {
	
	public Vvip() {
		//숨어있음
		//super();
	}
	
	//부모클래스는 super키워드로 접근 가능
	public Vvip(String str, String str1, int i) {
		super(str,str1,i);
		//super는 자식 생성자의 항상 첫번쨰
		//그 위에 코드 불가능
		//밑이나 위나 같음
		/*
		super.name = str;
		super.grade = str1;
		super.point = i;
		*/
		System.out.println("값 초기화 완료");
	}
	
	public String toString() {
		return "";		
	}

	//오버라이딩(상속받아 메소드 재정의)
	//컴파일러에게 알리는 주석문(안 붙여도 됨)
	@Override
	public double getBonus() {
		return 0.1*point;		
	}
}
