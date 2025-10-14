package Lec30;

public abstract class Fan {
	float Bldlength;
	String brand;
	String binding;
	
	//abstract methods
	public abstract void on();
	public abstract void off();
	
	//non-abstract methods
	public void speedIncr() {
		System.out.println("Press + button!");
	}
	public void speedDecr() {
		System.out.println("Press - button!");
	}
}
