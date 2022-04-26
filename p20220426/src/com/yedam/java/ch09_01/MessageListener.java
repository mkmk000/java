package com.yedam.java.ch09_01;

import com.yedam.java.ch09_01.Button.OnClickListener; //OnClickListener가 정확하게 뭔지 알려주기위해 사용

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
