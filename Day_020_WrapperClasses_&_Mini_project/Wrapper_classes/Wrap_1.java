package com.wrapper_classes;

public class Wrap_1 
{
	public static void main(String[] args) {
		
		byte byteValue = 100;

        Byte byteObj = byteValue;          // Autoboxing
        byte byteValue2 = byteObj;         // Auto-Unboxing

        System.out.println("Byte Object : " + byteObj);
        System.out.println("byte Value  : " + byteValue2);
        
        System.out.println("------------------");
        
        short shortValue = 2000;

        Short shortObj = shortValue;       // Autoboxing
        short shortValue2 = shortObj;      // Auto-Unboxing

        System.out.println("Short Object : " + shortObj);
        System.out.println("short Value  : " + shortValue2);

        System.out.println("--------------------------");
        
        int intValue = 50000;

        Integer intObj = intValue;         // Autoboxing
        int intValue2 = intObj;            // Auto-Unboxing

        System.out.println("Integer Object : " + intObj);
        System.out.println("int Value      : " + intValue2);
        
        System.out.println("------------------");
        
        long longValue = 9876543210L;

        Long longObj = longValue;          // Autoboxing
        long longValue2 = longObj;         // Auto-Unboxing

        System.out.println("Long Object : " + longObj);
        System.out.println("long Value  : " + longValue2);
        System.out.println("------------------");
        
        char charValue = 'A';

        Character charObj = charValue;     // Autoboxing
        char charValue2 = charObj;         // Auto-Unboxing

        System.out.println("Character Object : " + charObj);
        System.out.println("char Value       : " + charValue2);
        
	}

}
