package practise3;

abstract class Payment 
{
	abstract void pay (double amount);
	
	void paymentStatus()
	{
		System.out.println("Successfull completed");
	}

}
