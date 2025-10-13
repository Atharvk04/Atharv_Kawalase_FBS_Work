#include<stdio.h>

double salary();

void main()
{
	double total;
	
	total = salary();
	
	printf("Total salary is: %.2lf",total);
}

double salary()
{
	double basic;
	double total, da, ta, hra;
	
	printf("Enter the basic salary: ");
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
	
	total = basic + da + ta + hra;
	return total;
}