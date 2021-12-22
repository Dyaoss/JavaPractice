package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 스스로 정지합니다.");
	}

	@Override
	public void wipe() {
		System.out.println("자동차가 비를 감지하고 와이펴를 켭니다.");		
	}

	@Override
	public void washCar() {
		super.washCar();
		System.out.println("자동세차를 시작합니다.");
	}

}
