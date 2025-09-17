package Lec23;

public class Bank {
	
	long accountNumber;
	String accountHolderName;
	long amount;
	
	public Bank() {
		
	}
	public Bank(long accountNumber,String accountHolderName ,long amount) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.amount=amount;
	}
	public void deposit(long depositAmount){
		if(depositAmount<=0) {
			System.out.println("Invalid deposit Amount");
		}
		else {
			amount=amount+depositAmount;
			System.out.println(amount);
		}
	}
	public void withdraw(long withAmount){
		if(withAmount>amount) {
			System.out.println("insuff Amount!");
		}
		else {
			amount=amount-withAmount;
			System.out.println(amount);
		}
		
	}
	
}
