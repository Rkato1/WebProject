package kh.java.func;

//<T>�� ������ Generic���� ��
//�̰� ������ ����Ҽ� ����
public class GenericEx<T> {
	//��ü�� ���鶧 � �ڷ����� ������ ����
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
