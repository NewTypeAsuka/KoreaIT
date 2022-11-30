package day08.exception;
/*
 * [[ 예외 ]]
 * 	프로그램 실행 도중 발생되는 에러에 해당된다.
 * 	(엄밀히 말하면 기술상 에러는 아님)
 * 	예외처리: 예외가 발생되었을 때 이를 처리하는 것
 * 
 * 처리하는 방법:
 * 	try {
 * 		실행코드
 *  } catch(익셉션클래스명 변수명){
 *  	해당 예외가 발생했을 경우 실행할 코드
 *  }
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 정수 값을 저장할 지역변수 초기화
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
//		result = num1/num2; 	// 0으로 나눌 수 없어서 에러 발생
//		System.out.println("실행결과: " + result);
		
//		if(num2 != 0) {
//			result = num1/num2;
//			System.out.println("실행결과: " + result);
//		} else {
//			System.out.println("어떠한 수를 0으로 나눌 수 없습니다."); 		// 예측 가능한 범위에서 if문으로 처리
//		}
		
		try {
			result = num1/num2; // 예외 발생시 try문 아래 코드는 실행 안됨
			System.out.println("실행결과: " + result);
		} catch(Exception e) { // 예외 발생시 catch문 아래 코드 실행
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			
			e.printStackTrace(); // 어떤 에러인지 표시
			System.out.println("무슨 에러야? " + e.getMessage());
		}
		
	}
}
