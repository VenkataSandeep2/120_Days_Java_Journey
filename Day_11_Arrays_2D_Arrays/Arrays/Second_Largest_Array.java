package com.practise;

public class Second_Largest_Array 
{
	public static void main(String[] args) 
	
	{
		int [] arr = {10,50,60,90,80,40,35,65,95,15,1025,95};
		int largest = Integer.MIN_VALUE ;
		int secondlargest = Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				secondlargest = largest;
				largest = arr[i];
				
			}	
			else if(arr[i] > secondlargest && arr[i] != largest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondlargest);
		
	}

}
