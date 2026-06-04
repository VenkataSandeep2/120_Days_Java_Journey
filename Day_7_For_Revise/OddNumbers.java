package Practise;

import java.util.*;
public class OddNumbers {

	public static void main(String[] args) 
	{
	System.out.println("Enter a number:-");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("Even Numbers ");
	for(int i = 1 ; i <= num;i+=2)
	{
		System.out.println(i);
	}
		
	}

}
