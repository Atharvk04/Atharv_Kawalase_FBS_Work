class ageCategory
{
	public static void main (String args[]) 
{
	int age = 27;
	
	if( age < 12)
	{
		System.out.printf("Person is child");
	}
	else if (age <=19 )
	{
		System.out.printf("Person is Teenager");
	}
	else if ( age <= 50)
	{
		System.out.printf("Person is Adult");
	}
	else
	{
		System.out.printf("Person is Senior");
	}
}
}