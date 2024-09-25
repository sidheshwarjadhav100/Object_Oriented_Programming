package com.sid.entity;

//POJO Class
public class Employee {

	// encapsulate by making variables private and access them using getter and setter

	private String name;
	private String companyName;
	private int age;
	private int salary;

	// non parameterized constructor
	public Employee() {
		super();
	}

	// parameterized constructor
	public Employee(String name, String companyName, int age, int salary) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.age = age;
		this.salary = salary;
	}

	// access private varibales using gatters and setters.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// if(name.contains(name)) {
		this.name = name;
		// }

	}

	public String getcompanyName() {
		return companyName;
	}

	public void setcompanyName(String companyName) {
		// if(name.contains(name)) {
		this.companyName = name;
		// }

	}

	// use setter and getters for accessing attribus.
	public int getAge() {
		return age;
	}

	public int setAge(int age) {

		if (age >= 18) {
			this.age = age;

		} else {
			System.out.println("Invalid age");
		}
		return age;

	}

	public double getSalary() {

		return salary;
	}

	public void setSalary(int salary) {

		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary");
		}
	}

	// tOString for return imployee information
	@Override
	public String toString() {
		return "Employee Info" + " \n Name= " + name + "\n Company= " + companyName + "\n Age= " + age + "\n Salary= "
				+ salary;
	}

}
