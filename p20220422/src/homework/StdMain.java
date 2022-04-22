package homework;

import java.util.Scanner;

public class StdMain {

	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
//		int student; //학생수
//		int studentNo; //학번
//		String studentName; //이름
//		int kor; //국어점수
//		int eng; //영어점수
//		int math; //수학점수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		int menu = 0; // 학생 정보 : 학번, 이름, 국어, 수학, 영어
		int std = 0; // 학생수
		int kor = 0; // 국어점수
		int eng = 0; // 영어점수
		int math = 0; // 수학점수

		while (true) {
			System.out.println("===========================================================");
			System.out.println("1.학생수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("===========================================================");
			System.out.println("선택>");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("학생수>");
				std = Integer.parseInt(sc.nextLine());
				st.setStudent(std);
			} else if (menu == 2) {
				System.out.println("학번>");
				int studentNo = Integer.parseInt(sc.nextLine());
				System.out.println("이름>");
				String studentName = sc.nextLine();
				System.out.println("국어 점수>");
				int kor1 = Integer.parseInt(sc.nextLine());
				System.out.println("영어 점수>");
				int eng1 = Integer.parseInt(sc.nextLine());
				System.out.println("수학 점수>");
				int math1 = Integer.parseInt(sc.nextLine());
				System.out.printf("평균 점수 : %.2f\n", (kor1+math1+eng1)/3.0);
			}
				

		}

	}
}
