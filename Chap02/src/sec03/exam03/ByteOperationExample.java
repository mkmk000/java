package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		
		byte result1 = 10 + 20; //컴파일러에서 변수타입에 맞게 연산되기 때문에 byte를 써도 오류가 안남
		
		
		byte x = 10;
		byte y = 20;
		int result2 = x+y; //변수를 선언하게 되면 타입이 변환되기 때문에 int를 써야함
		
		byte x2 = 30;
		long y2 = 40;
		//int result = x2 + y2; //피연산자 중 하나라도 long타입이 있다면 무조건 long으로 인식
		long result3 = x2 + y2;
		
		System.out.println(result2);
		System.out.println(result3);
		
		

	}

}
