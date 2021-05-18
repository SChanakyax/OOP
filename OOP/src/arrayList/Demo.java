package arrayList;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList<Integer> arr= new ArrayList<>();
		
		arr.add(12);
		arr.add(15);
		arr.add(20);
		
		System.out.println(arr);
		
		arr.add(1,1000);
		
		System.out.println(arr);

		Integer[] x = new Integer[arr.size()];
		x = arr.toArray(x);
		
		for(Integer val : x) {
			System.out.println(val);
		}
		
	}

}
