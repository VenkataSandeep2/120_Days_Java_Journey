package com.practise;

import java.util.Scanner;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:-> ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter a Integer values only : ");
		
		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i =0 ; i < size ;i++)
		{
			System.out.println("Array of Index "+i+ " value  " +arr[i]+" ");
		}
		
	}	

}
