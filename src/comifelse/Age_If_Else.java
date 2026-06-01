package comifelse;

import java.util.*;
public class Age_If_Else {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num :");
		int age=sc.nextInt();
		
		if(age < 18)
		{
			System.out.println("Child age is "+ age);
		}
		else if(age <= 25)
		{
			System.out.println("Adult age "+ age );
		}
		else if(age <= 35)
		{
			System.out.println("Young age "+ age);
		}
		else
		{
			System.out.println("Senior Citizen "+ age);
		}
	}

}
