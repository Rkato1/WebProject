package controller;

import model.vo.Movie;
import model.vo.Product;
import view.View;

public class Controller {

	Movie m[];
	Product p[];
	View v;
	
	//2�����迭�̹Ƿ� ���� ���� ����
	int vIndex, hIndex;
	
	//ó���� ���� �ӽ���������
	int itemp, itemp1;
	public Controller() {
		super();
		v = new View();
		p = new Product[30];
		m = new Movie[5];
	}
	public void main() {
		while(true) {
			itemp = v.showWelcome();
			switch(itemp) {
			case 1:
				itemp1 = v.showMenu();
				v.showMenu();
				break;
			case 2:
				itemp1 = v.showGuest();
				itemp = v.guestProcess(itemp1);
				break;
			case 0:
				return;
			default:
				break;
			}
		}
	}
}
