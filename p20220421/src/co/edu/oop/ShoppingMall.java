package co.edu.oop;

public class ShoppingMall {
	
//	-주문번호
//	-주문자 아이디
//	-주문자 이름
//	-주문상품번호
//	-배송 주소
	//1. 필드에 대한 정보를 출력하는 메소드
	//2. Scanner를 이용하여 데이터 받아오기
	//3. 생성자를 통한 데이터 저장

	//필드
	int orderNum;
	String id;
	String name;
	int prNum;
	String address;
	//생성자
	public ShoppingMall(int orderNum, String id, String name, int prNum , String address) { //우클릭 source -> constructor using field 에서 바로 입력가능
		this.orderNum = orderNum; //this -> orderNum 을 더 명확하게 인스턴스 필드임을 표시하기위해서 사용
		this.id = id;
		this.name = name;
		this.prNum = prNum;
		this.address = address;
	}
	//메소드
	void info() {
		System.out.println("주문번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + id);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문상품번호 : " + prNum);
		System.out.println("배송 주소 : " + address);
	}
	

}
