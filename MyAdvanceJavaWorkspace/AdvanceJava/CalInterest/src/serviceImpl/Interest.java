package serviceImpl;

public class Interest 
{
	public double calculateInterest(double principal, double rate, int time)
	{
		return (principal * rate * time) / 100;
	}
}
