package ch09;

public abstract class Computer {

	public abstract void display(); // 추상메서드 , 하위클래스에게 역할을 위임
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 종료합니다.");
	}
}
