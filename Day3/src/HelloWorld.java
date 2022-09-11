
class Demo {
	
	//boolean isTrue;
	
	/// if-else Statement 
	int greaterNumber(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}
		else if (num2 > num1 && num2 > num3) {
			return num2;
		}
		return num3;
	}
	
	
	
	int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
//	double addNumbers(double num1, double num2) {
//		return num1 + num2;
//	}
	
	int substracteNumbers(int num1, int num2) {
		return num1 - num2;
	}
	
//	double substracteNumbers(double num1, double num2) {
//		return num1 - num2;
//	}
	
	
	// Using switch statement
	int calculator(int num1, int num2, String operationName) {
		switch(operationName) {
		case "add":
			return addNumbers(num1, num2);
		case "sub":
			return substracteNumbers(num1, num2);
		default : 
			System.out.println("No operation found");
			return 0;
		}
	}
	
	// Using switch statements
	String getNumberSpelling(int num) {
		switch(num){
			case 0: 
				return "zero";
			case 1:
				return "One";
			case 2:
				return "Two";
			case 3:
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			default:
				return "Not found in database";
		}
	}
	
	// For loop
	void printIntegers(int number) {
		for(int i=1;i<=number;i++) {
			if(i % 2 == 0)
				break;
			System.out.println(i);
		}
	}
	
	// While loop
	void printTable(int number) {
		int i = 1;
		while(i <= 10) {
			System.out.println(number + " * " + i + " = " + number * i);
			i++;
		}
	}
	
	// Do while loop
	void printTableByDoWhile(int number) {
		int i = 1;
		do {
			System.out.println(number + " * " + i + " = " + number * i);
			i++;	
		}while(i <= 10);         
	}
	
	 public static void main(String[] args) {
		Demo demo = new Demo();
		//int largerNumber = demo.greaterNumber(12, 18, 17);
		//System.out.println("Larger Number is - " + largerNumber);
//		String numberSpelling = demo.getNumberSpelling(0);
//		System.out.println(numberSpelling);
		
//		int number = demo.calculator(12, 31, "susb");
//		System.out.println(number);
		
		//demo.printIntegers(12);
		//demo.printTable(8);
		
		demo.printTableByDoWhile(3);
	}

}
