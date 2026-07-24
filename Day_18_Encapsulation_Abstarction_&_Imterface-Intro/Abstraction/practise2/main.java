package practise2;

public class main {

	public static void main(String[] args) 
	{
		Developer dev =new Developer();
		dev.login();
		dev.work();
		System.out.println();
		
		Tester tes =new Tester();
		
		tes.login();
		tes.work();
	}

}
