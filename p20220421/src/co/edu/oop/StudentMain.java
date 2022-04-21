package co.edu.oop;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		// 학생 1명 관리 프로그램
		// 학생 정보 : 학번, 이름, 국어, 수학, 영어
		// 기본 생성자를 통해 인스턴스 만들고, 인스턴스에 데이터 입력
		// 1. 학생의 기본 정보 출력(학번, 이름, 국어, 수학, 영어)
		// 2. 학생의 점수 평균 출력(국어, 수학, 영어에 대한 평균)

//		//필드
//		int no;
//		String name;
//		int kor;
//		int math;
//		int eng;
//		
//		//생성자
//		public Student(int no, String name, int kor, int math, int eng) {
//			this.no = no;
//			this.name = name;
//			this.kor = kor;
//			this.math = math;
//			this.eng = eng;
//		}
//		
//		//메소드
//		void info() {
//			System.out.println("학번 : " + no);
//			System.out.println("이름 : " + name);
//			System.out.println("국어 점수 : " + kor);
//			System.out.println("수학 점수 : " + math);
//			System.out.println("영어 점수 : " + eng);
//		}

		Student st = new Student();
		st.no = 123452;
		st.name = "김이박";
		st.kor = 90;
		st.math = 88;
		st.eng = 95;
		st.info(); //메소드

		
	}

}
