package kh.java.run;

import kh.java.func.Calc;
import kh.java.func.MethodTest;
import kh.java.func.MethodTest2;

//오버로딩-한 클래스 내 parameter 선언부가 다르고
//이름이 같은 메소드를 여러개 정의하는 것
//ex) int Add(int a)
//	  int Add(int a,int b)
//    int Add(int a,int b,int c)
public class MethodStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest mt = new MethodTest();
		MethodTest2 mt2 = new MethodTest2();
		//mt.main();
		//Calc calc = new Calc();
		//calc.main();
		//mt2.main();\
		mt2.method1();
	}

}
