//WAP for swapping numbers using Function

#include<stdio.h>

void swap();
void main ()
{
	swap();
}
void swap()
{
	int a ,b;
	int temp;
	
	printf("Enter the Numbers: ");
	scanf("%d%d",&a,&b);
	
	temp = a;
	a = b;
	b =temp;
	
	printf("\nAfter Swapping : a = %d and b = % d", a,b);
}