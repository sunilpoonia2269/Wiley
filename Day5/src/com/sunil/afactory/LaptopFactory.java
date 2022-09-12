package com.sunil.afactory;

public class LaptopFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public LaptopFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Laptop(this.ram, this.hdd, this.cpu);
	}

}
