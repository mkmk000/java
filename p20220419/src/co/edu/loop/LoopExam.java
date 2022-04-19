package co.edu.loop;

public class LoopExam {

	public static void main(String[] args) {

		int sum = 0;
		sum = +1;
		sum = +2;
		sum = +3;
		sum = +4;
		sum = +5;
		System.out.println("1~5의 합 : " + sum);

		// 1~5의 합을 계산하는 프로그램
		for (int i = 1; i <= 5; i++) {
			// 첫번째 sum = 0, sum = sum + i;
			// 1) i=1, 0 = 0 + 1; -> sum = 1;
			// 2) i=2, 1 = 1 + 2; -> sum = 3;
			// 3) i=3, 3 = 3 + 3; -> sum = 6;
			// 4) i=4, 6 = 6 + 4; -> sum = 10;
			// 5) i=5, 10 = 10 + 5; -> sum = 15;
			sum += i; // sum = sum + i; 동일 수식
		}

		// 구구단 2단 만들기
		// 2*1, 2*2, 2*3... 2*9
		for (int i = 1; i <= 9; i++) {
			System.out.println("2단 : 2 * " + i + " = " + (2 * i));
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // % = 나머지 계산, 3의 배수를 구하는 방법
				System.out.println("3의 배수 : " + i);
			}
			if (i % 2 == 0) {
				System.out.println("2의 배수 : " + i);
			}
			if (i % 2 == 1) {
				System.out.println("홀수 : " + i);
			} else if (i % 2 == 0) {
				System.out.println("짝수 : " + i);
			}
		}

		// 구구단 만들기
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}

		// *
		// **
		// ***
		// ****
		// *****
		// i<=5
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // ln이 붙으면 줄바꿈
			}
			System.out.println();
		}

		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		
		
		
	}
}
