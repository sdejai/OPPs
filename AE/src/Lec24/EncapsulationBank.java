package Lec24;

public class EncapsulationBank {
	// using private access modi
	private long accountNum;
	private String accHolderName;
	private long amount;

	public EncapsulationBank() {
		
	}
	
	public EncapsulationBank(long accountNum, String accHolderName, long amount) {
		this.accountNum = accountNum;
		this.accHolderName = accHolderName;
		this.amount = amount;
	}


	public void display() {
		System.out.println("deatils-->" + accHolderName + " " + accountNum + " " + amount);
	}
}
