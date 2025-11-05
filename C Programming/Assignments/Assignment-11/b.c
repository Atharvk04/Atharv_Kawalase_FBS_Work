#include<stdio.h>
#include<string.h>

int mystrlen(char*);

void main ()
{
	char str [20];
	
	printf("Enter a String: ");
	gets(str);
	
	int result =mystrlen(str);
	
	printf("The length of the string is: %d",result);
}

int mystrlen(char* str)
{
	int i=0;
	
	while(str[i] != '\0')
	{
		i++;
	}
	
	return i;
}