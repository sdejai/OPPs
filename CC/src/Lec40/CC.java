package Lec40;


public class CC {
	private String name;
	public CC() {
		
	}
	public CC(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Hey "+name+" You are from CC Section";
	}
	public static void main(String[] args) {
		CC obj = new CC("aman");
		System.out.println(obj);
		System.out.println(obj.name);
	}
}
