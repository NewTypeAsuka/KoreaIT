package day06.constant;
/*
 * [[ 상수 ]]
 * 	처음 할당된 값이 변경되지 않는다.
 * 	final 키워드 사용
 * 	상수는 대문자로 선언
 */
public class MainClass01 {
	public static void main(String[] args) {
		final double PI = 3.14159; // 원주율은 상수
//		PI = 3.2; // final로 상수화해서 에러
		int r = 10;
		double area = PI*r*r;
		System.out.println("원의 넓이: " + area);
		
		System.out.println("JAVA에서 기본으로 제공하는 원주율: " + Math.PI);
		area = 0;
		area = Math.PI*Math.pow(r,2);
		System.out.println("JAVA에서 기본으로 제공하는 원의 넓이: " + area);
	}
}
