package p1;

public class AdmissionForm 
{
	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	
	public AdmissionForm(String studentName, int age, double percentage, double courseFees, double feesPaid) {
	
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}

	public void validate() throws EmptyNameException, UnderageException, InvalidPercentageException,
	NotFitForAdmissionException,FeesNotPaidException, InsufficientFeesException{
		
		if(this.studentName.trim().isEmpty())
		{
			throw new EmptyNameException();		
		}
		
		if(this.age < 17)
		{
			throw new UnderageException();
		}
		
		if(this.percentage < 0 || percentage > 100)
		{
			throw new InvalidPercentageException();
		}
		
		if(this.percentage < 35)
		{
			throw new NotFitForAdmissionException();
		}
		
		if(this.feesPaid == 0)
		{
			throw new FeesNotPaidException();
			
		}
		
		if(this.feesPaid < 0.30 * courseFees)
		{
			throw new InsufficientFeesException();
		}
	}
	
	
}
