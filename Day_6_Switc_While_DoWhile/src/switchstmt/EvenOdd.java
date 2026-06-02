import java.util.*;
class EvenOdd
{
    public static void main(String [] args)
    {
     int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	num = sc.nextInt();
      
	switch(num % 2) 
	    {
	   case 0:
		System.out.println(num + "is even");
		break;
	  case 1:
		System.out.println(num + " is odd");
		break;
	  default:
		System.out.println("Unexcepted Error");
 	    }
   }	
}
