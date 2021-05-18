package tute1_2;

public class Feet {
	private int inches;
	private int feet;

	public Feet(int feet, int inches) {
		this.feet= feet;
		this.inches = inches;
	}
	
	//overload the constructor
	public Feet(Feet len) {
		this.feet= len.feet;
		this.inches = len.inches;
	}
	
	public void add(Feet f1, Feet f2) {
		int totf;
		int toti;
		int totR;
		
		totf = f1.feet + f2.feet;
		toti = f1.inches + f2.inches;
		
		totR = totf % 12;
		totf += totR;
		
		toti += toti / 12;
		
		this.feet = totf;
		this.inches = toti;
	}
	
	public void print() {
		System.out.println(this.feet + "' " + this.inches + "\"");
	}
	
	public void print(String msg) {
		System.out.println(msg + " Length: " + this.feet + "' " + this.inches + "\"");
	}
}
