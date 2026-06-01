class ArithmaticOperator
  {
    public static void main(String args[])
    {
      int num1 = 10;
      int num2 = 20;
      System.out.println("----   Addition   ------");
      System.out.println(num1 + num2);
      //System.out.println(10+20);
      int num3 = num1+ num2;
      System.out.println(num3);

      String s1 = "Venkata";
      String s2 = "Sandeep";
      System.out.println(s1+s2);    //VenkataSandeep
      System.out.println(s1+" "+s2);  //Venkata Sandeep

      System.out.println(s1 + num1);    //to convet the String another data types
      //Venkata 10
      //In java String add any datatype to convert the String


      System.out.println(12 + 1 + 3 + s1 + 1 + 2 + s2 );
      System.out.println(s1 + 1.0 + 2); //s1+1.02 String
      System.out.println();
      System.out.println();
      
      System.out.println("____FLOAT______");
      float num5 = 2.0f;
      float num6 = 5.0f;
      int num7 = 4;
      System.out.println(num5 + num6);
      System.out.println(num5 + num7);  //float values to add the intger to convet the float
      
      float num8 = num6 + num7;
      System.out.println(num8);
      System.out.println(s1 + num8);
      
      System.out.println();
      System.out.println("_______Subtraction______");
      System.out.println(num2-num1);
    //  System.out.println(num2 - s1);
      System.out.println(num5 - num2);
      
     System.out.println(num2 - num6);
     
     System.out.println();
     System.out.println("_______ Multiplication_______");
     
     System.out.println(num2 * num1);
     
    int  num9 = num2*num1;
     //int num10 = num5 * num2;         doesn't print the float multiply and doesn't multiply
     //System.out.println(num10);
     
     int num11 = num2 * num7;
     System.out.println(num11);
     System.out.println();
     
     System.out.println("___Division");
     System.out.println( num2 / num1);
     System.out.println(num5 / num2);
     System.out.println(num1 / 3);
     System.out.println("In the division to divides the float or double to prints the infinity 10.0/0: -  "+10.0 / 0);
     System.out.println("In the division to int divides the float or double to prints the infinity or null 0/10: -  "+0 / 0.0);
      System.out.println(5.0/2.0);
      System.out.println(10/3);
      System.out.println(25 / 5.0);
      System.out.println();
      
      System.out.println("____Modulo________");
      
      System.out.println(10 % 3);
      System.out.println(15 % 2.0);
      System.out.println(10.0 % 5.0);
      System.out.println(11 % 3.0);
      System.out.println(11 % 3 );
    //  System.out.println(10 % 0);
      System.out.println("Here 0 % 2 :- "+0 % 10);
      System.out.println("Here 0.0 % 5 :- "+0.0 % 5);
      System.out.println(10.0 % 0);
      System.out.println("Division is 10.0 / 0 :- "+10.0 / 0);
      System.out.println("Division is 10 / 0.0 :- "+10 / 0.0);
      
    }
  }



/*

    OUTPUT
  ----   Addition   ------
30
30
VenkataSandeep
Venkata Sandeep
Venkata10
16Venkata12Sandeep
Venkata1.02


____FLOAT______
7.0
6.0
9.0
Venkata9.0

_______Subtraction______
10
-18.0
15.0

_______ Multiplication_______
200
80

___Division
2
0.1
3
In the division to divides the float or double to prints the infinity 10.0/0: -  Infinity
In the division to int divides the float or double to prints the infinity or null 0/10: -  NaN
2.5
3
5.0

____Modulo________
1
1.0
0.0
2.0
2
Here 0 % 2 :- 0
Here 0.0 % 5 :- 0.0
NaN
Division is 10.0 / 0 :- Infinity
Division is 10 / 0.0 :- Infinity

=== Code Execution Successful ===

  */
