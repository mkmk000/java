package co.edu.member;

public class PizzaMain {

	public static void main(String[] args) {

		//인스턴스화 3개(p1, p2, p3)
		Pizza p1 = new Pizza("Super Suprme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		int sales = Pizza.count; //static 필드 호출
		System.out.println("판매된 피자 갯수 : " + sales);
	}

}
