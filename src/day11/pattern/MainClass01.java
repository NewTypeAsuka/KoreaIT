package day11.pattern;
/*
 * 디자인패턴
 */
public class MainClass01 {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		
		Factory factory = Factory.getInstance();
		Factory factory2 = Factory.getInstance();
		Factory factory3 = Factory.getInstance();
		
		System.out.println(System.identityHashCode(singleton));
		System.out.println(System.identityHashCode(singleton2));
		System.out.println(System.identityHashCode(singleton3));
		
		System.out.println(System.identityHashCode(factory));
		System.out.println(System.identityHashCode(factory2));
		System.out.println(System.identityHashCode(factory3));
	}
}
