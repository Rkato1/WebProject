package kh.func;

public class PrintMsg {
	public void print() {
		System.out.println(1+1);
		System.out.println(1+1.1);
		//강제 형변환되어 소수점으로 나옴
		System.out.println('1'+1); //49+1, ascii code
		//문자의 값의 합
		System.out.println('1'-'2'); //49-50, ascii code
		System.out.println("1"+"1"); //1&1
		//문자 열의 합산
	}

}
