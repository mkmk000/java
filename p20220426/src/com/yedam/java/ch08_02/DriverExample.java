package com.yedam.java.ch08_02;
//매개 변수의 다형성(자동타입변환)
public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		driver.drive(new Bus()); //Vehicle vehicle = bus 자동타입변환
		driver.drive(new Taxi()); //Vehicle vehicle = taxi 자동타입변환
		
	}

}
