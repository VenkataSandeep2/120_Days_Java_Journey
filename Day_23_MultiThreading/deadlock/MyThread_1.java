package com.deadlock;

public class MyThread_1 extends Thread
{
	Resouce r1;
	Resouce r2;

	    MyThread_1(Resouce r1, Resouce r2)
	    {
	        this.r1 = r1;
	        this.r2 = r2;
	    }

	    public void run()
	    {
	        synchronized(r1)
	        {
	            System.out.println(getName() + " locked " + r1.name
	            );

	            try
	            {
	                Thread.sleep(1000);
	            }
	            catch(InterruptedException e)
	            {
	            	System.out.println(e);
	            }
	         }
	        System.out.println(getName() + " waiting for " + r2.name);
	            
	    }
}

