package co.yedam.java.ch03_01;

public class PhoneExample {

	public static void main(String[] args) {
		
		//Phone phone = new SmartPhone("홍길동"); //public SmartPhone(String owner)
		
		SmartPhone phone = new SmartPhone("홍길동");
		phone.turnOn(); //phone의 메소드
		phone.internetSearch(); //smartphone의 메소드
		phone.turnOff(); //phone의 메소드
		

	}

}
