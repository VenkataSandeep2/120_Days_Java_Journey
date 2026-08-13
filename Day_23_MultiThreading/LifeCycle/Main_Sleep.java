package com.thread_LifeCycle;

public class Main_Sleep {
	public static void main(String[] args) {
	
		MyThreadSleep_3 t = new MyThreadSleep_3();
		t.start();
		System.out.println("MAin thread");
	}

}
