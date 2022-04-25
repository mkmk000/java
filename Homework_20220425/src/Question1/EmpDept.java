package Question1;

public class EmpDept extends Employee {

//	2) EmpDept 클래스를 정의한다.
//	- Employee 클래스를 상속한다.
//	- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 추가된 필드의 getter를 정의한다.
//	- Employee 클래스의 메소드를 오버라이딩한다.
//	(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
//	(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능

	// 필드
	String EmpDept; // 부서명
	String Name; //이름
	int Salary; //연봉
	
	// 생성자
	public EmpDept(String name, int salary, String empDept) {
		super(name, salary);
		EmpDept = empDept;
		Name = name;
		Salary = salary;
	}
	
	// 메소드
	@Override
	public String getName() {
		return Name;
	}
	@Override
	public void setName(String Name) {
		this.Name = Name;
	}
	@Override
	public int getSalary() {
		return Salary;
	}
	@Override
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpDept(String EmpDept) {
		this.EmpDept = EmpDept;
	}
	@Override
	public void getInformation() {
		System.out.println("이름:" + Name + "  연봉:" + Salary + "  부서명:" + EmpDept);
	}
	@Override
	public void print() {
		System.out.println("수퍼클래스" + "\n서브클래스");
	}

	
	}
