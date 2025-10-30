package Lec37;

public class CalculateArea {
	public static void main(String[] args) {
		Circle objCir = new Circle(2);
		objCir.area();
		Rectangle objRec = new Rectangle(3, 2);
		objRec.area();
		Shape obj2 = new Shape();
		obj2.area();
		Shape obj = new Circle(3.1f);
		obj.area();
		Shape obj1 = new Rectangle(12, 3);
		obj1.area();
	}
}
