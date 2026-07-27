package com.checked_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exp_1 
{
	    public static void main(String[] args)
	    {
//	        FileReader file =
//	            new FileReader("student.txt");
	    	
	    	 try
	         {
//	             FileReader file =
//	                 new FileReader("D:\\Java Developer Resume (3) - Copy.pdf");
	             FileReader file =
		                 new FileReader("D:\\Java Developer.pdf");

	             System.out.println("File Found");
	         }
	         catch(FileNotFoundException e)
	         {
	             System.out.println("File Not Found");
	         }

	         System.out.println("Program Completed");
	     }
	 }
