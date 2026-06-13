package com;

public class Test2 
{
	public static void main(String[] args) 
	{
		int i  = 102;
		char ch = i ;
		System.out.println(i);
		System.out.println(ch);    //To GEt the error
		
	}

}


/*
OUTPUT

  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to char

	at com.Test2.main(Test2.java:8)
*/


package com;

public class Test2 
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		int i  = ch;

		System.out.println(ch);
		System.out.println(i);    
	}

}

/*

OUTPUT

  A
  65



