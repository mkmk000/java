package Question1;

public class EmployeeMain {

	public static void main(String[] args) {
		
//	3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//	- 출력결과
//	이름:이지나  연봉:3000  부서:교육부
//	수퍼클래스
//	서브클래스

		EmpDept empdept = new EmpDept("이지나", 3000, "교육부");
		empdept.getInformation();
		empdept.print();
		
		
	}

}
