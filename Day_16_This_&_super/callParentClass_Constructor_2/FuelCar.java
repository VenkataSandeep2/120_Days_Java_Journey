package com.callParentClass_Constructor_2;

public class FuelCar extends Car
{
	FuelCar()
	{
		super();
		System.out.println("FuelCar is Objected");
	}
	public void fuel()
	{
		System.out.println("Petrol Filling");
	}
	
}
