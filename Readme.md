# JavaSE

***

### 객체란?   
실제로 존재 또는 추상적으로 식별 가능한 모든 것   
최소한의 프로그램 단위   
	
Java - 객체 설계도를 만든다. (붕어빵틀)   
```
	class 클래스명{
		변수
		메소드
	}
```
객체를 만드는 방법(객체 생성) --> 메모리에 객체를 올린다. --> 인스턴스화   
* 클래스명(타입) 변수명 = new 클래스명();   
	
### 객체 구성요소
- 변수 - 특징, 속성 값   
	- 타입
		- 기본형(8개) - boolean, byte, char, short, int, long, float, double (stack 메모리 생성)
		- 참조형 - 기본형 외 모든 변수 --> 객체 주소값 가지고 있는 변수 (heap 메모리 생성)
	- 선언위치
		- 전역변수 - 클래스에 종속. 멤버변수
			- !초기화하지 않으면
				- 참조형 null 값
				- 기본형은 default 값: boolean(false), 정수형(0), 실수형(0.0)
		- 지역변수 - 메소드 안에 선언. !주의 초기값 대잆없을 시 컴파일 에러 발생! 초기화 필수!
	- 동적/정적
		- 동적(default) - 일반변수
		- 정적(static) - static이 선언된 변수(static 메모리 생성) / 실행시 생성 / 같은 타입 객체가 공유

- 메소드 - 기능, 코드집합
```
	// 메소드 구조
	접근제어자 (static) 리턴타입 메소드명(매개변수타입 매개변수명) {
		// 코드블럭
		...실행코드...
		return 리턴값; // 리턴 타입이 void면 생략 가능
	}
```
	- 오버로딩 - 메소드명 중복 정의. 매개변수 타입 또는 개수가 다르다.