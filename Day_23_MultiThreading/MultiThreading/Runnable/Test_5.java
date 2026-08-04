package commmm.exp_4;

public class Test_5 
{
	public static void main(String[] args) {
		Exp_5 exp= new Exp_5();
		
		Thread t1 = new Thread(exp);
		t1.start();
		//t1.run();
		System.out.println("Main cls Thread");
	}
}
