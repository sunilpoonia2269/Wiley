package com.sunil.afactory;

// Abstract factory presentation
// To explain abstract factory in proper way need to add diagrams
public class ComputerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer pc = ComputerFactory.createNewComputer(new PCfactory("2gb", "300GB", "2.4Ghz"));
		System.out.println(pc.getRam());
		
		Computer laptop = ComputerFactory.createNewComputer(new LaptopFactory("4GB", "500GB", "3.2Ghz"));
		
		System.out.println(laptop.getRam());
		
	
	}

}
