package co.edu.getset;

public class Car {
	
	//필드
	private String company;
	private String model;
	private String color;
	private int speed;
	
	
	//생성자
	
	
	//메소드(우클릭 -> source -> getter and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) { //set(setter) -> 데이터를 넣어줌
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() { //get(getter) -> 데이터 가공 후 전달
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed*2; //속도 mile(미국단위) -> km로 변환
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			speed = 0;
		}
		this.speed = speed; //속도는 마이너스가 없기때문에 데이터 입력
	}

}
