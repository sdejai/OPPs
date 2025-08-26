package Lec16;

public class StringEqualToOperater {

	public static void main(String[] args) {
		String city1="Mathura";
		String city2=new String("Mathura");
		//String city2=new String("Mathura").intern();
		String city3="Mathura";
		System.out.println(city1==city2);
		System.out.println(city1==city3);
		
	}

}
