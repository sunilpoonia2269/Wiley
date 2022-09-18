package com.employee;

public class Address {
	
	private int flatNumber;
	private String flatName;
	private String roadName;
	private String cityName;
	
	
	public Address(int flatNumber, String flatName, String roadName, String cityName) {
		super();
		this.flatNumber = flatNumber;
		this.flatName = flatName;
		this.roadName = roadName;
		this.cityName = cityName;
	}


	public int getFlatNumber() {
		return flatNumber;
	}


	public String getFlatName() {
		return flatName;
	}

	public String getRoadName() {
		return roadName;
	}

	public String getCityName() {
		return cityName;
	}


	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", flatName=" + flatName + ", roadName=" + roadName + ", cityName="
				+ cityName + "]";
	}

	
}
