package scom.Polymorphism_2;

public class EmployeeLogin
  {
	public void login(String email) 
	{
		System.out.println("Login using email");
	}
	public void login(String email , String password)
	{
		System.out.println("Login using emial and password");
	}
	public void login(long number)
	{
		System.out.println("Login using mobile number");
	}

}
