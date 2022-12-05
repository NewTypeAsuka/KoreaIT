package day07.interfaceEx;

import day07.mypac.Akweapon;

/*
 * [[ 인터페이스 ]]
 * 	추상메소드만 있다.
 * 	변수선언을 해도 변수가 아닌 상수가 된다.
 * 	다중 상속 가능
 * 
 * 	뼈대를 만들어준다.
 * 
 * 	!인터페이스의 변수는 final이 생략된 상수이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		Akweapon ak = new Akweapon();
		ak.attack();
		
		ak.attackSky();
		
		System.out.println(ak.NAME);
//		ak.NAME = "M4A1";
//		System.out.println(ak.NAME);
	}
}
