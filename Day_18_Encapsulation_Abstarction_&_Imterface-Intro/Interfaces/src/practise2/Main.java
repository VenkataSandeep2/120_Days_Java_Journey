package practise2;

public class Main 
{
	public static void main(String[] args) 
	{
		Airtel ai = new Airtel();
		ai.calling();
		ai.internet();
		ai.sms();
		System.out.println();
		
		Jio jio = new Jio();
		jio.calling();
		jio.internet();
		jio.sms();
		
	}
}
