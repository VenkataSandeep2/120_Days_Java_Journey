package com;

public class Test1 
{
	public static void main(String[] args) 
	{
		byte b= 120;
		short s = b ;
		int i = s;

		long l = s;
		float f = l;
		double d =f;
		System.out.println(b);
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
	}

}


/*
OUTPUT
    120
    120
    120
    120
    120.0
    120.0
