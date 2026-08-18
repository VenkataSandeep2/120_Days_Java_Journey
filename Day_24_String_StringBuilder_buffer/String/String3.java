package com.practise;

public class String3 
{
	public static void main(String args[])
	{

	byte b[] = {97,98,99,100,101,102,103,105,106};
	String s1 = new String(b);
	System.out.println("The Object is : "+s1);
	System.out.println("The Length of the String is : "+s1.length());
	System.out.println("Is itEmpty : "+s1.isEmpty());
	
	System.out.println();
	System.out.println();
	
	char x[] = {'s','a','n','d'};
	String s= new String(x);
	System.out.println("The Object is : "+s);
	System.out.println("The Length of the String is : "+s.length());
	
	char y[] = s.toCharArray();					//conver the string object
	System.out.println("The char array: "+s);
	for (int i = 0; i < y.length; i++) 
	 	{
		System.out.print(y[i]+"  ");
	 	}
	//System.out.println();
	System.out.println("ASIC VALUES ");
	byte b1[] = {65,66,67,68,69,70};
	String s2 = new String(b1);
	System.out.println("The object is : "+s2);
	System.out.println("The array length  : " +s2.length());
	byte bb[] =s1.getBytes();
	       for(int i =0;i< bb.length ;i++)
			{
			System.out.print(bb[i]+" ");
			}
	

	}
}