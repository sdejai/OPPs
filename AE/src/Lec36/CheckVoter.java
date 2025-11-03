package Lec36;

public class CheckVoter {
	
	public static void checkAge(int age) throws Exception {
		if(age<18) {
			throw new Exception();
		}
		else {
			System.out.println("you can vote");
		}
	}
	public static void main(String[] args) {
		int age=15;
		try {
			checkAge(age);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
