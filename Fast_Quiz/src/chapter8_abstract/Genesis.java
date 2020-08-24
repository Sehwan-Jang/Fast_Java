package chapter8_abstract;

public class Genesis extends Car{
	@Override
	public void turnOn() {
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	public void run() {
		System.out.println("Genesis달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Genesis 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis 시동을 끕니다.");		
	}
}
