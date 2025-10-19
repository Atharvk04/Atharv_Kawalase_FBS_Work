#include<stdio.h>

char upperOrLower(char ch);

void main ()
{
	char s, result;
	
	printf("Enter a character: ");
	scanf("%c",&s);
	
	result = upperOrLower(s);
	
	if(result == 0)
		printf("Character is an Uppercase.");
		
	else
		printf("Character is and Lowercase.");
}

char upperOrLower(char ch)
{
	if(ch >= 'A' && ch <= 'Z')
		return 0;
		
	else
		return 1;
}