package day05.var;

import day05.mypac.Card;

/*
 * [[ 변수(variable) ]]
 * 	메모리 공간에 붙여진 이름.
 * 	JAVA 프로그램 사용되는 모든 값을 메모리 공간에 저장.
 * 	메모리 공간에 이름을 붙여 접근 가능
 * 
 * 변수 선언 및 초기화
 * 	자료형 변수명 = 값
 * 
 * 1. 타입에 따른 변수
 * 	기본형: 예약어, 소문자로 시작, 값을 가지고 있다. 
 * 		8개 - boolean, byte, short, int, long, char, float, double
 * 	참조형: 대문자로 시작, 주소값을 가지고 있다.
 * 		기본형 외 나머지 전부 - String 등
 * 
 * 2. 선언하는 위치에 따른 변수
 * 	전역변수(global 변수): 클래스 안에 선언(멤버변수) 
 * 	지역변수(local 변수): 메소드 또는 생성자 안에 선언
 * 					   중괄호 {} 안에 선언된 변수
 * 					   반드시 초기화 해줘야 함 (안하면 컴파일 에러)
 *  초기화 = 처음 값을 대입
 *  
 * 3. 정적(static) / 동적 변수
 * 	Card 클래스에서 static으로 정의한 것은 고정값으로 받아서
 * 	width와 height는 뒤에도 적용 
 */
public class MainClass01 {
	
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.height);
		
		System.out.println();

		
		Card c2 = new Card();
		c2.cardType = "heart";
		c2.number = "K";
		c2.width = 65;
		c2.height = 90;
		System.out.println(c2.cardType);
		System.out.println(c2.number);
		System.out.println(c2.width);
		System.out.println(c2.height);
		
		System.out.println();
		
		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.height);
	}
}
