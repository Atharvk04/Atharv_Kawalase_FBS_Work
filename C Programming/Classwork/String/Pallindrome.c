#include<stdio.h>
#include<string.h>

void main ()
{
	char str[50];
	
	printf("Enter a string: ");
	gets(str);
	
	char pqr[50];
	strcpy(pqr, str);
	
	printf("\n%s",pqr);
	
	
	strrev(str);
	printf("\n%s",str);
	
	int result = strcmp(pqr,str);
	
	if(result == 0)
		printf("\nString is pallindrome.");
		
	else
		printf("\nString is not pallindrome.");
}