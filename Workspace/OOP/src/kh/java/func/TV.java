package kh.java.func;

public class TV {
	//�Ӽ�:ũ��,����,ä��,����
	//���������� ����
	public int inch;		//�ʱ�ȭ 0
	public boolean power;	//false
	public int channel;		//0
	public int volume;		//0
	
	//������ ����(������ ��������)
	//���� �������� ������ jvm�� �ڵ����� ����
	//������ ������ ���Ŀ��� �� �����������
	//������ �ʱⰪ����
	//�ݴ��� ������ �Ҹ���
	//java�� ��� Ư���� �������� ����
	//GC�� �˾Ƽ� ó����
	public TV() {
		this.inch = 100;
	}
	
	public TV(int inch) {
		this.inch = inch;
	}
	
	//�������(on/off)
	public void powerOnOff() {
		//�� ģ���� �ٿ� �� �� ����
		//���� ����
		power = !power;
		if(power) {
			System.out.println("����Ŵ");
		}
		else {
			System.out.println("������");
		}
	}
	
	//ä�ξ�-�ٿ�
	public void channelUp() {
		channel++;
		System.out.println("���� ä�� : "+channel);
	}
	public void channelDown() {
		channel--;
		System.out.println("���� ä�� : "+channel);
	}
	
	//������-�ٿ�
	public void volumeUp() {
		volume++;
		System.out.println("���� ũ�� : "+volume);
	}
	public void volumeDown() {
		volume--;
		System.out.println("���� ũ�� : "+volume);
	}
}
