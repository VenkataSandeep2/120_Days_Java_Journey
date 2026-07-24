package practise3;

public class Main {

	public static void main(String[] args) 
	{
		SbiAtm sbi = new SbiAtm();
		System.out.println("SBi ATM Machine");
		System.out.println("______________");
		sbi.deposit();
		sbi.checkBalance();
		sbi.withdraw();
		System.out.println();
		
		HdfcAtm hdfc = new HdfcAtm();
		System.out.println("Hdfc ATM Machine");
		System.out.println("______________");
		hdfc.deposit();
		hdfc.checkBalance();
		hdfc.deposit();
		hdfc.withdraw();
		System.out.println();
		
		IciciAtm icici = new IciciAtm();
		System.out.println("ICICI ATM Machine");
		System.out.println("______________");
		icici.deposit();
		icici.withdraw();
		icici.checkBalance();

	}

}
