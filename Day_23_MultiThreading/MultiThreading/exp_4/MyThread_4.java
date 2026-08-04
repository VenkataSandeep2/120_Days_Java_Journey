package com.exp_4;

public class MyThread_4 
{
	public void run()
	{
		for(int i =0;i<=5;i++)
		{
			System.out.println("Downloading -" +(i*20)+ "%");
		}
	}

}
