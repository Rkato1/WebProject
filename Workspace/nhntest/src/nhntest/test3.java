package nhntest;

public class test3 {
	private static void solution(int numOfOrder, String[] orderArr) {
	    // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
		if(numOfOrder<1 || numOfOrder>10) {
			System.out.println("주문표 장수 범위 초과");
		}else {
			if(orderArr.length<1 || orderArr.length>30) {
				System.out.println("직원이 작성한 주문표의 길이 초과");
			}else{
				
			}
		}
			
	  }
}
