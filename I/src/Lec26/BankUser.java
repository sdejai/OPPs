package Lec26;

public class BankUser {

	public static void main(String[] args) {
		Bank user1 =  new Bank(10221,"Dav",102412, 98567763, "Mathura");
//		user1.accountNumber=45672;
//		System.out.println(user1.accountNumber);
		user1.setAccountNumber(45672);
		System.out.println(user1.getAccountNumber());
	}

}
