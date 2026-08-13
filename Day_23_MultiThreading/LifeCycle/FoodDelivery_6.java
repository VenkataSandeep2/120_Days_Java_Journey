package com.thread_LifeCycle;

public class FoodDelivery_6 extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Order Accepted");

            Thread.sleep(2000);

            System.out.println("Food Prepared");

            Thread.sleep(2000);

            System.out.println("Food Delivered");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}