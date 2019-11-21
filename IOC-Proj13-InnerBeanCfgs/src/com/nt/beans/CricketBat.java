package com.nt.beans;

public class CricketBat {
	private String make;
	private String model;
	public CricketBat() {
		System.out.println("CricketBat:0-param constructor");
		
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "CricketBat [make=" + make + ", model=" + model + "]";
	}

}
