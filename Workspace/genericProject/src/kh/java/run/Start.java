package kh.java.run;

import kh.java.func.AnimalMgr;
import kh.java.func.AnimalMgrGeneric;
import kh.java.func.Bear;
import kh.java.func.Tiger;

public class Start {

	public static void main(String[] args) {
		AnimalMgr am = new AnimalMgr();
		Tiger t = new Tiger(200);
		//다형성에 의해서 처리 가능
		am.setData(t);
		AnimalMgr am1 = new AnimalMgr();
		Bear b = new Bear(1000);
		//다형성에 의해서 처리 가능
		am1.setData(b);
		AnimalMgrGeneric<Tiger> amg = new AnimalMgrGeneric<Tiger>();
		//Generic에 의해서 처리가능
		amg.setData(t);
		AnimalMgrGeneric<Bear> amg1 = new AnimalMgrGeneric<Bear>();
		//Generic에 의해서 처리가능
		amg1.setData(b);
		
		//하려면 다운캐스팅 필요
		//System.out.println(am.getData().getHp());
		System.out.println(((Tiger)am.getData()).getHp());
		System.out.println(((Bear)am1.getData()).getHp());
		
		//Generic에 의해서 처리가능
		System.out.println(amg.getData().getHp());
		System.out.println(amg1.getData().getHp());
		// TODO Auto-generated method stub
		/*
		GenericEx<String> ge = new GenericEx<String>();
		ge.setData("hi");
		String s = ge.getData();
		System.out.println(s);
		
		//기본형은 안들어감
		//GenericEx<int> ge2 = new GenericEx<int>();
		//사용하고 싶으면 Wrapper클래스를 이용해서
		GenericEx<Integer> ge2 = new GenericEx<Integer>();
		int num = ge2.getData();
		
		//2개를 사용할경우 <T,E>
		GenericEx2<String, Integer> ge3 = new GenericEx2<String, Integer>();
		//String
		ge3.getData();
		//int
		ge3.getData1();
		*/
	}

}
