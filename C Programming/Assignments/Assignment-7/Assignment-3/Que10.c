#include<stdio.h>

void addition(int *num);

void main ()
{
	int a;
	
	printf("Enter a Number: ");
	scanf("%d",&a);
	
	addition(&a);
}

void addition(int *num)
{
	int temp, first, last, sum;

    last = *num % 10;
    temp = *num;

    while (temp >= 10)
    {
        temp = temp / 10;
    }

    first = temp;

    sum = first + last;

    printf("Addition of first and last digit is: %d", sum);
}