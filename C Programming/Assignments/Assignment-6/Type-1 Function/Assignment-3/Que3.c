#include<stdio.h>

void sumOfNum();

void main ()
{
	sumOfNum();
}

void sumOfNum()
{
	int start, end , sum = 0, i;
	
	printf("Enter the starting number: ");
	scanf("%d",&start);
	
	printf("Enter the ending number: ");
	scanf("%d",&end);
	
	i = start;
	
	while (i <= end)
    {
        sum += i;
        i++;
    }
    
    
    printf("Sum: %d",sum);
}