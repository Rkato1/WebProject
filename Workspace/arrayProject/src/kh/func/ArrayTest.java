package kh.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void arrayTest1() {
		//길이가 3인 정수형 배열생성
		//stack영역에 변수 선언 
		//heap에 길이가 3인 배열 생성(data가 저장되는 공간)
		//->값은 0으로 초기화 되어있음
		/*
		int[] arr = new int[3];
		//arr의 첫번째 공간에 100대입
		arr[0] = 100;
		//arr의 두번째 공간에 1000대입
		arr[1] = 1000;
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
		*/
		int[] arr1 = new int[5];
		//for(int i=0;i<5;i++) {
		//arr1.length arr1 배열의 길이값 반환
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
		}
		//길이 5짜리 배열 선언후 값까지 한번에 할당
		int[] arr2 = {1,2,3,4,5};
		//문자열의 배열, []는 위치 상관없음
		String strArr[] = new String[10];
		strArr[0] = "Hello";
	}
	
	public void arrayTest2() {
		String strArr[] = new String[5];
		strArr[0] = "딸기";
		strArr[1] = "복숭아";
		strArr[2] = "키위";
		strArr[3] = "사과";
		strArr[4] = "바나나";
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
				System.out.print("점수 입력 : ");
				int itemp = sc.nextInt();
				arr[i] = itemp;
				tot += itemp;
			}else {
				arr[i]=tot;
			}			
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(i + "번째 점수는 " + arr[i]);			
		}
		System.out.printf("평균은 %.2f", (double)tot / 3);
	}
	
	public void arrayTest5() {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print(i+1 + "번째 숫자 입력 : ");
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
		
		//bool형 변수
		boolean room[] = new boolean[10];
		while(b) {
			System.out.println("모텔 관리 프로그램  v1.0");
			System.out.print("1.입실\t2.퇴실\t3.방보기\t4.종료\n선택 > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				System.out.print("몇번방에 입실하시겠습니까?");
				int i = sc.nextInt();
				if(i>11 && i<1) {
					System.out.println("잘못된 입력");
				}else {
					if(room[i-1]!=false) {
						System.out.println(i + "번방은 현재 손님이 있습니다");
					}else {
						room[i-1]=true;
						System.out.println(i + "번방에 입실하셨습니다");
					}
				}
				break;
			case 2:
				System.out.print("몇번방에서 퇴실하시겠습니까?");
				int j = sc.nextInt();
				if(j>11 && j<1) {
					System.out.println("잘못된 입력");
				}else {
					if(room[j-1]!=true) {
						System.out.println(j + "번방은 현재 빈 방입니다");
					}else {
						room[j-1]=false;
						System.out.println(j + "번방에서 퇴실하셨습니다");
					}
				}
				break;
			case 3:
				for(int k=0;k<room.length;k++) {
					if(room[k]==true) {
						System.out.println(k+1 + "번방에는 현재 손님이 있습니다");
					}else {
						System.out.println(k+1 + "번방이 현재 비어있습니다");
					}
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				b = false;
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		
		//int형배열
		/*
		int rNum[] = new int[10];
		while(b) {
			System.out.println("모텔 관리 프로그램  v1.0");
			System.out.print("1.입실\t2.퇴실\t3.방보기\t4.종료\n선택 > ");
			int itemp = sc.nextInt();
			switch(itemp) {
			case 1:
				System.out.print("몇번방에 입실하시겠습니까?");
				int i = sc.nextInt();
				if(i>11 && i<1) {
					System.out.println("잘못된 입력");
				}else {
					if(rNum[i-1]!=0) {
						System.out.println(i + "번방은 현재 손님이 있습니다");
					}else {
						rNum[i-1]=1;
						System.out.println(i + "번방에 입실하셨습니다");
					}
				}
				break;
			case 2:
				System.out.print("몇번방에서 퇴실하시겠습니까?");
				int j = sc.nextInt();
				if(j>11 && j<1) {
					System.out.println("잘못된 입력");
				}else {
					if(rNum[j-1]==0) {
						System.out.println(j + "번방은 현재 빈 방입니다");
					}else {
						rNum[j-1]=0;
						System.out.println(j + "번방에서 퇴실하셨습니다");
					}
				}
				break;
			case 3:
				for(int k=0;k<rNum.length;k++) {
					if(rNum[k]!=0) {
						System.out.println(k+1 + "번방에는 현재 손님이 있습니다");
					}else {
						System.out.println(k+1 + "번방이 현재 비어있습니다");
					}
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				b = false;
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		*/
	}
	
	public void lottoArray() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//게임을 더할지 여부를 판단하는 변수
		char c = ' ';
		boolean b = true;
		
		//유저의번호
		int lottoA[] = new int[6];
		//컴퓨터의 번호
		int lottoC[] = new int[6];
		//맞은개수 저장변수
		int count=0;
		//값저장위한 임시변수
		int itemp=0;
		
		//시작 및 유저의 번호 입력받기
		System.out.println("============== 로또 프로그램 ==============");
		for(int i=0;i<lottoA.length;i++) {
			System.out.print(i+1 + "번째 번호 입력(1~45) : ");
			//임시 번호를 저장할 변수
			itemp = sc.nextInt();
			//범위 벗어난거 잡고가기
			if(itemp>45 || itemp<1) {
				System.out.println("잘못입력하셨습니다. 1~45 중 한개를 입력해주세요");
				i--;
			}else {
				for(int k=0; k<lottoA.length; k++) {
					if((itemp == lottoA[k])&&(i!=k)) {
						System.out.println("이미 중복된 번호입니다. 다시 입력해주세요");
						i--;
						break;
					}
					else {
						lottoA[i]=itemp;
					}
				}
			}
		}
		
		//컴퓨터의 번호 입력받기
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
		
		//버블정렬
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
		
		//각각의 번호 시각적 출력
		System.out.println("사용자 번호");
		for(int i=0;i<lottoA.length;i++) {
			System.out.print(lottoA[i]+"\t");
		}
		System.out.println();
		System.out.println("컴퓨터 번호");
		for(int i=0;i<lottoC.length;i++) {
			System.out.print(lottoC[i]+"\t");
		}
		
		//맞은 개수측정
		for(int i=0;i<lottoA.length;i++) {
			itemp = lottoA[i];
			for(int j=0;j<lottoC.length;j++) {
				if(itemp==lottoC[j]) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("맞은 갯수 : " + count);
		
		//등수 표출
		switch(count) {
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
			System.out.println(7-count + "등입니다");
			break;
		case 1:
		default:
			System.out.println("꽝");
			break;
		}
		
		//더할지 여부 판단
		System.out.print("한번 더 하시겠습니까(1.yes,2.no)?");
		c = sc.next().charAt(0);
	}

	public void arrCopy() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String ph = sc.next();
		//문자열을 문자1개씩 분리해서 문자형 배열에 저장
		//문자열 중에 몇번째 글자 하나만 문자로 추출
		//얕은복사(값만 저장, 원본 변하면 얘도 바뀜)
		int iA[] = {1,2,3};
		int iA1[] = iA;
		//깊은복사(값과 주소 모두 저장, 원본 변해도 영향없음)
		char ph1[] = new char[13];
		for(int i=0;i<ph.length();i++) {
			ph1[i] = ph.charAt(i);
			if(i>3&&i<=7) {
				ph1[i]='*';
			}
			System.out.print(i);
		}
		

		//arraycopy메소드 원본배열,시작위치,복사배열,시작위치,길이
		
		//clone키워드를 사용해서 깊은 복사
		char ph2[] = ph.toCharArray().clone();
	}
	
	public void arrTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
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
		//2차원 배열 arr[가로_행번호][세로_열번호]
		//기본값은 숫자형은 모두 0 
		//boolean은 false, char ''		
		int sdarr[][] = {{1,2,3},{4,5,6}};
		int arr[][] = new int[5][5];
		int k = 0;
		//arr.length는 행의 갯수
		for(int i=0;i<arr.length;i++) {
			//arr[i].length는 그 행의 열의개수
			//가변배열에서는 각 행마다 열의 길이가
			//다를 수 있기 때문에 꼭 적어야함
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
		//행과 열을 저장할 변수
		int row = 0, col =0;
		//값 판별과정
		while(true) {
			System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
			row = sc.nextInt();
			if(row<1||row>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}else {
				break;
			}
		}
		
		while(true) {
			System.out.print("세로열의 개수를 입력하세요(1~10) ==> ");
			col = sc.nextInt();
			if(col<1||col>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}else {
				break;
			}
		}
		char chArray[][] = new char[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				//알파벳은 총 26개
				char ch = (char)(rd.nextInt(26)+97);
				chArray[i][j] = ch;
				System.out.print(chArray[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public void snail2DArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int temp = sc.nextInt();
		int arr[][] = new int[temp][temp];
		//행과 열
		int row=0,col=-1;
		//값 변수
		int k=1;
		//스위치개념의 변수
		int iSwitch = 1;
		
		while(true){
			//행의 값이 증감하는 코드
			for(int i=0;i<temp;i++){
        		col=col+iSwitch;
        		arr[row][col]=k++;
        	}

        	temp=temp-1;
        	//각각 n행n열의 배열은
        	//달팽이시 n,n-1,n-1,n-2,n-2...
        	//2,2,1,1을 거치게됨

        	//종착지라면
        	if(temp==0)
        	break;
        	//열의값이 증감하는코드
        	for(int i=0;i<temp;i++){
        		row=row+iSwitch;
        		arr[row][col]=k++;
        	}
        	//행과 열이 모두 증감되었으므로 증감을 서로 변환
        	iSwitch=iSwitch*(-1);
        }
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		//출처: https://cbts.tistory.com/60 [IT일기장]
	}

	public void snail2DArrayBack() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int temp = sc.nextInt();
		int arr[][] = new int[temp][temp];
		//행과 열
		int row=0,col=-1;
		//값 변수
		int k=1;
		//스위치개념의 변수
		int iSwitch = 1;
		
		while(true){
			//행의 값이 증감하는 코드
			for(int i=0;i<temp;i++){
        		col=col+iSwitch;
        		arr[row][col]=k++;
        	}

        	temp=temp-1;
        	//각각 n행n열의 배열은
        	//달팽이시 n,n-1,n-1,n-2,n-2...
        	//2,2,1,1을 거치게됨

        	//종착지라면
        	if(temp==0)
        	break;
        	//열의값이 증감하는코드
        	for(int i=0;i<temp;i++){
        		row=row+iSwitch;
        		arr[row][col]=k++;
        	}
        	//행과 열이 모두 증감되었으므로 증감을 서로 변환
        	iSwitch=iSwitch*(-1);
        }
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	//강사님 방식
	public void snail2DArray2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];					//입력받은크기의 정방형 배열 생성
		int k = 1;												//배열안의 채울 값 변수
		int inc =1;											//인덱스번호 증감용 변수
		int r=0;												//2차원배열 행 인덱스번호
		int c=-1;												//2차원배열 열 인덱스번호
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
		System.out.print("지도 한 변의 길이 입력 ");
		int iNum = sc.nextInt();
		//지도1의 배열
		int arr1[][] = new int[iNum][iNum];
		//지도2의 배열
		int arr2[][] = new int[iNum][iNum];
		//완성된 지도의 배열
		char ch[][] = new char[iNum][iNum];
		
		System.out.println("지도1의 숫자 입력 : ");
		//지도1에 숫자 입력
		for(int i=0; i<iNum; i++) {
			System.out.print(i+1+"번째 숫자 입력");
			int k = sc.nextInt();
			if(k>0 && k<Math.pow(2, iNum)) {
				arr1[i] = dec2binary(k, iNum);
			}
			else {
				System.out.println("잘못된 입력");
				i--;
			}
		}
		
		System.out.println("지도2의 숫자 입력 : ");
		//지도2에 숫자 입력
		for(int i=0; i<iNum; i++) {
			System.out.print(i+1+"번째 숫자 입력");
			int k = sc.nextInt();
			if(k>0 && k<Math.pow(2, iNum)) {
				arr2[i] = dec2binary(k, iNum);
			}
			else {
				System.out.println("잘못된 입력");
				i--;
			}
		}
		
		//지도를 합쳐 완성된 지도로 변환하는 코드
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
		
		//완성된 지도 출력
		System.out.println("완성된 지도");
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	//10진수를 2진수로 만드는 코드
	int[] dec2binary(int i, int all) {
		int arrTemp[] = new int[all];
		int ori = i;
		
		for(int j=0; j<all; j++) {
			//길이가 n인 배열의 마지막 인자는 n-1
			arrTemp[all-j-1] = ori%2;
			//나머지
			ori /= 2;
		}
		return arrTemp;
	}

	public void kakao() {
		Scanner sc = new Scanner(System.in);
		int map1[][] = new int[5][5];
		int map2[][] = new int[5][5];
		char map[][] = new char[5][5];
		
		System.out.println("첫번째 배열 숫자입력");
		for(int i=0;i<map1.length;i++) {
			System.out.print(i+1+"번째 행 숫자 입력(범위0~31) : ");
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