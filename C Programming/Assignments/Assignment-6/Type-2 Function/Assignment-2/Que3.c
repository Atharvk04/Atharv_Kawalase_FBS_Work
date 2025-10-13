#include<stdio.h>

int greatestNumber();

void main()
{
	int result;
	
	result = greatestNumber();
	
	if(result == 0)
		printf("a is greatest");
	else if (result == 1)
		printf("b is greatest");
	else if(result == 2)
		printf("c is greatest");
}
int greatestNumber()
{
	int a,b,c;
	
	printf("Enter the Numbers: ");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a>=b && a>=c)
		return 0;
		
	else if (b>=a && b>=c)
		return 1;
		
	else
		return 2;
}