package com.staticvariables;

public class Test_1 
{
	public static void main(String[] args) {
		  Student_1 s1 = new Student_1();
	        s1.id = 101;
	        s1.name = "Rahul";

	        Student_1 s2 = new Student_1();
	        s2.id = 102;
	        s2.name = "Ramesh";

	        s1.display();
	        s2.display();
	    }
	}