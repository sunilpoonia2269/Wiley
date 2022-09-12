package com.sunil.afactory;

public class PCfactory implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	

	public PCfactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}



	@Override
	public Computer createComputer() {
		return new PC(this.ram, this.hdd, this.cpu);
	}

}
