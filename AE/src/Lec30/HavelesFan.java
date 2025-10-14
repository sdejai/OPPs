package Lec30;

public class HavelesFan extends Fan{

	@Override
	public void on() {
		System.out.println("Press Green Button");
	}

	@Override
	public void off() {
		System.out.println("Press Dark Red Button");
	}

}
