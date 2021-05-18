package lab3_2;

public class Person {

	String name, address;
	
	public Person(String n, String a) {
		this.name = n;
		this.address = a;
	}
	
	public void showDetails() {
		System.out.println(this.name + "\n" + this.address);
	}
}
