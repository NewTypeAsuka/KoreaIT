package day05.oop;

// 일괄 import 단축키: Ctrl + Shift + O
import day05.mypac.MathUtil;

public class MainClass03 {
	public static void main(String[] args) {
		int r = 5; // 반지름
		MathUtil mu = new MathUtil();
		double area = mu.getArea(r);
		System.out.println("원의 넓이는 " + area);
		
		int result = mu.sum(6, 4);
		System.out.println("6+4는 " + result);
		
		System.out.println("5+9+1은 " + mu.sum(5, 9, 1));
	}
}
