package scom.Polymorphism_4;

public class FoodOrder 
{
	public void order(String item)
	{
		System.out.println("Order food item ->"+ item);
	}
	public void order(String item,int quantity)
	{
		System.out.println("Order Food and quantity -> "+ item+ " "+quantity);
	}

}
