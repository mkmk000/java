package co.yedam.java.ch02_03;

public class InstanceOfExample {

	public static void method1(Parent parent) {
		if (parent instanceof Child) { //Child 타입으로 변환이 되는지 확인
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지않음");
		}
	}

	public static void method2(Parent parent) { //instanceof로 안전하게 확인
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);

	}

}