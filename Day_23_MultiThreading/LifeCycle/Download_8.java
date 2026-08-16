package com.thread_LifeCycle;


class Download_8 extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(
                getName() + " Downloading " + i
            );

            Thread.yield();
        }
    }
}

