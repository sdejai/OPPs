package Lec28;

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
		Recatngle objRet = new Recatngle(12, 4);
		objRet.area();
		Circle objCircle = new Circle(2.1f);
		objCircle.area();
		Shape obShape = new Shape();
		obShape.area();
	}
}
