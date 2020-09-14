package kh.java.run;

import kh.java.api.Calc;
import kh.java.api.DateClass;
import kh.java.api.StringTest;
import kh.java.api.WrapperClass;

public class ApiStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest st = new StringTest();
		//st.stringBufferTest();
		//st.token();
		//st.tokenExam();
		//st.test();
		//st.mathTest();
		
		DateClass dc = new DateClass();
		//dc.calendarClass();
		//dc.dateTest();
		//dc.exam1();
		//dc.ddayCal();
		
		WrapperClass wc = new WrapperClass();
		//wc.test();
		
		Calc c = new Calc();
		//c.main();
		
		TempKakao temp = new TempKakao();
		//temp.main();
		TempKakao2 tmp = new TempKakao2();
		tmp.main();
	}

}
