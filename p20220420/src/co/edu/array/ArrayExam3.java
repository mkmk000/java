package co.edu.array;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {

		// 1) 1~100까지 데이터를 넣은 배열에서 3의 배수만 출력
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[100]; // 배열은 만들되, 사이즈는 아직 미정
		System.out.println("배열의 사이즈를 입력하세요.");
		int num = sc.nextInt(); // 배열 사이즈 입력
		
		/*
		 * for (int i = 1; i <= ary.length; i++){
		 * ary[i-1] = i; }    i를 1로 지정했을때 -1이 없으면 101(1~100까지만 인식)로 인식하여 오류 발생
		 */
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i + 1; // 1부터 배열의 크기만큼 데이터 입력
		}
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] % 3 == 0) {
				System.out.println("3의 배수 : " + ary[i]);
			}
		}

		
		// 2) 1~100까지 데이터를 넣은 배열에서 짝수만 출력
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i + 1; // 1부터 배열의 크기만큼 데이터 입력
		}
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] % 2 == 0) {
				System.out.println("짝수 데이터 : " + ary[i]);
			}
		}
		
		
		
		
	}
}
