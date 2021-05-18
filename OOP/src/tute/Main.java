package tute;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book();
		Student s1 = new Student();
/*
		IDisplay var1; //reference to IDisplay
		IInput var2; //reference to IDisplay

		var1 = new Book();
		var1.print();
		var1.printDetails();
		//var1.input();

		var2 = new Book();
		var2.input();
	*/	
		IDisplay var1= new Book(); //reference to IDisplay
		IInput var2 = new Book(); //reference to IDisplay
		
		var1.print();
		var1.printDetails();
		var2.input();
		
	/*	
		b1.input();
		b1.print();
		
		s1.input();
		s1.print();
		
*/
		
	}

}
