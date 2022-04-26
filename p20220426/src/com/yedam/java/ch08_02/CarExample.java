package com.yedam.java.ch08_02;
//필드의 다형성(자동타입변환)
public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.run();
		System.out.println("-------------------"); //그냥 구분선
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		myCar.run();
		
	}

}
