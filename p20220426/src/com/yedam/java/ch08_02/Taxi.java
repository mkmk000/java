package com.yedam.java.ch08_02;
//매개 변수의 다형성(자동타입변환)
public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
