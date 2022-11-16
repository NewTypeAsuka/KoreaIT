package day02.basic;
/*
 * [[ 참조형 데이터형(레퍼런스형) ]]
 * 
 * 5. String 형 (문자열)
 *  - 선언하는 방법
 *  	String 변수명;
 *  - 문자열을 저장할 수 있다.
 *  
 *  기본형(키워드형) - 자바에서 기본으로 제공하는 명령어 / boolean, char, byte, short, int, long, float, double (자바의 기본 명령어: public class static과 같은 색)
 *  참조형(데이터형) - 기본형을 제외한 명령어 / String (public class static과 다른 색)
 *    
 */
public class MainClass07 {
	public static void main(String[] args) {
		char ch = 'A';
		char[] ch1 = {'H', 'E'};
		
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요.";
		System.out.println("str: " + str);
		
		/*
		 *  h e l l o
		 *  0 1 2 3 4 => 인덱스 번호
		 */		
		String hello = "hello";
		
		// hello의 인덱스 찾기
		System.out.println("1번 인덱스: " + hello.charAt(1));
		
		// 문자열 안의 문자열 찾기
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		if(isContain) {
			System.out.println("addr 에는 특별시라는 문자열이 있어요!");
		}
	}
}