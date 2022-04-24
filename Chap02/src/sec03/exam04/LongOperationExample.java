package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long result = value1 + value2 + value3; //long타입 변수가 있기 때문에 long으로 출력
		System.out.println(result);

	}

}
