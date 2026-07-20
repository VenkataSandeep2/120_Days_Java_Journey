package scom.encapsulation_1;

public class Company 
{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login(String user, String pass) {

	    if (username.equals(user) && password.equals(pass)) {
	        System.out.println("Login Successful");
	        System.out.println("Welcome " + username);
	    } else {
	        System.out.println("Invalid Username or Password");
	    }
	}
}
