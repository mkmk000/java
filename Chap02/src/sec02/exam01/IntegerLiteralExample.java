package sec02.exam01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011; //2진수(0b 또는 0B로 시작), 끝에서부터 1 : 1*2에0승 = 1, 1 : 1*2에1승 = 2, 0 : 0*2에2승 = 0, 1 : 1*2에3승 = 8 
		System.out.println("var1 : " + var1);
		
		int var2 = 013; //8진수(0으로 시작하고 0~7 숫자로 구성), 끝에서부터 3 : 3*8에0승 = 3, 1 : 1*8에1승 = 8
		System.out.println("var2 : " + var2);
		
		int var3 = 11; //10진수(소숫점이 없는 0~9로 구성)
		System.out.println("var3 : " + var3);
		
		int var4 = 0xB3; //16진수(0x 또는 0X로 시작, abcdef도 숫자로 인식 a:10부터 시작, 끝에서부터 3 : 3*16에0승 = 3, B : B(11)*16에1승 = 176
		System.out.println("var4 : " + var4);
	}

}
