package co.yedam.java.ch03_02;

public class Dog extends Animal {
	
	//생성자
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override //추상 메소드 재정의
	public void sound() {
		System.out.println("멍멍");
	}

}
