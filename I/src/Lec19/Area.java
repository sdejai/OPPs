package Lec19;

public class Area {

	public static double area(float radius){
		final float pie=3.14f;
		return pie*(radius*radius);
	}
	public static double area(float lth, float wth){
		return  lth*wth;
	}
	
	public static void main(String[] args) {
		System.out.println(area(3.0f));
		System.out.println(area(3,6));
	}

}
