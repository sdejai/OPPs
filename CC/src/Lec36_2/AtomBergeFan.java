package Lec36_2;

public class AtomBergeFan extends Fan{

	@Override
	public void on() {
		System.out.println("Press Green Button Atomberge");
	}

	@Override
	public void off() {
		System.out.println("Press Red Button Atomberge");
	}

	@Override
	public void speedInc() {
		System.out.println("Press > Button Atomberge");
	}

	@Override
	public void speedDre() {
		System.out.println("Press < Button Atomberge");
	}
	
	
}
