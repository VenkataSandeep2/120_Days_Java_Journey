package com.thread_LifeCycle;

class Student_9 extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("Student thread started");

            Thread.sleep(2000);

            System.out.println("Study material downloaded");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}