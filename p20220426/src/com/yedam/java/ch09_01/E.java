package com.yedam.java.ch09_01;

public class E {
	
	//필드
	//인스턴스 필드
	F f = new F(); //인스턴스, 정적 클래스 둘 다 인스턴스 필드로 사용가능
	G g = new G(); //인스턴스, 정적 클래스 둘 다 인스턴스 필드로 사용가능
	
	//정적 필드
	//static F f1 = new F(); 인스턴스 멤버 없이는 사용불가
	static G g1 = new G();
	
	//생성자
	
	
	//메소드
	//인스턴스 메소드
	void method1() {
		F f = new F();
		G g = new G();
	}
	//정적메소드
	static void method2() {
	//	F f = new F(); 인스턴스 멤버 없이는 사용불가
		G g = new G();
	}

	
	//인스턴스 멤버 클래스
	class F {}
	
	
	//정적 멤버 클래스
	static class G {}
	
	
}
