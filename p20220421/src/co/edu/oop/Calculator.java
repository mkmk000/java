package co.edu.oop;

public class Calculator {
	
	//필드
	
	//생성자
	
	//메소드
	void execute() { //메소드 내부에 호출
		powerOn();
	}
	
	double avg(int x, int y) {
		int sum = plus(x, y);
		double result = (double) sum/2;
		return result;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	int plus(int x, int y) { //매개변수 = 선언된 데이터 타입(x=3,y=2)
		int result = x+y;
		return result; //return = 결과에 대한 내용을 반환해줌
		
	}
	int minus(int x, int y) {
		int result = x-y;
		return result;
	}

}
