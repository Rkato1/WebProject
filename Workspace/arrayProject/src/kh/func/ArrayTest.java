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
		int iA[]] = {1,2,3};
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
		
		//clone키워드를 사용해서 깊은 복사
		char ph2[] = ph.toCharArray().clone();
	}
	
	public void arrTest() {
		
	}
}
