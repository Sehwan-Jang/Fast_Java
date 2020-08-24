package chapter8_abstract;

public abstract class Car {
	
	public abstract void turnOn();
	public abstract void run();
	public abstract void stop();
	public abstract void turnOff();
	public void washCar() {}
	
	final public void go() {
		turnOn();
		run();
		stop();
		turnOff();
		washCar();		
	}
}
