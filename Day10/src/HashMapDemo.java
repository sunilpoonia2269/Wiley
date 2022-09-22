import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();
		
		// Real life example of map
//		Map<String, List<String>> library = new HashMap<String, List<String>>();
//		library.put("drama", Arrays.asList("", "", ""));
		
		
		myMap.put("M101", "Sunil");
		myMap.put("M102", "Mohit");
		myMap.put("M103", "Sumit");
		myMap.put(null, "Manu");
		myMap.put("M104", null);
		
//		System.out.println(myMap);
//		
//		System.out.println(myMap.get(null));
		
		String s = myMap.getOrDefault("M105", "Some defaults");
		String s1 = myMap.getOrDefault("M101", "Some defaults");
//		System.out.println(s);
//		System.out.println(myMap);
		
		Set<Entry<String, String>> entry = myMap.entrySet();
		
		System.out.println(entry);
		
		
		System.out.println(myMap.keySet());
		
		System.out.println(myMap.values());
		
		
		

	}

}
