package kh.point.vo;

//extendsŰ����� �θ�Ŭ�����κ��� ���
public class Vvip extends Vip {
	
	public Vvip() {
		//��������
		//super();
	}
	
	//�θ�Ŭ������ superŰ����� ���� ����
	public Vvip(String str, String str1, int i) {
		super(str,str1,i);
		//super�� �ڽ� �������� �׻� ù����
		//�� ���� �ڵ� �Ұ���
		//���̳� ���� ����
		/*
		super.name = str;
		super.grade = str1;
		super.point = i;
		*/
		System.out.println("�� �ʱ�ȭ �Ϸ�");
	}
	

	
	public String toString() {
		return "";		
	}

	//�������̵�(��ӹ޾� �޼ҵ� ������)
	//�����Ϸ����� �˸��� �ּ���(�� �ٿ��� ��)
	@Override
	public double getBonus() {
		return 0.1*point;		
	}
}
