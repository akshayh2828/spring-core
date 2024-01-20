package com.springcore.SpringCoreExample4;

public class Bike {
	
	Oil oil;

	public synchronized void setOil(Oil oil) {
		System.out.println("inside Bike class");
		this.oil = oil;
	}
	
	

}
