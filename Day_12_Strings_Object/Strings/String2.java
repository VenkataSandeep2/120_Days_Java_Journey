package com.practise;

public class String2 
{
	public static void main(String args[])
	{
	String s = new String();
	System.out.println("The Object is :-> "+s);
	System.out.println("The Length of the String is :-> "+s.length());
	System.out.println("It isEmpty :-> "+s.isEmpty());
	System.out.println();	
	System.out.println();

	byte b[] = {'s','a','n','d','e','e','p'};
	String s1 = new String(b);
	System.out.println("The Object is :-> "+s1);
	System.out.println("The Length of the String is :-> "+s1.length());
	System.out.println("It isEmpty :-> "+s1.isEmpty());
	System.out.println();	
	System.out.println();

	String s2 = new String(b,1,5);			//start with index zero to last n-1
	System.out.println("The Object is :-> "+s2);
	System.out.println("The Object is :-> "+s2.length());
	System.out.println("The Char at :-> "+s2.charAt(0));
	
	String s3 = new String("Sanjay Bro");
	
	System.out.println("String :-> "+s3);
	for(int i =0; i<s3.length() ;i++)
	{
		System.out.print(s3.charAt(i)+" ");
//		System.out.println();
//		System.out.println("String to char :->"+s3.charAt(i) +"   ");
	}

	}


}
