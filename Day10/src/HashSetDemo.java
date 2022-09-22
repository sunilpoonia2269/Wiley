import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>(); // unique and unordered
		
		numbers.add(34);
		numbers.add(67);
		numbers.add(89);
		numbers.add(34);
		numbers.add(48);
		numbers.add(null); // Adding null
		numbers.add(null); // Removed due to duplicate
		
		
		System.out.println(numbers);
		
		

	}

}
