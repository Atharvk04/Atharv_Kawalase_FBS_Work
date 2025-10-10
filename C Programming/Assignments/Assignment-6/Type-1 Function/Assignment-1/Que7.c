/* Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
respectively using Function. */

#include<stdio.h>

void salary();
void main()
{
	salary();
}
void salary()
{
	double basic;
	double total, da, ta, hra;
	
	printf("Please Enter the Salary: ");
	scanf("%lf",&basic);
	
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
	printf("Total Salary is : %.02lf",total);
}