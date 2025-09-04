package lec25;

public class FindArea {
	public static double area(int radius) {
		final float pie = 3.14f;
		return pie * (radius * radius);

	}

	public static int area(int l, int w) {
		return l * w;

	}

	public static void main(String[] args) {
		int radius = 3;
		int len = 12;
		int wth = 4;
		System.out.println(area(radius));
		System.out.println(area(len, wth));

	}

}
