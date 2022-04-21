package co.edu.oop;

public class Main {

	public static void main(String[] args) {

//		Car myCar = new Car(); //자동차 객체 생성
//		myCar.company = "기아";
//		myCar.model = "K3";
//		myCar.color = "white";
//		myCar.maxSpeed = 150;
//		
//		myCar.info();
//		System.out.println();
//		
//		
//		//생성자를 통한 데이터 입력
//		Car myCar2 = new Car("sonata","black"); //입력한 정보에 대한 값만 출력
//		myCar2.info();
//		System.out.println();
//		
//		//각 개체에 주소 번지 -> 100번지에 있는 데이터를 호출
//		Korean k1 = new Korean("박자바", "012345-124578");
//		k1.getInfo();
//		System.out.println();
//		Korean k2 = new Korean("김자바", "852025-145787");
//		k2.getInfo();
//		System.out.println();
//		Korean k3 = new Korean("미국", "이자바", "870912-236589");
//		k3.getInfo();
//		System.out.println();
		
		
		
		Calculator cal = new Calculator();
		
		int result = cal.plus(3, 2);
		System.out.println(result);
		
		result = cal.minus(10, 2);
		System.out.println(result);
		
		
		
		
	}

}
