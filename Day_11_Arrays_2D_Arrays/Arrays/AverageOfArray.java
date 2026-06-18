package com.practise;

public class AverageOfArray
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		double avg ;
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
			
			sum = sum+arr[i];
		}
		System.out.println();
		avg = sum/arr.length;
		System.out.println(avg);
		
	}

}
