package day10.util;

import java.util.Calendar;

/*
 * [[ Calendar 클래스 ]]
 * 	- 날짜 관련 객체
 */
public class MainClass07 {
	public static void main(String[] args) {
		// Calendar 객체 참조값 얻어오기
		Calendar calNow = Calendar.getInstance();
		
		int year = calNow.get(Calendar.YEAR); // 년도
		System.out.println("올해: " + year);
		
		int month = calNow.get(Calendar.MONTH)+1; // 월(+1 필수)
		System.out.println("이번달: " + month);
		
		int day = calNow.get(Calendar.DAY_OF_MONTH); // 일
		System.out.println("일: " + day);
		
		int hour = calNow.get(Calendar.HOUR);
		int min = calNow.get(Calendar.MINUTE);
		int sec = calNow.get(Calendar.SECOND);
		System.out.println(hour + ":" + min + ":" + sec);
	}
}
