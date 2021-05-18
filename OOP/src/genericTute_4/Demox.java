package genericTute_4;

import java.util.*;

public class Demox {

	public static void main(String[] args) {
		//Integer[] arr = {12,15,12,1,3};
		// System.out.println(calculateSum(arr));
	
		List myList = new ArrayList<>();
		myList.add(20);
		myList.add(10);
		myList.add(2);
		myList.add(5);

		System.out.println(calculateSum(myList));
	}

	private static <E extends Number> double calculateSum(List<E> x) {
		
		double sum= 0.0;
		
		for(E val : x) {
		 sum = sum + val.doubleValue() ;	
		}
		return sum;
	
		
	}
}







































