package ch10;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	} 
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe(); // 하위클래스에서 재정의가 필요함(필수), 재정의 안하면 오류남
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // 구현부가 없는 메서드 -> 하위클래스에서 재정의해서 필요할때 사용
	
	final public void run() { //변하면 안되는 순서
		startCar();
		drive();
		wipe();
		stop();
		turnOff();
		washCar();
	}

}
