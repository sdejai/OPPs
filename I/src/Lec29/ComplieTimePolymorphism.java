package Lec29;

public class ComplieTimePolymorphism {

	public void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void sum(float num1, float num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public float sum(float num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		ComplieTimePolymorphism obj = new ComplieTimePolymorphism();
		obj.sum(2,3);
		obj.sum(2.3f,2,4);
		System.out.println(obj.sum(2.3f,4));
	}

}
