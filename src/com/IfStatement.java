package com;

class IfCStatement1
{
  public static void main(String args[])
  {
    //10 > 5
    //true
    if(10 > 5)
    //if(10<5)    //does not print the output 
    {
      System.out.println("10 is big");
    }
    
    if(10>4)
    {
        System.out.println("10 is big");
      }
      if(10 >= 10)
      {
          System.out.println("true");
      }
      if(20 != 20)
      {
          System.out.println(" true");
      }
  }
}



/*OUTPUT

10 is big
10 is big
true

*/