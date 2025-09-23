package Lec24_2;

public class EncapsulationBank {
	// using private access modi
	private long accountNum;
	private String accHolderName;
	private long amount;

	// setter
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accHolderName = accountHolderName;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	// getter
	public long getAccountNum() {
		return accountNum;
	}

	public String getAccountHolderName() {
		return accHolderName;
	}

	public long getAmount() {
		return amount;
	}

	public void display() {
		System.out.println("deatils-->" + accHolderName + " " + accountNum + " " + amount);
	}
}
