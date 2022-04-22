package co.edu.member;

public class Singleton {
	
	//필드
	private static Singleton singleton = new Singleton(); //private = 접근 제한자(싱글톤 이클립스 내에서만 사용할 수 있도록 정의)
	
	//생성자
	private Singleton() { //다른 메인클래스에서 사용할 수 없도록 private 사용
		
	}
	
	//정적 메소드
	static Singleton getInstance() {
		if(singleton == null) { //if 사용한 이유 : 혹시 몰라서 예외처리
			singleton = new Singleton();
		}
		return singleton;
	}
	

}
