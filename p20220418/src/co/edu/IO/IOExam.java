package co.edu.IO;

import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {
		
		//데이터 입력을 받기 위해 scanner 선언
		Scanner sc = new Scanner(System.in); //scanner 뒤에 sc는 변수를 의미
		
		/*
		System.out.println("스캐너 값을 입력하세요.");
		String str = sc.nextLine();
		System.out.println("입력값 : " + str);
		*/
		
		
		//while = 반복문(중괄호 사이에서 계속 반복됨)
		while(true) {
			System.out.println("스캐너 값을 입력하세요.");
			String str1 = sc.nextLine();
			System.out.println("입력값 : " + str1);
			if(str1.equals("q")) {    //q를 입력하면 반복문 종료
				break;
			}
	

//		System.out.print(false); //괄호 안 내용 출력
//		System.out.println(); //괄호 안 내용 출력 후 엔터(ln)
//		System.out.printf(null, args); //괄호 안의 내용을 커스텀해서 출력
		
		int value = 100;
		// \n = 줄바꿈
		
		//printf 정수
		System.out.printf("%d\n", value); //%d = 정수
		System.out.printf("%5d\n", value); //%5d = 왼쪽 빈자리 공백 (__100)
		System.out.printf("%-5d\n", value); //%-5d = 오른쪽 빈자리 공백 (100__)
		System.out.printf("%05d\n", value); //%05d = 왼쪽 빈자리 0으로 채움 (00100)
		
		
		//printf 실수
		double value2 = 12.123;
		System.out.printf("%.2f\n", value2); //소수점 아래 2개까지만 출력 (12.12)
		System.out.printf("%9.4f\n", value2);
		//총 9자리를 출력하는데 소수점 아래 4개까지만 출력, 공백이 발생할시 왼쪽을 공백으로 처리 (__12.1230)
		System.out.printf("%-9.0f\n", value2); 
		//총 9자리를 출력하는데 소수점 표시 X, 공백이 발생할시 오른쪽을 공백으로 처리 (12_______)
		
		
//		try {
//			System.out.println("값을 입력하세요.");
//			int keyCode = System.in.read();
//			System.out.println("입력값 : " + keyCode);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
		}
		
	}

}
