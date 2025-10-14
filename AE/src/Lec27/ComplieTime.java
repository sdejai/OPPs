package Lec27;

public class ComplieTime {

	// CompileTime Polymorphism or overLoading
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public float sum(float num1, float num2) {
		return num1 + num2;
	}

	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static void main(String[] args) {
		ComplieTime obj = new ComplieTime();
		System.out.println(obj.sum(2, 3));
		System.out.println(obj.sum(2.8f, 3.2f));
		System.out.println(obj.sum(2, 3, 8));
	}

}
