package co.yedam.var;

public class VariableExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011; //2진수 표현
		int var2 = 0206; //8진수 표현
		int var3 = 365; //10진수 표현
		int var4 = 0xB3; //16진수 표현
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	
		
		long longVar1 = 10;
		long longVar2 = 20L;
		//long longVar3 = 1000000000000;
		long longVar4 = 1000000000000L; //인트 타입이 아닌 long 타입 데이터로 인식하기 위해 L이 붙음
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		System.out.println(longVar4);
		
		
		char c1 = 'A'; //문자
		String str = "AB"; //문자열
		char c2 = 65; //10진수로 저장
		char c3 = 44032; //10진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
		
		
		//\t => tab키(띄어쓰기)
		System.out.println("번호\t이름\t직업");
		//\n => Enter키(줄바꿈)
		System.out.println("행 단위 출력\n");
		
		
		//float floatVar1 = 3.14; (f(플롯형)가 없으면 더블형 숫자로 인식)
		float floatVar2 = 3.14f;
		
		double doubleVar1 = 0.321;
		
		float floatVar3 = 0.1234567890123456789f;
		double doubleVar2 = 0.1234567890123456789;
		
		System.out.println(floatVar3);
		System.out.println(doubleVar2);
		
		
		
		boolean stop = true;
		boolean state = false;
		
		if(state) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		
		
	
		
	}

}
