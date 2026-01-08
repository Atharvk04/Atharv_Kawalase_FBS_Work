package p1;

public class Test
{
	public static void main(String[] args) {
		
		try
		{
			int a = Integer.parseInt(args [0]);
			int b = Integer.parseInt(args [1]);
			
			int c = a / b;
			
			System.out.println("Result: " +c);
		}//try block ends here
		
		catch(NumberFormatException nfe)
		{
			System.out.println("Provide only Numbers.");
		}
		
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println("please provide Minimum two arguments.");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Dont provide 0 as second argument.");
		}
		
		catch(Exception e)
		{
			System.out.println("OOPS something went wrong!!");
		}
	}//main block ends here
	
}