package co.yedam.java.ch02_02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //Vehicle vehicle 자동타입변환, 버스가 달립니다.
		driver.drive(taxi); //Vehicle vehicle 자동타입변환, 택시가 달립니다.
	}

	//우선순위 : 1 자식클래스, 2 부모클래스
}
