package com.thread_LifeCycle;

public class SleepExample_4 
{
	public static void main(String[] args) {
		try {
		System.out.println("Sleep 1 second");
		
		
			Thread.sleep(1000);
			System.out.println("After Sleep");
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
