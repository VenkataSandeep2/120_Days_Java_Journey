package com.thread_LifeCycle;

public class Main_2 
{
	public static void main(String[] args) {
		MyThread_2 t = new MyThread_2();
		MyThread_2 t1 = new MyThread_2();
		t.start();
		t1.start();
		
	}
}
