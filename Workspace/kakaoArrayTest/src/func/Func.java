package func;

import java.util.ArrayList;
import java.util.Scanner;

public class Func {
	Scanner sc;
	//ĳ���� ũ��
	int cacheSize;
	//�����̸� �Է��� ����
	String city;	
	//����� ����
	ArrayList<String> cities;
	//���ڿ� ������ ����
	int index;
	//�Է� �Ǻ� ����
	boolean btemp=true;
	//�ӽ� ����� ĳ�ø���Ʈ
	ArrayList<String> cacheList;
	//�� ����ð�
	int totTime;
	public Func() {
		sc = new Scanner(System.in);
		cities = new ArrayList<String>();
		cacheList = new ArrayList<String>();
	}
	
	public void main() {
		while(true) {
			System.out.print("ĳ���� ũ�� �Է� : ");
			cacheSize = sc.nextInt();
			if(cacheSize >=0 && cacheSize <= 30) {
				//0�� ������ ��
				//cacheList = new ArrayList<String>(cacheSize);
				break;
			}else {
				System.out.println("0���� 30������ �� �Է�");
			}
		}
		while(true) {
			System.out.print("���� �̸� �Է� : ");
			city = sc.next();
			if((city.length()<21)) {
				for(int i=0; i<city.length(); i++) {
					char ch = city.charAt(i);
					if(!((ch >= 65 && ch <=90)||(ch>=97 && ch<=122))) {
						System.out.println("�����ڸ� �Է�");
						btemp = false;
						break;
					}
				}
				if(btemp == true) {					
					//������ �����ڸ� �ٸ� ����Ʈ�� �־����
					//������ ���� ����Ʈ ����϶�� ���� �ʾƼ� ���� ó��
					cities.add(city.toLowerCase());
				}else {
					btemp = true;
				}
			} else {
				System.out.println("���ڿ� �����ʰ� Ȥ�� ���� �߰�");
				break;
			}
			if(cities.size()>100001) {
				System.out.println("�ִ� �Է°��� ����");
				break;
			}
			System.out.print("�� �Է��Ͻðڽ��ϱ�?(y/n): ");
			if(sc.next().charAt(0)=='n') {
				break;
			}
		}
		for(int i=0; i<cities.size(); i++) {
			if((cacheList.contains(cities.get(i))&&(cacheList.size()!=0))) {
				//Least Recently Used
				if(cacheList.size()==cacheSize) {
					System.out.println(cacheList.get(0));
					cacheList.remove(0);
					cacheList.add(cities.get(i));
				}
				totTime+=1;
			}else {
				cacheList.add(cities.get(i));
				totTime+=5;
			}
		}
		System.out.println("�� ����ð��� : "+totTime);
	}
}
