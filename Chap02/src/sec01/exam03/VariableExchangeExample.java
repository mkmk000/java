package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y :" + y);
		
		
		int temp = x; //x=3의 값을 temp에 저장, temp = 3
		x = y; //y=5의 값을 x에 저장, x = 5
		y = temp; //temp=3의 값을 y에 저장, y=3
		
		System.out.println("x : " + x + ", y : " + y);
	}

}
