package exception;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int no = Integer.parseInt("123a");
			int value = 10 /0 ;
		}	
		catch(ArithmeticException e) {
			System.out.println("OOOOo");
			System.out.println(e.getMessage());
		
		}catch(NumberFormatException e) {
			System.out.println("XXXx");
			System.out.println(e.getMessage());
		}

	}

}
