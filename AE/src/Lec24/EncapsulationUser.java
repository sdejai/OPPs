package Lec24;

public class EncapsulationUser {

	public static void main(String[] args) {
		EncapsulationBank user1 =new EncapsulationBank();
		//not able to access due to instance varibale are private(Encasulation)
//		user1.accHolderName="Dev";
//		user1.accountNum=23567;
//		user1.amount=23578876;
		user1.setAccountNum(12345);
		user1.setAccountHolderName("Dev");
		user1.setAmount(34587);
		user1.display();
		System.out.println(user1.getAccountHolderName());
	}

}
