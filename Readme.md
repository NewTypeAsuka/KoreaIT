# JavaSE

***

### 객체란?   
실제로 존재 또는 추상적으로 식별 가능한 모든 것   
최소한의 프로그램 단위   
	
Java - 객체 설계도를 만든다. (붕어빵틀)   
```
	class 클래스명 extends 상속 implements 인터페이스 {
		생성자
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
	- 접근제어자(4개)   
		- public - 모든 패키지, 클래스에서 접근 가능   
		- protected - 같은 패키지 또는 상속 관계에서 접근 가능   
		- default (선언하지 않은 상태) - 같은 패키지에서만 접근 가능   
		- private - 같은 클래스 내에서만 접근 가능   
		
- 생성자(constructor) - 클래스명과 같다. 객체가 생성되기 전 한번만 실행된다.
	- 멤버필드 초기화용으로 자주 사용
	- 메소드와 차이점은 리턴이 없다는 것
	- 오버로딩 가능
	
- 상속 - 부모 클래스의 멤버를 자식 클래스에서 사용 또는 재정의 가능
	- 예약어 extends
	- super 예약어로 부모 클래스 접근 가능
	- 오버라이딩 - 부모 멤버 재정의
	
- 인터페이스 상속 - 클래스 상속과 비슷
	- 예약어 implements
	- 추상메소드와 상수로만 구성
	- 일반 상속과 달리 다중 상속 가능
	- 구성된 추상메소드는 오버라이딩 필수
	- new 인터페이스명 --> 익명 클래스 생성
	
- 다형성 - 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미
	- 인터페이스 타입 변수 선언 = new 자식클래스();
	- 부모클래스 타입 변수 선언 = new 자식클래스();
	
- lang 패키지
	- Object 클래스 - 모든 클래스의 조상 클래스 (상속 생략되어있다)
	- Wrapper 클래스 - 8가지 기본형 변수를 참조형 클래스로 제공. 여러 기능(메소드)이 있다.
	- String - 불변(immutable)의 클래스 메모리에 올라간 값 변경되지 않는다. 단 new String("값") 예외
	
- util 패키지
	- collection
		- List - 가변 배열 객체, 인덱스 값 존재
		- Set - 순서가 없는 배열 객체, 중복값 없음
		- Map - key, value로 구성, key는 중복값 없음
		
- 날짜 관련
	- Date, Calendar - 날짜 관련 객체
	- Scanner - 시스템(콘솔) 입력받을 수 있는 객체
	- Random - 난수 생성 객체