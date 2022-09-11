
public class CoffeeApp {

	public static void main(String[] args) {
		Coffee coffee = Coffee.EXPRESSO;
		coffee.prepareCoffee();
		System.out.println("Your total cost is - " + coffee.calculateCost());

	}

}
