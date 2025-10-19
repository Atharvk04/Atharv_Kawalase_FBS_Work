#include<stdio.h>

double salary (double no);

void main ()
{
	double a, result;
	
	printf("Enter a salary: ");
	scanf("%lf",&a);
	
	result = salary (a);
	
	printf("Total salary is: %.2lf",result);
}

double salary (double no)
{
	double total, da, ta, hra;
	
	if(no <=5000)
	{
		da = no * 0.10;
		ta = no * 0.20;
		hra = no * 0.25;
	}
	
	else
	{
		da = no * 0.15;
		ta = no * 0.25;
		hra = no * 0.30; 
	}
	
	total = no + da + ta + hra;
	
	return total;
}