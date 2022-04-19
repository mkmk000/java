package co.edu.convert;

public class CalExam {

	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5;

		double result = intValue + doubleValue; //자동타입변환(인트보다 더블이 크기때문에 더블로 인식하여 계산)
		System.out.println(result); // ctrl + F11 = 자바 컴파일 단축키
		
		
		
		//자동타입변환 연산
		byte x = 10;
		byte y = 20;
		
		//byte result2= x+y; //오류 뜨는 이유 : x, y를 인트로 인식
		int result2 = x+y;
		
		char c = 'A'; //A = 65, B = 66
		char d = 1;
		
		int result3 = c+d;
		System.out.println("유니코드 : " + result3);
		System.out.println("출력문자 : " + (char)result3);
		
		
		//실수 타입 변환
		int i = 1;
		double result4;
		
		result4 = i/5;
		System.out.println(result4);
		
		result4 = i/5.0;
		System.out.println(result4);
		
		result4 = (double) i/5;
		System.out.println(result4);
		
		//문자열 + 연산
		
		int value = 15;
		
		//숫자 + 숫자
		System.out.println(15+3);
		
		//문자열 + 숫자
		System.out.println("문자열+숫자 : " + value+2); 
		//큰 따옴표 안에 있는건 string으로 인식해서 덧셈이 아니고 쭉 이어지는걸로 인식
		System.out.println("문자열+숫자 : " + (value+2)); 
		
		//숫자 + 문자열
		System.out.println(value+2 + "숫자+문자열");
		
		
		//문자열 -> 숫자로 타입 변환
		//(double), (int) = 숫자 연산에서만 사용
		
		String str = "1000";
		int value1 = Integer.parseInt(str); //문자열을 인트 타입으로 바꾼다는 뜻
		System.out.println(value1);
		
		String str1 = "0.3";
		double value2 = Double.parseDouble(str1);
		System.out.println(value2);
		
//		String str2 = "가나다";
//		int value3 = Integer.parseInt(str2);
//		System.out.println(value3);
		
		
		//숫자 -> 문자열로 타입 변환
		String str3 = String.valueOf(value1);
		
		
		
		
		

	}

}
