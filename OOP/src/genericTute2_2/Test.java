package genericTute2_2;

public class Test {

	private static <E> void swap(E[] x, E[] y) {
		E temp;
		
		for(int i=0; i< x.length; i++) {
			temp = x[i];
			
			x[i] = y[i];
			y[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		String[] arr1 = {"a","b","acc"};
		String[] arr2 = {"45","56","98"};

		for(int i=0; i< arr1.length; i++) {
			System.out.println("arr1>>> " + arr1[i]);
		}
	
		for(int i=0; i< arr2.length; i++) {
			System.out.println("arr2>>> " + arr2[i]);
		}
		
		swap(arr1,arr2);
		
		for(int i=0; i< arr1.length; i++) {
			System.out.println("arr1<<<<<<>>> " + arr1[i]);
		}
	
		for(int i=0; i< arr2.length; i++) {
			System.out.println("arr2<<<<<<<>>> " + arr2[i]);
		}
		
		
	}
	
	
	
	

}
