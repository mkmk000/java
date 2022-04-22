package homework;

public class Student {

	// 학생 관리 프로그램 구현.
	// 관리 해야 할 학생 수 입력 후 학생 수만큼 정보 입력.
	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
	// 학생 번호 입력 시, 학생의 기본 정보 및 평균 출력.
	// getter, setter 사용해서 데이터 저장

	// 추가 문제, 학생 번호 입력시, 추가적으로 평균으로 등수 출력 기능.
	// 조건 1) class를 이용하여 학생을 등록.
	// 조건 2) class에서 학생의 기본 정보 및 평균을 출력하는 메소드 사용.

	// 필드
	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
	private int student; //학생수
	private int studentNo; //학번
	private String studentName; //이름
	private int kor; //국어점수
	private int eng; //영어점수
	private int math; //수학점수
	

	// 생성자
	public Student() {
	}

	// 메소드
	public int getStudent() {
		return student;
	}
	public void setStudent(int Student) { //set(setter) -> 데이터를 넣어줌
		this.student = student;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int StudentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String StudentName) {
		this.studentName = studentName;
	}
	public int getkor() {
		return kor;
	}
	public void setkor(int kor) {
		this.kor = kor;
	}
	public int geteng() {
		return eng;
	}
	public void seteng() {
		this.eng = eng;
	}
	public int getmath() {
		return math;
	}
	public void setmath() {
		this.math = math;
	}
	
	
	
}
