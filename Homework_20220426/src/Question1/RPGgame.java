package Question1;

import java.util.Scanner;

public class RPGgame implements Keypad {

	Scanner sc = new Scanner(System.in);

//	2) RPGgame 클래스를 정의한다.
//	- Keypad를 구현하는 클래스.
//	- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "RPGgame 실행"을 출력한다.
//	( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
//	- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
//   (1) public abstract void leftUpButton() : "캐릭터가 위쪽으로 이동한다"를 출력한다.
//   (2) public abstract void leftDownButton() : "캐릭터가 아래쪽으로 이동한다"를 출력한다.
//   (3) public abstract void rightUpButton()
//	- NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
//	- HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
//   (4) public abstract void rightDownButton()
//	- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
//	- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
//   (5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)

	// 필드
	private int mode;
	int num = sc.nextInt();
	
	// 생성자
	public void run(String run) {

	}

	// 추상메소드
	RPGgame rg = new RPGgame(); {
		
	};
	
	public void run() {
		System.out.println("RPGgame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (num == 0) {
			System.out.println("NORMAL_MODE : 캐릭터가 한칸단위로 점프한다.");
		} else if (num == 1) {
			System.out.println("HARD_MODE : 캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if (num == 0) {
			System.out.println("NORMAL_MODE : 캐릭터가 일반 공격.");
		} else if (num == 1) {
			System.out.println("HARD_MODE : 캐릭터가 HIT 공격.");
		}
	}

	boolean run;

	@Override
	public void changeMode() {
		run = true;
		System.out.println("HARD_MODE");
		run = false;
		System.out.println("NORMAL_MODE");

	}

}
