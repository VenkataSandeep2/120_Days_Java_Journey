package com.deadlock;

public class Main
{
    public static void main(String[] args)
    {
    	Resouce r1 = new Resouce("Resource-1");
    	Resouce r2 = new Resouce("Resource-2");

        MyThread_1 t1 =new MyThread_1(r1, r2);

        MyThread_1 t2 =new MyThread_1(r2, r1);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}