package Lec31;

public class Children extends Parent{
	
	
	public Children() {
		System.out.println("Hey I am Children Constrotor");
		
	}
//	public void display() {
//		System.out.println("Hey child class Method");	
//	}

	public static void main(String[] args) {
		Children obj = new Children();
		obj.display();
		
	}
}
