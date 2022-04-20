package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		cal.x = 5;
		cal.y = 2;
		
		cal.plus(10, 2); //ctrl 누른 상태로 plus 누르면 기능(메소드)이 어떻게 구성되어있는지 확인 가능
		cal.minus(100, 40);
		cal.multi(54, 35);
		cal.div(40, 10);
		System.out.println();
		
		
		Car car = new Car(); //G바겐
		car.model = "G바겐";
		car.color = "black";
		car.price = 300000000;
		car.info();
		System.out.println();

		Car car2 = new Car(); //소나타
		car2.model = "소나타";
		car2.color = "white";
		car2.price = 3000000;
		car2.info();
		System.out.println();

		Car car3 = new Car("그랜저","black",200);
		car3.info();
		
	}

}
