package p3;

public class InvalidPasswordException extends Exception 
{
	@Override
	public String toString() 
	{
		return "Invalid Password!! Please Enter Correct Password..";
	}
}
