package practise;

public class Main 
{
	public static void main(String[] args) 
	{
		FuelCar fc = new FuelCar();
		fc.start();
		fc.stop();
		System.out.println();
		ElectricCar ec = new ElectricCar();
		ec.start();
		ec.start();
		ec.stop();
	}

}
