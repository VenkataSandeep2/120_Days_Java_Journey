package com.thread_Schedular;

public class Test_2 
{
	public static void main(String[] args) {
		MyThread_2 t1 = new MyThread_2("San");
		MyThread_2 t2 = new MyThread_2("San San ");
		MyThread_2 t3 = new MyThread_2("San San San");
		MyThread_2 t4 = new MyThread_2("San San San San ");
		MyThread_2 t5 = new MyThread_2("San San SAN SAN SAN SAn ");
		
		System.out.println("Main thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
