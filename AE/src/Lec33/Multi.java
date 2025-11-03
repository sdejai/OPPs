package Lec33;

public abstract class Multi {

	public static void main(String[] args) {
		FunInterMulti ref =(val)->5*val;
		FunInterMulti ref1=(val)->10*val;
//		int res=ref.mul(7);
//		System.out.println(res);
		System.out.println(ref.mul(8));
		System.out.println(ref1.mul(12));
	}

}
