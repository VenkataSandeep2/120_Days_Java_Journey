package practise3;

public class Main {

	public static void main(String[] args) 
	{
		UPI upi =new UPI();
		upi.pay(3500);
		upi.paymentStatus();
		
		CreditCard cc = new CreditCard();
//		cc.CreditCard(5000);
		cc.pay(15400);
		cc.paymentStatus();			//when the class is there method to print local method
	}

}
