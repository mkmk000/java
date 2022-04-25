package Question2;

public class StandardWeightInfo extends Human {

//	2) StandardWeightInfo 클래스를 정의한다.
//	- Human 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
//	홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.	
	
	//생성자
	public StandardWeightInfo(String Name, int Height, int Weight) {
		super(Name, Height, Weight);
		this.Name = "홍길동";
		this.Height = 168;
		this.Weight = 45;
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println(Name + "님의 신장 " + Height + ", 몸무게 " + Weight + ", 표준체중 " + (Height - 100) * 0.9 + "입니다.");
	}
	public double getStandardWeight() {
		System.out.println((Height - 100) * 0.9);
		return Height;
	}
	
	

}
