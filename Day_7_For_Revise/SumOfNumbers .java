package Practise;

import java.util.*;
public class SumOfNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 0;i<= num ;i++)
		{
			sum= sum+i;
			System.out.println(i+" " +sum);
		}
		System.out.println("sum of digits value is ->"+sum);
	}

}
