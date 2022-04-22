package co.edu.getset;

public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car();

		myCar.setSpeed(-50);
		int speed = myCar.getSpeed();
		System.out.println(speed);
	
		
		//50 mile 속도를 넣음
		myCar.setSpeed(50);
		//50 mile -> km 값으로 변환
		speed = myCar.getSpeed();
		System.out.println(speed);
		
		
		
		
	}

}
