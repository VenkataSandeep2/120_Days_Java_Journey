package com.This;

public class Main 
{
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Ravi");
		emp.display();
		System.out.println();
		Employee emp1 = new Employee(102, null);
		emp1.display();
		System.out.println();
		Employee emp2 = new Employee(0, null);
		emp2.display();
	}
}
