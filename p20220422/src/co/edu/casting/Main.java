package co.edu.casting;

public class Main {

	public static void main(String[] args) {
		/*
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		*/
		
		// D->B->A
		// E->C->A
	    /*
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		*/
		
		/*
		B b1 = d;
		C c1 = e;
		*/
		
//		B b3 = e; //상속 관계에 있지 않기 때문에 에러발생
//		C c2 = d; //상속 관계에 있지 않기 때문에 에러발생
		
		Parent p1 = new Child();
		p1.method1();
		p1.method2(); //자식클래스에서 오버라이드한 내용 출력됨
		p1.method3();
		//p1.method4(); //Parent 타입에 method4가 없기때문에 오류 발생
	
		
		//클래스 타입 배열
		Parent p2 = new Parent();
		Parent p3 = new Parent();
		Parent p4 = new Parent();
		
		Parent[] parent = {p2, p3, p4}; //다차원 배열의 응용버전	
		
		
	}
	
}
