package day10.util;

import java.util.LinkedList;
import java.util.Queue;

/*
 * [[ Queue ]]
 * 	- 배열성 인터페이스
 * 	- 선입선출(First In First Out): 먼저 들어온 값이 먼저 나간다.
 */
public class MainClass10 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("피카츄");
		queue.offer("라이츄");
		queue.offer("파이리");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		queue.remove(); // 첫번째 값 제거
		queue.clear(); // 모든 값 제거(초기화)
	}
}