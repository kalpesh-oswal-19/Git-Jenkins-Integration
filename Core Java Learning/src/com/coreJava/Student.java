package com.coreJava;

public class Student {
	
	/*private String name;
	private int rollNo;
	private String city;
	private double percentage;
	
	
	public Student(String name, int rollNo, String city, double percentage) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
		this.percentage = percentage;
	}
	
	public void printStudentDetails() {
		   
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("City: "+city);
		System.out.println("Percentage: "+percentage);
	}*/
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.name = name; 
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
