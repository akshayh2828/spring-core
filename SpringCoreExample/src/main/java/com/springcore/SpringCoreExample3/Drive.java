package com.springcore.SpringCoreExample3;

public class Drive {

	private int id;
	
	private Car car;

	
	
	
	public Drive(Car car,int id ) {
		super();
		this.id = id;
		this.car = car;
	}




	public String startCar() {
		String engine= car.getCarEngine();
		return "Car Started And "+engine;
	}
	
}
