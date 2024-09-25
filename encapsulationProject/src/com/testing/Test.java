package com.testing;

import com.entity.Student;
import com.service.Service;

//Test calss
public class Test {
	
	public static void main(String[] args) {
		// obj of serice class
		Service ser = new Service();
		// call m1 mathod that is in service class and store result in std.
		Student std = ser.m1();
		// Display std result by using toSting .
		System.out.println(std);

	}

}
