package com.custom_Exception;

import java.util.Scanner;

public class CustomException 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a age");
		Scanner sc= new Scanner(System.in);
		try {
		int age = sc.nextInt();
		if(age > 18)
		{
			System.out.println("Eligible for Vote");
		}
		else
		{
			System.out.println("not eligible for Vote");
		
		throw new InvalidAgeException("Not Eligible.............");
		}
		}catch(InvalidAgeException ie)
		{
			System.out.println(ie);
			
		}
		finally {
			sc.close();
		}
		}
		
	}



// Custom Exception File

package com.custom_Exception;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}

}

