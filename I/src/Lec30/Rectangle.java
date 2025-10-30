package Lec30;

public class Rectangle extends Shape {
	float len;
	float wth;
	
	public Rectangle() {
	
	}
	public Rectangle(float len,float wth) {
		this.len=len;
		this.wth=wth;
	}
	@Override 
	public void area() {
		System.out.println("Area of Rectangle "+len*wth);
	}
	
}
