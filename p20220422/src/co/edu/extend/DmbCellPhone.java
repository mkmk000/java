package co.edu.extend;

//자식 클래스
public class DmbCellPhone extends CellPhone { //자식클래스(DmbCellPhone)에서 부모클래스(CellPhone)의 기능을 사용가능
	
	//필드
	public int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); //부모클래스에서 생성자가 발생했기 때문에 사용(부모의 기본 생성자 호출)
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "Dmb 시작");
		super.powerOn(); //상속받은 메소드도 사용가능
	}
	void turnOffDmb() {
		System.out.println("Dmb 종료");
	}
	
	
	//메소드 재정의(오버라이딩 Overriding)
	@Override //어노테이션
	void powerOn() {
		System.out.println("자식 클래스에서 전원을 켭니다.");
	}
	
	
	
	
	
	
}
