package kh.java.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateClass {
	public void calendarClass(){
		//��ü ����
		//Calendar�� �߻�Ŭ������ �����ڵ�  protected
		Calendar today = Calendar.getInstance();
		//Calendar�� �ڽ�Ŭ���� GregorianCalendar��ü�� ����
		//�ѱ�ǥ�ؽð����� ������ ������(��ǻ�� �ý��� �������� ������ ���� ������)
		//Calendar.YEAR->������ ���� ��ȯ
		System.out.println(today.get(Calendar.YEAR));
		//Calendar.MONTH->(0~11)��ȯ,�� ���
		System.out.println(today.get(Calendar.MONTH) + 1);
		//�� ���
		System.out.println(today.get(Calendar.DATE));
		//am/pm���� 0/1��ȯ
		System.out.println(today.get(Calendar.AM_PM));
		//�ð�
		System.out.println(today.get(Calendar.HOUR));
		//��
		System.out.println(today.get(Calendar.MINUTE));
		//��
		System.out.println(today.get(Calendar.SECOND));
		//��/1000 (1~1000)
		System.out.println(today.get(Calendar.MILLISECOND));
		//����(1(��)~7(��))
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		
		Calendar yesterday = Calendar.getInstance();
		System. out.println(yesterday.get(Calendar.DAY_OF_WEEK));
		//���� ����
		yesterday.set(Calendar.YEAR, 2019);
		System.out.println(yesterday.get(Calendar.YEAR));
		System.out.println(yesterday.get(Calendar.DAY_OF_WEEK));
		
		long todaySec = today.getTimeInMillis();
		//1970/01/01���� ����ð����� �帥�ð���
		//MILLISECOND�� ��Ÿ���� �޼ҵ�
		long yesterdaySec = yesterday.getTimeInMillis();
		System.out.println(todaySec);
		long ltodaySec = todaySec/1000;
		long lyesterdaySec = yesterdaySec/1000;
		
		//�Ϸ�� 86400��
		int itoday = (int)ltodaySec/86400;
		int iyesterday = (int)lyesterdaySec/86400;
		
		//������ �������� 366, �ƴ� ��� 365
		System.out.println(itoday-iyesterday);
	}

	//���� �� ����ؼ� ��������� ����
	public void dateTest() {
		//��ǻ�� �ð��� ����
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
		sb.append(iYear+"�� ");
		sb.append(iMonth+"�� ");
		sb.append(iDate+"�� ");
		switch(iDay) {
		case 1:
			sb.append("�Ͽ���");
			break;
		case 2:
			sb.append("������");
			break;
		case 3:
			sb.append("ȭ����");
			break;
		case 4:
			sb.append("������");
			break;
		case 5:
			sb.append("�����");
			break;
		case 6:
			sb.append("�ݿ���");
			break;
		case 7:
			sb.append("�����");
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
		System.out.println("============ D-Day ���� ============");
		System.out.print("D-Day [�⵵] �Է� : ");
		int dYear = sc.nextInt();
		System.out.print("D-Day [��] �Է� : ");
		int dMonth = sc.nextInt();
		System.out.print("D-Day [��] �Է� : ");
		int dDay = sc.nextInt();
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, dYear);
		c1.set(Calendar.MONTH, dMonth-1);
		c1.set(Calendar.DATE, dDay);
		System.out.printf("���� ��¥ : %d�� %d�� %d��\n", iYear, iMonth, iDay);
		System.out.printf("D-Day ��¥ : %d�� %d�� %d��\n", dYear, dMonth, dDay);
		//���� �Ϸ� ���
		//24*60*60*1000
		int iToday = (int)(c.getTimeInMillis()/86400000);
		int dToday = (int)(c1.getTimeInMillis()/86400000);
		if(iToday-dToday>0) {
			System.out.printf("%d�� �������ϴ�.\n", iToday-dToday);
		}else if(iToday-dToday<0) {
			System.out.printf("%d�� ���ҽ��ϴ�.\n", dToday-iToday);
		}else {
			System.out.println("D-Day �Դϴ�.");
		}
	}
}
