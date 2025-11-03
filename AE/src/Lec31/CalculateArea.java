package Lec31;

public class CalculateArea {
	public static void main(String[] args) {
		Circle objCir = new Circle(2);
		objCir.area();
		Rectangle objRec = new Rectangle(4, 4.2f);
		objRec.area();
//		we can not create and call
//		Shape obj2 = new Shape();
//		obj2.area();
	}
}
