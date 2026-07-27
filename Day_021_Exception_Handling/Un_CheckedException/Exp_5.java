package com.Unchecked_Exception;

public class Exp_5 {
	
	    public static void main(String[] args)
	    {
	        String ageInput = "Ten";		// String ageInput = "10";

	        System.out.println("Registration Started");

	        try
	        {
	            int age = Integer.parseInt(ageInput);

	            System.out.println("Age : " + age);

	            if(age >= 18)
	            {
	                System.out.println("Eligible");
	            }
	            else
	            {
	                System.out.println("Not Eligible");
	            }
	        }
	        catch(NumberFormatException e)
	        {
	            System.out.println("Please enter age using numbers");
	        }

	        System.out.println("Registration Completed");
	    }
	
}
