package co.edu.quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // scanner 뒤에 sc는 변수를 의미

		int com = (int) (Math.random() * 3);
		System.out.println("숫자를 입력하세요.");
		int user = sc.nextInt();

		switch (com) {
		case 0:
			if (com == 0) {
				System.out.println("무승부");
				break;
			} else if (com == 1) {
				System.out.println("승리");
				break;
			} else if (com == 2) {
				System.out.println("패배");
				break;
			}
		case 1:
			if (com == 0) {
				System.out.println("패배");
				break;
			} else if (com == 1) {
				System.out.println("무승부");
				break;
			} else if (com == 2) {
				System.out.println("승리");
				break;
			}
		case 2:
			if (com == 0) {
				System.out.println("승리");
				break;
			} else if (com == 1) {
				System.out.println("패배");
				break;
			} else if (com == 2) {
				System.out.println("무승부");
				break;
			}

		}

	}

}
