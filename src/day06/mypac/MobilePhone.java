package day06.mypac;

// 자식 클래스는 부모 클래스를 extends로 상속함
// private만 아니면 상속 가능
public class MobilePhone extends Phone{
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name += " 이효리";
		super.name = name;
	}
}
