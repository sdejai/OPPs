package Lec36_2;

public class HavelesFan extends Fan{

	@Override
	public void on() {
		System.out.println("Press Dark Green Button Haveles");
	}

	@Override
	public void off() {
		System.out.println("Press Dark Red Button Haveles");
	}

	@Override
	public void speedInc() {
		System.out.println("Press + Button Haveles");
	}

	@Override
	public void speedDre() {
		System.out.println("Press - Button Haveles");
	}

}
