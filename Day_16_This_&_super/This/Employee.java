package com.This;

public class Employee 
{
	int id ;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("id -> " +id);
		System.out.println("name -> "+name);
	}

}
