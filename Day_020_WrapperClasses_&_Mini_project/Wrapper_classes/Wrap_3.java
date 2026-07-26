package com.wrapper_classes;


public class Wrap_3
{
	public static void main(String[] args) {
		int a = 100;
		System.out.println("a-> "+a);
		
		//Integer b = Integer(20);
		Integer c = Integer.valueOf(20);
		System.out.println("c-> "+c);
		Integer d = Integer.valueOf(c);
		System.out.println("d-> "+d);
		Integer f = 52;	//Auto Boxing
		int g =f;		//Auto Unboing
		Integer num ;
		System.out.println(f);
		System.out.println("f-> "+g);
		
		Boolean bool = false;
		Integer num1 = 10;
		Integer num2 = 25;
		System.out.println(num1+2);
		System.out.println(num1);
		
		int num3 = Integer.parseInt("100");
		System.out.println(num3);
		
		int num4= Integer.parseInt("85");
		System.out.println(num4);
		
		String num5 = String.valueOf(10);
		System.out.println(num5);
		
		Character ch = Character.valueOf('A');
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('S'));
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isDigit('5'));
		
		Integer num6 = 150;
		System.out.println(num6.hashCode());
		
		num6 = 140;
		System.out.println("num6 "+num6);
		
		Integer num7 = 140;
		System.out.println("num7 "+num7);
		System.out.println(num6 == num7);
		
	}

}
