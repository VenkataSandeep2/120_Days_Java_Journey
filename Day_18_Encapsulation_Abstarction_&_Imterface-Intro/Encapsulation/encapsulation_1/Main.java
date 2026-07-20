package scom.encapsulation_1;

public class Main 
{
	public static void main(String[] args) {
		
	
	Company co = new Company();
	co.setUsername("Sanjay");
	co.setPassword("San@123");
	
	
	co.login("Sanjay","San@123");
	
	
	Company co1 = new Company();
	co1.setUsername("Ram@21");
	co1.setPassword("Ram@111");
	
	System.out.println();
	co1.login("Ram@21","Ram@222");
	
	System.out.println();
	Company co2 = new Company();
	co2.setUsername("Ravi@21");
	co2.setPassword("Ravi@111");
	
	co2.login("Ravi@21","Ravi@111");
	
	}
}
