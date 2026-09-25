package com.clone;

public class Emp_Test_1 {
	
	    public static void main(String[] args)
	            throws CloneNotSupportedException {

	        Employee_1 e1 =new Employee_1(101, "Ravi", 50000);

	        Employee_1 e2 = e1.clone();

	        e2.name = "Sandeep";
	        e2.salary = 70000;

	        System.out.println(e1.name);
	        System.out.println(e1.salary);

	        System.out.println(e2.name);
	        System.out.println(e2.salary);
	    }

}
