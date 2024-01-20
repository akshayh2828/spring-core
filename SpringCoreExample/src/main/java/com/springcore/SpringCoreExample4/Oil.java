package com.springcore.SpringCoreExample4;

public class Oil {

	Bike bike;

	public synchronized void setBike(Bike bike) {
		System.out.println("inside Oil class");
		this.bike = bike;
	}
	
	
}
