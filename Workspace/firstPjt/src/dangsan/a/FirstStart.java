package dangsan.a;

//타 패키지에서 참조하기 위한 선언
import dangsan.func.Func;

public class FirstStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//타 클래스 사용을 위한 새로운 변수 선언 및 초기화
		FirstFunc ff = new FirstFunc();
		//타 클래스에 선언된 함수(메소드)를 사용
		ff.ms1();
		ff.ms2();
		*/
		Func f = new Func();
		f.printMsg();
	}

}
