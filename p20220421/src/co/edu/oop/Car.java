package co.edu.oop;

public class Car {
	
	//필드(속성)
	String company;
	String model;
	String color;
	int maxSpeed;
	//생성자(객체 초기화)
	public Car() {   //데이터가 없는 생성자
		
	}
	public Car(String model, String color) {  //데이터가 있는 생성자
		this.model = model;
		this.color = color;
	}
	public Car(String a) {
		this.model = a;
	}
	//메소드(기능)
	void info() {
		System.out.println("회사 : " + company);
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대 속도 : " + maxSpeed);
	}

}
