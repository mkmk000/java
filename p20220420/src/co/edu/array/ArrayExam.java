package co.edu.array;

import java.util.Scanner;  //ctrl + shift + O

public class ArrayExam {

	public static void main(String[] args) {

		// 배열 : 같은 데이터 타입을 연속된 공간에 저장.
		int[] ary = new int[5]; // int타입(정수)의 배열을 만들고, 5개의 데이터를 넣을 수 있는 공간(0,1,2,3,4)

		// 데이터 저장 방법 1
		ary[0] = 1; // 첫번째는 0부터 시작
		ary[1] = 2;
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;

		// 데이터 저장 방법 2
		int[] ary1 = { 1, 2, 3, 4, 5 }; // int타입(정수)의 배열을 만들고, 배열에 데이터를 바로 넣어주는 방법

		
		// 1. 배열을 만들고 Scanner를 통해 데이터를 넣는 프로그램
		Scanner sc = new Scanner(System.in);

		int[] ary2 = new int[5]; // 공간 5개인 정수형 타입 배열 생성
		/*
		 * for (int i = 0; i < ary2.length; i++) { // 반복문을 이용해 배열에 데이터 저장, length(공간이
		 * 몇개인지 알려줌) System.out.println("데이터를 입력하세요."); ary2[i] = sc.nextInt(); //
		 * ary2[0] = sc.nextInt();, ary2[1] = sc.nextInt(); 와 같은 수식, 각 배열 첫번째에서 다섯번째까지의
		 * // 데이터를 넣는 구문 System.out.println(ary2[i]); // 각 배열의 데이터 출력 }
		 */
		
		for(int i=0; i<ary2.length; i++) {
			System.out.println("점수를 입력하세요.");
			ary2[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<ary2.length; i++) {
			sum += ary2[i]; //sum = sum + ary2[i]
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double)(sum/ary2.length)); //double -> 강제타입변환
		
		
		//1~100까지의 합(5050)을 구하는 방법
		int[] ary3 = new int[100];
		for(int i=0; i<ary3.length; i++) {
			ary3[i] = i+1; //변수 i를 이용하여 데이터를 저장하는 방법
		}
		sum = 0; //변수 초기화(위에 sum 데이터가 들어가 있어서 0으로 초기화)
		for(int i=0; i<ary3.length; i++) {
			sum += ary3[i]; //sum에 배열 0~99까지의 데이터 누적
		}
		System.out.println(sum);
		
		
		
		//100번째 배열 자리에 1~99까지 더한 값(4950)을 저장
		//일반적인 숫자 기준 1~10 = 10개
		//배열 기준 0~9 = 10개
		//int[] ary = new int[100];, 0~99 = 100개
		sum = 0;
		for(int i=0; i<ary3.length; i++) {
			if(i == 99) {  //100번째 자리에 99를 넣어주기위해 조건 추가
				ary3[i] = sum;
				break;
			}
			sum += ary3[i];
		}
		System.out.println(ary3[99]);
		
		
		
		

	}

}
