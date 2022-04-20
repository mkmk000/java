package co.edu.oop;

public class Student {
	
	//필드 -> 정보를 담아두는 곳
	String name;
	int age;
	int kor;
	int eng;
	int math;
	
	//생성자(필수) -> 객채를 만들기 위해서 필요한 구문, 클래스 이름과 동일
	public Student() {
		
	}
	
	//메소드(함수, 기능) -> 이 설계도에서 사용되는 기능
	void getinfo() {
		System.out.println("학생의 이름 : " + name + "\n 나이 : " + age);		
	}

}
