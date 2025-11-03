package Lec41;

public class CheckVoter {

	public static void EliVoter(int age) throws Exception {
		if(age<18) {
			throw new InValidVoterException("you can not vote");
		}
		else {
			System.out.println("You can Vote");
		}
	}
	
	public static void main(String[] args) throws Exception {
		int age=19;
		try {
			EliVoter(age);
		}catch (InValidVoterException e) {
			System.out.println(e);
		}finally {
			System.out.println("Hello Finally");
		}
		
	}

}
