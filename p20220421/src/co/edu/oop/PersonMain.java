package co.edu.oop;

public class PersonMain {

	public static void main(String[] args) {

		
		//주민번호, 이름, 주소, 나이
		Person ps = new Person("012345-278910","김자바","대구",20);
		ps.info();
		System.out.println();
		Person ps1 = new Person("980202-123456","이자바","서울",26);
		ps.info();
		System.out.println();
		Person ps2 = new Person("017898-288790","박자바","부산",17);
		ps.info();
		
		
	}

}
