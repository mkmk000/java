package com.yedam.java.ch08_02;

public class ImplementationC implements InterfaceC { //InterfaceC(인터페이스 a,b를 상속)

	@Override
	public void methodA() { //InterfaceA
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() { //InterfaceB
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() { //InterfaceC
		System.out.println("ImplementationC-methodC() 실행");
	}

}
