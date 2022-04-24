package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		/*
		String str1 = "10";
		int value1 = Integer.parseInt(str1); //String -> int 변환
		*/
		int value1 = Integer.parseInt("10"); //위와 같은 의미
		System.out.println("value1 : " + value1);
		
		double value2 = Double.parseDouble("3.14");
		System.out.println("value2 : " + value2);
		
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println("value3 : " + value3);
		
		/*
		int value4 = 10;
		String str1 = String.valueOf(value4); //int -> String 변환 (String.valueOf())
		*/
		String str1 = String.valueOf("10"); //위와 같은 의미
		System.out.println("str1 : " + str1);
		
		String str2 = String.valueOf("3.14");
		System.out.println("str2 : " + str2);
		
		String str3 = String.valueOf(true);
		System.out.println("str3 : " + str3);

	}

}
