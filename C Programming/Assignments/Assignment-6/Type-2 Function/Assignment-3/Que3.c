#include<stdio.h>

int sumOfNum();

void main()
{
	int result;
	
	result = sumOfNum();
	
	printf("Sum: %d",result);
}

int sumOfNum()
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
    
    return sum;
}