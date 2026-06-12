package Practise;

import java.util.*;
public class Fibonancci {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		
		for(int i = 2 ; i<=num ;i++)
		{
			System.out.print(a + " ");
			int c = a+b;
			a = b;
			b = c;
		}
	}
}
/*
OUTPUT

Enter a number
10
0 1 1 2 3 5 8 13 21 34 
=== Code Execution Successful ===

Enter a number
7
0 1 1 2 3 5 8 
=== Code Execution Successful ===
Enter a number
11
0 1 1 2 3 5 8 13 21 34 55 
=== Code Execution Successful ===


  */
public class Fibonacci
{
	public static void main(String[] args) 
	{
	  int num =7;
	  int a = 0;
	  int b = 1;
	  
	  for(int i =1;i<=num;i++)
	  {
	      System.out.print(a +" ");
	      int c = a+b;
	      a = b;
	      b = c;
	  }
	}
}

/*
  OUTPUT
  0 1 1 2 3 5 8 
=== Code Execution Successful ===

  */
	
