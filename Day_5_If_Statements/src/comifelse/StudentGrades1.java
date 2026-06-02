package comifelse;

public class StudentGrades1 
{
	public static void main(String[] args) 
	{
		     int score = 85;
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
