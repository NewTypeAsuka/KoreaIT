package day05.mypac;

public class MathUtil {
	public double pi = 3.14159; // 원주율
	
	// 직접 주석 달기: Alt + Shift + L
	/**
	 * @param r - 반지름 값
	 * @return - 원의 넓이
	 */
	public double getArea(int r) {  // 매개변수 반지름
		double area = pi*r*r; 		// 원주율*반지름^2
		return area;			    //원의 넓이
	}
	
	// 합계
	public int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	// 3개의 합계 (오버로딩)
	public int sum(int a, int b, int c) {
		int result = a+b+c;
		return result;
	}
}
