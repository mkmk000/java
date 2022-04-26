package com.yedam.java.ch09_01;

public class Outter {
	
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field); //Nested 내부에 있는 field 가져옴
			this.method(); // this => 해당되는 클래스의 인스턴스를 가르킴
			
			System.out.println(Outter.this.field); //Outter 클래스의 field를 가져오겠다는 뜻
			Outter.this.method();
		}
	}

}
