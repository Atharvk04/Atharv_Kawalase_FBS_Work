#include<stdio.h>

int range (int num);

void main ()
{
	int a, result;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	result = range (a);

}

int range (int num)
{
	printf("Numbers from %d to 10 are:\n",num);
	
	while (num<=10)
		{
			printf("%d\n",num);
			num++;
		}
	return 0;
}