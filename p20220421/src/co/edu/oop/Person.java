package co.edu.oop;

public class Person {

	// Person 클래스 선언

//	1) 필드
//	-주민번호
//	-이름
//	-주소
//	-나이
//	2) 생성자
//	-기본 생성자(필드 초기화x)
//	-주민번호, 이름, 주소, 나이를 매개변수로 필드 초기화
//	3) 메소드
//	-introduce -> "Person[name : John, age : 20]"
//
//	Main 클래스에서 임의의 3명에 대한 객체를 만들고 메소드 introduce 호출하여 정보출력

	// 필드
	String no;
	String name;
	String addr;
	int age;

	// 생성자
	public Person(String no, String name, String addr, int age) {
		this.no = no;
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	// 메소드
	void info() {
		System.out.println("[주민번호 : " + no + "이름 : "+ name + "주소 : " + addr + "나이 : " + age);
	}

}
