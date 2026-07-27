package com.Unchecked_Exception;

import java.util.Scanner;

public class Exp_1 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a second number ");
		int num2= sc.nextInt();
		
		int num3 = num1/num2;
		
		System.out.println(num3);
		/*
		 
		 * Enter a number:- 
		52
		Enter a second number 
		s
		Exception in thread "main" java.util.InputMismatchException
		 */
		
		
//		Enter a number:- 
//		50
//		Enter a second number 
//		0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at com.checked_Exception.Exp_1.main(Exp_1.java:15)

	}

}
