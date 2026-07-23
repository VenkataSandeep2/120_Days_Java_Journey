package scom.Polymorphism_5;

public class Main {
	public static void main(String[] args) {
		TvRemote tv = new TvRemote();
		tv.turnOn();
		tv.turnOff();
		System.out.println(tv.hashCode());
		
	}
}
