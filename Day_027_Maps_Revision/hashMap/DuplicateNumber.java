package com.hashMap;

import java.util.HashSet;

public class DuplicateNumber 
{
public static void main(String[] args) 
{
	int[] arr =  {10,30,50,4,0,10,3,50,40,20,85,025};
	
	HashSet<Integer> dup = new HashSet<Integer>();
	
	for(int number: arr)
	{
	if(!dup.add(number))
	{
		System.out.println("Duplicate numbers:- "+ number);
	}
	
	}
}	
}
