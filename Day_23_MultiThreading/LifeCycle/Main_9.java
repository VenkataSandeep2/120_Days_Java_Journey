package com.thread_LifeCycle;

public class Main_9 
{
	public static void main(String[] args) {
		Student_9 s = new Student_9();
		
		System.out.println("1-> " +s.getState());
		s.start();
		
		System.out.println("2 -> "+s.getState());
		try {
        Thread.sleep(500);
        System.out.println("3. State : " + s.getState());
		s.join();
		
		
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Terminated "+s.getState());
		
	}

}
