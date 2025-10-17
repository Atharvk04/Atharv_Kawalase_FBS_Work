#include<stdio.h>

void average(int n1,int n2,int n3,int n4,int n5);

void main ()
{
	int s1,s2,s3,s4,s5;
	
	printf("Enter the numbers: ");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	
	average (s1,s2,s3,s4,s5);
}
void average(int n1,int n2,int n3,int n4,int n5)
{
	float avg , totalMarks;
	
	totalMarks = (n1+n2+n3+n4+n5);
	
	avg = totalMarks / 5.0;
	
	printf("Total Marks = %.2f and Average is: %.2f",totalMarks,avg); 
}