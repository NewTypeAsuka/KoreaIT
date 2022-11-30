package day08.mypac;

public class NumberPrinter {
	public void printNumber() throws InterruptedException { // 예외 처리 강제로 미루
		for(int i=0; i<10; i++) {
			System.out.println(i);
			Thread.sleep(1000); // 1초 일시정지
		}
	}
}
