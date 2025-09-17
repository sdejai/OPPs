package Lec29;

public class BankUser {

	public static void main(String[] args) {
		Bank user1 = new Bank();
		user1.setAccountNumber(12345);
		user1.setAccountHolderName("Rahul");
		user1.setAccount(100000);
		user1.withDraw(6000);
	}

}
