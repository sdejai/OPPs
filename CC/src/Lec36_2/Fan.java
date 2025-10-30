package Lec36_2;

public abstract class Fan {
	
	String brandName;
	
	public Fan() {
		System.out.println("Fan const");
	}

	public abstract void  on();

	public abstract void off();

	public abstract void speedInc();

	public abstract void speedDre();
	
	public void airThrought() {
		System.out.println("Air");
	}
}
