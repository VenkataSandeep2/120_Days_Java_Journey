package com.thread_Schedular;

public class MyThread_2 extends Thread
{

	public MyThread_2(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(getName()+ "hey hello");
		}
	}
	
}
