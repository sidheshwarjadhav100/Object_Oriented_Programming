package com.sid.task;

//Motorcycle is one one the type of vehicle it also have engine.
//it also has same functionality as vehicle class so we extends vehicle class property.
//when we extends vehicle class we can access functions of vehicle class as well
//so we redefine parent class method into child class with different operation here we done it.
public class Motorcycle extends Vehicle {
//@Override annotation is use check all the rules of Overriding
	@Override
	public void startEngine() {
		System.out.println("Motorcycle Engine Started.");

	}

	@Override
	public void stopEngine() {
		System.out.println("Motorcycle Engine Stopped.");

	}

}
