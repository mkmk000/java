package co.yedam.java.ch03_02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		
		//자동 타입 변환을 이용한 방법
		Animal animal = null;
		animal = new Dog(); //자동타입변환
		animal.sound(); //재정의된 메소드 호출
		animal = new Cat(); //자동타입변환
		animal.sound(); //재정의된 메소드 호출
		System.out.println("-----");
		
		
	}

}
