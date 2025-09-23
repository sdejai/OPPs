package Lec24;

public class Emp {

	public static void main(String[] args) {
		EmpConstructor empObje1= new EmpConstructor(10103,"Dev");
		empObje1.display();
		EmpConstructor empObje2= new EmpConstructor(1,"Raj");
		empObje2.display();
		EmpConstructor empObje3= new EmpConstructor("Keshav");
		empObje3.display();
	}

}
