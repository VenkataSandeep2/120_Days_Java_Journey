package com.exp_2;

public class MyThread_2 extends Thread
{
	public void run()
	{
		
		for(int i = 0;i<999999;i++)
		{

			
			System.out.println("Thread "+ i);
		}
		//System.out.println("Parent class or Thread super");
	}

}
