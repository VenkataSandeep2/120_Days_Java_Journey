package com.multiLevel_4;

public class Main {

	public static void main(String[] args) 
	{
		Manager ma = new Manager();
		ma.login();
		ma.approveLeave();
		//ma.hashCode();
		ma.work();
		System.out.println();
		System.out.println("Hashcode of the object -> "+ma.hashCode());
	}

}
