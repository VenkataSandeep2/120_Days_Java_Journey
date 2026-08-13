package com.thread_LifeCycle;

public class MyThreadSleep_3 extends Thread
{
	@Override
	public void run() 
	{
		try {
			System.out.println("Working");
			Thread.sleep(1500);
			System.out.println("Workign again");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
