import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


// Capacity of collections : default capacity of arraylist - 10
// Load factor of collections : load facotor for arraylist - 0.75
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList numbers = new ArrayList();
		//ArrayList : AbstractArrayList, Collection, Object, List, AbstractCollection
		// numbers arraylist is not type-safe by default
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(60); //int --> Integer(AutoBoxing)
		numbers.add(87);
		//numbers.add("Hello"); // : Gives error after type safety
		
		numbers.add(34);
		numbers.add(53);
		
		// Printing all the elments in arraylist
		//System.out.println(numbers);
		
		numbers.add(78);
		
		//System.out.println(numbers);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		
		numbers1.add(34);
		numbers1.add(76);
		numbers1.add(9);
		
		numbers.addAll(numbers1);
		//System.out.println(numbers);
		
		
		// Traditional for loop : considers index and can traverse in forward and backward way
		// Slower 
//		for(int i=0; i<numbers.size(); i++)
//			System.out.println(numbers.get(i));
		
		// for each loop : enhanced for loop -> doesn't consider index number, only goes in forward way
		// Faster but cannot remove elements
//		for(Integer number : numbers)
//			System.out.println(number);
		
		// iterator : doesn't consider index numbers, only in forward direction
		// Gives additional features ex -> facility to remove something
		Iterator<Integer> numberIterator = numbers.iterator();
		while(numberIterator.hasNext()) {
			System.out.println(numberIterator.next());
			numberIterator.remove();
		}
		
		
		ListIterator<Integer> myList = numbers.listIterator();
		
		while(myList.hasPrevious()) {
			
		}
		
		
		
		
		
		
	}

}
