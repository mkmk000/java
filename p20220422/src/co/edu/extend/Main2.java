package co.edu.extend;

public class Main2 {

	public static void main(String[] args) {

		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		sa.takeOff(); //부모 클래스의 메소드 호출
		sa.fly(); //자식 클래스에서 오버라이드한 메소드
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly(); //자식 클래스에서 오버라이드한 메소드
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		sa.fly(); //자식 클래스에서 오버라이드한 메소드
		sa.land(); //부모 클래스의 메소드 호출
	}

}
