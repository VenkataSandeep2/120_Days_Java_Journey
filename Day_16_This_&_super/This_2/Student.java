package com.This_2;

public class Student 
{
	String name;
	
	String course;

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	public void display() {
		System.out.println("Student name -> "+name);
		System.out.println("Student course-> "+course);
	}

}
