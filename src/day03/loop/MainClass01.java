package day03.loop;
/*
 * [[ 반복문 ]]
 * 	특정 부분의 코드가 반복적으로 수행하도록 하는 제어문.
 * 
 * 	1. while문
 * 
 * 	while(조건문) {
 * 		반복 수행할 코드
 *  }
 *
 */
public class MainClass01 {
	public static void main(String[] args) {
		// while문을 이용해서 0~99까지 출력
		int count = 0; // 카운트를 세기 위한 변수
		while(true) {
			System.out.println("첫번째 경우: " + count);
			count ++;
			if(count == 100) break;
		}
		
		count = 0;
		while(count < 100) {
			System.out.println("두번째 경우: " + count);
			count++;
		}
		
		count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println("세번째 경우: " + count);
			count++;
			if(count == 100) isRun = false;
		}
	}
}
