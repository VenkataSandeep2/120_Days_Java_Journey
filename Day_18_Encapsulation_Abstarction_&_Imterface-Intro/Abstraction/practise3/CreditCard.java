
package practise3;

public class CreditCard extends Payment
{
	@Override
	void pay(double amount) 
	{
	System.out.println("Credit card  " + amount +" Successfully using credit card");
	}
	void paymentStatus()
	{
		System.out.println("Successfull completed..............");
	}
}