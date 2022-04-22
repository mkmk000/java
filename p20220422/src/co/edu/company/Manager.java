package co.edu.company;

public class Manager extends Employee {

	// Manager, Programmer -> Employee를 상속 받고, getSalary를 오버라이드
	// Manager -> baseSalary + 1000000
	// Programmer -> baseSalary + 2000000

	@Override
	int getSalary() {
		return baseSalary + 1000000;
	}
}

