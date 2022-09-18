package com.serilize;

public class Date {
	private int dd, mm, yy;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ day : " + this.dd + " mm : " + this.mm + " yy : " + this.yy + " ]";
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	

}
