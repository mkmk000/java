package Question2;

public class ObesityInfo extends StandardWeightInfo {

	
private String getObesity;
//	3) ObesityInfo 클래스를 정의한다.
//	- StandardWeightInfo 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : Weight/표준체중 * 100)
//	박둘이님의 신장 168, 몸무게 90, 비만입니다.
	
	
	//필드
	public ObesityInfo(String Name, int Height, int Weight) {
		super(Name, Height, Weight);
		this.Name = "박둘이";
		this.Height = 168;
		this.Weight = 90;
	}
	
	//메소드
	int i = 200;
	public double getObesity() { 
		if(i > Weight/((Height - 100) * 0.9) * 100) {
			System.out.println("비만입니다.");
		} else if (i < Weight/((Height - 100) * 0.9) * 100)
			System.out.println("정상체중입니다.");
		return 0;
		
	}
	
	@Override
	public void getInformation() {
		System.out.println(Name + "님의 신장 " + Height + ", 몸무게 " + Weight + ", ");
	}
	public void info() {
		System.out.println(Name + "님의 신장 " + Height + ", 몸무게 " + Weight + ", " + getObesity);
	}
}
