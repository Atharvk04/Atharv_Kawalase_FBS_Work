#include<stdio.h>

void average(int n1,int n2,int n3,int n4,int n5);

void main ()
{
	int a,b,c,d,e;
	
	printf("Enter the numbers: ");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	
	average (a,b,c,d,e);
}
void average(int n1,int n2,int n3,int n4,int n5)
{
	float avg;
	
	avg = (n1+n2+n3+n4+n5) / 5.0;
	
	printf("Average is: %.2f",avg); 
}