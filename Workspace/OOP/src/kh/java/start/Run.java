package kh.java.start;

import kh.java.controller.StudentController;
import kh.java.func.ObjTest;

public class Run {

	public static void main(String[] args) {
		ObjTest ot = new ObjTest();
		System.out.println(ot);
		System.out.println(ot.toString());
		ObjTest ot1 = new ObjTest();
		System.out.println(ot1);
		System.out.println(ot1.toString());
		
		//StudentController sc = new StudentController();
		//sc.main();
		// TODO Auto-generated method stub

		/*
		//�޸𸮿� TV��ü ����->�ν��Ͻ� tv
		TV tv = new TV();
		TV tv1 = new TV(30);
		
		//���� �Ӽ� �����ؼ� ���
		System.out.println(tv.inch);
		System.out.println(tv.power);
		System.out.println(tv.channel);
		System.out.println(tv.volume);
		tv.powerOnOff();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		
		//������(�ʱ�ȭ ���), newŰ����
		//���ϰ� ������������(void�� �ٸ�)
		//�������� �̸��� Ŭ������� ����
		Student st = new Student();
		//private�� ���� �Ұ���
		//st.name = "������";
		//���� getter, setter�޼ҵ带 Ȱ��
		st.setName("������");
		st.setAge(28);
		st.setAddr("���");
		System.out.println("�̸� : "+st.getName());
		System.out.println("���� : "+st.getAge());
		System.out.println("�ּ� : "+st.getAddr());
		
		Student st1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		st1.setName(sc.next());
		System.out.println("���� �Է� : ");
		st1.setAge(sc.nextInt());
		System.out.println("�ּ� �Է� : ");
		st1.setAddr(sc.next());
		*/
	}

}
