#include<stdio.h>

int sumOfNum (int start, int end);

void main ()
{
	int a,b, result;
	
	printf("Enter the starting number: ");
	scanf("%d",&a);
	
	printf("Enter the ending number: ");
	scanf("%d",&b);
	
	result = sumOfNum (a,b);
	
	printf("Sum: %d",result);
}

int sumOfNum (int start, int end)
{
	int i = start;
	int sum = 0;
	
	while (i <= end)
    {
        sum += i;
        i++;
    }
    
    return sum;
}