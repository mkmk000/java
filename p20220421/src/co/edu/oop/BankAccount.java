package co.edu.oop;

public class BankAccount {
	
//	은행 계좌(BankAccount)
//	//계좌번호, 예금주, 잔액
//	//매개 변수 3개(계좌번호, 예금주, 잔액)를 가지는 생성자
//	//메소드
//	1. 예금을 할 수 있는 메소드
//	2. 출금을 할 수 있는 메소드
//	3. 현재 잔액을 확인할 수 있는 메소드
//
//	Main Class
//	-인스턴스는 1개만 생성하고 인자 3개를 가지도록 생성
//	-Scanner 사용
//
//	-반복문을 이용하여 1. 예금, 2.출금, 3.잔액 확인, 4.종료
	
	//필드
	String accountNo; //계좌
	String name; //예금주
	int balance; //잔액
	
	//생성자
	public BankAccount(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	//메소드
	void deposit(int money) { //deposit = 예금
		this.balance += money; //입금된다는 뜻
		System.out.println("계좌번호>" + this.accountNo);
		System.out.println("예금주>" + this.name);
		System.out.println("예금 후 잔액>" + this.balance);
	}
	void withDraw(int money) { //withdraw = 출금
		this.balance -= money; //출금된다는 뜻
		System.out.println("계좌번호>" + this.accountNo);
		System.out.println("예금주>" + this.name);
		System.out.println("출금 후 잔액>" + this.balance);
	}
	int nowMoney() { //남은 금액(잔액)
		return balance;
	}
	
	
	

}
