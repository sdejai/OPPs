package Lec35;

public class Recatngle extends Shape {
	float len;
	float wed;

	public Recatngle() {

	}

	public Recatngle(float len,float wed) {
		this.len=len;
		this.wed=wed;
	}

	@Override
	public void area() {
		System.out.println("Area of Reactngle " + len * wed);
	}

	public static void main(String[] args) {
		Recatngle objRet = new Recatngle(12,4);
		objRet.area();
		Shape obShape = new Shape();
		obShape.area();
//		// Dynmic Dispatch
		Shape objShape = new Recatngle(2,8.2f);
		objShape.area();
		Circle obj = new Circle(4.2f);
		obj.area();
		// Dynmic Dispatch
		Shape ojShapeCir = new Circle(2);
		ojShapeCir.area();
	}
}
