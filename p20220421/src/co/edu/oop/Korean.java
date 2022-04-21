package co.edu.oop;

public class Korean {

	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	//생성자의 오버로딩
	public Korean(String n, String s) {
		this.name = n;  //this = 클래스 내에 선언된 필드를 콕 집어서 사용하겠다는 뜻
		this.ssn = s;
	}
	public Korean(String n, String s, String p) {
		this.nation = n;
		this.name = s;
		this.ssn = p;
	}
	
	//메소드의 오버로딩
	void getInfo() { //void = 리턴이 필요없음
		System.out.println("국적 : " + nation); //nation = this.nation 둘 다 사용가능
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
	}
	
}
