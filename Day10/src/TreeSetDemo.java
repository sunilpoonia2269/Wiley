import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<Integer>(); // unique and unordered and sorted
		
		numbers.add(34);
		numbers.add(67);
		numbers.add(89);
		numbers.add(34);
		numbers.add(48);
//		numbers.add(null); // Adding null  // Nullpointerexception
//		numbers.add(null); // Removed due to duplicate
		
		
		//Acendingly sorted
		System.out.println(numbers);
		
		

	}
}
