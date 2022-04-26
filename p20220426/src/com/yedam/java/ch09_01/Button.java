package com.yedam.java.ch09_01;

public class Button {
	
	OnClickListener listener; //인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) { //매개 변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //구현 객체의 onClick() 메소드 호출
	}
	
	static interface OnClickListener { //중첩 인터페이스(어떤 리스너를 받더라도 호출하는 메소드를 onClick 하나로 통일시킴)
		void onClick();
	}
	

}
