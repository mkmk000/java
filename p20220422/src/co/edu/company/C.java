package co.edu.company;

import co.edu.ass.A;

public class C extends A { // C = 자식클래스

	public static void main(String[] args) {
		A a = new A();
		int temp;

		// 1) default
//		temp = a.b //같은 패키지내에서만 호출할 수 있기 때문에 오류뜸

		// public
		temp = a.b;
		
		// protected
		C c = new C();
		int d = c.c;
		
		
		
		
	}

}
