void main ()
{
	double basic = 4000;
	double total, da, ta, hra;
	
	if(basic <=5000)
	{
		da = basic * 0.10;
		ta = basic * 0.20;
		hra = basic * 0.25;
	}
	
	else
	{
		da = basic * 0.15;
		ta = basic * 0.25;
		hra = basic * 0.30; 
	}
	
	total = da + ta + hra;
	printf("Total Salary is : %lf",total);
}