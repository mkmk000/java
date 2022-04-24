package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {

		char c1 = 'A'; //큰따옴표("A")를 붙이면 문자열로 인식
		System.out.println(c1);
		char c2 = 65;
		System.out.println(c2);
		char c3 = '\u0041'; // \ -> 이스케이프 문자
		System.out.println(c3);
		char c4 = '가';
		System.out.println(c4);
		char c5 = 44032;
		System.out.println(c5);
		char c6 = '\uac00';
		System.out.println(c6);
		
	}

}
