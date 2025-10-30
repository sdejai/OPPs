package Lec37;

public class Rectangle extends Shape {
	int len;
	int wth;
	
	public Rectangle() {
	
	}
	public Rectangle(int len,int wth) {
		this.len=len;
		this.wth=wth;
	}
	@Override 
	public void area() {
		System.out.println("Area of Rectangle "+len*wth);
	}
	
}
