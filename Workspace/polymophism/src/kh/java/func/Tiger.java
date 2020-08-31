package kh.java.func;

public class Tiger extends Animal {
	//자식이 변형해서 사용가능
	@Override
	public void breath() {
		System.out.println("휴~");
	}
	
	public void hunting() {
		System.out.println("어흥");
	}
}
