package day09.thread;

import day09.mythread.MyThread;

/*
 * [[ 스레드 ]]
 * 	메인메소드가 추가되서 같이 동작한다고 생각하면 된다.
 *  병렬 실행
 *  비동기 실행
 *  ex) 네이버 창과 네이버 검색창은 같은 창 안에서 별개로 실행됨
 *  
 * [[ 새로운 스레드 시작시키는 방법 ]]
 * 	1. thread 객체를 생성할 수 있는 클래스를 정의한다.
 * 	2. 정의한 클래스를 이용해서 객체를 생성
 * 	3. 생성된 객체의 start() 메소드를 호출한다.
 * 		!주의 run() 메소드 호출 아님
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		MyThread thread1 = new MyThread();
		thread1.start();
		System.out.println("메인 스레드가 종료됩니다.");
	}
}
