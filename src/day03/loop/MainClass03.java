package day03.loop;
/*
 * 3. for문
 * 
 * for(초기화변수; 조건식; 증감식) {
 * 		반복 수행할 코드
 * }
 */
public class MainClass03 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		// for문과 while문은 같다.
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
}
