package kh.point.start;
//ĸ��ȭ+���+������
import kh.point.controller.PointController;
import kh.point.model.vo.Grade;
import kh.point.model.vo.Silver;

public class Start {

	public static void main(String[] args) {
		//�߻�Ŭ������ ��ü�� ���� �� ����
		//Grade g = new Grade();
		//���� ������ڸ� ��ӵ� �ڽ�Ŭ���� ��ü�� ���� �� ����
		Grade g = new Silver();
		
		// TODO Auto-generated method stub
		PointController pc = new PointController();
		pc.main();
	}
}
