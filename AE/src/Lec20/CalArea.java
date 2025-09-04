package Lec20;

public class CalArea {
	public static double area(float radius) {
		final float pie=3.14f;
		return pie*(radius*radius);
	}
	public static double area(float len,float wth) {
		return len*wth;
	}
	public static void main(String[] args) {
		System.out.println(area(3.1f));
		System.out.println(area(32,6));
	}

}
