package practise3;

public class UPI extends Payment
{
	@Override
	void pay(double amount) 
	{
	System.out.println("Paid  " + amount +" sucessfully using UPI");
	}
}
