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
		int iA[] = {1,2,3};
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
		

		//arraycopy�޼ҵ� �����迭,������ġ,����迭,������ġ,����
		
		//cloneŰ���带 ����ؼ� ���� ����
		char ph2[] = ph.toCharArray().clone();
	}
	
	public void arrTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է� : ");
		String ph = sc.next();
		char chs[] = new char[14];
		
		chs = ph.toCharArray().clone();
		for(int i=0;i<ph.length();i++) {
			if(i>7) {
				chs[i]='*';
			}
			System.out.print(chs[i]);
		}
	}

	public void sdarrTest() {
		//2���� �迭 arr[����_���ȣ][����_����ȣ]
		//�⺻���� �������� ��� 0 
		//boolean�� false, char ''		
		int sdarr[][] = {{1,2,3},{4,5,6}};
		int arr[][] = new int[5][5];
		int k = 0;
		//arr.length�� ���� ����
		for(int i=0;i<arr.length;i++) {
			//arr[i].length�� �� ���� ���ǰ���
			//�����迭������ �� �ึ�� ���� ���̰�
			//�ٸ� �� �ֱ� ������ �� �������
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=k;
				k++;
			}
		}
	}
	
	public void sdarrTest1() {
		int arr[][] = new int[5][5];
		int k=5;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=k-j;
			}
			k+=5;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void sdarrTest2() {
		int arr[][] = new int[5][5];
		int k=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[j][i]=k++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void sdarrTest3() {
		int arr[][] = new int[5][5];
		int k=5;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=(j+1)*k-i;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void sdarrTest4() {
		int arr[][] = new int[5][5];
		int k=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i%2==0) {
					arr[i][j]=k++;
				}else {
					arr[i][4-j]=k++;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void kakaoArrayTest() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		//��� ���� ������ ����
		int row = 0, col =0;
		//�� �Ǻ�����
		while(true) {
			System.out.print("�������� ������ �Է��ϼ���(1~10) ==> ");
			row = sc.nextInt();
			if(row<1||row>10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}else {
				break;
			}
		}
		
		while(true) {
			System.out.print("���ο��� ������ �Է��ϼ���(1~10) ==> ");
			col = sc.nextInt();
			if(col<1||col>10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}else {
				break;
			}
		}
		char chArray[][] = new char[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				//���ĺ��� �� 26��
				char ch = (char)(rd.nextInt(26)+97);
				chArray[i][j] = ch;
				System.out.print(chArray[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public void snail2DArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int temp = sc.nextInt();
		int arr[][] = new int[temp][temp];
		//��� ��
		int row=0,col=-1;
		//�� ����
		int k=1;
		//����ġ������ ����
		int iSwitch = 1;
		
		while(true){
			//���� ���� �����ϴ� �ڵ�
			for(int i=0;i<temp;i++){
        		col=col+iSwitch;
        		arr[row][col]=k++;
        	}

        	temp=temp-1;
        	//���� n��n���� �迭��
        	//�����̽� n,n-1,n-1,n-2,n-2...
        	//2,2,1,1�� ��ġ�Ե�

        	//���������
        	if(temp==0)
        	break;
        	//���ǰ��� �����ϴ��ڵ�
        	for(int i=0;i<temp;i++){
        		row=row+iSwitch;
        		arr[row][col]=k++;
        	}
        	//��� ���� ��� �����Ǿ����Ƿ� ������ ���� ��ȯ
        	iSwitch=iSwitch*(-1);
        }
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		//��ó: https://cbts.tistory.com/60 [IT�ϱ���]
	}

	public void snail2DArrayBack() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int temp = sc.nextInt();
		int arr[][] = new int[temp][temp];
		//��� ��
		int row=0,col=-1;
		//�� ����
		int k=1;
		//����ġ������ ����
		int iSwitch = 1;
		
		while(true){
			//���� ���� �����ϴ� �ڵ�
			for(int i=0;i<temp;i++){
        		col=col+iSwitch;
        		arr[row][col]=k++;
        	}

        	temp=temp-1;
        	//���� n��n���� �迭��
        	//�����̽� n,n-1,n-1,n-2,n-2...
        	//2,2,1,1�� ��ġ�Ե�

        	//���������
        	if(temp==0)
        	break;
        	//���ǰ��� �����ϴ��ڵ�
        	for(int i=0;i<temp;i++){
        		row=row+iSwitch;
        		arr[row][col]=k++;
        	}
        	//��� ���� ��� �����Ǿ����Ƿ� ������ ���� ��ȯ
        	iSwitch=iSwitch*(-1);
        }
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	//����� ���
	public void snail2DArray2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];					//�Է¹���ũ���� ������ �迭 ����
		int k = 1;												//�迭���� ä�� �� ����
		int inc =1;											//�ε�����ȣ ������ ����
		int r=0;												//2�����迭 �� �ε�����ȣ
		int c=-1;												//2�����迭 �� �ε�����ȣ
		while(size>0) {
			for(int i=0;i<size;i++) {
				c=c+inc;
				arr[r][c]=k;
				k++;
			}
			size--;
			for(int i=0;i<size;i++) {
				r=r+inc;
				arr[r][c]=k;
				k++;
			}
			inc = -inc;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public void kakaoArrayTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� ���� �Է� ");
		int iNum = sc.nextInt();
		//����1�� �迭
		int arr1[][] = new int[iNum][iNum];
		//����2�� �迭
		int arr2[][] = new int[iNum][iNum];
		//�ϼ��� ������ �迭
		char ch[][] = new char[iNum][iNum];
		
		System.out.println("����1�� ���� �Է� : ");
		//����1�� ���� �Է�
		for(int i=0; i<iNum; i++) {
			System.out.print(i+1+"��° ���� �Է�");
			int k = sc.nextInt();
			if(k>0 && k<Math.pow(2, iNum)) {
				arr1[i] = dec2binary(k, iNum);
			}
			else {
				System.out.println("�߸��� �Է�");
				i--;
			}
		}
		
		System.out.println("����2�� ���� �Է� : ");
		//����2�� ���� �Է�
		for(int i=0; i<iNum; i++) {
			System.out.print(i+1+"��° ���� �Է�");
			int k = sc.nextInt();
			if(k>0 && k<Math.pow(2, iNum)) {
				arr2[i] = dec2binary(k, iNum);
			}
			else {
				System.out.println("�߸��� �Է�");
				i--;
			}
		}
		
		//������ ���� �ϼ��� ������ ��ȯ�ϴ� �ڵ�
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				if(arr1[i][j]==1 || arr2[i][j]==1) {
					ch[i][j]='#';
				}
				else {
					ch[i][j]=' ';
				}
			}
		}
		
		//�ϼ��� ���� ���
		System.out.println("�ϼ��� ����");
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	//10������ 2������ ����� �ڵ�
	int[] dec2binary(int i, int all) {
		int arrTemp[] = new int[all];
		int ori = i;
		
		for(int j=0; j<all; j++) {
			//���̰� n�� �迭�� ������ ���ڴ� n-1
			arrTemp[all-j-1] = ori%2;
			//������
			ori /= 2;
		}
		return arrTemp;
	}

	public void kakao() {
		Scanner sc = new Scanner(System.in);
		int map1[][] = new int[5][5];
		int map2[][] = new int[5][5];
		char map[][] = new char[5][5];
		
		System.out.println("ù��° �迭 �����Է�");
		for(int i=0;i<map1.length;i++) {
			System.out.print(i+1+"��° �� ���� �Է�(����0~31) : ");
			int iNum = sc.nextInt();
			map1[i] = dec2binary(iNum, 5);
			/*
			for(int j=0; j<map1[i].length;j++) {
				map1[i][4-j] = iNum%2;
				iNum/=2;
			}
			*/
		}
		
		for(int i=0;i<map1.length;i++) {
			for(int j=0; j<map1[i].length;j++) {
				System.out.print(map1[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map1[i][j]==1 || map2[i][j]==1) {
					map[i][j]='#';
				}
				else {
					map[i][j]=' ';
				}
			}
		}
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}