package p3;

public class LoginValidation 
{
	String username;
	String password;
	
	public LoginValidation(String username, String password) 
	{
		this.username = username;
		this.password = password;
	}
	
	

	public void validateUsername(String enteredUsername) throws InvalidUsernameException
	{
		if(!username.equals(enteredUsername) )
		{
			throw new InvalidUsernameException();
		}
		
	}
	
	public void  validatePassword(String enteredPassword) throws InvalidPasswordException
	{
		if(!password.equals(enteredPassword))
		{
			throw new InvalidPasswordException();
		}
	}
}
