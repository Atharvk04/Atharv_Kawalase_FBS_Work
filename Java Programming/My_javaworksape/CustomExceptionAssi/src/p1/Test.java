package p1;

public class Test {

	public static void main(String[] args) 
	{
		AdmissionForm a1 = new AdmissionForm("Atharv",22,84.20,100000.00,50000.00);
		
		try
		{
			a1.validate();
			System.out.println("Admission Successful!");
		}
		
		catch(EmptyNameException e)
		{
			System.out.println(e);
		} catch (UnderageException e)
		{
			System.out.println(e);
		} 
		catch (InvalidPercentageException e) 
		{
			System.out.println(e);
		} 
		catch (NotFitForAdmissionException e) 
		{
			System.out.println(e);
		} 
		catch (FeesNotPaidException e) 
		{
			System.out.println(e);
		} 
		catch (InsufficientFeesException e) 
		{
			System.out.println(e);
		}

	}

}
