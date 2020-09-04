package kh.java.func;

public class AnimalMgrGeneric<T> {
	T data;

	public AnimalMgrGeneric() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AnimalMgrGeneric(T data) {
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
