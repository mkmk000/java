package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //둘 다 int 타입으로 변환되기 때문에 int를 써야함
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A'; //유니코드 65
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2; //둘 다 int 타입으로 변환되기 때문에 int를 써야함
		System.out.println("유니코드 : " + intValue2);
		//문자로 출력하고 싶을때 char타입으로 강제변환
		System.out.println("출력문자 : " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; //수학에서는 10/4 = 2.5
		System.out.println(intValue4);
		
		double doubleValue = intValue3 / 4.0; //실수로 변환하면 10.0/4.0 = 2.5가 나옴
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x/y; //double로 강제변환 1.0/2.0 = 0.5
		System.out.println(result);
		
	}

}
