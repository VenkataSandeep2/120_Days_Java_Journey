package com.HierachicalInheritance_3;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car c= new Car();
		c.start();
		c.drive();
		System.out.println();
		
		Bike bi = new Bike();
		bi.start();
		bi.brake();
		System.out.println();
		
		Auto au = new Auto();
		au.start();
		au.transport();
		System.out.println();
		
		Bus bus = new Bus();
		bus.start();
		bus.transport();
		
	}

}
