package com.sid.service;

import com.sid.entity.Employee;

public class Service {

	/*
	 * declre method m1 using custome data type as class name because we have to
	 * return object of Employee
	 */

	public Employee m1() {
		// create a object of Employee class by passing arguments and retrun object
		Employee e1 = new Employee("Sager Jadhav", "TCS", 21, 16000);

		return e1;

	}

	public Employee m2() {
		// create a object of Employee class by passing arguments and retrun object
		Employee e2 = new Employee("Purushottam Raherkar", "TCS", 22, 19000);

		return e2;

	}

	public Employee m3() {
		Employee e3 = new Employee("Varun Patil", "TCS", 21, 16000);

		return e3;

	}

}
