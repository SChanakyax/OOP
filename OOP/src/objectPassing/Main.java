package objectPassing;

public class Main {

	public static void main(String[] args) {
		Squre s1 = new Squre(15, 20);
		Squre s2 = new Squre(45, 12);
		Squre s3 = new Squre(15, 20);
		
		System.out.println(s1.compareWith(s2));
		System.out.println(s2.compareWith(s3));
		System.out.println(s3.compareWith(s1));
		
		/* passing objects as a parameter to the constructor */
		Squre s4 = new Squre(s1);
	
		boolean result = s4.compareWith(s1);
		
		System.out.println(result);
	}
	
}
