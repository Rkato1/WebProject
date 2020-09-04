package kh.java.run;

import kh.java.func.AnimalMgr;
import kh.java.func.AnimalMgrGeneric;
import kh.java.func.Bear;
import kh.java.func.Tiger;

public class Start {

	public static void main(String[] args) {
		AnimalMgr am = new AnimalMgr();
		Tiger t = new Tiger(200);
		//�������� ���ؼ� ó�� ����
		am.setData(t);
		AnimalMgr am1 = new AnimalMgr();
		Bear b = new Bear(1000);
		//�������� ���ؼ� ó�� ����
		am1.setData(b);
		AnimalMgrGeneric<Tiger> amg = new AnimalMgrGeneric<Tiger>();
		//Generic�� ���ؼ� ó������
		amg.setData(t);
		AnimalMgrGeneric<Bear> amg1 = new AnimalMgrGeneric<Bear>();
		//Generic�� ���ؼ� ó������
		amg1.setData(b);
		
		//�Ϸ��� �ٿ�ĳ���� �ʿ�
		//System.out.println(am.getData().getHp());
		System.out.println(((Tiger)am.getData()).getHp());
		System.out.println(((Bear)am1.getData()).getHp());
		
		//Generic�� ���ؼ� ó������
		System.out.println(amg.getData().getHp());
		System.out.println(amg1.getData().getHp());
		// TODO Auto-generated method stub
		/*
		GenericEx<String> ge = new GenericEx<String>();
		ge.setData("hi");
		String s = ge.getData();
		System.out.println(s);
		
		//�⺻���� �ȵ�
		//GenericEx<int> ge2 = new GenericEx<int>();
		//����ϰ� ������ WrapperŬ������ �̿��ؼ�
		GenericEx<Integer> ge2 = new GenericEx<Integer>();
		int num = ge2.getData();
		
		//2���� ����Ұ�� <T,E>
		GenericEx2<String, Integer> ge3 = new GenericEx2<String, Integer>();
		//String
		ge3.getData();
		//int
		ge3.getData1();
		*/
	}

}
