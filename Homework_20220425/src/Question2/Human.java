package Question2;

public class Human {
	
//	1) Human 클래스를 정의한다.
//	- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
	
	
	//필드
	String Name;
	int Height;
	int Weight;
	
	//생성자
	public Human(String Name, int Height, int Weight) {
		super();
		this.Name = Name;
		this.Height = Height;
		this.Weight = Weight;
	}
	
	public Human() {
	}

	//메소드
	public void getInformation() {
		System.out.println(Name + "님의 신장 " + Height + ", 몸무게 " + Weight);
	}

	
	
}
