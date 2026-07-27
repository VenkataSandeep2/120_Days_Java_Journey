package com.Unchecked_Exception;

public class Exp_4 {
	
	    public static void main(String[] args)
	    {
	        int[] marks = {85, 90, 75};

	        System.out.println("Student Marks");

	        try
	        {
	            System.out.println("Java : " + marks[0]);
	            System.out.println("SQL  : " + marks[1]);
	            System.out.println("HTML : " + marks[2]);

	            // Invalid index
	            System.out.println("CSS  : " + marks[3]);
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("Invalid marks index");
	        }

	        System.out.println("Program Completed");
	    }
	
}
