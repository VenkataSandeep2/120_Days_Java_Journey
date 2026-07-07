package com.multiLevel_2;

public class Main 
{
	public static void main(String[] args) {
		Developer d = new Developer();
		d.walk();
		d.work();
		d.code();
		System.out.println(d.hashCode());
	}

}
