package co.edu.exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

//		1. 섭씨, 화씨 -> c = 5/9(F-32)
//		scanner -> 화씨 데이터를 받고, 화씨 -> 섭씨 변환 프로그램
		
		Scanner sc = new Scanner(System.in); //데이터 받을 준비
		System.out.println("화씨를 입력하세요."); //어떤 데이터를 받을지
		int c_temp = sc.nextInt(); //인트 타입으로 스캐너를 받겠다는 뜻
		System.out.printf("%.2f/n", 5/9.0*(c_temp-32)); //받은 변수를 계산식에 넣어서 바로 계산
		
		
		
//		2. 가위바위보(반복문 X)
//		scanner random
//		가위(0), 바위(1), 보(2) 게임
//		컴퓨터와 가위바위보해서 승리/패배 출력
		
		System.out.println("가위(0) 바위(1) 보(2)");
		int user = sc.nextInt();
		int random = (int)(Math.random()*3); //0, 1, 2
		
		switch (user) {
		case 0: //가위
			if (random == 1) {
				System.out.println("패배");
			} else if (random == 2) {
				System.out.println("승리");
			} else {
				System.out.println("무승부");
			}
			break;
		case 1: //바위
			if (random == 1) {
				System.out.println("무승부");
			} else if (random == 2) {
				System.out.println("패배");
			} else {
				System.out.println("승리");
			}
			break;
	    case 2: //보
		    if (random == 1) {
			    System.out.println("승리");
		    } else if (random == 2) {
			    System.out.println("무승부");
		    } else {
			    System.out.println("패배");
		    }
		    break;
	     }
		
		
		
//		3. 학점관리 프로그램 - switch문만 사용해서 출력
//		scanner -> data
//		100~90 : A
//		89~80 : B
//		79~70 : C
		
		System.out.println("점수를 입력하세요.");
		int point = sc.nextInt();
		if(point / 10 > 10); {  //100보다 큰 숫자가 들어올때 10으로 처리
			point = 10;	
		//100~90, 89~80, 79~70
		switch(point) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		}
		
		
	}
	}
}
