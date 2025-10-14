package Lec29;

public class Circle extends Shape {
	private float radius;

	public Circle() {

	}

	Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		final float pie = 3.14f;
		float areaOfCir = pie * radius * radius;
		System.out.println("Area of circle " + areaOfCir);
	}
}
