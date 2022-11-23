package day04.method;
/*
 * [[ 메소드 ]]
 * 	어떤 특정 작업을 수행하기 위한 명령문의 집합.
 * 
 *  접근제어자 (정적) 반환타입 메소드이름(매개변수타입 매개변수명){// 메소드선언부
 *  	명령문 // 메소드구현부
 *  	return 반환값;
 *  }
 *  
 *  오버로딩
 *  	메소드 명이 같아도 매개변수 갯수 또는 타입이 다르면 사용 가능
 */

public class MainClass01 {
	public static String name; // 전역변수 name 선언
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		
		// hello 메소드 호출하기
		hello();
		
		// printName 메소드 호출하기
		printName("이상준");
		setName("피카츄");
	
		String strName = getName();
		
		System.out.println("전역변수 name: " + name);
		System.out.println("전역변수 name: " + strName);
		
		String eMon = getEvolution("꼬부기");
		
		System.out.println(eMon);
	}
	
	// 인자 X 리턴 X - 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, world");
		System.out.println("Hello, world");
		System.out.println("Hello, world");
		System.out.println("Hello, world");
		System.out.println("Hello, world");
	}
	
	// 인자(매개변수) O 리턴 X
	public static void printName(String name) {
		System.out.println("이름: " + name);
	}
	
	// 오버로딩메소드
	public static void printName(String name, int age) {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	// 인자(매개변수) O 리턴 X - 매개변수를 전역변수 name에 대입
	public static void setName(String name) {
		MainClass01.name = name;
	}
	
	// 인자 X 리턴 O - 전역변수 name을 반환
	public static String getName() {
		return name;
	}
		
	public static String getEvolution(String mon) {
		String eMon = "";
		if(mon.equals("꼬부기")) {
			eMon = "어니부기";
		}else if(mon.equals("어니부기")) {
			eMon = "거북왕";
		}
		return eMon;
	}
}