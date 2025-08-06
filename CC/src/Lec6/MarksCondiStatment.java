package Lec6;
import java.util.Scanner;

public class MarksCondiStatment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float markPer=sc.nextFloat();
		/*marks>90 Gt
			marks>80 && marks<90 Scotty
			marks anything pizza*/
		if(markPer>=90) {
			System.out.println("GT");
		}
		else if(markPer>80 && markPer<90) {
			System.out.println("Scoty");
		}
		else {
			System.out.println("Pizza");
		}
	}

}
