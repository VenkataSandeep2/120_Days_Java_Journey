package com.Super_2;

public class Dog extends Animal
{
	String colour ="brown";
	
	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
