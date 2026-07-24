package practise3;

public class SbiAtm implements ATM
{
	@Override
	public void deposit() {

		System.out.println("Depost the amount");
	}
	
	@Override
	public void checkBalance() {
		System.out.println("Check the Balance");
		
	}
	

	@Override
	public void withdraw() {
		System.out.println("Withdrae the amount ");
		
	}
}
