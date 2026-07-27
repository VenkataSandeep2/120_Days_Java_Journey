package com.Unchecked_Exception;

import java.util.Scanner;

public class Exp_2 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:- ");
		try {
		int num1 = sc.nextInt();
		
		System.out.println("Enter a second number ");
		int num2= sc.nextInt();
	
		int num3 = num1/num2;
		System.out.println(num3);
		
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		
	}

}
