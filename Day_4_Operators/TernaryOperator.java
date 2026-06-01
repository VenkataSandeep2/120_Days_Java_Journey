class TernaryOperator
  {
    public static void main(String args[])
    {
      System.out.println("Ternary Operator");

      System.out.println((10 < 5) ? "10 is big" : "5 is big");
      System.out.println((10 > 5) ? "10 is big" : "5 is big");
      System.out.println((10<=5) ? "10 is big" : "5 is big");
      String res = (5 <= 5) ? "5 is big" : "5 is big";
      System.out.println(res);
      System.out.println();
      
      int num1 = 10;
      int num2 = 5;
      
      String bignum = (num2>num1) ? (num2 +"is big") : (num1 + "is big");
    System.out.println(bignum);
    
    int num3 = 5;
    String numb =(num3 > 0) ? "positive":"negative";
    System.out.println(numb);
    }
  }


/*

OUTPUT

  Ternary Operator
5 is big
10 is big
5 is big
5 is big

10is big
positive

=== Code Execution Successful ===

  */
