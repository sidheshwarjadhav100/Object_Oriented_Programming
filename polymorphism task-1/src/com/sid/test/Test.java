package com.sid.test;

import com.sid.task.Car;
import com.sid.task.Motorcycle;
import com.sid.task.Truck;
import com.sid.task.Vehicle;

public class Test {
	public static void main(String[] args) {

		/*
		 * An array of Vehicle objects is created, holding instances of different
		 * vehicle subclasses.
		 */

		Vehicle[] v = { new Car(), new Motorcycle(), new Truck() };

		/*
		 * When the startEngine() and stopEngine() methods are called on each object,
		 * the appropriate implementation based on the object's actual type is invoked,
		 * demonstrating polymorphism.
		 */
		for (Vehicle vehicle : v) {
			vehicle.startEngine();
			vehicle.stopEngine();
		}
	}
}
