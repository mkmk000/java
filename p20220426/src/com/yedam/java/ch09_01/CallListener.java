package com.yedam.java.ch09_01;

import com.yedam.java.ch09_01.Button.OnClickListener; //OnClickListener가 정확하게 뭔지 알려주기위해 사용

//public class CallListener implements OnClickListener 
public class CallListener implements Button.OnClickListener { //위와 같은 의미인데 이게 주로 사용됨

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
