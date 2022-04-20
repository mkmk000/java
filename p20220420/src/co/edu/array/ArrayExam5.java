package co.edu.array;

import java.util.Scanner;

public class ArrayExam5 {

	public static void main(String[] args) {

//		//참조 타입(String) 배열 생성
//		String[] strAry = {"김","이","박","최"}; //double로도 가능
//		
//		//향상된 for문을 이용하여 각각의 배열 요소 출력
//		for(String name : strAry) {
//			System.out.println(name);
//		}

		// 학생 수와 학생들의 점수를 받아서 최고 점수 및 평균 점수 구하기
		boolean run = true; // 반복문을 돌리기 위함
		int studentNum = 0; // 배열 크기 설정
		int[] scores = null; // 배열 데이터 입력
		Scanner sc = new Scanner(System.in);

		while (run) { // 반복문
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
		}

		int selectNo = Integer.parseInt(sc.nextLine()); // 문자열을 숫자(정수)로 변환

		// switch문으로도 가능
		if (selectNo == 1) {
			System.out.println("학생수> ");
			studentNum = sc.nextInt();
			scores = new int[studentNum];
			sc.nextLine();

		} else if (selectNo == 2) {
			for (int i = 0; i < scores.length; i++) {
				System.out.println("scores[" + i + "]>");
				scores[i] = sc.nextInt();
			}
			sc.nextLine();
		} else if (selectNo == 3) {
			for (int i = 0; i < scores.length; i++) {
				System.out.println("scores[" + i + "]>" + scores[i]);
			}
		} else if (selectNo == 4) {
			int sum = 0;
			int max = 0;
			for (int i = 0; i < scores.length; i++) {
				max = max < scores[i] ? scores[i] : max;

				if (max < scores[i]) {
					max = scores[i];
				}
				sum += scores[i];
			}
			System.out.println("최고 점수 : " + max);
			System.out.printf("평균 점수 : %.2f\n", (double) sum / scores.length);
		} else if (selectNo == 5) {
			run = false;
		}

		
	}

}
