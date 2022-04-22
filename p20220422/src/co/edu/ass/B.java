package co.edu.ass;

public class B {

	public static void main(String[] args) {

		A a = new A();
		int temp;
		
		//1)default
		temp = a.a;
		
		//2)public
		temp = a.b;
		
		//3)protected
		temp = a.c;
		
		//4)private
//		temp = a.d; //오류 뜨는 이유 A라는 클래스에서만 사용할 수 있기 때문
		
		
	}

}
