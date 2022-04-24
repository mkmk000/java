package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//float var1 = 3.14
		float var2 = 3.14f; //f를 안 붙이면 컴파일 에러 발생
		double var3 = 3.14; //실수리터럴은 기본적으로 double 타입으로 인식
		System.out.println(var2);
		System.out.println(var3);
		
		float var4 = 0.1234567890123456789f; //아무리 숫자가 커도 소숫점 이하 7자리까지만 출력, 마지막 숫자는 반올림되어서 출력
		System.out.println(var4);
		double var5 = 0.1234567890123456789;
		System.out.println(var5); //마지막 숫자는 반올림되어서 출력
		
		double var6 = 3e6; //e 또는 E는 10진수 실수로 인식 -> 3*10에6승
		System.out.println(var6);
		float var7 = 3e6f;
		System.out.println(var7);
		double var8 = 2e-3; //2*10에-3승
		System.out.println(var8);
	}

}
