class LogicalOperator
  {
    public static void main(String args[])
    {
      boolean isMajor = true;
      boolean hasVoterId = false;
      System.out.println(isMajor && hasVoterId);
      
      boolean hasDrivingLicense = true;
      System.out.println(isMajor && hasDrivingLicense); //true
      System.out.println(isMajor || hasVoterId);        //true
      System.out.println(!isMajor || hasVoterId);       //false
      System.out.println(!(!hasVoterId));               //false
      
      boolean large = (10 > 5) &&(15>10);               //true
      System.out.println();
      System.out.println(large);
      
      boolean large1 = (10 < 5) &&(15 > 10);        //false
      System.out.println();
      System.out.println(large1);
      boolean large2 = (10 > 5) || (15>10);             // true
      System.out.println();
      System.out.println(large2);
      
      boolean large3 = (10 < 15) || (15 > 10);              // true
      System.out.println();
      System.out.println(large3);
      
      boolean res = (10>5) || (15<6) &&(15 > 25) &&(10>=5); //true
      System.out.println(res);
      
      boolean res1 = (10<5) || (15<6) &&(15 > 25) &&(10>=5); //false
      System.out.println(res1);
      
      int a = 15;
      System.out.println(false || (a>5));        //true
      System.out.println(!true || (a<5));        //false
      System.out.println(!false || (a<5));      //true

      
    
    }
  }



/*
OUTPUT
false
true
true
false
false

true

false

true

true
true
false
true
false
true

=== Code Execution Successful ===




*/
