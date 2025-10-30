package Lec31;

public abstract class Fan {
	
	//abstract method
	public abstract void on();
	public abstract void off();
	public abstract void speedInc();
	public abstract void speedDec();
	
	//method
	public void display() {
		System.out.println("Fan class");
	}
}
