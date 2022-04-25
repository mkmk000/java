package co.yedam.java.ch03_01;

public class SmartPhone extends Phone {

	//생성자
	public SmartPhone(String owner) { //phone이 가지고 있는 생성자 호출
		super(owner); //반드시 첫번째(부모클래스의 생성자 호출), 없으면 자식클래스 생성불가
	}
	
//	부모클래스의 생성자가 없을때
//	public SmartPhone() {
//		super();
//	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
	

}
