package com.staticvariables;

public class Test_2 
{
	public static void main(String[] args) 
	{
		Employee_2 e2= new Employee_2();
		e2.id =1;
		e2.name ="San";
		
		
		Employee_2 e22= new Employee_2();
		e22.id =1;
		e22.name ="Sand";
		
		e2.display();
		e22.display();
		
	}

}
