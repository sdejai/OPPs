package Lec31;

public class Havels extends Fan{

	@Override
	public void on() {
		System.out.println("Press light Green Button Havels!");
	}

	@Override
	public void off() {
		System.out.println("Press red Button Havels!");
	}

	@Override
	public void speedInc() {
		System.out.println("Press > Havels!");
	}

	@Override
	public void speedDec() {
		System.out.println("Press < Havels!");
	}

}
