package com.practise;

public class SumOfArray
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50,60};
		int sum = 0;
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println("Original Array :-> "+arr[i]);
			sum = sum+arr[i];
			System.out.println("Array add the index value oreder -> "+sum);
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Total sum is -> " +sum);
		
	}

}


/*

              OUTPUT
              Original Array :-> 10
              Array add the index value oreder -> 10
              Original Array :-> 20
              Array add the index value oreder -> 30
              Original Array :-> 30
              Array add the index value oreder -> 60
              Original Array :-> 40
              Array add the index value oreder -> 100
              Original Array :-> 50
              Array add the index value oreder -> 150
              Original Array :-> 60
              Array add the index value oreder -> 210
              
              Total sum is -> 210



*/
