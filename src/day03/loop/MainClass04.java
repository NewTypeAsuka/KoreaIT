package day03.loop;
/*
 * if 조건문 + for 반복문 연습
 * 1번 숙제
 * 주말숙제 2중 for문 코드 분석하기
 * 
 * 2번 숙제
 *        *
 *       **
 *      ***
 *     ****
 *    *****
 *   ******
 *  *******
 * 나오게 하기
 * 
 * 3번 숙제
 *     *
 *    ***
 *   *****
 *  *******
 *  
 * 4번 숙제
 *     *
 *    ***
 *   *****
 *  *******
 *   *****
 *    ***
 *     *
 */
public class MainClass04 {
	public static void main(String[] args) {
		// 1번 숙제 분석!
		for(int i=0; i<7; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*"); //print는 개행하지 않음
			}
			System.out.println();
		}
	}
}
