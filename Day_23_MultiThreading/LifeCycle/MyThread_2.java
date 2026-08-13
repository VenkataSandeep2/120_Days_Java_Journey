package com.thread_LifeCycle;

public class MyThread_2 extends Thread
{
	public void run()
	{
		for(int i =0;i<=3;i++)
		{
		System.out.println("playing  -> " + i);
		}	
	}

}
