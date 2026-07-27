package com.Unchecked_Exception;

public class Exp_3 
{

	    public static void main(String[] args)
	    {
	       // String employeeName = "san";
	        String employeeName = null;
	        

	        System.out.println("Employee System login");

	        try
	        {
	            int length = employeeName.length();

	            System.out.println("Name Length : " + length);
	        }
	        catch(NullPointerException e)
	        {
	            System.out.println("NULL POINTER EXCEPTION Employee name is not available");
	        }

	        //  String employeeName = "san";
	        //Employee System login
	       // Name Length : 3
	        
	        System.out.println();
	        //String employeeName = null;
//	        Employee System login
//	        NULL POINTER EXCEPTION Employee name is not available

	       
	    }
	
}
