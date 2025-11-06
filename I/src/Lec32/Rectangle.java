package Lec32;

public class Rectangle extends Shape {
	int len;
	int wt;
	
	public Rectangle() {
	
	}
	public Rectangle(int len,int wt) {
		this.len=len;
		this.wt=wt;
	}
	@Override 
	public void area() {
		System.out.println("Area of Rectangle is "+len*wt);
	}
	
}
