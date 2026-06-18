package com.practise;

public class Array
{
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,50,60,80};
		
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println("Index Value "+i+" " +"Array value :-" +arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
