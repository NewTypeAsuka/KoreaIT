package day10.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[ HashMap 클래스 ]]
 *  - Map 인터페이스를 구현한 클래스이다.
 *  - Key 값, Value 값을 쌍으로 저장한다. (사전 형태)
 *  - Key 값은 중복 불가
 */
public class MainClass05 {
	public static void main(String[] args) {
		// HashMap 객체 생성
		HashMap<String, String> map1 = new HashMap<>();
		
		// 데이터 저장하기
		map1.put("hello", "안녕하세요");		
		map1.put("car", "자동차");		
		map1.put("tiger", "호랑이");
		
		// 데이터 불러오기
		String value = map1.get("hello"); // 키값으로 값 가져오기
		System.out.println("value: " + value);
		
		// Map에 있는 키값 불러오기 (Set으로 반환)
		Set<String> set = map1.keySet();
		
		// Set -> 반복자 객체
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String keyValue = it.next(); // 키값 하나씩 읽어오기
			String value2 = map1.get(keyValue); // 해당 키값에 할당되어있는 value값 읽어오기
			System.out.println(value2); // 출력
			
		}
	}
}
