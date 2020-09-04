package kh.java.func;

//<T>가 붙으면 Generic으로 됨
//이게 없으면 사용할수 없음
public class GenericEx<T> {
	//객체를 만들때 어떤 자료형이 될지를 결정
	T data;

	public GenericEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GenericEx(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
