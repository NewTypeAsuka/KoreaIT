package day09.lang;
/*
 * [[ 래퍼 클래스 (Wrapper Class) ]]
 * 	8개의 기본 타입에 해당하는 데이터를 객체로 표현
 * 	boolean, byte, short, int, long, float, double, char
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 기본형 변수
		boolean b = true;
		Boolean wb1 = new Boolean(true); // 요즘은 valueOf 타입을 많이 씀
		Boolean wb2 = new Boolean(false);
		
		Boolean wb3 = Boolean.valueOf(true);
		
		Integer number1 = Integer.valueOf(10);
		Integer number2 = new Integer(10);
		int number3 = 10;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("number1 == number3: " + (number1 == number3));
		System.out.println("number1 == number2: " + (number1 == number2));
		
		int number4 = number1;
		int number5 = number2;
		System.out.println("number4 == number5: " + (number4 == number5));
		
		int iNum1 = Integer.parseInt("100");
		int iNum2 = Integer.parseInt("100");
		System.out.println(iNum1 + iNum2);
	}
}
