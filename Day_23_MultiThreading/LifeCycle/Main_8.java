package com.thread_LifeCycle;

public class Main_8
{
    public static void main(String[] args)
    {
        Download_8 d1 = new Download_8();
        Download_8 d2 = new Download_8();

        d1.setName("File-A");
        d2.setName("File-B");

        d1.start();
        d2.start();
    }
}