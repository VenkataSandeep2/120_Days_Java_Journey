package get_setcom;


public class Bank 
{
	public static void main(String[] args) 
	{
		BankAccount bankacc = new BankAccount();
		bankacc.setaccnum(354531);
		bankacc.setbal(8543.16);

		System.out.println("Bank account number is :-> " + bankacc.getaccnum());
		System.out.println("Account balance is -> " + bankacc.getbal());
	}
}