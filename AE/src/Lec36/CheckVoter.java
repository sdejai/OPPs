package Lec36;

import java.util.Scanner;

public class CheckVoter {

	public static void checkAge(int age) throws InvaildVoterException {

		if (age < 18) {
			throw new InvaildVoterException("Voter is under age");
		} else {
			System.out.println("you can vote");
		}
	}

	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
//		int age=sc.nextInt();
		int age = 55;
		try {
			checkAge(age);
		} catch (InvaildVoterException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
