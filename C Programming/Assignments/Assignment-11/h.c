#include<stdio.h>
#include<string.h>

void strreverse(char* );

void main()
{
	char str[50] = " Hello, Good Morning";
	
	strreverse(str);
	
	printf("Reversed string is: %s",str);
}
void strreverse(char* str)
{
	int i , j;
	int temp;
	
	j = strlen (str) - 1;
	
	for(i=0; i<j; i++, j--)
	{
		temp = str[i];
		str[i]=str[j];
		str[j]=temp;
	}
}