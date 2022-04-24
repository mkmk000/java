package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {

		long var1 = 10;
		//long var2 = 20000000000; //오류뜨는이유 : 자바 컴파일러는 정수타입을 기본적으로 int타입으로 인식
		long var3 = 20000000000L; //숫자 뒤에 L 표시를 붙여주면 long 타입으로 인식해서 오류 안남
		long var4 = 20L;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
	}

}
