package Lec22;

public class Bank {
	long accountNumber;
	String accountHolderName;
	long amount;

	public void deposit(long depMoney) {
		if(depMoney<=0) {
			System.out.println("Invalid Deposit amount!");
		}
		else {
			amount=amount+depMoney;
			System.out.println(amount);
		}
	}

	public void withdraw(long withMoney) {
		if(amount<withMoney) {
			System.out.println("Insiff amount!");
		}
		else {
			amount=amount-withMoney;
			System.out.println(amount);
		}
	}
	public static void main(String[] args) {
		Bank userObj=new Bank();
		userObj.accountNumber=1234;
		userObj.accountHolderName="Rahul";
		userObj.amount=1000;
		userObj.withdraw(100);
		userObj.deposit(500);
		Bank userObj2=new Bank();
		userObj2.accountNumber=1986;
		userObj2.accountHolderName="Rohit";
		userObj2.amount=1037488;
		userObj2.withdraw(100560);
	}
}
