package Lec10;

public class LocalGlobalScope {
//	var name;
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			final int num=100;
//			num=num+10;
			System.out.println(num+i);
			var name1="s";
		}
//		System.out.println(num);//out of scope(block) 
	}

}
