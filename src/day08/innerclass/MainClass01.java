package day08.innerclass;
/*
 * [[ 내부클래스(innerclass) ]]
 * 	클래스 안에 또다른 클래스 정의
 */
public class MainClass01 {
	public static void main(String[] args) {
		new MainClass01.InnerClass().doSomething(); // 내부클래스 실행(아래와 같음)
		new InnerClass().doSomething(); // 내부클래스 실행
	} // main 메소드 끝
	static class InnerClass { // 내부클래스 정의
		public void doSomething() {
			System.out.println("무언가를 해요!");
		}
	}
} // MainClass01 끝
