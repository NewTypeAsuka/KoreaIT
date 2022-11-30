package day07.polymorphism;

import day07.mypac.Akweapon;
import day07.mypac.M4A1weapon;
import day07.mypac.Scope;
import day07.mypac.Weapon;

/*
 * [[ 다형성(polymorphism) ]]
 * 	하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미.
 * 
 *  instanceof 연산자: 객체가 어떤 클래스를 상속받고 있는지 T/F 확인용으로 사용
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 일반 객체 생성 선언
		Akweapon ak = new Akweapon();
		ak.attack();
		ak.doSnipe();
		
		// 다형성을 이용한
		// 부모타입선언 자식객체 생성
		
		/*
		 *  Weapon w1 = new Akweapon();
		 *  	-> Stack Area 저장
		 *  	-> Weapon 클래스 코드 알고 있다.
		 *  	-> Heap 영역의 생성된 new Akweapon() 참조하고 있다 = 주소값을 갖고 있다.
		 *  결론: Weapon의 정의된 멤버만 사용가능, Weapon을 상속받은 색체는 모두 참조 가능
		 */
		Weapon w1 = new Akweapon();
		w1.attack();
//		w1.doSnipe();
		
		Akweapon ak2 = (Akweapon) w1; // 주소값 복사(얕은 복사)
		ak2.doSnipe();
		
		Scope s1 = ak2;
//		s1.attack();
		s1.doSnipe();
		
		System.out.println(System.identityHashCode(w1));
		System.out.println(System.identityHashCode(ak2));
		System.out.println(System.identityHashCode(s1));
		
		classifyWeapon(ak2);
		
		M4A1weapon m4 = new M4A1weapon();
		
		classifyWeapon(m4);
	}
	
	public static void classifyWeapon(Object obj) {
		if(obj instanceof Scope) {
			System.out.println("저격소총입니다.");
		} else {
			System.out.println("일반소총입니다.");
		}
	}
}
