package com.yedam.java.ch08_02;
//필드의 다형성(자동타입변환)
public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}

}
