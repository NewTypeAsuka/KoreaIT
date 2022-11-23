package day05.oop;

import day05.mypac.Book; // 다른 패키지에서는 import해야 사용 가능

public class MainClass02 {
	public static void main(String[] args) {
		Book book1 = new Book();
//		day05.mypac.Book book1 = new Book(); 라고 해도 됨
				
		System.out.println(book1.subject);
		System.out.println(book1.writter);
		book1.subject = "사람은 무엇으로 사는가";
		book1.writter = "톨스토이";
		System.out.println(book1.subject);
		System.out.println(book1.writter);
		
		book1.read();
		book1.pillow();
	}
}
