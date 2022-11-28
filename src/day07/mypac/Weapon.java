package day07.mypac;

public interface Weapon {
	final String NAME = "AK-47";
	// final은 없어도 상수로 고정됨
	
	public void attack();
	
	public void attackSky();
}
