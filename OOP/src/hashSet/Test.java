package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		HashSet < String> myHashset = new HashSet<>();

		myHashset.add("LAmao");
		myHashset.add("Amana");
		myHashset.add("Sumana");
		myHashset.add("Gmana");
	//	System.out.println(myHashset);
		 
	//	for(String value : myHashset) {
	//		System.out.println(value);
	//	}
		
		TreeSet<String> my3set = new TreeSet<>();

		myHashset.add("L");
		myHashset.add("Ama");
		myHashset.add("Sum");
		myHashset.add("Gm");
		System.out.println(my3set);
		 
		for(String val : my3set) {
			System.out.println(val);
		}
		
		
		
	}

}
