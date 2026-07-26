package com.wrapper_classes;

public class Wrap_2
{
	public static void main(String[] args) 
	{
		
		byte by = 120;
		System.out.println("Byte value to convert differnt datatypes");
		System.out.println("orginal byte value-->"+by);
		
		short shortvalue = by;
		System.out.println("byte -> short value " + shortvalue);
		
		int intvalue = by;
		System.out.println("byte -> int value "+ intvalue);
		long longvalue = by;
		System.out.println("byte -> long value "+longvalue);
		
		 float floatValue = by;
		 
		 System.out.println("byte -> float value "+ floatValue );
		 
		 double doublevalue =by;
		 System.out.println("byte -> double value " +doublevalue);
		 
		 System.out.println();
		 System.out.println("----------------------------------");
		 System.out.println();
		 System.out.println("byte to Char Converion");
		 
		  byte value1 = 65;
	        byte value2 = 66;
	        byte value3 = 67;
	        byte value4 = 97;
	        byte value5 = 98;

	        char ch1 = (char) value1;
	        char ch2 = (char) value2;
	        char ch3 = (char) value3;
	        char ch4 = (char) value4;
	        char ch5 = (char) value5;

	        System.out.println(value1 + " -> " + ch1);
	        System.out.println(value2 + " -> " + ch2);
	        System.out.println(value3 + " -> " + ch3);
	        System.out.println(value4 + " -> " + ch4);
	        System.out.println(value5 + " -> " + ch5);
		 
	}

}
