package commmm.exp_4;

public class Test_7 
{
	public static void main(String[] args) 
	{
		Examp_7 exp = new Examp_7();
		
		Thread t3 = new Thread(exp);
		
		t3.start();
		System.out.println("Main Thread");
	}

}
