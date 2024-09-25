package com.entity;

public class Student {

	// POJO CLASS

	// ALL VARIABLES ARE PRIVATE
	private String name;
	private int rollNo;
	private String div;
	private String cource;
	private double fees;

	// NON PARAMETERIZED CONSTRUCTOR
	public Student() {
		super();
	}

	// PARAMETERIZED CONSTRUCTOR
	public Student(String name, int rollNo, String div, String cource, double fees) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.div = div;
		this.cource = cource;
		this.fees = fees;
	}

	// GETERS AND SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	// tOSTRING
	@Override
	public String toString() {
		return "Student Info" + " \n Name= " + name + "\n Roll No= " + rollNo + "\n Division= " + div + "\n Cource="
				+ cource + "\n Fees= " + fees;
	}

}
