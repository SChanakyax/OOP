package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> marks = new HashMap<>();
		
		marks.put("SC", 80);
		marks.put("a", 40);
		marks.put("f", 75);
		marks.put("e", 70);

		
		Integer res = marks.get("f");
		res = res + 10;
		marks.put("f", res);
		
		
		Set<Map.Entry<String,Integer>> newSet = marks.entrySet();
		
		for(Map.Entry<String, Integer> val : newSet) {
			System.out.println(val.getKey() + "  " + val.getValue() + "  " + val.getClass());
		}
		
		
		
	}

}
