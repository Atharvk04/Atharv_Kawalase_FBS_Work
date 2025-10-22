#include<stdio.h>

void upperOrLower(char *ch);

void main ()
{
	char a;
	
	printf("Enter a character: ");
	scanf("%c",&a);
	
	upperOrLower(&a);
}

void upperOrLower(char *ch)
{
	if(*ch >= 'A' && *ch <= 'Z')
		printf("Character is Uppercase.");
		
	else
		printf("Character is Lowercase.");
}