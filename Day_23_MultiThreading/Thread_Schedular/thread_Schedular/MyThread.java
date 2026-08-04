package com.thread_Schedular;

public class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0;i<= 4;i++)
		{
			System.out.println(getName() + " " +i);
		}
	}

}
