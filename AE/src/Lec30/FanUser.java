package Lec30;

public class FanUser {

	public static void main(String[] args) {
		AtomBergFan obj = new AtomBergFan();
		obj.on();
		obj.off();
		obj.bransDisplay();
		obj.speedIncr();
		HavelesFan objHav = new HavelesFan();
		objHav.on();
		objHav.off();
//		we cann't create object of abstract classes
//		Fan objFan = new Fan();
		
	}

}
