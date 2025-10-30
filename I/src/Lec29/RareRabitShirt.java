package Lec29;

public class RareRabitShirt extends Shirt {
	
	@Override
	public void brand() {
		System.out.println("Rare Rabit Brand");
	}
	
	public static void main(String[] args) {
		RareRabitShirt obj = new RareRabitShirt();
		obj.brand();
	}

}
