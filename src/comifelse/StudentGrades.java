package comifelse;

import java.util.*;
public class StudentGrades {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a marks ");
	        int score = sc.nextInt();
	        if (score >= 90) 
	        {
	            System.out.println(score+" Grade: A");
	        }
	        else if (score >= 80) 
	        {
	            System.out.println(score+" Grade: B"); // This will print for a score of 85
	            }
	        else if (score >= 70) 
	        {
	            System.out.println(score+" Grade: C");
	        }
	        else if(score >= 50)
	        {
	           System.out.println(score+" Grade D"); 	
	        }
	        
	        
	        else{
	                System.out.println(score+" Grade: F");
	                }
	    }
	    
	  }