package kh.point.start;
//캡슐화+상속+다형성
import kh.point.controller.PointController;
import kh.point.model.vo.Grade;
import kh.point.model.vo.Silver;

public class Start {

	public static void main(String[] args) {
		//추상클래스는 객체를 만들 수 없음
		//Grade g = new Grade();
		//굳이 사용하자면 상속된 자식클래스 객체로 만들 수 있음
		Grade g = new Silver();
		
		// TODO Auto-generated method stub
		PointController pc = new PointController();
		pc.main();
	}
}
