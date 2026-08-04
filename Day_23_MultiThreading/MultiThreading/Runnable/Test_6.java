package commmm.exp_4;

public class Test_6 
{
	public static void main(String[] args) {
		Examp_6 exp2 = new Examp_6();
		
		Thread t2 = new Thread(exp2);
		t2.start();
		System.out.println("Open the notification");
	}

}
