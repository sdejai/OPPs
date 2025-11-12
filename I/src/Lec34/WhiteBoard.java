package Lec34;

public class WhiteBoard {
	
	private float len;
	private float wt;
	private String color;
	
	public WhiteBoard() {
	
	}
	public WhiteBoard(float len,float wt,String color) {
		this.len=len;
		this.color=color;
		this.wt=wt;
	}
	@Override 
	public String toString() {
		return len +" "+ wt+" " +color + ": Hey class";
	}
	public static void main(String[] args) {
		WhiteBoard obj = new WhiteBoard(1.2f,2,"White");
		System.out.println(obj);
	}
}
