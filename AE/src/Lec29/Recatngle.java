package Lec29;

public class Recatngle extends Shape {
	float len;
	float wed;

	public Recatngle() {

	}

	public Recatngle(float len, float wed) {
		this.len = len;
		this.wed = wed;
	}

	@Override
	public void area() {
		System.out.println("Area of Reactngle " + len * wed);
	}

	public static void main(String[] args) {
		
//		Dynmic Dispatch
		Shape objShape = new Recatngle(2, 8.2f);
		objShape.area();
		
		Shape objCir = new Circle(4.2f);
		objCir.area();
	}
}
