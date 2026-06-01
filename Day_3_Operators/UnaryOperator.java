class UnaryOperator
  {
    public static void main(String args[])
    {
      System.out.println("The Unary Operators are a+ , a++ , ++a, a- , a-- , --a : post increment and preincremnt");
      int num1 = 10;
      int num2 = 20;
      System.out.println(+num2);    //+20 =     20
      System.out.println(-num2);    //+(-20) = -20
      System.out.println(+ num1);   //+ (+10) = 10
      System.out.println(- num1);   //-(+10) = -10
      boolean canVote = true;
      System.out.println(canVote);
      System.out.println(!canVote);     //! no
      System.out.println();
      System.out.println("_____Increment operator___");
      num1++;
      num2++;
      
      System.out.println(num1);
      System.out.println(num2);
      
      num1--;
      num2--;
      System.out.println(num1);
      System.out.println(num2);
      System.out.println();
      ++num1;
      ++num2;
      
      System.out.println(num1);
      System.out.println(num2);
      
      --num1;
      --num2;
      System.out.println(num1);
      System.out.println(num2);
      
      System.out.println("Here is both are same think but actually some logic to develop ");
      System.out.println("Now see another example");
      
      System.out.println();
      System.out.println("The post increment x++ is :- " + num1++); //10
      System.out.println("The num1 value is " + num1);  //11
      
      System.out.println("The pre increment ++x is :- "+ ++num1);   //12
      
      int num3 = 15;
      num3++;
      System.out.println(num3);
      System.out.println(++num3);
      
      int num4 = 21;
      int num5 = ++num4;
      System.out.println(num5);
      
      int res1 = ++num1 + num2++ + num4++;
      System.out.println(res1);
      
      res1 = num4++ + ++num2 + num2++;
      System.out.println(res1);
      
      int num6 = 5;
      int num7 = 15;
      System.out.println(num6--);
      System.out.println(num6);
      
      System.out.println(--num6);
      System.out.println(num6);
      
      System.out.println(--num4 + num5++ - ++num1 + num2++);
      
    
      
    }
  }



/*
  OUTPUT
The Unary Operators are a+ , a++ , ++a, a- , a-- , --a : post increment and preincremnt
20
-20
10
-10
true
false

_____Increment operator___
11
21
10
20

11
21
10
20
Here is both are same think but actually some logic to develop 
Now see another example

The post increment x++ is :- 10
The num1 value is 11
The pre increment ++x is :- 12
16
17
22
55
67
5
4
3
3
54

=== Code Execution Successful ===


*/
