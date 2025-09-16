package Lec22;

public class ConstructorStudent {
	int hight;
	String name;
	String lang;
	public ConstructorStudent() {

	}

	public ConstructorStudent(int hight, String name, String lang) {
		this.hight = hight;
		this.name = name;
		this.lang = lang;
	}
	public void display() {
		System.out.println(this.hight);
		System.out.println(this.name);
		System.out.println(this.lang);
	}
	public static void main(String[] args) {
		ConstructorStudent obj1 = new ConstructorStudent(5,"Rahul","Hindi");
		obj1.display();
		ConstructorStudent obj2 = new ConstructorStudent();
		obj2.display();
	}
}
