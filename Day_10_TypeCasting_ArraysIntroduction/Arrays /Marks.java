package com.practise;

public class Marks 
{
	public static void main(String[] args) 
	{
		int [] marks = new int[7];
		
		marks[0] = 90;
		marks[1] = 85;
		marks[2] = 91;
		marks[3] = 75;
		marks[4] = 86;
		marks[5] = 65;
		marks[6] = 80;
		System.out.println("Telugu :- "+ marks[0]);
		System.out.println("Hindi :- "+ marks[1]);
		System.out.println("English :- "+ marks[2]);
		System.out.println("Maths :- " +marks[3]);
		System.out.println("Science :- " +marks[4]);
		System.out.println("Social :-" +marks[5]);
		System.out.println("Physics :- "+marks[6]);
		//System.out.println(":- "+marks[7]);	//java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println();
	}
}

		
		
		/*OUTPUT
              
              Telugu :- 90
              Hindi :- 85
              English :- 91
              Maths :- 75
              Science :- 86
              Social :-65
              Physics :- 80




			*/
