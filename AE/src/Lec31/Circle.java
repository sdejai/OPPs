package Lec31;

public class Circle extends Shape {

	final float pie=3.14f; 
	float radius;
	
	public Circle() {
		
	}
	
	public Circle(float radius) {
		this.radius=radius;
	}
	
	@Override
	public void area() {
		System.out.println("Area of circle "+pie*radius*radius);
	}

}
