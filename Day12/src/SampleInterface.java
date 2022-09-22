
public interface SampleInterface {

	void process(); // public and abstract by default
	void process1();
	
	// To achieve backward compatibility you can declare this method default
	// You can have any number of default method
	public default void doTask() {
		System.out.println("Doing some task");
	}
	
	
	// Static methods written in interface to provide the common business logic to be shared across all the subclass
	// It cannot be overriden as it is static method
	// Any number of static methods are allowed
	public static void generateRecourses() {
		// Some task about getting recourses
	}
	
	
}
