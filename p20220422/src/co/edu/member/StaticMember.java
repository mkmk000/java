package co.edu.member;

public class StaticMember {

	// 정적필드(Static)
	static double PI = 3.14159;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

//	int a; //객체에 등록되지않은 a를 사용할시 오류 발생
//	static double PI = 3.14159;
//
//	static int plus(int x, int y) {
//		return x + y + a; //객체에 등록되지않은 a를 사용할시 오류 발생
//	}
//
//	static int minus(int x, int y) {
//		return x - y;
//	}

//	int a;
//	static double PI = 3.14159;
//
//	static int plus(int x, int y) {
//	StaticMember sm = new StaticMember(); //인스턴스화 한 후에 사용
//		return x + y + a.sm;
//	}
//
//	static int minus(int x, int y) {
//		return x - y;
//	}

}
