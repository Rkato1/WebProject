package kh.java.func;

//<T>�� ������ Generic���� ��
//�̰� ������ ����Ҽ� ����
//2���� ����Ұ�� <T,E>
public class GenericEx2<T,E> {
	//��ü�� ���鶧 � �ڷ����� ������ ����
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
