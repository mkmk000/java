package co.yedam.java.ch08_01;

public interface RemoteControl {
	
	//상수 필드(static final)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; //public static final int MIN_VOLUME = 0; 과 동일
	
	//추상 메서드
	public abstract void turnOn();
	void turnOff(); //public abstract void turnOff(); 와 동일
	public void setVolume(int volume);
	
}
