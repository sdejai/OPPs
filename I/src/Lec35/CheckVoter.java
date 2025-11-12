package Lec35;

import java.util.Scanner;

public class CheckVoter {
	public static void checkAge(int age) throws InValidVoterException {
		if (age < 18) {
			throw new InValidVoterException("Invalid voter");
		} else {
			System.out.println("Please vote!");
		}
	}

	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
		int age = 14;
		try {
			checkAge(age);
		} catch (InValidVoterException in) {
			System.out.println(in);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Please Voter your vote make changes!");
		}

	}

}
