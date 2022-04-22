package co.edu.member;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("하나의 싱글톤 객체입니다.");
		}
		System.out.println(obj1); //몇번지의 주소를 가지는지 출력
		System.out.println(obj2); //몇번지의 주소를 가지는지 출력
	}

}
