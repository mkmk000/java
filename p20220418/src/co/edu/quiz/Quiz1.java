package co.edu.quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //scanner 뒤에 sc는 변수를 의미
		
		System.out.println("값을 입력하세요.");
		double F = sc.nextDouble();  //F = 화씨, C = 섭씨
		double C = (double)5/9*(F-32);
		System.out.println(C);
		
		
	}

}
