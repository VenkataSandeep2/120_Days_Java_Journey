package com.practise;

public class LargestElement 
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,60,80,50,40,32,88};
		int max = arr[0];
		
		for(int i =1 ;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max =arr[i];
			}
		}
		System.out.println(max);
		
	}

}
