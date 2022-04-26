package com.yedam.java.ch09_02;

public class Anonymous {

	// 필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	// 로컬 변수값으로 대입
	void method1() {
		Person localVar = new Person() { //세미콜론 반드시 붙여야함
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			public void wake() {
				super.wake();
				walk();
			}
		};
		
		localVar.wake(); //로컬 변수 사용
	}
	
	void method2(Person person) { //매개 변수를 받을 메소드
		person.wake();
	}
}
