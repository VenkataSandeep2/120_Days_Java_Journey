package com.thread_LifeCycle;
public class Main_7
{
    public static void main(String[] args)
    {
        Student_7 s = new Student_7();

        System.out.println("Before start: " + s.getState());

        s.start();

        try
        {
            s.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("After completion: " + s.getState());
    }
}