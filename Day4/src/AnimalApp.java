
public class AnimalApp {
	
//	public static void displayDog(Dog dog) {
//		System.out.println("Information about dog");
//		dog.breath();
//		dog.eat();
//		dog.trainMe();
//		dog.sleep();
//	}
//	
//	public static void displayCat(Cat cat) {
//		System.out.println("Information about cat");
//	}
	
	public static void displayAnimal(Animal animal) {
		animal.talk();
		animal.breath();
		animal.eat();
		if(animal instanceof Dog ) // instance of operator check type of object
			((Dog) animal).trainMe();
		
		
	}

	public static void main(String[] args) {
		// superclass ref = new subclass();
		// PolyMorphic reference or
		// dynamic method dispatch
//		Animal animal = new Dog();
//		animal.talk();
//		((Dog) animal).trainMe(); // Downcasting
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		displayAnimal(dog);
		displayAnimal(cat);
	
		
	}
}
