package day11.pattern;
/*
 * 팩토리 패턴
 * 	getInstance 메소드 통해서 객체 생성
 */
public class Factory {
	
	private static Factory instance;
	
	private Factory() {
		
	}
	
	public static Factory getInstance() {
		return new Factory();
	}
}