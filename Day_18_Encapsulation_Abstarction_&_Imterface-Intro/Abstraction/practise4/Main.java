package practise4;


public class Main 
{
	public static void main(String[] args) 
	{
		KFC kfc = new KFC();
		kfc.orderReceived();
		kfc.prepareFood();
		kfc.parcel();
		System.out.println();
		
		PizzaHunt pz = new PizzaHunt();
		pz.orderReceived();
		pz.prepareFood();
		//pz.parcel();
	}

}
