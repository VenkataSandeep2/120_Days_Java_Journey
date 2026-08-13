package com.thread_LifeCycle;
class Count_5 extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 5; i >= 1; i--)
            {
                System.out.println("Countdown : " + i);

                Thread.sleep(1000);
            }

            System.out.println("Go!");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}