package co.yedam.java.ch03_02;

public abstract class Animal { //추상 클래스(추상 메소드를 포함하고 있는 클래스는 무조건 abstract가 붙어야함)
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드, 종마다 정의된 소리가 다르기 때문에
	
}
