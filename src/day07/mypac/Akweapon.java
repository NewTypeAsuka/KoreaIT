package day07.mypac;
/*
 * 인터페이스 상속받는 방법
 * 
 * implements 예약어로 선언한다.
 * 반드시 오버라이딩 필요
 */
public class Akweapon implements Weapon, Scope {
	
	@Override
	public void attack() {
		System.out.println("공격을 해요!");
	}
	
	@Override
	public void attackSky() {
		System.out.println("하늘공격을 해요!");
	}
	
	@Override
	public void doSnipe() {
		System.out.println("저격을 해요!");
	}
}
