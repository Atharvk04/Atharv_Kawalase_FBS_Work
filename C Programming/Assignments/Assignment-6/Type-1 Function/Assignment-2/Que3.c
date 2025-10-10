//Write a program to find greatest of three numbers using nested if-else using Function.

#include<stdio.h>

void greatestNum();
void main ()
{
	greatestNum();
}

void greatestNum()
{
	int a, b, c;
	
	printf("Enter the Numbers: ");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a>b)
	{
		if (a>c)
		{
			printf("%d",a);
		}
		else 
		{
			printf("%d",c);
		}
	}
	else
	{
		if(b>c)
		{
			printf("%d",b);
		}
		else
		{
			printf("%d",c);
		}
	}
}