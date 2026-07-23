package scom.Polymorphism_3;

public class Payment {
	void pay(int amount)
	{
		System.out.println("Cash payment->" +amount);
		
	}
	
	void pay(double amount)
	{
		System.out.println("Upi Payment-> " + amount);
	}
	
	void pay(String CardNumber,double amount)
	{
		System.out.println("Card payment -> "+amount);
	}

}
