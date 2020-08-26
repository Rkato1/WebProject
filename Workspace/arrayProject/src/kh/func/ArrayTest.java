package kh.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void arrayTest1() {
		//���̰� 3�� ������ �迭����
		//stack������ ���� ���� 
		//heap�� ���̰� 3�� �迭 ����(data�� ����Ǵ� ����)
		//->���� 0���� �ʱ�ȭ �Ǿ�����
		/*
		int[] arr = new int[3];
		//arr�� ù��° ������ 100����
		arr[0] = 100;
		//arr�� �ι�° ������ 1000����
		arr[1] = 1000;
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
		*/
		int[] arr1 = new int[5];
		//for(int i=0;i<5;i++) {
		//arr1.length arr1 �迭�� ���̰� ��ȯ
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
		}
		//���� 5¥�� �迭 ������ ������ �ѹ��� �Ҵ�
		int[] arr2 = {1,2,3,4,5};
		//���ڿ��� �迭, []�� ��ġ �������
		String strArr[] = new String[10];
		strArr[0] = "Hello";
	}
	
	public void arrayTest2() {
		String strArr[] = new String[5];
		strArr[0] = "����";
		strArr[1] = "������";
		strArr[2] = "Ű��";
		strArr[3] = "���";
		strArr[4] = "�ٳ���";
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		System.out.println(strArr[4]);
	}
	
	public void arrayTest3() {
		int arr[] = new int[100];
		for(int i=0;i<100;i++) {
			arr[i]=i+1;
			System.out.printf("arr[%d] = " + arr[i] + "\n", i);
		}
	}
	
	public void arrayTest4() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		int tot=0;
		for(int i=0;i<4;i++) {
			if(i<3) {
				System.out.print("���� �Է� : ");
				int itemp = sc.nextInt();
				arr[i] = itemp;
				tot += itemp;
			}else {
				arr[i]=tot;
			}			
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(i + "��° ������ " + arr[i]);			
		}
		System.out.printf("����� %.2f", (double)tot / 3);
	}
	
	public void arrayTest5() {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print(i+1 + "��° ���� �Է� : ");
			int itemp = sc.nextInt();
			arr[i] = itemp;
		}
		
		for(int i=0;i<arr.length;i++) {			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>=arr[j]) {
					int itemp = arr[i];
					arr[i] = arr[j];
					arr[j] = itemp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void motelArray() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		
		//bool�� ����
		boolean room[] = new boolean[10];
		while(b) {
			System.out.println("���� ���� ���α׷�  v1.0");
			System.out.print("1.�Խ�\t2.���\t3.�溸��\t4.����\n���� > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				System.out.print("����濡 �Խ��Ͻðڽ��ϱ�?");
				int i = sc.nextInt();
				if(i>11 && i<1) {
					System.out.println("�߸��� �Է�");
				}else {
					if(room[i-1]!=false) {
						System.out.println(i + "������ ���� �մ��� �ֽ��ϴ�");
					}else {
						room[i-1]=true;
						System.out.println(i + "���濡 �Խ��ϼ̽��ϴ�");
					}
				}
				break;
			case 2:
				System.out.print("����濡�� ����Ͻðڽ��ϱ�?");
				int j = sc.nextInt();
				if(j>11 && j<1) {
					System.out.println("�߸��� �Է�");
				}else {
					if(room[j-1]!=true) {
						System.out.println(j + "������ ���� �� ���Դϴ�");
					}else {
						room[j-1]=false;
						System.out.println(j + "���濡�� ����ϼ̽��ϴ�");
					}
				}
				break;
			case 3:
				for(int k=0;k<room.length;k++) {
					if(room[k]==true) {
						System.out.println(k+1 + "���濡�� ���� �մ��� �ֽ��ϴ�");
					}else {
						System.out.println(k+1 + "������ ���� ����ֽ��ϴ�");
					}
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�");
				b = false;
				break;
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}
		
		//int���迭
		/*
		int rNum[] = new int[10];
		while(b) {
			System.out.println("���� ���� ���α׷�  v1.0");
			System.out.print("1.�Խ�\t2.���\t3.�溸��\t4.����\n���� > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				System.out.print("����濡 �Խ��Ͻðڽ��ϱ�?");
				int i = sc.nextInt();
				if(i>11 && i<1) {
					System.out.println("�߸��� �Է�");
				}else {
					if(rNum[i-1]!=0) {
						System.out.println(i + "������ ���� �մ��� �ֽ��ϴ�");
					}else {
						rNum[i-1]=1;
						System.out.println(i + "���濡 �Խ��ϼ̽��ϴ�");
					}
				}
				break;
			case 2:
				System.out.print("����濡�� ����Ͻðڽ��ϱ�?");
				int j = sc.nextInt();
				if(j>11 && j<1) {
					System.out.println("�߸��� �Է�");
				}else {
					if(rNum[j-1]==0) {
						System.out.println(j + "������ ���� �� ���Դϴ�");
					}else {
						rNum[j-1]=0;
						System.out.println(j + "���濡�� ����ϼ̽��ϴ�");
					}
				}
				break;
			case 3:
				for(int k=0;k<rNum.length;k++) {
					if(rNum[k]!=0) {
						System.out.println(k+1 + "���濡�� ���� �մ��� �ֽ��ϴ�");
					}else {
						System.out.println(k+1 + "������ ���� ����ֽ��ϴ�");
					}
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�");
				b = false;
				break;
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}
		*/
	}
	
	public void lottoArray() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//������ ������ ���θ� �Ǵ��ϴ� ����
		char c = ' ';
		boolean b = true;
		
		//�����ǹ�ȣ
		int lottoA[] = new int[6];
		//��ǻ���� ��ȣ
		int lottoC[] = new int[6];
		//�������� ���庯��
		int count=0;
		//���������� �ӽú���
		int itemp=0;
		
		//���� �� ������ ��ȣ �Է¹ޱ�
		System.out.println("============== �ζ� ���α׷� ==============");
		for(int i=0;i<lottoA.length;i++) {
			System.out.print(i+1 + "��° ��ȣ �Է�(1~45) : ");
			//�ӽ� ��ȣ�� ������ ����
			itemp = sc.nextInt();
			//���� ����� �����
			if(itemp>45 || itemp<1) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1~45 �� �Ѱ��� �Է����ּ���");
				i--;
			}else {
				for(int k=0; k<lottoA.length; k++) {
					if((itemp == lottoA[k])&&(i!=k)) {
						System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
						i--;
						break;
					}
					else {
						lottoA[i]=itemp;
					}
				}
			}
		}
		
		//��ǻ���� ��ȣ �Է¹ޱ�
		for(int i=0;i<lottoC.length;i++) {
			int ranNum = rd.nextInt(45)+1;			
			for(int k=0; k<lottoC.length; k++) {
				if((ranNum == lottoC[k])&&(i!=k)) {
					i--;
					break;
				}
				else {
					lottoC[i] = ranNum;
				}
			}
		}
		
		//��������
		for(int i=0;i<lottoA.length;i++) {			
			for(int j=i+1; j<lottoA.length; j++) {
				if(lottoA[i]>lottoA[j]) {
					itemp = lottoA[i];
					lottoA[i] = lottoA[j];
					lottoA[j] = itemp;
				}
			}
		}
		for(int i=0;i<lottoC.length;i++) {			
			for(int j=i+1; j<lottoC.length; j++) {
				if(lottoC[i]>lottoC[j]) {
					itemp = lottoC[i];
					lottoC[i] = lottoC[j];
					lottoC[j] = itemp;
				}
			}
		}
		
		//������ ��ȣ �ð��� ���
		System.out.println("����� ��ȣ");
		for(int i=0;i<lottoA.length;i++) {
			System.out.print(lottoA[i]+"\t");
		}
		System.out.println();
		System.out.println("��ǻ�� ��ȣ");
		for(int i=0;i<lottoC.length;i++) {
			System.out.print(lottoC[i]+"\t");
		}
		
		//���� ��������
		for(int i=0;i<lottoA.length;i++) {
			itemp = lottoA[i];
			for(int j=0;j<lottoC.length;j++) {
				if(itemp==lottoC[j]) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("���� ���� : " + count);
		
		//��� ǥ��
		switch(count) {
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
			System.out.println(7-count + "���Դϴ�");
			break;
		case 1:
		default:
			System.out.println("��");
			break;
		}
		
		//������ ���� �Ǵ�
		System.out.print("�ѹ� �� �Ͻðڽ��ϱ�(1.yes,2.no)?");
		c = sc.next().charAt(0);
	}

	public void arrCopy() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ȣ �Է� : ");
		String ph = sc.next();
		//���ڿ��� ����1���� �и��ؼ� ������ �迭�� ����
		//���ڿ� �߿� ���° ���� �ϳ��� ���ڷ� ����
		//��������(���� ����, ���� ���ϸ� �굵 �ٲ�)
		int iA[]] = {1,2,3};
		int iA1[] = iA;
		//��������(���� �ּ� ��� ����, ���� ���ص� �������)
		char ph1[] = new char[13];
		for(int i=0;i<ph.length();i++) {
			ph1[i] = ph.charAt(i);
			if(i>3&&i<=7) {
				ph1[i]='*';
			}
			System.out.print(i);
		}
		
		//cloneŰ���带 ����ؼ� ���� ����
		char ph2[] = ph.toCharArray().clone();
	}
	
	public void arrTest() {
		
	}
}
