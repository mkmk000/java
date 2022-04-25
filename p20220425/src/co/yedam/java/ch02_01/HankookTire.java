package co.yedam.java.ch02_01;

//자식클래스
public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //super => 타이어의 생성자를 불러옴
	}
	
	@Override //오버라이딩 => 메소드 시그니처가 똑같다는 뜻, 수정 가능
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}
	
	

}
