package com.Comprator;

import java.util.Comparator;

public class Employee_Sal_Name 
{
	 int id;
	    String name;
	    double salary;
		public Employee_Sal_Name(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee_Sal_Name [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

		
}