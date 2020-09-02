package kh.java.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateClass {
	public void calendarClass(){
		//객체 생성
		//Calendar는 추상클래스고 생성자도  protected
		Calendar today = Calendar.getInstance();
		//Calendar의 자식클래스 GregorianCalendar객체를 생성
		//한국표준시간대의 정보를 가져옴(컴퓨터 시스템 기준으로 맞춰진 값을 가져옴)
		//Calendar.YEAR->올해의 연도 반환
		System.out.println(today.get(Calendar.YEAR));
		//Calendar.MONTH->(0~11)반환,월 출력
		System.out.println(today.get(Calendar.MONTH) + 1);
		//일 출력
		System.out.println(today.get(Calendar.DATE));
		//am/pm구분 0/1반환
		System.out.println(today.get(Calendar.AM_PM));
		//시간
		System.out.println(today.get(Calendar.HOUR));
		//분
		System.out.println(today.get(Calendar.MINUTE));
		//초
		System.out.println(today.get(Calendar.SECOND));
		//초/1000 (1~1000)
		System.out.println(today.get(Calendar.MILLISECOND));
		//요일(1(일)~7(토))
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		
		Calendar yesterday = Calendar.getInstance();
		System. out.println(yesterday.get(Calendar.DAY_OF_WEEK));
		//연도 변경
		yesterday.set(Calendar.YEAR, 2019);
		System.out.println(yesterday.get(Calendar.YEAR));
		System.out.println(yesterday.get(Calendar.DAY_OF_WEEK));
		
		long todaySec = today.getTimeInMillis();
		//1970/01/01부터 현재시간까지 흐른시간을
		//MILLISECOND로 나타내는 메소드
		long yesterdaySec = yesterday.getTimeInMillis();
		System.out.println(todaySec);
		long ltodaySec = todaySec/1000;
		long lyesterdaySec = yesterdaySec/1000;
		
		//하루는 86400초
		int itoday = (int)ltodaySec/86400;
		int iyesterday = (int)lyesterdaySec/86400;
		
		//윤년이 있을때는 366, 아닌 경우 365
		System.out.println(itoday-iyesterday);
	}

	//자주 안 사용해서 사라질수도 있음
	public void dateTest() {
		//컴퓨터 시간에 영향
		Date date = new Date();
		System.out.println(date);
		Calendar today = Calendar.getInstance();
		//today.set(Calendar.DATE, 1);
		Date date1 = new Date(today.getTimeInMillis());
		System.out.println(date1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		System.out.println(sdf.format(date));
		System.out.println(sdf1.format(date));
	}

	public void exam1() {
		Calendar c = Calendar.getInstance();		
		int iYear = c.get(Calendar.YEAR);
		int iMonth = c.get(Calendar.MONTH)+1;
		int iDate = c.get(Calendar.DATE);
		int iDay = c.get(Calendar.DAY_OF_WEEK);
		StringBuffer sb = new StringBuffer();
		sb.append(iYear+"년 ");
		sb.append(iMonth+"월 ");
		sb.append(iDate+"일 ");
		switch(iDay) {
		case 1:
			sb.append("일요일");
			break;
		case 2:
			sb.append("월요일");
			break;
		case 3:
			sb.append("화요일");
			break;
		case 4:
			sb.append("수요일");
			break;
		case 5:
			sb.append("목요일");
			break;
		case 6:
			sb.append("금요일");
			break;
		case 7:
			sb.append("토요일");
			break;
		}
		System.out.println(sb);
	}

	public void ddayCal() {
		Calendar c = Calendar.getInstance();
		int iYear = c.get(Calendar.YEAR);
		int iMonth = c.get(Calendar.MONTH)+1;
		int iDay = c.get(Calendar.DATE);
		Scanner sc = new Scanner(System.in);
		System.out.println("============ D-Day 계산기 ============");
		System.out.print("D-Day [년도] 입력 : ");
		int dYear = sc.nextInt();
		System.out.print("D-Day [월] 입력 : ");
		int dMonth = sc.nextInt();
		System.out.print("D-Day [일] 입력 : ");
		int dDay = sc.nextInt();
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, dYear);
		c1.set(Calendar.MONTH, dMonth-1);
		c1.set(Calendar.DATE, dDay);
		System.out.printf("오늘 날짜 : %d년 %d월 %d일\n", iYear, iMonth, iDay);
		System.out.printf("D-Day 날짜 : %d년 %d월 %d일\n", dYear, dMonth, dDay);
		//남은 일로 계산
		//24*60*60*1000
		int iToday = (int)(c.getTimeInMillis()/86400000);
		int dToday = (int)(c1.getTimeInMillis()/86400000);
		if(iToday-dToday>0) {
			System.out.printf("%d일 지났습니다.\n", iToday-dToday);
		}else if(iToday-dToday<0) {
			System.out.printf("%d일 남았습니다.\n", dToday-iToday);
		}else {
			System.out.println("D-Day 입니다.");
		}
	}
}
