package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {

		//Calculator
//		Calculator cal = new Calculator();
//		cal.execute(); //power on의 기능을 가져와서 씀(전원을 켭니다.), 메소드내에서 메소드 호출
//		double avg = cal.avg(10, 2);
//		System.out.println(avg);
		
		
		//Calculator2
		Calculator2 myCalcu = new Calculator2();
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
	}

}
