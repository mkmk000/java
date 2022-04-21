package co.edu.oop;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount("123-4567-7890", "김자바", 100000); //계좌번호, 예금주, 통장기본금액
		
		int menu = 0; //1.예금 2.출금 3.잔액확인 4.종료
		int money = 0; //예금액이나 출금액 입력
		while(true) {
			System.out.println("1.예금, 2.출금, 3.잔액확인, 4.종료");
			System.out.println("선택>");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				System.out.println("예금액>");
				money = Integer.parseInt(sc.nextLine());
				ba.deposit(money);
			} else if(menu==2) {
				System.out.println("출금액>");
				money = Integer.parseInt(sc.nextLine());
				ba.withDraw(money);
			} else if(menu==3) {
				System.out.println("잔액>");
				System.out.println(ba.nowMoney()+"원 입니다.");
			} else if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
	}

}
