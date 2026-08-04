package com.exp_4;

public class Test_4 
{
	public static void main(String[] args) 
	{
		System.out.println("===");
		MyThread_4 t4 = new MyThread_4();
		t4.run();
		System.out.println("Main thread");
	}

}
