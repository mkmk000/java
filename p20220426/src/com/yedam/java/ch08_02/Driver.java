package com.yedam.java.ch08_02;
//매개 변수의 다형성(자동타입변환)
public class Driver {
	public void drive(Vehicle vehicle) { //Vehicle을 매개변수로 받음
		if(vehicle instanceof Bus) {
			//내가 검사하려는 변수명 -> 어떤 객체인지
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
