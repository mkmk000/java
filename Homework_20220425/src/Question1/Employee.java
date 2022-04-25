package Question1;

public class Employee {
	
//	1) Employee 클래스를 정의한다.
//    - 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//    - 각 필드의 getter만 존재한다.
//    - 메소드는 다음과 같이 정의한다.
//    (1) public void getInformation() : 이름과 연봉을 출력하는 기능
//    (2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
	
	//필드
	String Name; //이름
	int Salary; //연봉
	
	//생성자
	public Employee(String name, int salary) {
		Name = name;
		Salary = salary;
	}
	
	
	//메소드
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public void getInformation() {
		System.out.println("이름 : " + Name + "연봉" + Salary);
	}
	public void print() {
		System.out.println("수퍼클래스");
		return;
	}
}
