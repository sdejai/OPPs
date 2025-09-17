package Lec29;

public class Bank {
	private long accountNumber;
	private String accountHolderName;
	private long amount;

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setAccount(long amount) {
		this.amount = amount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public long getAmount() {
		return amount;
	}

	public void deposit(long depositAmount) {
		if(depositAmount<=0) {
			System.out.println("Invaild amount");
		}
		else {
			amount=amount+depositAmount;
			System.out.println(amount);
		}
		
	}

	public void withDraw(long withAmount) {
		if(withAmount>amount) {
			System.out.println("insuff amount");
		}
		else {
			amount=amount-withAmount;
			System.out.println(amount);
		}
	}
}
