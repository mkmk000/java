package co.edu.company;

public class Employee {

	// Manager, Programmer -> Employee를 상속 받고, getSalary를 오버라이드
	// Manager -> baseSalary + 1000000
	// Programmer -> baseSalary + 2000000

	// 필드
	public int baseSalary = 300000;

	int getSalary() {
		return baseSalary;
	}
	
	// 생성자
	
	
	
}
