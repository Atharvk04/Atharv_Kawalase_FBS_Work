void main () {
	
	int year = 1600;
	
	if (year % 4 == 0 && year % 100 != 0 || year /400 == 0)
	{
		printf("Year is leap");
	}
	else
	{
		printf("Year is not leap");
	}
}