public class Pattern1 
{
	public static void main(String[] args) {
		
	
	for(int row =1; row <= 5;row++)
	{
		System.out.println("*");
	}

    /*
    OUTPUT
    *
    *
    *
    *  
    *
      */
	
	
	System.out.println();
	for(int i = 1; i<= 5;i++)
	{
		System.out.print("* ");
	}
	System.out.println();


    /*
    OUTPUT
    
    * * * * * 

      */
    
	
	System.out.println();
	for(int i = 1;i<=5;i++)
	{
	    for(int j = 1;j<=5;j++)
	    {
	        System.out.print("* ");
	    }
	    System.out.println();
	}


    /*
      OUTPUT
      * * * * * 
      * * * * * 
      * * * * * 
      * * * * * 
      * * * * * 

      */
	
	System.out.println();
	for(int i = 1; i <= 5;i++)
	{
		for(int j=0 ;j<= i-1;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}


    /*
      OUTPUT
            
      * 
      * * 
      * * * 
      * * * * 
      * * * * * 
        */
	System.out.println();
	for(int i =1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("* ");
		}
	System.out.println();
	}


/*
  OUPUT

    * * * * * 
    * * * * 
    * * * 
    * * 
    * 
*/

    
	System.out.println();
	
	for(int i= 1;i<=5;i++)
	{
	    for(int j = 1;j<=i;j++)
	    {
	        System.out.print(j+" ");
	    }
	    System.out.println();
	}
}
}
      /*
    OUTPUT
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5 
        */







//here is the fulll code


public class Pattern1 
{
	public static void main(String[] args) {
		
	
	for(int row =1; row <= 5;row++)
	{
		System.out.println("*");
	}
	
	
	System.out.println();
	for(int i = 1; i<= 5;i++)
	{
		System.out.print("* ");
	}
	System.out.println();
	
	System.out.println();
	
	for(int i = 1;i<=5;i++)
	{
	    for(int j = 1;j<=5;j++)
	    {
	        System.out.print("* ");
	    }
	    System.out.println();
	}
	
	
	System.out.println();
	for(int i = 1; i <= 5;i++)
	{
		for(int j=0 ;j<= i-1;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	

	System.out.println();
	for(int i =1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("* ");
		}
	System.out.println();
	}
	System.out.println();
	
	for(int i= 1;i<=5;i++)
	{
	    for(int j = 1;j<=i;j++)
	    {
	        System.out.print(j+" ");
	    }
	    System.out.println();
	}
	
	
}

}

/* 
OUTPUT
*
*
*
*
*

* * * * * 

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

* 
* * 
* * * 
* * * * 
* * * * * 

* * * * * 
* * * * 
* * * 
* * 
* 

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

=== Code Execution Successful ===

  */
