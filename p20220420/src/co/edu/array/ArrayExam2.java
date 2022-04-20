package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {

		int[] ary1 = { 5, 10, 4, 7, 8 };
		int max = 0; // 최대값 변수
		int min = ary1[0]; // 최소값 변수, 0=첫번째 데이터 5

		for (int i=0; i<ary1.length; i++) {

			// 최대값 구하기
			if (max < ary1[i]) {
				max = ary1[i];
			}
			// 최소값 구하기
			if (min > ary1[i]) {
				min = ary1[i];
			}
		}
		System.out.println("최대값" + max);
		System.out.println("최소값" + min);

		Scanner sc = new Scanner(System.in);
		int[] ary2 = null; // 배열은 만들되, 사이즈는 아직 미정
		System.out.println("배열의 사이즈를 입력하세요.");
		int num = sc.nextInt(); // 배열 사이즈 입력
		ary2 = new int[num]; // 배열 사이즈 입력값으로 배열 크기 설정

		/*
		 * for(int i=0; i<ary2.length; i++) { ary2[i] = i+1; //1부터 배열의 크기만큼 데이터 입력 }
		 * for(int i=0; i<ary2.length; i++) { if(ary2[i] % 2 == 0) { //2의 배수 구하기(2로 나눴을때
		 * 0이 나오는 값) System.out.println(ary2[i]); } }
		 */

		// 홀수만 출력
		for (int i = 0; i < ary2.length; i++) {
			ary2[i] = i + 1; // 1부터 배열의 크기만큼 데이터 입력
		}
		for (int i = 0; i < ary2.length; i++) {
			if (ary2[i] % 2 == 1) { // 0 -> 짝수 출력, 1 -> 홀수 출력
				System.out.println(ary2[i]);
			}
		}

		
		int[] ary3 = new int[num];
		// ary2, ary3 2개의 배열을 만듦
		for (int i = 0; i < ary3.length; i++) { // ary3.length = num 과 동일
			ary3[i] = i;
		}
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary3.length; j++) {
				// 조건
				// ary2 의 데이터 + ary3 이 10보다 작은 데이터가 나오는 경우
				if (ary2[i] + ary3[j] < 10) {
					System.out.println("1." + ary2[i] + "2. " + ary3[j]);
				}
			}
		}

		
		
		
		
		
	}

}
