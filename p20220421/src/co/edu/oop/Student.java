package co.edu.oop;

public class Student {
	
	//학생 1명 관리 프로그램
	//학생 정보 : 학번, 이름, 국어, 수학, 영어
	//기본 생성자를 통해 인스턴스 만들고, 인스턴스에 데이터 입력
	//1. 학생의 기본 정보 출력(학번, 이름, 국어, 수학, 영어)
	//2. 학생의 점수 평균 출력(국어, 수학, 영어에 대한 평균)
	
	//필드
	int no;
	String name;
	int kor;
	int math;
	int eng;
	
	//생성자
	public Student() {
		
	}

	//메소드
	void info() {
		System.out.println("학번 : " + this.no);
		System.out.println("이름 : " + this.name);
		System.out.println("국어 점수 : " + this.kor);
		System.out.println("수학 점수 : " + this.math);
		System.out.println("영어 점수 : " + this.eng);
		System.out.printf("평균 점수 : %.2f\n", (kor+math+eng)/3.0);
	}
	
	

}
