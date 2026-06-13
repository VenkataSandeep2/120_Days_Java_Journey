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
//	    int[] arr = new int[0];
//		arr[0] = 1;
//		System.out.println(arr[0]);		//java.lang.ArrayIndexOutOfBoundsException
//		
		System.out.println();
		System.out.println("=====ARRAY FORMATION========");
		
		char[] grades = {'a','b'};
		System.out.println("Index of 0 is  Grade " + grades[0]);
		grades[0] = 'c';
		System.out.println("After Index update of 0 is Grade " + grades[0]);
		System.out.println("Index of 1 is  Grade " + grades[1]);
		System.out.println("The Grades are in the Arrya:- > "+ grades[0] +" "+grades[1]);
		
		System.out.println();
		System.out.println("================Boolean=================");
		boolean[] arr2 = new boolean[1];
		arr2[0] = true;
		//arr2[0] = !true;
		System.out.println(arr2[0]);
		
		System.out.println();
		System.out.println("=============String Array================");
		String[] str = new String[2];
		str[0] = "Avs";
		str[1] = "Sandeep";
		//str[2] = " hello ";
		System.out.println("String -> " +str[0]);
		System.out.println("String -> " + str[1]);
		System.out.println("String Concanation:-> " + str[0] +" "+ str[1]);
		//System.out.println(str[2]);		//java.lang.ArrayIndexOutOfBoundsException
		
		
	}
}


/*
              OUTPUT
              
              Telugu :- 90
              Hindi :- 85
              English :- 91
              Maths :- 75
              Science :- 86
              Social :-65
              Physics :- 80
              
              
              =====ARRAY FORMATION========
              Index of 0 is  Grade a
              After Index update of 0 is Grade c
              Index of 1 is  Grade b
              The Grades are in the Arrya:- > c b
              
              ================Boolean=================
              true
              
              =============String Array================
              String -> Avs
              String -> Sandeep
              String Concanation:-> Avs Sandeep

                */
