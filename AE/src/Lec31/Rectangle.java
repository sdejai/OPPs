package Lec31;

public class Rectangle extends Shape {
	int len;
	float wth;
	
	public Rectangle() {
	
	}
	public Rectangle(int len,float wth) {
		this.len=len;
		this.wth=wth;
	}
	@Override 
	public void area() {
		System.out.println("Area of Rectangle "+len*wth);
	}
	
}
