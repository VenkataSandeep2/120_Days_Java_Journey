package com.Unchecked_Exception;

import java.util.Scanner;

public class Exp_6 {
	    public static void main(String[] args)
	    {
	    	System.out.println("Enter a number");
	    	
	    	Scanner sc = new Scanner(System.in);
	        try
	        {
	            // ArithmeticException
	            int a = sc.nextInt();
	            int b = sc.nextInt();

	            int result = a / b;
	            int res = a+b;

	            System.out.println("Result : " + result);
	            System.out.println("res : "+ res);

	            // NullPointerException
	            String name = null;

	            System.out.println(name.length());
	        }

	        catch(ArithmeticException e)
	        {
	            System.out.println("Cannot divide by zero");
	        }

	        catch(NullPointerException e)
	        {
	            System.out.println("String value is null");
	        }

	        System.out.println("Program Completed");
	    }
	
}
