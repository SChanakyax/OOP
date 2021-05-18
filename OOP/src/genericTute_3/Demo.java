package genericTute_3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		Integer value[] = takeInput();
		System.out.println(findmax(value));
	}
	
	private static <T extends Comparable<T>> T findmax(T[] value) {
		// TODO Auto-generated method stub
		T max = value[0];
		
		for(int i =0; i<value.length; i++ ) {
			if(value[i].compareTo(max)>0) {//max < value[i]
				max = value[i];
			};
		}
		
		return max;
	}
 
	private static Integer[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Integer[] arr = new Integer[size];
		
		for(int i=0; i < size; i++) {
			System.out.println(":Enter:");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	
}
