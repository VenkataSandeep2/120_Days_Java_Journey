package scom.Polymorphism_6;

public class Main 
{
	public static void main(String[] args) {
		AcRemote ac = new AcRemote();
		ac.turnOn();
		ac.turnOff();
		AcRemote.turnOff();
	}

}
