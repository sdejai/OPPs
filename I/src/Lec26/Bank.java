package Lec26;

public class Bank {
	private long accountNumber;
	private String accountHolderName;
	private long amount;
	private long mobileNumber;
	private String address;

	public Bank() {

	}

	public Bank(long accountNumber, String accountHolderName, long amount, long mobileNumber, String address) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.amount = amount;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}

}
