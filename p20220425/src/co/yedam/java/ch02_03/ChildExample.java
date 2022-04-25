package co.yedam.java.ch02_03;

public class ChildExample {

	public static void main(String[] args) {

		//자동타입변환
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		
//		 parent.field2 = "data2"; //parent에 정의되어 있지 않기 때문에 오류발생
//		 parent.method3();
		 
		//child로 강제타입변환
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();

	}

}
