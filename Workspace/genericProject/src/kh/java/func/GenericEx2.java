package kh.java.func;

//<T>가 붙으면 Generic으로 됨
//이게 없으면 사용할수 없음
//2개를 사용할경우 <T,E>
public class GenericEx2<T,E> {
	//객체를 만들때 어떤 자료형이 될지를 결정
	T data;
	E data1;

	public GenericEx2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GenericEx2(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public E getData1() {
		return data1;
	}

	public void setData1(E data1) {
		this.data1 = data1;
	}
}
