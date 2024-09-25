package com.sid.test;

import com.sid.entity.Employee;
import com.sid.service.Service;

public class Main {

	public static void main(String[] args) {

		Service src = new Service();
		// here we call m1 method of service and store that result in m1
		Employee m1 = src.m1();
		// print above line o/p
		System.out.println(m1);

		System.out.println("____________________________________________");
		Employee m2 = src.m2();
		System.out.println(m2);

		System.out.println("____________________________________________");

		Employee m3 = src.m3();
		System.out.println(m3);

	}

}
