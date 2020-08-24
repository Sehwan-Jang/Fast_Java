package chapter8_abstract;

public class Avante extends Car{
	@Override
	public void turnOn() {
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	public void run() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante 시동을 끕니다.");		
	}
	
	public void washCar() {
		System.out.println("Avante는 세차까지 합니다.");
	}
}
