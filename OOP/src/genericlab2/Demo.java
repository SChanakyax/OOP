package genericlab2;

public class Demo {

	public static void main(String[] args) {
		Print print = new Print();
		int age = 24;
		print.print("Age is", age);
		
		
		
	}


}

class Print {
	<T>void print(String message, int val) {
		 System.out.println(message+ ">>>> " + val);
	}
}
