package com.yedam.java.ch09_02;

public class AnonymousClassExample {

	public static void main(String[] args) {

		AnonymousClass ac = new AnonymousClass();

		// 익명 객체 필드 사용
		ac.rc.turnOn();

		// 익명 객체 로컬 변수 사용
		ac.method1();

		// 익명 객체 매개값 사용
		ac.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");

			}
		});
	}

}
