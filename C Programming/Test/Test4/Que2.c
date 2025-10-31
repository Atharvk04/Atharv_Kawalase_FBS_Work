//Que 2: Write a program to find power of any number.
//Eg. 2^4 = 16.

#include <stdio.h>

void main()
{
	int number,power;
	printf("Enter the number and the power = ");
	scanf("%d %d",&number,&power);
	
	int res = 1;
	while(power>0)
	{
		res = res*number;
		power--;
	}
	printf("Result = %d",res);
}
