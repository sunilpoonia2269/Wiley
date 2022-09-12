package com.sunil.afactory;

public class PC implements Computer{

	private String ram;
	private String hdd;
	private String cpu;
	
	
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}


	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return this.hdd;
	}


	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return this.cpu;
	}
	
	
}
