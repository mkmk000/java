package com.yedam.java.ch08_02;
//필드의 다형성(자동타입변환)
public class Car { //Tire를 부품으로 가지는 클래스
	
	//인터페이스 타입 필드선언, 초기구현 객체 대입
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//인터페이스에서 설명된 roll() 메소드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
