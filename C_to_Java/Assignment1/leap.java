class leap
{
	public static void main (String[] args) {
	
	int year = 1600;
	
	if (year % 4 == 0 && year % 100 != 0 || year /400 == 0)
	{
		System.out.printf("Year is leap");
	}
	else
	{
		System.out.printf("Year is not leap");
	}
}
}