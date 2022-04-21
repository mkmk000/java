package co.edu.oop;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {

		//스캐너를 사용하여 데이터 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 번호 입력>");
		int orderNum = Integer.parseInt(sc.nextLine());
		
		System.out.println("주문자 아이디 입력>");
		String id = sc.nextLine();
		
		System.out.println("주문자 이름 입력>");
		String name = sc.nextLine();
		
		System.out.println("상품 번호 입력>");
		int prNum = Integer.parseInt(sc.nextLine());
		
		System.out.println("주소 입력>");
		String address = sc.nextLine();		
		
		ShoppingMall sm = new ShoppingMall(orderNum, id, name, prNum, address);
		sm.info();
		
	}

}
