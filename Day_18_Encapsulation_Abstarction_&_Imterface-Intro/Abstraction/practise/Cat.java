package practise;

public class Cat extends Animal
{
	@Override
	
	public void sound()
	{
		System.out.println("Meow.......");
	}
	
	public void sleep()
	{
		System.out.println("Cat is sleeping");
	}
	@Override
	public void numOfLegs() {
		
		System.out.println(4);
	}

}
