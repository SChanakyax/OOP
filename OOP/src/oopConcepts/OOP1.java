package oopConcepts;

public class OOP1 {
	
	public static void main(String[] arg) {
		
		int array[];
		array = new int[3];
		
		array[0] = 10;
		array[1] = 50;
		array[2] = 35;
		
		int x = 0;
		for(int i=0; i<=2; i++) {
			System.out.println(array[i]);
		}
		
		while(x!=3) {
			System.out.println(array[x]);
			x++;
		}
		
		System.out.println("Print");
	}
}
