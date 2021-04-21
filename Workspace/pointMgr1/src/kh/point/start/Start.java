package kh.point.start;
//캡슐화
import kh.point.controller.PointController;
import kh.point.vo.Vvip;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointController pc = new PointController();
		pc.main();
		
		/*
		//상속 받았으므로 상위 클래스 메소드 사용가능
		Vvip vv = new Vvip();
		vv.setName("sik");
		vv.setGrade("vvip");
		vv.setPoint(1000);		
		
		//생성자는 상속이 되지 않음
		Vvip vv1 = new Vvip("1","vvip",1000);
		*/
	}

}
