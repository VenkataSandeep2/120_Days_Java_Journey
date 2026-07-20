package getter_setter_com;

public class BankAccount 
{
		public int accnum;
		public double bal;
		private int secretpin;
		
		public int getaccnum()
		{
			return accnum;
		}
		
		public void setaccnum (int accnum) 
		{
			this.accnum= accnum;
		}
		
		
		public double getbal()
		{
			return bal;
		}
		
		public void setbal(double bal)
		{
			
			if(bal<0)
			{
				System.out.println("Balance is negative");
			}else
			{
				this.bal = bal;
			}
		}
		
		public int getsecretpin()
		{
			return secretpin;
		}
		public void setsecretpin(int secretpin)
		{
			
			this.secretpin = secretpin;
		}
		
		//verification 
		 public void showBalance(int pin)
		  {
			 if(pin == secretpin)
				 {
				 System.out.println("Account Balance: " + bal);
				 }
			 else
				 {
				 System.out.println("Incorrect PIN!");
				 }
		  }

}
