package com.practise;

public class String4 
{
	public static void main(String args[])
	{
	String s = "Rama";
	String s1 = "Rama";
	//int res = s.compareTo(s1);
	int res = s.compareToIgnoreCase(s1);
	if(res > 0)
		{
		System.out.println("First is big");
		}
		else if(res < 0)
		{
		System.out.println("second is big");
		}
		else {
		System.out.println("Third is big");
		}
	}	
	

	

}
