package co.edu.quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		// 학점 측정 프로그램
//		int grade;
//
//		System.out.println("성적을 입력하세요.");
//
//		grade = Integer.parseInt(sc.nextLine()); // 예시)문자열 : "85" -> int = 85
//
//		if (grade >= 90) {
//			System.out.println("A학점");
//		} else if (grade >= 80) {
//			System.out.println("B학점");
//		} else if (grade >= 70) {
//			System.out.println("C학점");
//		} else if (grade >= 60) {
//			System.out.println("D학점");
//		} else {
//			System.out.println("F학점, 공부하세요.");
//		}

		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요.");
		int grade = sc.nextInt();
		int grade1 = grade/10;
		
		switch(grade1) {
		case 7:
		    System.out.println("C");
		    break;
		case 8:
		    System.out.println("B");
		    break;
		case 9:
			System.out.println("A");
			break;
		case 10:
		    System.out.println("A");
		    break;
		
		
		}
		
	
		}

}
