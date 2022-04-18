package co.yedam.var;

public class VariableExample2 {

	public static void main(String[] args) {
		
		//자동 타입 변환
		byte a = 10;
		int b = a;
		long c = b;
		//byte 타입은 char 타입으로 변환 불가(char는 음수를 포함하지 않기 때문)
		byte d = 10;
		//char f = d;
		
		
		
		//인트를 괄호 안에 있는 char 타입으로 강제 변환
		int intValue = 44032;
		char charValue = (char)intValue;
		//인트를 괄호 안에 있는 byte 타입으로 강제 변환
		int intValue1 = 10; //1byte 127까지 표현
		byte byteValue = (byte)intValue1;
		
		System.out.println(byteValue);
		
		
		
		
		
	}

}
