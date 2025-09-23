package Lec25;

public class EncapsulationPerson {

	public static void main(String[] args) {
		Encapsulation person1 = new Encapsulation("Dev",23,"Mathura",4);
//		person1.name="Deva";
//		person1.age=13;
//		person1.address="mathura";
		person1.setName("Deva");
		person1.display();
	}

}
