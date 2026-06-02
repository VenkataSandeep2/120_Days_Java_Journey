package comifelse;
import java.util.*;
public class Scan_EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num =sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println(num +" Even Number");
		}
		else
		{
			System.out.println(num +" Odd number");
		}
	}
}
