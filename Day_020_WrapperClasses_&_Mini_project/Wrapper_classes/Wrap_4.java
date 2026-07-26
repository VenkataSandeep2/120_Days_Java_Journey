package com.wrapper_classes;

public class Wrap_4
{
	public static void main(String[] args) {
		System.out.println("String conversion");
		System.out.println();
		
		String s1 = "100";
        String s2 = "100.50";
        String s3 = "true";
        String s4 = "A";
        
        byte byteValue = Byte.parseByte(s1);
        System.out.println(byteValue);
        
        short shortValue = Short.parseShort(s1);
        System.out.println(shortValue);
        
        int intvalue = Integer.parseInt(s1);
        System.out.println(intvalue);
        
        double doublevalue = Double.parseDouble(s1);
        System.out.println(doublevalue);
        
        char charValue = s4.charAt(0);
        System.out.println("char    : " + charValue);
	}

}
